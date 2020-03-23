package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostTest {
    Post post;

    @Test
    public void testGetText() {
        post = new Post("I love the Weather Today");
        assertEquals("I love the Weather Today", post.getText());
    }
}