package com.souzaemerson.ui.dialog

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun genericDialog(context: Context, title: String? = null, message: String) {
    return AlertDialog.Builder(context)
        .setTitle(title)
        .setMessage(message)
        .create()
        .show()
}