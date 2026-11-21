package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ToggleButton;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.editTextText);
        EditText bio = findViewById(R.id.editTextText2);

        RadioGroup mood = findViewById(R.id.radioGroupMood);
        ToggleButton colorful = findViewById(R.id.toggleButton);

        Button myButton = findViewById(R.id.button);

        myButton.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, MainActivity4.class);

            intent.putExtra("name", name.getText().toString());
            intent.putExtra("bio", bio.getText().toString());

            intent.putExtra("mood", mood.getCheckedRadioButtonId());

            intent.putExtra("colorful", colorful.isChecked());

            intent.putExtra("image", R.drawable.pfp2);

            startActivity(intent);
        });
    }
}
