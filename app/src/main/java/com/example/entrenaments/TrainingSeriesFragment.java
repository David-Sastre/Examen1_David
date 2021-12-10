package com.example.entrenaments;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TrainingSeriesFragment extends ListFragment {

    private String[] entrenaments = {"Extremitats a Tope", "Agonia Màxima",
            "Entrenament especial", "Força i longitud",
    };

    private int[] images = {R.drawable.estirar,R.drawable.hard,R.drawable.full,R.drawable.top};

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_training_series, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Establecemos el Adapter a la Lista del Fragment
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, entrenaments));
    }

    public void onStart() {
        super.onStart();
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // Mostramos un mensaje con el elemento pulsado
        Toast.makeText(getActivity(), "Has elegido " + entrenaments[position],
                Toast.LENGTH_SHORT).show();
    }



    private Listener mListener;

    static interface Listener {
        void onItemClicked(long id);
    }


    public TrainingSeriesFragment() {
        // Required empty public constructor
    }
}