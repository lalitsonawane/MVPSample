package in.apptonic.mvp_sample.ui.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import in.apptonic.mvp_sample.MvpApp;
import in.apptonic.mvp_sample.R;
import in.apptonic.mvp_sample.data.DataManager;
import in.apptonic.mvp_sample.ui.base.MvpView;
import in.apptonic.mvp_sample.ui.splash.SplashActivity;
import in.apptonic.mvp_sample.ui.splash.SplashMvpView;

public class MainActivity extends Activity implements MainMvpView{


    TextView textViewShow;
    Button buttonLayout;
    MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context){

        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mainPresenter = new MainPresenter(dataManager);
        mainPresenter.onAttach(this);

        textViewShow = findViewById(R.id.textViewShow);
        buttonLayout = findViewById(R.id.buttonLogout);
        textViewShow.setText(mainPresenter.getEmailId());

        buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLoggedOut();

            }
        });
    }

    @Override
    public void openSplashActivity(){

        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
