package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by aligndev on 27-Sep-17.
 */

public class Activity_Page_Forword_password_OTP extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature( Window.FEATURE_NO_TITLE);
       // setContentView( R.layout.activity_page_alert_otp );
        setContentView(R.layout.activity_page_forword_password_otp);

        try {
            hideActionBar();
            Select_Buttom_Return_Forwordpass();

        }catch (Exception e){}

    }

    public void  Select_Buttom_Return_Forwordpass(){

        Button sent = (Button) findViewById(R.id.button_topincode);
        sent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Activity_Page_CreatedPinCode.class));
            }
        });


    }

    private void hideActionBar() {
        //Hide the action bar only if it exists
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }



}
