package com.bsetiadi.kotlin_mvp.ui.base

open class BasePresenter<V : IBaseView> : IBasePresenter<V> {

    private var mView : V? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun dettachView() {
        mView = null
    }
}