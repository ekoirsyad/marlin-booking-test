package marlin.com.marlinbookingtest.soaldua;

import marlin.com.marlinbookingtest.model.Response;

public interface SoalDuaViewInterface {

    void hideLoading();

    void showData(Response response);

    void showError(String s);

}
