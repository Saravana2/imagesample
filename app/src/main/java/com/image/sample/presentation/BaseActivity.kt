package com.image.sample.presentation

import androidx.appcompat.app.AppCompatActivity
import com.image.sample.presentation.di.Injector

open class BaseActivity : AppCompatActivity() {
    fun getAppInjector() = application as Injector
}