package com.example.taller10iconos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageButton gfgImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gfgImageButton =  (ImageButton) findViewById(R.id.imageButton);


        gfgImageButton.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this, "Facebook", Toast.LENGTH_SHORT).show();
            String url = "https://www.facebook.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        gfgImageButton =  (ImageButton) findViewById(R.id.imageButton2);
        gfgImageButton.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this, "Instagram", Toast.LENGTH_SHORT).show();
            String url = "https://www.instagram.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        gfgImageButton =  (ImageButton) findViewById(R.id.imageButton3);
        gfgImageButton.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this, "Twitter", Toast.LENGTH_SHORT).show();
            String url = "https://twitter.com/home?lang=es";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        gfgImageButton =  (ImageButton) findViewById(R.id.imageButton4);
        gfgImageButton.setOnClickListener(view -> {

            Toast.makeText(MainActivity.this, "Twitch", Toast.LENGTH_SHORT).show();
            String url = "https://www.twitch.tv/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
    }
}