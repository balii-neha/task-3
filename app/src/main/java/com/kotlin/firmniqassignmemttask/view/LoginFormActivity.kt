package com.kotlin.firmniqassignmemttask.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.circleapisdemo.utils.Utils
import com.kotlin.firmniqassignmemttask.R
import kotlinx.android.synthetic.main.loginform_activity.*


class LoginFormActivity : AppCompatActivity() {

    private var email = ""
    private var password = ""
    private var confirm_password = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginform_activity)

        inits()
    }

    private fun inits() {

        clickListener()

    }

    private fun clickListener() {
        submit_mButton.setOnClickListener(View.OnClickListener {

            /* check validation */
            checkValidation()
        })


    }

    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun checkValidation() {

        /* get Text from user input */
        email = email_mEt.text.toString()
        password = password_mEt.text.toString()
        confirm_password = confirmPassword_mEt.text.toString()

        if (email.equals("")) {
            email_mEt.setError("Enter email")
        } else if (!isEmailValid(email)) {
            email_mEt.setError("Please enter valid format")
        } else if (password.equals("")) {
            password_mEt.setError("Enter Password")

        } else if (confirm_password.equals("")) {
            confirmPassword_mEt.setError("Enter confirm password")
        } else if (!confirm_password.equals(password)) {
            confirmPassword_mEt.setError("Password is not matching")
        } else {
            Utils.alertDialog(this)
        }
    }
}