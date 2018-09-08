package in.apptonic.mvp_sample.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import in.apptonic.mvp_sample.BaseActivity;

import in.apptonic.mvp_sample.MvpApp;
import in.apptonic.mvp_sample.R;
import in.apptonic.mvp_sample.data.DataManager;

import in.apptonic.mvp_sample.utils.CommonUtils;

public class LoginActivity extends BaseActivity implements LoginMvpView {


    LoginPresenter loginPresenter;
    EditText editTextEmail, editTextPassword;
    Button button;

    public static Intent getStartIntent(Context context){

        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        loginPresenter = new LoginPresenter(dataManager);

        loginPresenter.onAttach(this);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });

    }

    @Override
    public void openMainActivity() {

        String emailId = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        if (!CommonUtils.isEmailValid(emailId)) {

            Toast.makeText(this, "Enter Correct Email Id", Toast.LENGTH_LONG).show();
            return;
        }

        if (password == null || password.isEmpty()) {

            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show();
            return;
        }

        loginPresenter.startLogin(emailId);

    }

    @Override
    public void onLoginButtonClick() {

    }
}
