package com.london.newsapp.di

import android.app.Application
import com.london.newsapp.data.manger.LocalUserMangerImpl
import com.london.newsapp.domain.manger.LocalUserManger
import com.london.newsapp.domain.usecases.AppEntryUseCase
import com.london.newsapp.domain.usecases.ReadAppEntryUseCase
import com.london.newsapp.domain.usecases.SaveAppEntryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ): AppEntryUseCase = AppEntryUseCase(
        readAppEntryUseCase = ReadAppEntryUseCase(localUserManger),
        saveAppEntryUseCase = SaveAppEntryUseCase(localUserManger)
    )

}