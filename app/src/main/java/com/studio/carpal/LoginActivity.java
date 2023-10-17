package com.studio.carpal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.studio.carpal.databinding.ActivityLoginBinding;
import com.studio.carpal.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        email = binding.editTextLoginEmail.toString();
        password = binding.editTextLoginPwd.toString();
        binding.buttonLogin.setOnClickListener(v -> {


        });
    }

}
