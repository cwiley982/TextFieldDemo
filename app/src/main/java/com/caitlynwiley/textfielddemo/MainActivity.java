package com.caitlynwiley.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayCreds(View view) {
        EditText user = findViewById(R.id.usernameField);
        EditText pass = findViewById(R.id.passwordField);
        String username = user.getText().toString();
        String password = pass.getText().toString();
        Log.i("CREDENTIALS", "Username: " + username + " Password: " + password);
    }
}

