package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class User{
    private String name;

    //this is the personal Timeline
    private Stack<Post> posts;

    //This is the aggregated timeline of people user follows
    private Stack<Post> timeLine;

    private List<User> following;
    
    public User() {
        this("New User");
    }
    public User(String name){
        this.name = name;
        posts = new Stack<Post>();
        timeLine = new Stack<Post>();
        following = new ArrayList<User>();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    };

    public List<User> getFollowing(){
        return this.following;
    }

    public void follow(User user){
        this.following.add(user);
    };

    public Stack<Post> getPosts(){
        return this.posts;
    }

    public void publish(String postText){
        Post newPost = new Post(postText);
        this.posts.push(newPost);
    };

    //This will collect the posts from current user and all users listed 
    //in Following and sort by post.Date
    private void constructTimeline(){
    };

    public Stack<Post> getTimeLine(){
        this.constructTimeline();
        return this.timeLine;
    }

}