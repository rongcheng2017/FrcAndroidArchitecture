package com.plugin.test

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author: frc
 * @description:
 * @date:  4/14/21 4:35 PM
 *
 */
open class MyPlugin : Plugin<Project> {
    override fun apply(target: Project) {
       print(" MyPlugin is useful")
    }
}

// Dependencies.kt
const val jUnit = "junit:junit:4.12"
const val androidTestRunner = "com.android.support.test:runner:1.0.2"
const val androidTestRules = "com.android.support.test:rules:1.0.2"
const val mockkAndroid = "io.mockk:mockk-android:1.9"
const val mockk = "io.mockk:mockk:1.9"
const val espressoCore = "com.android.support.test.espresso:espresso-core:3.0.2"


