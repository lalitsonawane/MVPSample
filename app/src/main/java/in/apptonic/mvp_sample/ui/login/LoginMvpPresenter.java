package in.apptonic.mvp_sample.ui.login;

import in.apptonic.mvp_sample.ui.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);

}
