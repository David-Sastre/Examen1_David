package com.example.entrenaments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrainingInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrainingInfoFragment extends ListFragment {
    private String[] entrenaments = {"Extremitats a Tope", "Agonia Màxima",
            "Entrenament especial", "Força i longitud",
    };
    private int[] images = {R.drawable.estirar,R.drawable.hard,R.drawable.full,R.drawable.top};

    public TrainingInfoFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_training_series, container, false);
    }

    public static TrainingInfoFragment newInstance(){
        TrainingInfoFragment fragment = new TrainingInfoFragment();
        Bundle args = new Bundle();
        args.putString("nom", String.valueOf(Entrenament.entrenaments[fragment.getSelectedItemPosition()]));
        fragment.setArguments(args);
        return fragment;
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

}