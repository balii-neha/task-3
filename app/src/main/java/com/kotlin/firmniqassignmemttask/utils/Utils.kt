package com.kotlin.circleapisdemo.utils

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AlertDialog
import com.kotlin.firmniqassignmemttask.MyApplication
import com.kotlin.firmniqassignmemttask.R
import java.util.regex.Pattern

object Utils {
    fun isEmailValid(email: String): Boolean {
        return Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
        ).matcher(email).matches()
    }


    fun alertDialog(context: Context) {
        val alertDialog: AlertDialog.Builder = AlertDialog.Builder(context)
        alertDialog.setTitle("OK")
        alertDialog.setMessage("Welcome ")
        alertDialog.setPositiveButton("Yes") { dialog, id ->
            dialog.cancel()
        }
        alertDialog.setNegativeButton("Cancel") { dialog, id ->
            dialog.cancel()
        }

        val alert = alertDialog.create()
        alert.setCanceledOnTouchOutside(false)
        alert.show()
        val negativeButton = alert.getButton(DialogInterface.BUTTON_NEGATIVE)
        negativeButton.setTextColor(Color.BLACK)

        val positiveButton = alert.getButton(DialogInterface.BUTTON_POSITIVE)
        positiveButton.setTextColor(Color.BLACK)
    }
}