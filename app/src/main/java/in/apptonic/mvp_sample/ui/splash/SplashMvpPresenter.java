package in.apptonic.mvp_sample.ui.splash;

import in.apptonic.mvp_sample.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();
}
