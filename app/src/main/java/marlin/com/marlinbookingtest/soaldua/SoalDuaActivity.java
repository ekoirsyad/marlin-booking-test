package marlin.com.marlinbookingtest.soaldua;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import marlin.com.marlinbookingtest.R;
import marlin.com.marlinbookingtest.model.Response;

public class SoalDuaActivity extends AppCompatActivity implements SoalDuaViewInterface {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_dua);
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showData(Response response) {

    }

    @Override
    public void showError(String s) {

    }
}
