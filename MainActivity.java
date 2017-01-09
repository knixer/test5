package com.example.christopherono.adaptermednote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String NOTE_ID_EXTRA = "com.example.christopherono.adaptermednote.Identifier";
    public static final String NOTE_TITLE_EXTRA = "com.example.christopherono.adaptermednote.Title";
    public static final String NOTE_MESSAGE_EXTRA = "com.example.christopherono.adaptermednote.Message";
    public static final String NOTE_CATEGORY_EXTRA = "com.example.christopherono.adaptermednote.Category";
    public static final String NOTE_FRAGMENT_TO_LOAD_EXTRA = "com.example.christopherono.adaptermednote.Fragment_To_Load";

    public enum FragmentToLaunch{VIEW, EDIT};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
