package com.example.gamequiz;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";
    private FirebaseAuth mAuth;
    FirebaseUser mUser;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout android = findViewById(R.id.androidLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);
        final Button history = findViewById(R.id.history);
        final Button logout = findViewById(R.id.logoutbtn);
         change = findViewById(R.id.accountChange);


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                selectedTopicName = "java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);

                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "php";

                php.setBackgroundResource(R.drawable.round_back_white_stroke10);

                java.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        html.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "html";

                html.setBackgroundResource(R.drawable.round_back_white_stroke10);

                php.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        }));

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "android";
                
                android.setBackgroundResource(R.drawable.round_back_white_stroke10);

                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Select a Topic", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    intent.putExtra("selected topic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), listView.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), change.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(logout.getContext());
                builder.setTitle("Are you Sure?");
                builder.setMessage("want to logout IT QUIZ GAME?");

                builder.setPositiveButton("Logout", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mAuth.signOut();
                        sigOutUser();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(logout.getContext(), "Cancelled", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }

    private void sigOutUser() {
        Intent intent = new Intent(MainActivity.this, login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}