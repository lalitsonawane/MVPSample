package in.apptonic.mvp_sample.ui.login;


import in.apptonic.mvp_sample.data.DataManager;
import in.apptonic.mvp_sample.ui.base.BasePresenter;

class LoginPresenter <V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V>{


    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {

   getmDataManager().saveEmailID(emailId);
   getmDataManager().setLoggedIn();
   getMvpView().openMainActivity();

    }


}
