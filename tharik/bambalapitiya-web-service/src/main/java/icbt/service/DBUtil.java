/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tharik
 */
public class DBUtil {
   static final String DB_URL = "jdbc:mysql://localhost:3306/icbt_bambalapitiya";
   static final String USER = "icbt";
   static final String PASS = "icbt@123";
   
   public static List<User> getUsers() {
   List<User> users  = new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      stmt = conn.createStatement();
      String sql = "SELECT * FROM users";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){
          
         User user = new User();
         user.setUsername(rs.getString("username"));
         user.setFirstName(rs.getString("first_name"));
         user.setLastName(rs.getString("last_name"));
         user.setPassword(rs.getString("password"));
         
         users.add(user);
      }
      rs.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   return users;
   }
   
   
    public static User getUser(String username) {
       User user  = null;
       Connection conn = null;
       Statement stmt = null;
       try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection(DB_URL, USER, PASS);
          stmt = conn.createStatement();
          String sql = "SELECT * FROM users WHERE username='" + username + "'";
          ResultSet rs = stmt.executeQuery(sql);
          while(rs.next()){
             user = new User();
             user.setUsername(rs.getString("username"));
             user.setFirstName(rs.getString("first_name"));
             user.setLastName(rs.getString("last_name"));
             user.setPassword(rs.getString("password"));
          }
          rs.close();
       }catch(SQLException se){
          se.printStackTrace();
       }catch(Exception e){
          e.printStackTrace();
       }finally{
          try{
             if(stmt!=null)
                conn.close();
          }catch(SQLException se){
          }
          try{
             if(conn!=null)
                conn.close();
          }catch(SQLException se){
             se.printStackTrace();
          }
       }
       return user;
   }
}
