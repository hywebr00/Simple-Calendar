package com.simplemobiletools.calendar.pro

import androidx.multidex.MultiDexApplication
import com.simplemobiletools.commons.extensions.baseConfig
import com.simplemobiletools.commons.extensions.checkUseEnglish

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
        baseConfig.apply {
            textColor = -16777216
            backgroundColor = -1
            primaryColor = -16777216
            navigationBarColor = -16777216
        }
    }
}
