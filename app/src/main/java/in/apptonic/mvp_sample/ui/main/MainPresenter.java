package in.apptonic.mvp_sample.ui.main;

import in.apptonic.mvp_sample.data.DataManager;
import in.apptonic.mvp_sample.ui.base.BasePresenter;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {


    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {

        return getmDataManager().getEmailID();

    }

    @Override
    public void setUserLoggedOut(){

        getmDataManager().clear();
        getMvpView().openSplashActivity();

    }
}
