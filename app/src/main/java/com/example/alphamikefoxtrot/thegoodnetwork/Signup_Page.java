package com.example.alphamikefoxtrot.thegoodnetwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Signup_Page extends Activity {
    protected EditText mUsername;
    protected EditText mEmailid;
    protected EditText mPassword;
    protected Button mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__page);


        //initialization
        mUsername =(EditText)findViewById(R.id.usernameRegisterEditText);
        mEmailid =(EditText)findViewById(R.id.emailRegisterEditText);
        mPassword =(EditText)findViewById(R.id.passwordRegisterEditText);
        mSignup = (Button)findViewById(R.id.registerButton);

        //listen to the sign up button
        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast

                Toast.makeText(Signup_Page.this,"You have successfully signed up",Toast.LENGTH_LONG).show();
                linkProfile();
            }
        });
    }

    private void linkProfile() {
        Intent intent= new Intent(getApplicationContext(),Profile_Page.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
