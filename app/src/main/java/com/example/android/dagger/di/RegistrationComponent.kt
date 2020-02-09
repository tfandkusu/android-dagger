package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

/**
 * @Subcomponentをつけて
 *
 * あるスコープをつけたComponentに対して、おなじスコープをつけた注入対象クラスのインスタンスはシングルインスタンスになる。
 */
@Subcomponent
@ActivityScope
interface RegistrationComponent {

    /**
     * Factoryを作って
     */
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    /**
     * 注入したいクラスを列挙する
     */
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}