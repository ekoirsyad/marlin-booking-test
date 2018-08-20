package marlin.com.marlinbookingtest.network;

import io.reactivex.Observable;
import marlin.com.marlinbookingtest.model.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface NetworkApi {

    @Headers("Authorization: \"BearereyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOlwvXC9hcGkubWFybGluYm9va2luZy5uZXRcL2F1dGhcL2xvZ2luIiwiaWF0IjoxNTM0MjM4NTk1LCJleHAiOjE1MzY3NzY1OTUsIm5iZiI6MTUzNDIzODU5NSwianRpIjoieTROYVdwWUhCUGtESTVqUCIsInN1YiI6NDI0NiwicHJ2IjoiODdlMGFmMWVmOWZkMTU4MTJmZGVjOTcxNTNhMTRlMGIwNDc1NDZhYSJ9.WVvdGmzzbeT4OATqorFF0RVILRWC5D8lVdhFcyxLTOk\"")
    @GET("product/open")
    Observable<Response> getMarlin();
}
