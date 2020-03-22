package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/registUserServlet")
public class RegistUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //收到请求
        System.out.println("1111");
        //获数据
        Map<String, String[]> parameterMap = request.getParameterMap();
        //封装数据
        User user=new User();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //调用service
        UserService userService=new UserServiceImpl();
        Boolean flag= userService.regist(user);
        //响应
        ResultInfo info=new ResultInfo();
        if (flag){
            info.setFlag(flag);
        }else {
            info.setFlag(!flag);
            info.setErrorMsg("注册失败");
        }

        //序列化
        ObjectMapper om=new ObjectMapper();
        String jsonInfo = om.writeValueAsString(info);

        //设置json类型
       response.setContentType("application/json;charset=utf-8");

        response.getWriter().write(jsonInfo);
       // response.getOutputStream().write(jsonInfo.getBytes());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
