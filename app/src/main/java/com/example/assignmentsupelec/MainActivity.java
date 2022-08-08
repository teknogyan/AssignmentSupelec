package com.example.assignmentsupelec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
     public void signIn(View view) {

        EditText userName = (EditText) findViewById(R.id.textViewUsername);
        EditText password = (EditText) findViewById(R.id.textViewPassword);

        SharedPreferences preferences = getSharedPreferences("Shared_Pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
         Log.i("sharedpref", preferences.getString("username",""));
         Log.i("sharedpref", preferences.getString("password",""));
         Log.i("user",userName.getText().toString());
        if(preferences.getString("username", "").equals(userName.getText().toString()) &&
                preferences.getString("password", "").equals(password.getText().toString())) {
                newActivity();
        } else
            Toast.makeText(getApplicationContext(),"Wrong Username or Password",Toast.LENGTH_SHORT).show();

     }

     public void signUp(View view) {

         Intent goToSignUp = new Intent();
         goToSignUp.setClass(this,signUpActivity.class);
         startActivity(goToSignUp);

     }

     public void passwordHint(View view) {

         Intent goToWeb = new Intent();
         goToWeb.setClass(this,webActivity.class);
         startActivity(goToWeb);
     }
     public void newActivity() {

         Intent goToHomePage = new Intent();
         goToHomePage.setClass(this,HomePageActivity.class);
         startActivity(goToHomePage);
     }
}