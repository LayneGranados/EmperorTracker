package com.emperor_tracare.emperortracker.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.emperor_tracare.emperortracker.R;
import com.emperor_tracare.emperortracker.model.MyApplication;
import com.emperor_tracare.emperortracker.model.Person;
import com.google.android.gms.maps.model.Circle;

import de.hdodenhof.circleimageview.CircleImageView;


public class AccountFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account, container, false);
        CircleImageView profileImage = (CircleImageView)view.findViewById(R.id.profile_image_edit_account);
        TextView name = (TextView) view.findViewById(R.id.textView_name_edit_account);
        Person person = ((MyApplication)getActivity().getApplication()).getPersonSigned();
        name.setText(person.getNombre());
        profileImage.setImageResource(Person.findImageByUsername(person.getUsuario()));
        return view;
    }


}
