package com.example.demoretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIService {

    @Headers({
            "Content-Type: application/json"
    })
    @POST("BoxAppMobile1.svc/App1_InsertMember")
    Call<Member> insertMember(@Body Member member);
}
