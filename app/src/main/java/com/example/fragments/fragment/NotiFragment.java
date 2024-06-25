package com.example.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;


public class NotiFragment extends Fragment {

    EditText name,pass;
    Button submit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_noti, container, false);


        name = v.findViewById(R.id.name);
        pass = v.findViewById(R.id.pass);
        submit = v.findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String na = name.getText().toString();
                String ps = pass.getText().toString();

                if (na.equals("") || ps.equals(""))
                {
                    Toast.makeText(getContext(), "Fields Are Empty", Toast.LENGTH_SHORT).show();
                }
                else if (name.getText().toString().equals("ayush") || pass.getText().toString().equals("2110"))
                {
                    Toast.makeText(getContext(), "Successfully", Toast.LENGTH_SHORT).show();
//                    final Snackbar snackbar = Snackbar.make(getContext(), "Success", Snackbar.LENGTH_SHORT);
//                    View custom_view = getLayoutInflater().inflate(R.layout.i)
                }
                else
                {
                    Toast.makeText(getContext(), "Error...", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }
}