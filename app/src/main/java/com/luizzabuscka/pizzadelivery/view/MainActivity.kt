package com.luizzabuscka.pizzadelivery.view

import android.widget.ArrayAdapter
import android.widget.Toast
import com.luizzabuscka.pizzadelivery.entities.Product
import com.luizzabuscka.pizzadelivery.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : android.support.v7.app.AppCompatActivity(), IMainActivity {

    var presenter: MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.luizzabuscka.pizzadelivery.R.layout.activity_main)

        presenter.getProducts()
    }

    override fun fillList(adapter: ArrayAdapter<Product>) {
        lvProducts.adapter = adapter
    }

    override fun showError(errorCode: Int) {
        Toast.makeText(this, "Erro ao carregar lista", Toast.LENGTH_LONG).show()
    }
}
