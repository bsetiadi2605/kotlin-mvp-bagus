package com.bsetiadi.kotlin_mvp.ui.base

import android.content.Context

interface IBaseView {

    fun getContext() : Context
    fun showError(error : String?)
    fun showMessage(message : String?)

}