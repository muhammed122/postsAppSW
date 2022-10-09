package com.example.postsapiappsw.data.source.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public abstract class RetrofitClient {

  //  private final static String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private final static String BASE_URL = "https://dev.kamashka.com/";
    private static Retrofit retrofit;


    public static WebService getWebService() {
        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        return retrofit.create(WebService.class);

    }


}
