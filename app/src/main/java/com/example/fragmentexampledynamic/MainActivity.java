package com.example.fragmentexampledynamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        // Replace the contents of the container with the new fragment
        ft.add(R.id.fragment_container, new FragmentB(),"FragmentName");
        //or ft.replace(R.id.fragment_container, new FragmentB());

        // Complete the changes added above
        ft.commit();
    }

    public void update_greeting(View view) {
        //access the fragment by tag
        FragmentB fragmentB = (FragmentB)getSupportFragmentManager().findFragmentByTag("FragmentName");
        ((TextView)fragmentB.view.findViewById(R.id.b_textview)).setText(R.string.greeting2);
    }
}