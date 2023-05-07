package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static EditText username;
    private static EditText password;
    private static Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton();
    }

    public void LoginButton() {
        username = (EditText) findViewById(R.id.email_text);
        password = (EditText) findViewById(R.id.pass_text);
        login_btn = (Button) findViewById(R.id.button_text);

        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("user@gmail.com") &&
                                password.getText().toString().equals("12345678")) {
                            Toast.makeText(MainActivity.this, "User and Password is Correct",
                                    Toast.LENGTH_SHORT).show();
                        } else if (password.length()<=7) {
                            Toast.makeText(MainActivity.this, "Password must be 8 characters!!",
                                    Toast.LENGTH_SHORT).show();

                        }


                        else {
                            Toast.makeText(MainActivity.this, "User and Password is NOT correct",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds item to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up Button,So long
        //as you specify a parent activity in AndroidManifest.xml
        return false;
    }
}