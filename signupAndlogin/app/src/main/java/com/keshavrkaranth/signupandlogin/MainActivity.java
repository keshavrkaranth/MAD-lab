package com.keshavrkaranth.signupandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private Button signup;
    private EditText username,password;
    private String uname,psswd;
    private static final String password_pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";

    Pattern passPatten = Pattern.compile(password_pattern);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup = findViewById(R.id.signup);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname = username.getText().toString();
                psswd = password.getText().toString();

                if(isValid()){
                    Intent intent = new Intent(getApplicationContext(),login.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("username",uname);
                    bundle.putString("password",psswd);
                    intent.putExtras(bundle);
                    Toast.makeText(MainActivity.this,"Signup Success",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
            }
        });

    }
    private boolean isValid(){
        if(!passPatten.matcher(psswd).matches()) {
            Toast.makeText(this, "Password should contain upper and lowe case and special character sequence", Toast.LENGTH_LONG).show();
            return false;
        }
        else{
            return true;
        }
    }
}