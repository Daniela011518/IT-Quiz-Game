package com.example.gamequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

public class register extends AppCompatActivity {
    private FirebaseAuth mAuth;
    TextView backBtn;
    EditText user, pass, repass;
    FirebaseUser mUser;
    Button registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        backBtn = (TextView) findViewById(R.id.backBtn);
        user = (EditText) findViewById(R.id.user);
        repass = (EditText) findViewById(R.id.repassword);
        pass = (EditText) findViewById(R.id.password);
        mUser = mAuth.getCurrentUser();
        registerBtn = findViewById(R.id.registration);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this, login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrationForm();
            }
        });

    }

    private void registrationForm() {
        String email = user.getText().toString();
        String password = pass.getText().toString();
        String reTypePass = repass.getText().toString();

        if(email.isEmpty()){
            user.setError("Email is Required");
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

        if(!password.equals(reTypePass)){
            repass.setError("Password not matched");
            repass.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(register.this, "Your Account Has been created!", Toast.LENGTH_SHORT).show();
                            Toast.makeText(register.this, "Welcome to Anagrammer", Toast.LENGTH_SHORT).show();
                            nextActivity();
                        } else {

                            AlertDialog.Builder builder = new AlertDialog.Builder(registerBtn.getContext());
                            builder.setTitle("Email has Taken");
                            builder.setMessage("Please use another email Address");

                            builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(register.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                                }
                            });
                            builder.show();
                        }
                    }
                });

    }

    private void nextActivity() {
        Intent intent = new Intent(register.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}