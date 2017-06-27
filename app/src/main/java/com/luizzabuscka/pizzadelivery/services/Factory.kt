package com.luizzabuscka.pizzadelivery.services

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by luizzabuscka on 6/26/17.
 */
object Factory {

    val baseUrl = "http://www.mocky.io/"

    fun create(): IWebServices {
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()

        return retrofit.create(IWebServices::class.java);
    }

}