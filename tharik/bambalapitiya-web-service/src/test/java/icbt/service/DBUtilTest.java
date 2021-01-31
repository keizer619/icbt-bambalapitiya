/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt.service;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tharik
 */
public class DBUtilTest {
    
    public DBUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUsers method, of class DBUtil.
//     */
//    @Test
//    public void testGetUsers() {
//        System.out.println("getUsers");
//        List<User> expResult = null;
//        List<User> result = DBUtil.getUsers();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getUser method, of class DBUtil.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String username = "admin";
        
        User expResult = new User("admin", "John", "smith", "a123");
        User result = DBUtil.getUser(username);
        
        assertEquals(expResult.getUsername(), result.getUsername());
        assertEquals(expResult.getFirstName(), result.getFirstName());
        assertEquals(expResult.getLastName(), result.getLastName());
        assertEquals(expResult.getPassword(), result.getPassword());
    }
    
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        
        
        //Add new user
        User user = new User("user1", "George", "Whey", "qwe");
       
        boolean expectedResult = true;
        boolean result = DBUtil.addUser(user);
        
        assertEquals(expectedResult, result);
        
        
        //Check newly added users attributes
        User resultUser = DBUtil.getUser(user.getUsername());

        assertEquals(user.getUsername(), resultUser.getUsername());
        assertEquals(user.getFirstName(), resultUser.getFirstName());
        assertEquals(user.getLastName(), resultUser.getLastName());
        assertEquals(user.getPassword(), resultUser.getPassword());
        
        
        //Test update
        user.setFirstName("Andrew");
        user.setLastName("Smith");
        user.setPassword("asd");
        
        boolean updateResult = DBUtil.updateUser(user);
        assertEquals(expectedResult, updateResult);
        
        
        //Check updated users attributes
        resultUser = DBUtil.getUser(user.getUsername());

        assertEquals(user.getUsername(), resultUser.getUsername());
        assertEquals(user.getFirstName(), resultUser.getFirstName());
        assertEquals(user.getLastName(), resultUser.getLastName());
        assertEquals(user.getPassword(), resultUser.getPassword());
        
        
        //Test delete 
        boolean deleteResult = DBUtil.deleteUser(user.getUsername());
        assertEquals(expectedResult, deleteResult);
        resultUser = DBUtil.getUser(user.getUsername());
        assertEquals(null, resultUser);
    }
}
