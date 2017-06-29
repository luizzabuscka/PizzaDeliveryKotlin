package com.luizzabuscka.pizzadelivery.presenter

import android.util.Log
import android.widget.ArrayAdapter
import com.luizzabuscka.pizzadelivery.R
import com.luizzabuscka.pizzadelivery.adapters.ProductsAdapter
import com.luizzabuscka.pizzadelivery.entities.Product
import com.luizzabuscka.pizzadelivery.repositories.ProductsRepository
import com.luizzabuscka.pizzadelivery.services.Factory
import com.luizzabuscka.pizzadelivery.util.ErrorsUtil
import com.luizzabuscka.pizzadelivery.view.IMainActivity
import com.luizzabuscka.pizzadelivery.view.MainActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by luizzabuscka on 6/26/17.
 */
class MainPresenter(val activity: MainActivity) : IMainPresenter {


    override fun getProducts() {

        val repository = ProductsRepository(Factory.create())
        repository.getProducts()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    result ->
                    val adapter = ProductsAdapter(result, R.layout.item_product) {
                        activity.itemClicked(it)
                    }
                    activity.fillList(adapter)
                }, {
                    error ->
                    error.printStackTrace()
                    activity.showError(ErrorsUtil.Main.ERROR_LOAD)
                })



    }

}