package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {
    private final UserDao userDaoImp;

    @Autowired
    public UserServiceImp(UserDaoImp userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoImp.getAllUsers();
    }

    @Override
    public void add(User user) {
        userDaoImp.add(user);
    }

    @Override
    public void delete(int id) {
        userDaoImp.delete(id);
    }

    @Override
    public void edit(User user) {
        userDaoImp.edit(user);
    }

    @Override
    public User getById(int id) {
        return userDaoImp.getById(id);
    }

}