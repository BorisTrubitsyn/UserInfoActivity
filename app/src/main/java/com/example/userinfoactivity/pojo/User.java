package com.example.userinfoactivity.pojo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class User {
    private long id;
    private String imageUrl;
    private String name;
    private String nick;
    private String description;
    private String location;
    private int followingCount;
    private int followersCount;

    public User(long id, String imageUrl, String name, String nick, String description, String location, int followingCount, int followersCount) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.nick = nick;
        this.description = description;
        this.location = location;
        this.followingCount = followingCount;
        this.followersCount = followersCount;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                followingCount == user.followingCount &&
                followersCount == user.followersCount &&
                Objects.equals(imageUrl, user.imageUrl) &&
                name.equals(user.name) &&
                nick.equals(user.nick) &&
                Objects.equals(description, user.description) &&
                Objects.equals(location, user.location);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(id, imageUrl, name, nick, description, location, followingCount, followersCount);
    }

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getNick() {
        return nick;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }


}

