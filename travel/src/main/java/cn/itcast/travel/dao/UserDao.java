package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {

     User findByUsername(String username);

     User SaveUser(User user);

}
