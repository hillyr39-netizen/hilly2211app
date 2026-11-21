
package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView image = findViewById(R.id.imageView3);

        TextView name = findViewById(R.id.textView);
        TextView bio = findViewById(R.id.textView2);
        TextView mood = findViewById(R.id.textViewMood);
        TextView status = findViewById(R.id.textViewStatus);

        ImageButton backButton = findViewById(R.id.imageButton2);

        Intent intent = getIntent();

        String userName = intent.getStringExtra("name");
        String userBio = intent.getStringExtra("bio");

        int userImage = intent.getIntExtra("image", R.drawable.pfp2);
        int userMood = intent.getIntExtra("mood", -1);

        boolean colorful = intent.getBooleanExtra("colorful", false);

        name.setText(userName);
        bio.setText(userBio);
        image.setImageResource(userImage);

        if (userMood == R.id.radioButton10) {
            mood.setText("Blue Mood");
        }
        else if (userMood == R.id.radioButton11) {
            mood.setText("Yellow Mood");
        }
        else if (userMood == R.id.radioButton12) {
            mood.setText("Pink Mood");
        }

        if (colorful) {
            status.setText("ACTIVE");
        }
        else {
            status.setText("INACTIVE");
        }

        backButton.setOnClickListener(v -> finish());
    }
}
