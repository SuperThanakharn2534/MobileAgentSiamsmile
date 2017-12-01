package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by aligndev on 25-Oct-17.
 */

public class Activity_Page_SelectCheckBox extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_page_selectcheckbox);

        //SetCheckBox();
        SetButton();

    }

    public  void SetCheckBox(){

        CheckBox checkBox_SMS  = (CheckBox)findViewById( R.id.cb_sms );
        CheckBox checkBox_email  = (CheckBox)findViewById( R.id.cb_email );
    }

    public  void SetButton(){

        Button button = (Button) findViewById( R.id.bt_selectData );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), Activity_Page_AgentLogin.class));
            }
        } );

    }

}
