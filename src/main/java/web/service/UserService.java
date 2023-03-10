package web.service;

import web.model.User;
import java.util.List;

public interface UserService {


    User getUserById(long id);

    void addUser(User user);


    void deleteUser(long id);

    void editUser(User user);


    List<User> getAllUsers();


}