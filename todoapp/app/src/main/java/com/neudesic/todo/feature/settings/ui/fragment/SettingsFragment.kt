package com.neudesic.todo.feature.settings.ui.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate.*
import androidx.preference.DropDownPreference
import androidx.preference.PreferenceFragmentCompat
import com.neudesic.todo.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_settings, rootKey)
    }
}