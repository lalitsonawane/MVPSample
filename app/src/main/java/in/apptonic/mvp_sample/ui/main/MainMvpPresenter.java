package in.apptonic.mvp_sample.ui.main;

import in.apptonic.mvp_sample.ui.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();
    void setUserLoggedOut();

}
