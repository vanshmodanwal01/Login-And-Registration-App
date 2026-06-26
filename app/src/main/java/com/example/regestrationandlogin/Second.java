package com.example.regestrationandlogin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Second extends AppCompatActivity {
    Button b3,b4;
    EditText e3,e4;
    FirebaseAuth fa2;
    ProgressBar p2;
    MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        e3 = (EditText) findViewById(R.id.editTextText3);
        e4 = (EditText) findViewById(R.id.editTextText4);
        e4.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        fa2 = FirebaseAuth.getInstance();
        p2 = (ProgressBar) findViewById(R.id.progressBar2);
        mp = MediaPlayer.create(this,R.raw.ls);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e3.getText().toString().trim();
                String s2 = e4.getText().toString();
                
                if (s1.isEmpty())
                {
                    e3.setError("Enter Email ID");
                    return;
                }
                else
                {
                    if (s2.isEmpty())
                    {
                        e4.setError("Enter Password");
                        return;
                    }
                    else
                    {
                        p2.setVisibility(View.VISIBLE);
                        fa2.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    p2.setVisibility(View.INVISIBLE);
                                    Toast.makeText(Second.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                    mp.start();
                                    Intent i = new Intent(Second.this,MainActivity.class);
                                    startActivity(i);
                                    finish();

                                }
                                else
                                {
                                    p2.setVisibility(View.INVISIBLE);
                                    Toast.makeText(Second.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                    
                }
                

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(Second.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}