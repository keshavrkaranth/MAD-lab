package com.keshavrkaranth.signupandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private Button logibBtn;
    private EditText username,password;
    private String usrname,psswd;
    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        logibBtn = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Bundle bundle = getIntent().getExtras();
        usrname = bundle.getString("username");
        psswd = bundle.getString("password");
        bundle.putString("username",usrname);
        Intent intent = new Intent(getApplicationContext(),loginSuccess.class);
        intent.putExtras(bundle);

        logibBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter!=2){
                    System.out.println("Button tapped");
                    if(username.getText().toString().equals(usrname) && password.getText().toString().equals(psswd)){
                        Toast.makeText(login.this,"Login Success",Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(login.this,"Invalid Credentials",Toast.LENGTH_LONG).show();
                        counter++;
                        username.setText(null);
                        password.setText(null);
                    }
                }else{
                    Toast.makeText(login.this,"Maximum reach reached",Toast.LENGTH_LONG).show();
                    logibBtn.setBackgroundColor(R.color.black);
                    logibBtn.setEnabled(false);
                }
            }
        });

    }
}