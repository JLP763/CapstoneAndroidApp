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

        Username = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);

        //Login
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authenticate(Username.getText().toString(),Password.getText().toString());
            }
        });

    }

    //Function for authenticating login
    private void authenticate(String username, String password){
        if ((username.equals("P3N")) && (password.equals("P3N"))){
            Intent intent = new Intent(LoginScreen.this, MainActivity.class);
            startActivity(intent);
        } else{
            Toast toast = Toast.makeText(LoginScreen.this, "Username and Password cannot be null.",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}