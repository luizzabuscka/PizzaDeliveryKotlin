package com.luizzabuscka.pizzadelivery.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luizzabuscka.pizzadelivery.R
import com.luizzabuscka.pizzadelivery.presenter.ILoginPresenter
import com.luizzabuscka.pizzadelivery.presenter.LoginPresenter
import com.luizzabuscka.pizzadelivery.util.ErrorsUtil
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), ILoginActivity {


    val presenter: ILoginPresenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initUI();
    }

    fun initUI() {
        btLogin.setOnClickListener {
            val login = etLogin.text.toString()
            val password = etPassword.text.toString()
            presenter.validateLogin(login, password)
        }
    }


    override fun showError(errorType: Int) {
        if (errorType == ErrorsUtil.Login.EMPTY_LOGIN)
            Toast.makeText(this, getString(R.string.empty_login), Toast.LENGTH_LONG).show()
        else if (errorType == ErrorsUtil.Login.EMPTY_PASSWORD)
            Toast.makeText(this, getString(R.string.empty_password), Toast.LENGTH_LONG).show()
        else if (errorType == ErrorsUtil.Login.WRONG_LOGIN_OR_PASSWORD)
            Toast.makeText(this, getString(R.string.wrong_login_or_pass), Toast.LENGTH_LONG).show()
    }

    override fun callNextActivity(it: Intent) {
        startActivity(it)
        finish()
    }


}
