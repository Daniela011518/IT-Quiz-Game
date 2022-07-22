package com.example.gamequiz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    TextView signup,forgot;
    EditText user, pass;
    FirebaseUser mUser;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = findViewById(R.id.signup);
        mAuth = FirebaseAuth.getInstance();
        user =  findViewById(R.id.usern);
        pass =  findViewById(R.id.passw);
        mUser = mAuth.getCurrentUser();
        login =  findViewById(R.id.loginBtn);
        forgot = findViewById(R.id.forgotBtn);

        if(mUser != null){
            startActivity(new Intent(login.this, MainActivity.class));
        }

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,register.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,ResetActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = user.getText().toString().trim();
                String password = pass.getText().toString().trim();
                Date time = Calendar.getInstance().getTime();

                SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
                String formattedDate = df.format(time);

                if(email.isEmpty()){
                    user.setError("Full Name is Required");
                    user.requestFocus();
                    return;
                }

                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    user.setError("Provide a Valid Email");
                    user.requestFocus();
                    return;
                }

                if(password.isEmpty()){
                    pass.setError("Provide a Valid Email");
                    pass.requestFocus();
                    return;
                }

                if(password.length()< 6){
                    pass.setError("Minimum of Six Characters");
                    pass.requestFocus();
                    return;
                }

                mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            nextToGame();
                            Toast.makeText(login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(login.this, "Login Failed ", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }
        });
    }



    private void nextToGame() {
        Intent intent = new Intent(login.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}