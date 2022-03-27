package com.sam.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


import io.realm.Realm;

public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        EditText titleInput = findViewById(R.id.titleinput);
        EditText descriptionInput = findViewById(R.id.descriptioninput);
        MaterialButton saveBtn = findViewById(R.id.savebtn);

        Realm.init(getApplicationContext());
        Realm realm = Realm.getDefaultInstance();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = titleInput.getText().toString();
                String text = descriptionInput.getText().toString();
                long createdAt = System.currentTimeMillis();

                realm.beginTransaction();
                Notes note = realm.createObject(Notes.class);
                note.setTitle(title);
                note.setText(text);
                note.setCreatedAt(createdAt);
                realm.commitTransaction();
                Toast.makeText(getApplicationContext(), "Note Saved", Toast.LENGTH_SHORT).show();
                finish();
;
            }
        });
    }
}