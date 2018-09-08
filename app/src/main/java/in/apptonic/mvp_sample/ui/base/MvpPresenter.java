package in.apptonic.mvp_sample.ui.base;

public interface MvpPresenter<V extends MvpView>{

    void onAttach(V mvpView);
}
