package com.example.appaaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class HirePurchaseCalc extends Activity {

    EditText vCarPrice, vDownPayment, vInterest;
    TextView vInstallmentPrice;
    Button vbtnCalculate;
    RadioGroup vRadioGrp;
    RadioButton vRadioBtn;

    public void onCreate (Bundle b) {
        super.onCreate(b);

        setContentView(R.layout.hirepurchasecalc);

        vCarPrice=findViewById(R.id.txtCarPrice);
        vDownPayment=findViewById(R.id.txtDownPayment);
        vInterest=findViewById(R.id.txtInterest);
        vInstallmentPrice=findViewById(R.id.txtInstallmentPrice);
        vbtnCalculate=findViewById(R.id.BtnCalc);
        vRadioGrp=findViewById(R.id.radioGrp);

        vbtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int CarPrice, DownPayment, Year;
                double Interest, Installment;

                CarPrice = Integer.parseInt(vCarPrice.getText().toString());
                DownPayment = Integer.parseInt(vDownPayment.getText().toString());

                int selectedId = vRadioGrp.getCheckedRadioButtonId();
                vRadioBtn = findViewById(selectedId);
                Year = Integer.parseInt(vRadioBtn.getText().toString());

                Interest = Double.parseDouble(vInterest.getText().toString());

                Installment = (((((CarPrice - DownPayment) * Interest) / 100 ) * Year ) + (CarPrice - DownPayment)) / (Year * 12);

                vInstallmentPrice.setText("RM " + String.format("%.2f", Installment));

            }
        });
    }
}
