/*
 * Copyright (c) Team 7, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 *
 */

package com.team7.cmput301.android.theirisproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.team7.cmput301.android.theirisproject.UserListAdapter;
import com.team7.cmput301.android.theirisproject.IrisProjectApplication;
import com.team7.cmput301.android.theirisproject.R;
import com.team7.cmput301.android.theirisproject.controller.IrisController;
import com.team7.cmput301.android.theirisproject.model.CareProvider;
import com.team7.cmput301.android.theirisproject.model.Patient;
import com.team7.cmput301.android.theirisproject.model.User;
import com.team7.cmput301.android.theirisproject.model.User.UserType;

import java.util.List;

/**
 * ViewProfileActivity is for allowing the patient to view their profile information.
 * @author caboteja
 */


public class ViewProfileActivity extends IrisActivity {

    private User user;

    private TextView name;
    private TextView email;
    private TextView phone;

    private TextView usersLabel;
    private ListView usersListView;

    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_view_profile);

        user = IrisProjectApplication.getCurrentUser();

        name = findViewById(R.id.view_profile_name_text_view);
        email = findViewById(R.id.view_profile_email_text_view);
        phone = findViewById(R.id.view_profile_phone_text_view);
        usersLabel = findViewById(R.id.view_profile_users_text_view);
        usersListView = findViewById(R.id.view_profile_users_list_view);

        name.setText(user.getName());
        email.setText(user.getEmail());
        phone.setText(user.getPhone());

        List<? extends User> users;
        String label;
        if (user.getType() == UserType.PATIENT) {
            Patient patient = (Patient) user;
            users = patient.getCareProviders();
            label = getString(R.string.view_profile_users_care_providers);
        } else {
            CareProvider careProvider = (CareProvider) user;
            users = careProvider.getPatients();
            label = getString(R.string.view_profile_users_patients);
        }

        usersLabel.setText(label);

        adapter = new UserListAdapter(this, R.layout.list_care_provider_item, (List<User>) users);
        usersListView.setAdapter(adapter);
    }

    @Override
    protected IrisController createController(Intent intent) {
        return null;
    }
}
