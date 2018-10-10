package org.computermentors.inceractivestory.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.computermentors.inceractivestory.R;

public class StoryActivity extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        if (name == null || name.isEmpty()){
            name = "Punk";
        }
    }
}
