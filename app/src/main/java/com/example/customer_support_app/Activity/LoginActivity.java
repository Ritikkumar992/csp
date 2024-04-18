package com.example.customer_support_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.customer_support_app.R;

public class LoginActivity extends AppCompatActivity {
    TextView loginBtn;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        // remove title bar
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            WindowInsetsController windowInsetsController = getWindow().getInsetsController();
            if(windowInsetsController != null){
                windowInsetsController.hide(WindowInsets.Type.statusBars());
            }
        }
        else{
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        spinner = findViewById(R.id.spinnerId_login);
        String[] items = {"Admin","Manager", "Auditor","Client"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(LoginActivity.this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        // Navigating from LoginActivity to HomeActivity.
        Intent iHome = new Intent(LoginActivity.this, HomeActivity.class);
        loginBtn = findViewById(R.id.login_btn_id);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iHome); // Navigate to Home Page.
            }
        });
    }
}