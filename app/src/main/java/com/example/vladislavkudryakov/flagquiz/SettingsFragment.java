package com.example.vladislavkudryakov.flagquiz;


import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Melo on 09.04.2018.
 */

public class SettingsFragment extends PreferenceFragment {
    // creates preferences GUI from preferences.xml file in res/xml
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences); // load from XML
    }
}
