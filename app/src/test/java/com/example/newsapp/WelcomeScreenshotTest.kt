package com.example.newsapp

import android.view.View
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class WelcomeScreenshotTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        theme = "Theme.NewsApp",
        showSystemUi = false,
    )

    @Test
    fun welcome() {
        val view = paparazzi.inflate<View>(R.layout.activity_welcome)
        paparazzi.snapshot(view, "welcome")
    }
}
