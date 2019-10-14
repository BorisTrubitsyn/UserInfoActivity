package com.example.userinfoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.userinfoactivity.pojo.User;
import com.squareup.picasso.Picasso;


public class UserInfoActivity extends AppCompatActivity {

    private ImageView userImageView;
    private TextView nameTextView;
    private TextView nickTextView;
    private TextView descriptionTextView;
    private TextView locationTextView;
    private TextView followingCountTextView;
    private TextView followersCountTextView;
    private RecyclerView tweetsRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userImageView = findViewById(R.id.user_image_view);
        nameTextView = findViewById(R.id.user_name_text_view);
        nickTextView = findViewById(R.id.user_nick_text_view);
        descriptionTextView = findViewById(R.id.user_description_text_view);
        locationTextView = findViewById(R.id.user_location_text_view);
        followersCountTextView = findViewById(R.id.followers_count_text_view);
        followingCountTextView = findViewById(R.id.following_count_text_view);
        displayUserInfo();
        initRecyclerView();



    }

    private void initRecyclerView() {
        tweetsRecyclerView = findViewById(R.id.tweets_recycler_view);
        tweetsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void displayUserInfo() {
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(userImageView);
        nameTextView.setText("DevColibri");
        nickTextView.setText("@devcolibri");
        descriptionTextView.setText("Sample description");
        locationTextView.setText("USA");

        String followingCount = String.valueOf(getUser().getFollowingCount());
        followingCountTextView.setText(followingCount);

        String followersCount = String.valueOf(getUser().getFollowersCount());
        followersCountTextView.setText(followersCount);

    }

    private User getUser() {
        return new User(1L, "http://i.imgur.com/DvpvklR.png",
                "DevColibri",
                "devcolibri",
                "Sample description",
                "USA",
                42,
                42);
    }

}

