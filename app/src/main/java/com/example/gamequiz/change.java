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

public class change extends AppCompatActivity {
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
        registerBtn.setText("Change Password");
        user.setVisibility(View.INVISIBLE);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change.this, login.class);
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
        String password = pass.getText().toString();
        String reTypePass = repass.getText().toString();


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

        mAuth.getCurrentUser().updatePassword(password)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Successfully change pass", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }
}