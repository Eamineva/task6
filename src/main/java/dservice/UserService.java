package dservice;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
//    List<User> uModel(String str, int series);
}
