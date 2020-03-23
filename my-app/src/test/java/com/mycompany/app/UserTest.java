package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    User user;
    User user2;
    User user3;

    public static void main(String[] args) {

    }

    @Before
    public void setUp() {
        user2 = new User("Alice");
        user3 = new User("Charlie");
    }

    @Test
    public void testUserDefault() {
        user = new User();
        assertEquals("New User", user.getName());
    }

    @Test
    public void testUserWithName() {
        user = new User("Bob");
        assertEquals("Bob", user.getName());
    }

    @Test
    public void testNewName() {
        user2.setName("New Alice");
        assertEquals("New Alice", user2.getName());
    }

    @Test
    public void testFollow() {
        user2.follow(user3);
        assertEquals(user3, user2.getFollowing().get(user2.getFollowing().size() - 1));
    }

    @Test
    public void testPublish() {
        User Bob = new User("Bob");
        Bob.publish("Darn! We lost!");
        assertEquals("Darn! We lost!",Bob.getPosts().get(Bob.getPosts().size() - 1).getText());
    }
    
}