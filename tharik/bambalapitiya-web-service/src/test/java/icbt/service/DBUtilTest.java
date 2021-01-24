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
    
}
