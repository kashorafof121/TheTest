package com.example.android.thetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailBox ;
    EditText pass1Box ;
    EditText pass2Box;
    EditText numberBox ;
    TextView con;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailBox = (EditText) findViewById(R.id.email);
        pass1Box = (EditText) findViewById(R.id.pass);
        pass2Box = (EditText) findViewById(R.id.again);
        numberBox = (EditText) findViewById(R.id.mob);
        con = (TextView) findViewById(R.id.cont);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailBox.getText().toString();
                String pass1 = pass1Box.getText().toString();
                String pass2 = pass2Box.getText().toString();
                String num = numberBox.getText().toString();

                if (pass2.matches(pass1)){
                Bundle data = new Bundle();
                data.putString("email", email);
                data.putString("pass",pass1);
                data.putString("mobile", num);
                Intent changePage = new Intent(MainActivity.this , show.class);
                changePage.putExtras(data);
                startActivity(changePage);

                }


                else {
                    Toast.makeText(MainActivity.this , "The two passwords isn't matched" , Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}
