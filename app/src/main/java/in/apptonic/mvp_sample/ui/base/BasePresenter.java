package in.apptonic.mvp_sample.ui.base;

import in.apptonic.mvp_sample.data.DataManager;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;

    public BasePresenter(DataManager dataManager){

    mDataManager = mDataManager;

    }

    @Override
    public void onAttach(V mvpView) {

    }

    public V getMvpView(){

        return mMvpView;

    }

    public DataManager getmDataManager() {
        return mDataManager;
    }
}
