package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import Adapter.Adapter_Slide_Image;

/**
 * Created by aligndev on 27-Sep-17.
 */




public class Activity_Page_Login extends AppCompatActivity {

    ViewPager viewPager;
   Adapter_Slide_Image adapter;
   LinearLayout slidLayout;
    private  int dotscount;
    private ImageView[] dots;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_page_login);

        try {
            hideActionBar();


        }catch (Exception e){}

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        slidLayout  = (LinearLayout)findViewById(R.id.SlideDost);
        adapter = new Adapter_Slide_Image(this);
        viewPager.setAdapter(adapter);
         dotscount = adapter.getCount();
        dots = new ImageView[dotscount];

        for(int i= 0;i<dotscount;i++){
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(4,0,4,0);
            slidLayout.addView(dots[i],params);

        }
            dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {

                    for(int i=0;i<dotscount;i++){
                        dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));
                    }

                    dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);




        Button sent = (Button) findViewById(R.id.BT_LogIn);
        sent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getBaseContext(), Activity_Page_Main.class));
               // startActivity(new Intent(getBaseContext(), Activity_Page_CreatedPinCode.class));
                startActivity(new Intent(getBaseContext(), Activity_Page_LogInPinCode.class));
            }
        });

        String text = getString(R.string.msg_sample);
        String linkText = getString(R.string.msg_linkable);
        int start = text.indexOf(linkText);
        int end = start + linkText.length();

        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new CallToast(), start, end, 0);

        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(spannableString);
        textView.setMovementMethod(new LinkMovementMethod());

    }



     private class CallToast extends ClickableSpan {
        @Override
        public void onClick(View widget) {
            startActivity(new Intent(getBaseContext(),Activity_Page_Forget_Password.class));
        }
    }

     private void hideActionBar() {
        //Hide the action bar only if it exists
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


    }

     public class MyTimerTask extends TimerTask{

         @Override
         public void run() {

             Activity_Page_Login.this.runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     if(viewPager.getCurrentItem()==0){
                         viewPager.setCurrentItem(1);

                     }else if(viewPager.getCurrentItem() == 1){
                         viewPager.setCurrentItem(2);
                     }else if(viewPager.getCurrentItem() == 2){
                         viewPager.setCurrentItem(3);
                     }else if(viewPager.getCurrentItem() == 3){
                         viewPager.setCurrentItem(4);
                     }else if(viewPager.getCurrentItem() == 4){
                         viewPager.setCurrentItem(5);
                     }else if(viewPager.getCurrentItem() == 5){
                         viewPager.setCurrentItem(6);
                     }else if(viewPager.getCurrentItem() == 6){
                         viewPager.setCurrentItem(7);
                     }else if(viewPager.getCurrentItem() == 7){
                         viewPager.setCurrentItem(8);
                     }else if(viewPager.getCurrentItem() == 8){
                         viewPager.setCurrentItem(9);
                     }else if(viewPager.getCurrentItem() == 9){
                         viewPager.setCurrentItem(10);
                     }else if(viewPager.getCurrentItem() == 10){
                         viewPager.setCurrentItem(11);
                     }else {
                         viewPager.setCurrentItem(0);
                     }
                 }
             });




         }
     }





}
