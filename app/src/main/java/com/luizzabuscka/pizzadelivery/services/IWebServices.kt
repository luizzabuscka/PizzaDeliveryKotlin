package com.luizzabuscka.pizzadelivery.services


import com.luizzabuscka.pizzadelivery.entities.Product
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * Created by luizzabuscka on 6/26/17.
 */
interface IWebServices {

    @GET("/v2/59519b150f0000a600a3d645")
    fun getProducts(): Observable<Array<Product>>
}