package in.apptonic.mvp_sample;

import android.app.Application;
import android.content.SharedPreferences;

import in.apptonic.mvp_sample.data.DataManager;
import in.apptonic.mvp_sample.data.SharedPrefsHelper;

public class MvpApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
