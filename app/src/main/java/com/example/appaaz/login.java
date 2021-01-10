package com.example.appaaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends Activity {

    //declare the variables
    EditText vloginUsername, vloginPassword;
    Button vloginBtn;

    public void onCreate (Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.login); //using login.xml for view file

        //declare the function of assets by iID
        vloginUsername=findViewById(R.id.loginUsername);
        vloginPassword=findViewById(R.id.loginPassword);
        vloginBtn=findViewById(R.id.loginBtn);

        //login button onclick function
        vloginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Woi Woi Woi", Toast.LENGTH_LONG).show();
                String username, password;
                username = vloginUsername.getText().toString();
                password = vloginPassword.getText().toString();

                if (username.length()==0 || password.length()==0)
                {
                    Toast.makeText(getBaseContext(), "Username or Password is missing", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}
