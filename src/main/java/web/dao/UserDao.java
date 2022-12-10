package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {
    User getUserById(long id);

    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user);

    List<User> getAllUsers();
}