package com.example.android.thetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class show extends AppCompatActivity {

    boolean showen;
    ImageView image;
    String pass;
    TextView emailBox;
    TextView passwordBox;
    TextView mobileBox;
    String pass2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Bundle data= getIntent().getExtras();
        String email =data.getString("email");
        pass =data.getString("pass");
        String mobile = data.getString("mobile");

        emailBox = (TextView) findViewById(R.id.email_box);
        passwordBox = (TextView) findViewById(R.id.pass_box);
        mobileBox  = (TextView) findViewById(R.id.mobile_box);

        for (int i =0 ; i< pass.length() ; i++){
            pass2+="*";
        }

        emailBox.setText(email);
        passwordBox.setText(pass2);
        mobileBox.setText(mobile);

        showen = false;
         image = (ImageView) findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!showen){
                    image.setImageResource(R.drawable.untitled);
                    passwordBox.setText(pass);
                    showen = true;

                }
                else {
                    image.setImageResource(R.drawable.see);
                    passwordBox.setText(pass2);
                    showen =false;

                }

            }
        });

    }
}
