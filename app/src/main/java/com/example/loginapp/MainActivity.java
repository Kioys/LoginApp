package com.example.loginapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText elementUsername;
    EditText elementPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elementUsername = (EditText) findViewById(R.id.editTextUsername);
        elementPassword = (EditText) findViewById(R.id.editTextPassword);

    }

    public void LoginOnClick(View component){
        String username = elementUsername.getText().toString();
        String password = elementPassword.getText().toString();

        if(!username.equals("matias") || !password.equals("arratibel")){
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Inicio de sesión fallido")
                    .setMessage("El nombre o la contraseña no son correctas")
                    .setCancelable(false)
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            return;
                        }
                    }).show();
            return;
        }

        startActivity(new Intent(MainActivity.this, MainMenu.class));

    }

}