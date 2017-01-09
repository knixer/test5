package com.example.christopherono.adaptermednote;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class NoteDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_detail);
        createAndAddFragment();
    }

    private void createAndAddFragment(){
        //grab intent and fragment to launch from our main activity list fragment
        Intent intent = getIntent();
        MainActivity.FragmentToLaunch fragmentToLaunch = (MainActivity.FragmentToLaunch)
                intent.getSerializableExtra(MainActivity.NOTE_FRAGMENT_TO_LOAD_EXTRA);

        //grabbing our fragment manager and our fragment transaction so that we can add our edit
        //or view fragment dynamically
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //välja rätt fragment
        switch(fragmentToLaunch){
            case EDIT:
                //Create and add note-edit fragment to NoteDetailActivity if thats what we want to launch
                NoteEditFragment noteEditFragment = new NoteEditFragment();
                setTitle(R.string.editFragmentTitle);
                fragmentTransaction.add(R.id.note_container, noteEditFragment, "NOTE_EDIT_FRAGMENT");

                break;

            case VIEW:
                //Create and add note-view fragment to NoteDetailActivity if thats what we want to launch
                NoteViewFragment noteViewFragment = new NoteViewFragment();
                setTitle(R.string.viewFragmentTitle);
                fragmentTransaction.add(R.id.note_container, noteViewFragment, "NOTE_VIEW_FRAGMENT");
                break;
        }

        fragmentTransaction.commit();
    }
}
