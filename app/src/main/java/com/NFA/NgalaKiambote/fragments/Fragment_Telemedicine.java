package com.NFA.NgalaKiambote.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.NFA.NgalaKiambote.R;
import com.NFA.NgalaKiambote.adapters.Adapter_User;
import com.NFA.NgalaKiambote.models.Model_User;

import java.util.ArrayList;

public class Fragment_Telemedicine extends Fragment {

    public Fragment_Telemedicine() {

    }

    RecyclerView recyclerTelemedicine;
    Adapter_User adapterUser;
    ArrayList<Model_User> modelUserList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_telemedicine, container, false);

        recyclerTelemedicine = view.findViewById(R.id.recycler_telemedicine);

        recyclerTelemedicine.setHasFixedSize(true);
        recyclerTelemedicine.setLayoutManager(new LinearLayoutManager(getContext()));

        modelUserList = new ArrayList<>();
        adapterUser = new Adapter_User(getContext(), modelUserList);
        recyclerTelemedicine.setAdapter(adapterUser);

        showUsers();

        return view;
    }

    private void showUsers() {

    }

}