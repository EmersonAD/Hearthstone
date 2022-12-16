package com.souzaemerson.ui.dialog

import android.content.Context
import androidx.appcompat.app.AlertDialog

private fun genericDialog(context: Context, message: String) {
    return AlertDialog.Builder(context)
        .setMessage(message)
        .create()
        .show()
}