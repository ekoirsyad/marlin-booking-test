package marlin.com.marlinbookingtest.soaldua;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import marlin.com.marlinbookingtest.model.Response;
import marlin.com.marlinbookingtest.network.NetworkApi;
import marlin.com.marlinbookingtest.network.NetworkService;

public class SoalDuaPresenter implements SoalDuaPresenterInterface {

    private SoalDuaViewInterface soalDuaViewInterface;
    private String TAG = "Soal Dua Presenter";

    SoalDuaPresenter(SoalDuaViewInterface soalDuaViewInterface) {
        this.soalDuaViewInterface = soalDuaViewInterface;
    }

    @Override
    public void getData() {
        getObservable().subscribe(getObserver());
    }

    private Observable<Response> getObservable() {
        return NetworkService.getRetrofit().create(NetworkApi.class)
                .getMarlin()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    private DisposableObserver<Response> getObserver() {
        return new DisposableObserver<Response>() {
            @Override
            public void onNext(Response response) {
                Log.d(TAG, "onNext() called with: response = [" + response + "]");
                soalDuaViewInterface.showData(response);
                soalDuaViewInterface.hideLoading();
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " + e.getMessage());
                e.printStackTrace();
                soalDuaViewInterface.showError("Error fetch data");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "Complete load data");
            }
        };
    }
}
