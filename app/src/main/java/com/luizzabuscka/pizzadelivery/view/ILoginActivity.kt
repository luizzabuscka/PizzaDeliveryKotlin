package com.luizzabuscka.pizzadelivery.view

import android.content.Intent

/**
 * Created by luizzabuscka on 6/19/17.
 */
interface ILoginActivity {
    fun showError(errorType: Int)
    fun callNextActivity(it: Intent)

}