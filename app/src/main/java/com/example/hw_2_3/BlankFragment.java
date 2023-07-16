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

public class BlankFragment extends Fragment {

    private Button btn_minus1;
    private Button btn_plus1;
    private TextView tv_result;



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
        tv_result = requireActivity().findViewById(R.id.tv_result);
        btn_minus1 = requireActivity().findViewById(R.id.btn_minus1);
        btn_plus1 = requireActivity().findViewById(R.id.btn_plus1);


        btn_plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double carentNumber = Double.parseDouble(tv_result.getText().toString());
                carentNumber = carentNumber + 1;
                tv_result.setText(String.valueOf(carentNumber));
            }
        });
        btn_minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double carentNumber = Double.parseDouble(tv_result.getText().toString());
                carentNumber = carentNumber - 1;
                tv_result.setText(String.valueOf(carentNumber));
            }


        });
    }
}