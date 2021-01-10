package com.example.appaaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends Activity {

    //declare the variables
    EditText loginUsername, loginPassword;
    Button loginBtn;

    public void onCreate (Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.login); //using login.xml for view file

        //declare the function of assets by iID
        loginUsername=findViewById(R.id.loginUsername);
        loginPassword=findViewById(R.id.loginPassword);
        loginBtn=findViewById(R.id.loginBtn);

        //login button onclick function
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Woi Woi Woi", Toast.LENGTH_LONG).show();
                String username, password;
                username = loginUsername.getText().toString();
                password = loginPassword.getText().toString();

                if (username.length()==0 || password.length()==0)
                {
                    Toast.makeText(getBaseContext(), "Username or Password is missing", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}
