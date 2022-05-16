package com.rafli.userl;

import static com.rafli.userl.RegisterActivity.fromHtml;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ActivityFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView tvCreateAccount = (TextView) findViewById(R.id.tvCreateAccount);

        tvCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityFirst.this, RegisterActivity.class));
            }
        });

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityFirst.this, LoginActivity.class));
            }
        });

        TextView Admin = (TextView)findViewById(R.id.Admin);

        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityFirst.this, LoginActivity.class));
            }
        });

        TextView Staff = (TextView)findViewById(R.id.Staff);

        Staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityFirst.this, LoginActivity.class));
            }
        });

        TextView About = (TextView)findViewById(R.id.About);

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityFirst.this, LoginActivity.class));
            }
        });
    }
}