package in.apptonic.mvp_sample.data;

public class DataManager {

    SharedPrefsHelper mSharedPrefHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper){

        mSharedPrefHelper = sharedPrefsHelper;

    }

    public void clear(){

        mSharedPrefHelper.clear();
    }

    public void saveEmailID(String email){

        mSharedPrefHelper.putEmail(email);

    }

    public String getEmailID(){

        return mSharedPrefHelper.getEmail();
    }

    public void setLoggedIn(){

        mSharedPrefHelper.setLoggedInMODE(true);
    }

    public Boolean getLoggedInMode(){

        return mSharedPrefHelper.getLoggedInMode();
    }


}
