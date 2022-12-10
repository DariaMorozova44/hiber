package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceimpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public User getUserById(long id) {
       return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userDao.deleteUser(id);

    }


    @Override
    @Transactional
    public void editUser(User user) {
        userDao.editUser(user);
    }


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}

