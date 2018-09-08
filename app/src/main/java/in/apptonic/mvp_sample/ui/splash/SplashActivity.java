package in.apptonic.mvp_sample.ui.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import in.apptonic.mvp_sample.MvpApp;
import in.apptonic.mvp_sample.R;
import in.apptonic.mvp_sample.data.DataManager;
import in.apptonic.mvp_sample.ui.login.LoginActivity;
import in.apptonic.mvp_sample.ui.main.MainActivity;

public class SplashActivity extends Activity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {

        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_slash);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();

        mSplashPresenter = new SplashPresenter(dataManager);

        mSplashPresenter.onAttach(this);

        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {

        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();

    }

    @Override
    public void openLoginActivity() {

        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();

    }
}
