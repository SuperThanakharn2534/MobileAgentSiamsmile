package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by aligndev on 27-Sep-17.
 */

public class Activity_Page_Forwordpassword extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_forwordpassword );


        Button sent = (Button) findViewById(R.id.button_topincode);
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Activity_Page_CreatedPinCode.class));
            }
        });

    }






}

