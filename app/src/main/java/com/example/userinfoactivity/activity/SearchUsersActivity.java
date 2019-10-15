package com.example.userinfoactivity.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.userinfoactivity.R;
import com.example.userinfoactivity.adapter.UsersAdapter;
import com.example.userinfoactivity.pojo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class SearchUsersActivity extends AppCompatActivity {
    private RecyclerView usersRecyclerView;
    private UsersAdapter usersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_users);
        initRecyclerView();
        searchUsers();
    }

    private void initRecyclerView() {
        usersRecyclerView = findViewById(R.id.users_recycler_view);
        usersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        usersAdapter = new UsersAdapter();
        usersRecyclerView.setAdapter(usersAdapter);
    }
    private void searchUsers() {
        Collection<User> users = getUsers();
        usersAdapter.setItems(users);
    }


    private Collection<User> getUsers() {
        return Arrays.asList(
                new User(
                        929257819349700608L,
                        "http://i.imgur.com/DvpvklR.png",
                        "DevColibri",
                        "@devcolibri",
                        "Sample description",
                        "USA",
                        42,
                        42
                ),

                new User(
                        44196397L,
                        "https://pbs.twimg.com/profile_images/782474226020200448/zDo-gAo0_400x400.jpg",
                        "Elon Musk",
                        "@elonmusk",
                        "Hat Salesman",
                        "Boring",
                        14,
                        13
                )
        );
    }

}
