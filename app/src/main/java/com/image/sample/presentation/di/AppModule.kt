package com.image.sample.presentation.di

import android.content.Context
import com.image.sample.presentation.di.animal.AnimalSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [AnimalSubComponent::class])
class AppModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideAppContext(): Context = context.applicationContext
}