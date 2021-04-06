package com.example.fragmentexampledynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    //View inflation/instantiation
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container,false);
    }
    // Setup requiring access to View starts here
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //setup here
        TextView textView = view.findViewById(R.id.b_textview);
        textView.setText(R.string.greeting);
        Button button = view.findViewById(R.id.b_button);
        button.setText(R.string.button_click);
    }

    // Parent Activity has finished loading, access parent views here
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
