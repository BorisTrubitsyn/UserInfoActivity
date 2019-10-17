package com.example.userinfoactivity.activity;

import android.os.Bundle;
import android.widget.Toast;

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


        UsersAdapter.OnUserClickListener onUserClickListener = new UsersAdapter.OnUserClickListener() {
            @Override
            public void onUserClick(User user) {
                Toast.makeText(SearchUsersActivity.this, "user " + user.getName(), Toast.LENGTH_SHORT).show();
            }
        };
        usersAdapter = new UsersAdapter(onUserClickListener);
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
                        "https://ru.wikipedia.org/wiki/%D0%9C%D0%B0%D1%81%D0%BA,_%D0%98%D0%BB%D0%BE%D0%BD#/media/%D0%A4%D0%B0%D0%B9%D0%BB:Elon_Musk_Royal_Society.jpg",
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
