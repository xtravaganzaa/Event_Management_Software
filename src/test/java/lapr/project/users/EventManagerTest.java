/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.users;

import lapr.project.model.EventEmployee;
import lapr.project.model.EventManager;
import lapr.project.model.User;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class EventManagerTest {

    /**
     *
     */
    @Test
    public void EnsureSameObjectEventManagerIsEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventManager result = new EventManager(user);
        assertEquals(result, result);
    }
    
    /**
     *
     */
    @Test
    public void EnsureSameObjectsEventManagerAreNotEqual() {
        
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        User user2 = new User("Z", "c", "b", "a");
        EventManager result = new EventManager(user);
        EventManager expectedResult = new EventManager(user2);
        assertNotEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureDifferentObjectsEventManagerAreNotEqual() {
        User user = new User("mario", "m@gmail.com", "mario1", "m123");
        EventManager result = new EventManager(user);
        Object expectedResult = new Object();
        assertNotEquals(result, expectedResult);
    }
    /**
     *
     */
    @Test
    public void EnsureToStringIsEqual() {
        User user = new User("James", "james@gmail.com", "juanjames", "123456789");
        EventManager eventManager = new EventManager(user);
        String result = eventManager.toString();
        String expectedResult = "Name:James; Username:juanjames; Email:james@gmail.com";
        assertEquals(result, expectedResult);
    }

    /**
     *
     */
    @Test
    public void EnsureToStringIsNotEqual() {
        User user = new User("James", "james@gmail.com", "juanjames", "123456789");
        EventManager eventManager = new EventManager(user);
        String result = eventManager.toString();
        String expectedResult = "Name: Jame Username: juanjames Email: james@gmail.com";
        assertNotEquals(result, expectedResult);
    }
     @Test
    public void EnsureGetEmployeeIsNotEqual() {
        User user = new User("Z", "c", "b", "a");
        EventManager eventmanager = new EventManager(user);
        User user2 = eventmanager.getEventManager();
        EventManager result = new EventManager(user2);
        assertNotEquals(result, eventmanager);
    }

    /**
     *
     */
    @Test
    public void EnsureGetUserNameIsEqual() {
        User user = new User("Z", "c", "b", "a");
        User user2 = new User("T", "a", "o", "q");
        EventManager eventmanager = new EventManager(user);
        String result = eventmanager.getUsername();
        assertNotEquals(result, user2);
    }

    /**
     *
     */
    @Test
    public void EnsureGetEmailIsEqual() {
        User user = new User("Z", "c", "b", "a");
        EventManager eventmanager = new EventManager(user);
        String result = user.getEmail();
        String expectedResult = eventmanager.getEmail();
        assertEquals(result, expectedResult);
    }
}
