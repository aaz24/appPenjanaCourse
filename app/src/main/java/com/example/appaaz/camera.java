package com.example.appaaz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class camera extends Activity {

    Button vBtnCamera;
    ImageView vImgView;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.camera);
        vImgView = findViewById(R.id.imgView);
        vBtnCamera = findViewById(R.id.btnCamera);
        vBtnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent CameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

            }
        });
    }

}
