package com.luizzabuscka.pizzadelivery.view

import android.widget.ArrayAdapter
import com.luizzabuscka.pizzadelivery.entities.Product

/**
 * Created by luizzabuscka on 6/26/17.
 */
interface IMainActivity {

    fun fillList(adapter: ArrayAdapter<Product>)
    fun showError(errorCode: Int)

}