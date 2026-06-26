package com.example.regestrationandlogin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    FirebaseAuth fa;
    ProgressBar p1;
    MediaPlayer mp;
    ImageView iv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editTextText);
        e2 = (EditText) findViewById(R.id.editTextText2);
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        p1 = (ProgressBar) findViewById(R.id.progressBar);
        fa = FirebaseAuth.getInstance();
        mp = MediaPlayer.create(this,R.raw.ls);
        iv = (ImageView)findViewById(R.id.imageView);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString().trim();
                String s2 = e2.getText().toString();
                if (s1.isEmpty())
                {
                    e1.setError("Fill Email ID");
                    return;
                }
                else
                {
                    if (s2.isEmpty())
                    {
                        e2.setError("Enter Password");
                        return;
                    }
                    else
                    {
                        p1.setVisibility(View.VISIBLE);
                        fa.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                    Intent i = new Intent(MainActivity.this,Third.class);
                                    startActivity(i);
                                    finish();
                                    mp.start();
                                    p1.setVisibility(View.INVISIBLE);
                                }
                                else
                                {

                                    Toast.makeText(MainActivity.this, "Email not registered or Password incorrect", Toast.LENGTH_SHORT).show();
                                    p1.setVisibility(View.INVISIBLE);
                                }
                            }
                        });
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this,Second.class);
                startActivity(i);
                finish();
            }
        });



    }
}