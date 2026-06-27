package com.example.regestrationandlogin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Third extends AppCompatActivity {
    Button b5,b6;
    EditText e1,e2,e3;

    FirebaseAuth fa3;
    MediaPlayer mp;
    DatabaseReference dr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        fa3 = FirebaseAuth.getInstance();
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button7);
        e1 = (EditText)findViewById(R.id.editTextText5);
        e2 = (EditText)findViewById(R.id.editTextText6);
        e3 = (EditText)findViewById(R.id.editTextText7);
        mp = MediaPlayer.create(this,R.raw.ls);
        dr = FirebaseDatabase.getInstance().getReference("users");
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fa3.signOut();
                mp.start();

                Intent k = new Intent(Third.this,MainActivity.class);
                startActivity(k);
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if (s3.length()!=10)
                {
                    e3.setError("Enter 10 digit number");
                }
                else
                {
                    if (s1.isEmpty())
                    {
                        e1.setError("Enter name");
                    }
                    else
                    {
                        if (s2.isEmpty())
                        {
                            e2.setError("Enter email id");
                        }
                        else
                        {
                            users user = new users(s1,s2,s3);
                            dr.child(s3).setValue(user);
                            Toast.makeText(Third.this, "Data updated", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }
}