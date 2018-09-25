package com.hu.dao;

import com.hu.po.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl extends BaseDao implements UserDao {
    private Connection connection = null;
    private PreparedStatement preparedStatement =null;
    private ResultSet resultSet = null ;
    @Override
    public int addUser(User user) {
        StringBuffer sql = new StringBuffer(" INSERT INTO `user`(userName,`password`) VALUES(?,?)");
        connection=this.getConnection();
        int result = this.executeUpdate(sql.toString(),user.getUserName(),user.getPassword());
        return result;
    }
    public User getUser(User user){
        User user1 =new User();
        try {
            StringBuffer sql =null;
            connection = this.getConnection();
            if(user.getUserName() !=null) {
                sql = new StringBuffer("SELECT * FROM user WHERE userName = ?");
                preparedStatement = connection.prepareStatement(sql.toString());
                preparedStatement.setString(1, user.getUserName());
            }
               if(preparedStatement != null){
                   resultSet=preparedStatement.executeQuery();
                   while (resultSet.next()){
                       user1.setId(resultSet.getInt("id"));
                       user1.setUserName(resultSet.getString("userName"));
                       user1.setPassword(resultSet.getString("password"));
                   }
               }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            this.closeAll(resultSet,preparedStatement,connection);
        }
            return user1;
    }
}
