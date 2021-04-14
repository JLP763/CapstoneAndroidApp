package com.example.taylorinsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        Username = findViewById(R.id.etName);
        Password = findViewById(R.id.etPassword);
        Login = findViewById(R.id.btnLogin);

        //Login
        Login.setOnClickListener(v -> authenticate(Username.getText().toString(),Password.getText().toString()));

    }

    //Function for authenticating login
    private void authenticate(String username, String password){
        if ((username.equals("kdutton")) && (password.equals("dutton"))){
            Intent intent = new Intent(LoginScreen.this, MainActivity.class);
            startActivity(intent);
        } else{
            Toast toast = Toast.makeText(LoginScreen.this, "Incorrect username and password.",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}