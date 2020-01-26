package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
 * モジュールはabstract classで定義する
 */
@Module
abstract class StorageModule {
    /**
     * Storageインターフェースの実装はSharedPreferencesStorageである。
     */
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

}