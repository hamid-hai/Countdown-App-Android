package com.example.countdownappversionsecondaprilsurface;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

public class EditCountdownFragment extends Fragment implements DatePickerDialog.OnDateSetListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.countdownedit_main, container, false);

        AppCompatButton btnDatePicker = v.findViewById(R.id.buttonDatePicker);
        getChildFragmentManager();
        // https://developer.android.com/reference/androidx/fragment/app/Fragment#getFragmentManager()
        // Double check Fragment Manager has been removed
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getChildFragmentManager(), "date picker");
            }
        });

        return v;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

    }
}