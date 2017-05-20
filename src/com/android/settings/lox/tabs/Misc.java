package com.android.settings.lox.tabs;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import android.os.Bundle;
import com.android.settings.R;

import com.android.settings.SettingsPreferenceFragment;

public class Misc extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.lox_misc_tab);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.APPLICATION;
    }
}
