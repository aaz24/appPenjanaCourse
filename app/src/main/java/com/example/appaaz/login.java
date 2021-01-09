package com.example.appaaz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class login extends Activity {

    EditText loginUsername, loginPassword;
    Button loginBtn;
    public void onCreate (Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.login);

        loginUsername=findViewById(R.id.loginUsername);
        loginPassword=findViewById(R.id.loginPassword);
        loginBtn=findViewById(R.id.loginBtn);
    }

}
