package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

/**
 * Daggerのコンポーネントを定義
 */
@Component(modules = [StorageModule::class])
interface AppComponent {
    /**
     * RegistrationActivityはInjectを要求していることを表す
     */
    fun inject(activity: RegistrationActivity)

    fun inject(activity: MainActivity)


    /**
     * AppComponentのインスタンスを作る担当
     */
    @Component.Factory
    interface Factory {
        /**
         *　@param context 依存性グラフの中でContextインターフェースが必要になったときは、このインスタンスが使われる。
         */
        fun create(@BindsInstance context: Context): AppComponent
    }

}