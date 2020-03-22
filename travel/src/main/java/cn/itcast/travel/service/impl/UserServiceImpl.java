package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public Boolean regist(User user) {
        User userFlag = userDao.findByUsername(user.getUsername());
        if (userFlag != null) {//用户名存在
            return false;
        } else {//不存在
            userDao.SaveUser(user);
            return true;
        }
    }
}
