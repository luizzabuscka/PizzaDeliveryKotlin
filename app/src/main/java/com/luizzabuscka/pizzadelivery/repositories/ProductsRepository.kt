package com.luizzabuscka.pizzadelivery.repositories


import com.luizzabuscka.pizzadelivery.entities.Product
import com.luizzabuscka.pizzadelivery.services.IWebServices
import io.reactivex.Observable

/**
 * Created by luizzabuscka on 6/26/17.
 */
class ProductsRepository(val service: IWebServices) {

    fun getProducts(): Observable<Array<Product>> {
        return service.getProducts()
    }

}

