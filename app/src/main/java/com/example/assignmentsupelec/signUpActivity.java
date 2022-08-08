package com.example.assignmentsupelec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }
    public void signUp(View view) {

        EditText userName = (EditText)findViewById(R.id.editTextUserName);
        EditText password =(EditText) findViewById(R.id.editTextTextPassword);
        SharedPreferences preferences = getSharedPreferences("Shared_Pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("username", userName.getText().toString());
        editor.putString("password", password.getText().toString());
        editor.commit();
        Toast.makeText(this, "Your Account has been created", Toast.LENGTH_SHORT).show();

    }
}