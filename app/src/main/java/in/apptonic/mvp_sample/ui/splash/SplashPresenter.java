package in.apptonic.mvp_sample.ui.splash;

import in.apptonic.mvp_sample.data.DataManager;
import in.apptonic.mvp_sample.ui.base.BasePresenter;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {
    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    public void decideNextActivity(){

        if (getmDataManager().getLoggedInMode()){

            getMvpView().openMainActivity();

        } else {

            getMvpView().openLoginActivity();

        }
    }
}
