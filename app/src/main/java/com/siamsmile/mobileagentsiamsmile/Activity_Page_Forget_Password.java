package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by aligndev on 11-Oct-17.
 */

public class Activity_Page_Forget_Password extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_page_forget_password );
        SetButtom();
    }

    public  void  SetButtom(){

        Button button = (Button) findViewById( R.id.bt_nextpage_slectcheckbox );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Activity_Page_SelectCheckBox.class));
            }
        } );




    }


}
