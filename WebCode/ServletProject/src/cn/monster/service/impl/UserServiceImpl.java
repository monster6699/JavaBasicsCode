package cn.monster.service.impl;

import cn.monster.dao.UserDao;
import cn.monster.dao.impl.UserDaoImpl;
import cn.monster.domain.PageBean;
import cn.monster.domain.User;
import cn.monster.domain.UserLogin;
import cn.monster.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        try {
            return userDao.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public UserLogin findUserLogin(UserLogin userLogin) {
        try {

            return userDao.findUserLogin(userLogin);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Boolean addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public Boolean delete(String id) {
        return userDao.delete(id);
    }

    @Override
    public User userSelect(String id) {
        return userDao.select(id);
    }

    @Override
    public Boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public Boolean delSelect(String[] uids) {
        try {
            for (String uid : uids) {
                userDao.delete(uid);
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

        return true;
    }

    @Override
    public PageBean<User> findUserSelectPage(String _currentPage, String _rows) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);
        if(currentPage<=0) {
            currentPage = 1;
        }
        PageBean<User> userPageBean = new PageBean<>();

        userPageBean.setRows(rows);
        int totalCount = userDao.findTotalCount();
        userPageBean.setTotalCount(totalCount);
        int totalPage = totalCount % rows == 0 ? totalCount / rows : (totalCount / rows) + 1;
        if(currentPage > totalPage) {
            currentPage = totalPage;
        }
        int start = (currentPage - 1) * rows;


        userPageBean.setCurrentPage(currentPage);
        userPageBean.setTotalPage(totalPage);
        List<User> list = userDao.findUserPageList(start, rows);
        userPageBean.setList(list);
        return userPageBean;
    }
}
