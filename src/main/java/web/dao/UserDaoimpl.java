package web.dao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component

public class UserDaoimpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    @Transactional
    public User getUserById(long id) {
        return entityManager.find(User.class,id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
    }


    @Override
    @Transactional
    public void deleteUser(Long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    @Transactional
    public void editUser(User user){
        entityManager.merge(user);
    }
}