package com.neudesic.todo.feature.settings.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.neudesic.todo.R
import com.neudesic.todo.feature.settings.ui.fragment.SettingsFragment

class SettingsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, SettingsFragment())
            .commit()
    }
}