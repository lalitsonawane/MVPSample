package in.apptonic.mvp_sample.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefsHelper {

    public static final String MY_PREFS = "MY_PREFS";
    public static final String EMAIL = "EMAIL";

    SharedPreferences mSharedPreferences;

    public SharedPrefsHelper (Context context){

        mSharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public void clear(){

        mSharedPreferences.edit().clear().apply();

    }

    public String getEmail() {

        return mSharedPreferences.getString(EMAIL, null);

    }
        public void putEmail(String email) {
            mSharedPreferences.edit().putString(EMAIL, email).apply();
        }


    public boolean getLoggedInMode(){

        return mSharedPreferences.getBoolean("IS_LOGGED_IN", false);

    }

    public void setLoggedInMODE(Boolean loggedIn){

        mSharedPreferences.edit().putBoolean("IS_LOGGED_IN", loggedIn).apply();

    }


}
