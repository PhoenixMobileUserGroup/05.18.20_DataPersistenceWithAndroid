package com.neudesic.todo.feature.settings.ui.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate.*
import androidx.preference.DropDownPreference
import androidx.preference.PreferenceFragmentCompat
import com.neudesic.todo.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences_settings, rootKey)

//TODO for next mobile user group
//        val dayNightPreferences = findPreference<DropDownPreference>("useDayNightTheme")
//        dayNightPreferences?.setOnPreferenceChangeListener { _, newValue ->
//            when(newValue.toString()) {
//                "Light" -> setDefaultNightMode(MODE_NIGHT_NO)
//                "Dark" -> setDefaultNightMode(MODE_NIGHT_YES)
//                "Auto" -> setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
//            }
//            true
//        }
    }
}