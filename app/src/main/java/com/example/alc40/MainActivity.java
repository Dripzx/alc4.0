package com.example.alc40;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btabout;
    Button btprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btabout =(Button)findViewById(R.id.button);

        btprofile =(Button)findViewById(R.id.button2);

        btabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,about_alc.class);
                startActivity(intent);


            }
        });



        btprofile.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,my_profile.class);
                startActivity(intent);
            }
        });
    }
}
