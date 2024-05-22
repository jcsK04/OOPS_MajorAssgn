package com.example.oopsassgn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CID;
    private String CommBody;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "postID")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "userID")
    private UserSetup userSetup;

    // Getters and setters
    public int getCID() {
        return CID;
    }

    public void setCID(int commentID) {
        this.CID = commentID;
    }

    public String getCommBody() {
        return CommBody;
    }

    public void setCommBody(String commentBody) {
        this.CommBody = commentBody;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public UserSetup getUser() {
        return userSetup;
    }

    public void setUser(UserSetup userSetup) {
        this.userSetup = userSetup;
    }
}