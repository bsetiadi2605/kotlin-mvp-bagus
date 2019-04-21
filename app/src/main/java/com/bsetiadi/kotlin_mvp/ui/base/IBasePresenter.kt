package com.bsetiadi.kotlin_mvp.ui.base

interface IBasePresenter<in V : IBaseView> {

    fun attachView(view: V)
    fun dettachView()

}