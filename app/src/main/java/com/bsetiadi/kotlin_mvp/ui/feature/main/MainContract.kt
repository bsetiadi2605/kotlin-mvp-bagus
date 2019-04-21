package com.bsetiadi.kotlin_mvp.ui.feature.main

import com.bsetiadi.kotlin_mvp.ui.base.IBasePresenter
import com.bsetiadi.kotlin_mvp.ui.base.IBaseView

object MainContract {

    interface View : IBaseView {

    }

    interface Presenter : IBasePresenter<View> {

    }

}