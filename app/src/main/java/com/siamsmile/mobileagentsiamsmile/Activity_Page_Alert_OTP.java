package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/**
 * Created by aligndev on 11-Oct-17.
 */

public class Activity_Page_Alert_OTP extends AppCompatActivity {

    boolean isClicked = true;
    PopupWindow popUpWindow;
    ActionBar.LayoutParams layoutParams;
    LinearLayout mainLayout;
    Button btnClickHere;
    LinearLayout containerLayout;
    TextView tvMsg;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        setContentView( R.layout.activity_page_alert_otp );

        try {
            hideActionBar();
            PopoUp();
            ButtonCancle();
            ButtonOk();
        }catch (Exception e){}






    }


    private void hideActionBar() {
        //Hide the action bar only if it exists
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
    public  void  ButtonCancle(){

        Button  button = (Button) findViewById( R.id.cancle_tologin );
          button.setOnClickListener( new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  startActivity(new Intent(getBaseContext(), Activity_Page_First_Login.class));
              }
          } );
    }
    public  void  ButtonOk(){
        Button button = (Button) findViewById( R.id.ok_tocreate_OTP );
         button.setOnClickListener( new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(getBaseContext(), Activity_Page_Forword_password_OTP.class));
             }
         } );
    }
    public  void PopoUp(){

        //PopUp Page
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.5));

    }


}
