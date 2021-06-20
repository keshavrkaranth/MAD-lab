package com.keshavrkaranth.phone_call;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.security.acl.Permission;

public class MainActivity extends AppCompatActivity {

    EditText phone_no;
    ImageButton phone,save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone_no = findViewById(R.id.phoneno);
        phone = findViewById(R.id.phone);
        save = findViewById(R.id.save);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                  ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
              }else {
                  startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+String.valueOf(phone_no.getText().toString()))));
              }
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber = phone_no.getText().toString();
                Intent intent =new Intent(Intent.ACTION_INSERT);
                intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,phonenumber);
                startActivity(intent);

            }
        });


    }
}