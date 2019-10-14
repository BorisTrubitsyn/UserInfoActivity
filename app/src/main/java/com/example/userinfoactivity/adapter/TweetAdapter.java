package com.example.userinfoactivity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.userinfoactivity.R;
import com.example.userinfoactivity.pojo.Tweet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//унаследовали наш адаптер от RecyclerView
//указали собственный ViewHolder
public class TweetAdapter extends RecyclerView.Adapter {
    private List<Tweet>tweetList = new ArrayList<>();
    private static final String TWITTER_RESPONSE_FORMAT = "EEE MMM dd HH:mm:ss";
    private static final String MONTH_DAY_FORMAT = "MMM d ";


    public void setItems(Collection<Tweet>tweets){
        tweetList.addAll(tweets);
        notifyDataSetChanged();
    }
    public void clearItems(){
        tweetList.clear();
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tweet_item_view,parent,false);
        return new TweetViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(TweetViewHolder holder, int position) {
        holder.bind(tweetList.get(position));

    }

    @Override
    public int getItemCount() {
        return tweetList.size();
    }


    class TweetViewHolder extends RecyclerView.ViewHolder {


        private ImageView userImageView;
        private TextView nameTextView;
        private TextView nickTextView;
        private TextView creationDateTextView;
        private TextView contentTextView;
        private TextView retweetsTextView;
        private TextView likesTextView;
        private ImageView tweetImageView;


        public TweetViewHolder(View itemView) {
            super(itemView);

            userImageView = itemView.findViewById(R.id.profile_image_view);
            nameTextView = itemView.findViewById(R.id.author_name_text_view);
            nickTextView = itemView.findViewById(R.id.author_nick_text_view);
            creationDateTextView = itemView.findViewById(R.id.creation_date_text_view);
            contentTextView = itemView.findViewById(R.id.tweet_content_text_view);
            tweetImageView = itemView.findViewById(R.id.tweet_image_view);
            retweetsTextView = itemView.findViewById(R.id.retweets_text_view);
            likesTextView = itemView.findViewById(R.id.likes_text_view);
        }

        public void bind(Tweet tweet) {
            nameTextView.setText(tweet.getUser().getName());
            nickTextView.setText(tweet.getUser().getNick());
            contentTextView.setText(tweet.getText());
            retweetsTextView.setText(String.valueOf(tweet.getRetweetCount()));
            likesTextView.setText(String.valueOf(tweet.getFavouriteCount()));

            String creationDateFormatted = getFormatedDate(tweet.getCreationDate());
            creationDateTextView.setText(creationDateFormatted);
        }
    }

    }

