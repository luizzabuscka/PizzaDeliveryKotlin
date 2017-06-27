package com.luizzabuscka.pizzadelivery.presenter

import android.content.Intent
import com.luizzabuscka.pizzadelivery.view.LoginActivity
import com.luizzabuscka.pizzadelivery.util.ErrorsUtil
import com.luizzabuscka.pizzadelivery.view.MainActivity

/**
 * Created by luizzabuscka on 6/5/17.
 */

class LoginPresenter(val activity: LoginActivity) : ILoginPresenter {

    override fun validateLogin(login: String, password: String) {
        if (login.trim().isEmpty()) {
            activity.showError(ErrorsUtil.Login.EMPTY_LOGIN)
            return
        }

        if (password.trim().isEmpty()) {
            activity.showError(ErrorsUtil.Login.EMPTY_PASSWORD)
            return
        }


        //Put the logic of login here
        if (login == "luiz" && password == "1234") {
            activity.callNextActivity(Intent(activity, MainActivity::class.java))
        } else {
            activity.showError(ErrorsUtil.Login.WRONG_LOGIN_OR_PASSWORD)
        }
    }

}
