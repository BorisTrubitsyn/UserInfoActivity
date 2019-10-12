package com.example.userinfoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;


public class UserInfoActivity extends AppCompatActivity {

    private ImageView userImageView;
    private TextView nameTextView;
    private TextView nickTextView;
    private TextView descriptionTextView;
    private TextView locationTextView;
    private TextView followingCountTextView;
    private TextView followersCountTextView;


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


    }
    private void displayUserInfo(){
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(userImageView);
        nameTextView.setText("DevColibri");
        nickTextView.setText("@devcolibri");
        descriptionTextView.setText("Sample description");
        locationTextView.setText("USA");
        followingCountTextView.setText("42");
        followersCountTextView.setText("54");

    }
}
