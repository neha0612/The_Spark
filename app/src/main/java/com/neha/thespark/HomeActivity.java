package com.neha.thespark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    Button btnLogOut;
    FirebaseAuth mAuth;
    TextView nameEmail,emailEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameEmail = findViewById(R.id.nameEmail);
        emailEmail = findViewById(R.id.emailEmail);
        btnLogOut = findViewById(R.id.btnLogOut);
        mAuth = FirebaseAuth.getInstance();

        String name = mAuth.getCurrentUser().getDisplayName();
        String email = mAuth.getCurrentUser().getEmail();

        nameEmail.setText(name);
        emailEmail.setText(email);


        btnLogOut.setOnClickListener( view ->{
            mAuth.signOut();
            startActivity(new Intent(HomeActivity.this,MainActivity.class));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null){
            startActivity(new Intent(HomeActivity.this,MainActivity.class));
        }

    }

}