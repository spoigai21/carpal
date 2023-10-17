package com.studio.carpal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.studio.carpal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.buttonLogin.setOnClickListener(v -> {
            Intent login = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(login);
        });

        // Set click listener for the register link
        binding.textViewRegisterLink.setOnClickListener(v -> {
            Intent register = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(register);
        });


//        // Find views by their IDs
//        ImageView imageViewLogo = findViewById(R.id.imageView_logo);
//        TextView textViewAppName = findViewById(R.id.textView_app_name);
//        TextView textViewMainHead = findViewById(R.id.textView_main_head);
//        Button buttonLogin = findViewById(R.id.button_login);
//        TextView textViewRegister = findViewById(R.id.textView_register);
//        TextView textViewRegisterLink = findViewById(R.id.textView_register_link);
//
//        // Set the text and other properties of your views as needed
//        textViewAppName.setText("CarPal");
//        textViewMainHead.setText("Find riders\nto\ncarpool with you!");
//        buttonLogin.setText("Login");
//        textViewRegister.setText("Do not have an account? ");
//        textViewRegisterLink.setText(getString(R.string.register)); // Assuming 'register' is defined in your strings.xml
//
//        Button loginbutton = findViewById(R.id.button_login);
    }


}