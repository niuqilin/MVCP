package com.example.bin.myapplication.mvp;

import io.reactivex.observers.DisposableObserver;

/**
 * description
 *
 * @author bin
 * @date 2018/3/8 17:36
 */
public class PresenterLifecycleObserver<T> extends DisposableObserver<T> {

    public PresenterLifecycleObserver(BaseViewModel viewModel) {
        viewModel.addDisposable(this);
    }

    @Override
    public void onNext(T t) {
    }

    @Override
    public void onError(Throwable e) {
    }

    @Override
    public void onComplete() {
    }
}
