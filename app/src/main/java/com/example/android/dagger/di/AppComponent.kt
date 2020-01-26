package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Daggerのコンポーネントを定義
 * シングルトンを使いたいときは @Singleton をつける。
 */
@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class /*ここでSubcomponentsも指定する*/])
interface AppComponent {
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

    /**
     * MainActivityは注入を使いたい
     */
    fun inject(activity: MainActivity)


    fun registrationComponent(): RegistrationComponent.Factory


}