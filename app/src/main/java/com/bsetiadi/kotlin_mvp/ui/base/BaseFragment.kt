package com.bsetiadi.kotlin_mvp.ui.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Toast

@Suppress("UNCHECKED_CAST")
abstract class BaseFragment<in V: IBaseView, T: IBasePresenter<V>> : Fragment(), IBaseView {

    protected abstract var mPresenter : T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter.attachView(activity as V)
    }

    override fun getContext(): Context = activity!!

    override fun showError(error: String?) {
        Toast.makeText(activity, error, Toast.LENGTH_SHORT).show()
    }

    override fun showMessage(message: String?) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.dettachView()
    }
}