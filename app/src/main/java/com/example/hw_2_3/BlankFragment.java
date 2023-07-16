package com.example.hw_2_3;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment extends Fragment {

    private Button one;
    private Button two;
    private TextView zero;
    private int i = +1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        zero = requireActivity().findViewById(R.id.zero);
        one = requireActivity().findViewById(R.id.one);
        two = requireActivity().findViewById(R.id.two);
        
        switch (view.getId()){
            case R.id.one:
                zero.setText(+1) ;
                break;
            case R.id.two:
                zero.setText(-1);
                break;
        }

    }

}