package com.example.android.messagecomposer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    public String txt = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void apology(View view)
    {
        //Log.v("apology","clicked");
        txt = getResources().getString(R.string.f1);
        send(txt);
    }

    public void thank(View view)
    {
        txt = getResources().getString(R.string.f2);
        send(txt);
    }


    public void busy(View view)
    {
        txt = getResources().getString(R.string.f3);
        send(txt);
    }

    public void bday(View view)
    {
        txt = getResources().getString(R.string.f4);
        send(txt);
    }

    public void send(String t)
    {

        EditText edt = (EditText) findViewById(R.id.edit);
        String s = (String) edt.getText().toString();
        //Log.v("send",""+s);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms",s,null));
        intent.putExtra("sms_body",t);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }
}
