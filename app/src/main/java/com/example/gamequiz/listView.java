package com.example.gamequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.Locale;

public class listView extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter mainAdapter;
    ImageView backToHome;
    EditText search;
    FirebaseRecyclerOptions<Model> options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        backToHome = (ImageView) findViewById(R.id.backToHome);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        search = findViewById(R.id.search);


        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(listView.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


        options = new FirebaseRecyclerOptions.Builder<Model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Score").orderByChild("email"), Model.class)
                        .build();

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().isEmpty() || charSequence.toString().equals(" ")) {
                    options =
                            new FirebaseRecyclerOptions.Builder<Model>()
                                    .setQuery(FirebaseDatabase.getInstance().getReference().child("Score").orderByChild("email"), Model.class)
                                    .build();
                } else {
                    options =
                            new FirebaseRecyclerOptions.Builder<Model>()
                                    .setQuery(FirebaseDatabase.getInstance().getReference().child("Score").orderByChild("email").startAt(search.getText().toString().toLowerCase()).endAt(search.getText().toString().toLowerCase() + "\uf8ff"), Model.class)
                                    .build();
                }
                mainAdapter.updateOptions(options);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mainAdapter = new MainAdapter(options);
        recyclerView.setAdapter(mainAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapter.stopListening();
    }
}