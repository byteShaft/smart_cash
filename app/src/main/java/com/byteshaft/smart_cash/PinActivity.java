package com.byteshaft.smart_cash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PinActivity extends AppCompatActivity {

    private Button mPayNowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        setTitle("PIN");
        mPayNowButton = findViewById(R.id.pay_now);
        mPayNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PinActivity.this, ReceiptActivity.class));
            }
        });

    }
}
