package com.bsetiadi.kotlin_mvp.ui.feature.main

import android.os.Bundle
import com.bsetiadi.kotlin_mvp.R
import com.bsetiadi.kotlin_mvp.ui.base.BaseActivity

class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {

    override var mPresenter: MainContract.Presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}