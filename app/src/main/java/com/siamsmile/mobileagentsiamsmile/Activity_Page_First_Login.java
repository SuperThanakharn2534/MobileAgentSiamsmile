package com.siamsmile.mobileagentsiamsmile;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by aligndev on 11-Oct-17.
 */

public class Activity_Page_First_Login extends AppCompatActivity {

     public  EditText Username ,Password;
     public   UserNameTask userNameTask = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        setContentView( R.layout.activity_page_first_login );
        try {
            hideActionBar();
            SetDataBase();
           Button();

        }catch (Exception e){}
    }

    public void  SetDataBase(){

         Username  = (EditText) findViewById(R.id.txtUsername);
          Password = (EditText) findViewById(R.id.txtPassword);
       // User  user = new User();
       // user.setUserName( Username.toString() );
       // user.setPassword( Password.toString() );
       // UserMGR userMGR = new UserMGR();
       // userMGR.InsertData(user,this);


    }

    public  void Button(){
        Button button = (Button)findViewById( R.id.NextpageOTP );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getBaseContext(), Activity_Page_Alert_OTP.class));
                attemptLogin();
            }
        } );
    }

    public void attemptLogin() {

        // Reset errors.
        Username.setError(null);
        Password.setError(null);
        // Store values at the time of the login attempt.
        String  mUser = Username.getText().toString();
        String  mPassword = Password.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // Check for a valid password.
        if (TextUtils.isEmpty(mPassword)) {
            Password.setError(getString(R.string.error_field_required));
            focusView = Password;
            cancel = true;
        } else if (mPassword.length() < 3) {
            Password.setError(getString(R.string.error_invalid_password));
            focusView = Password;
            cancel = true;
        }

        // Check for a valid email address.
        if (TextUtils.isEmpty(mUser)) {
            Username.setError(getString(R.string.error_field_required));
            focusView = Username;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            //  Message.setText(R.string.login_progress_signing_in);
            Intent it2 = new Intent(getBaseContext(),Activity_Page_Alert_OTP.class);
            startActivity(it2);
            Username.setText("");
            Password.setText("");

            userNameTask = new UserNameTask();
            userNameTask.execute((Void) null);
        }
    }

    public class UserNameTask extends AsyncTask<Void, Void, Boolean> {

        @Override
        protected Boolean doInBackground(Void... params) {
//            UserMGR userMGR = new UserMGR();
//            User  user = new User();
//           // user =  userMGR.SelectData(Username.getText().toString() ,Password.getText().toString() ,getBaseContext());
//
//
//            if(user != null){
//                Log.i("Log",user.getUserName());
//            }
            Intent it2 = new Intent(getBaseContext(),Activity_Page_Alert_OTP.class);
            startActivity(it2);
            return  null;
//            Username.setText("");
//            Password.setText("");

        }

        @Override
        protected void onPostExecute(final Boolean success) {

        }

        @Override
        protected void onCancelled() {

        }
    }

    private void hideActionBar() {
        //Hide the action bar only if it exists
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }






}
