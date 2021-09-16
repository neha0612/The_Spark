package com.neha.thespark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.CallbackManager;

public class ShowActivity extends AppCompatActivity {

    private TextView info;
    private ImageView profile;
    private Button logout;

    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        info = findViewById(R.id.info);
        profile = findViewById(R.id.profile);
        logout = findViewById(R.id.logout);

        callbackManager =CallbackManager.Factory.create();


    }
}