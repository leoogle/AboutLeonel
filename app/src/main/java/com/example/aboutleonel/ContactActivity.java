package com.example.aboutleonel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView linkedinTv = (TextView) findViewById(R.id.linkedinTv);
        linkedinTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://ve.linkedin.com/in/leonel-duran-366475112"));
                startActivity(linkedinIntent);
            }
        });
        TextView phoneTv = (TextView) findViewById(R.id.phoneTv);
        phoneTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel: +56 9 62704294"));
                startActivity(callIntent);

            }
        });
    }
}
