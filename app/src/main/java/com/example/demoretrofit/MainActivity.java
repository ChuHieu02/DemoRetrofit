package com.example.demoretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvHoivien;
    private String imageData = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvHoivien = (RecyclerView) findViewById(R.id.rcv_Hoivien);


        Gymmember gymmember1 = new Gymmember("2019-07-14", "2000-01-01",
                "CN000001", "113", "", "", "",
                false, "Ha Noi", "", "Test123", "",
                "", imageData, "a.jpg", "");
        Member member1 = new Member("admin", "gymmaster", gymmember1);

        insertMember(member1);


    }

    private void insertMember(Member member) {
        Retrofit retrofit = RetrofitClient.getRetrofitClient();
        APIService api = retrofit.create(APIService.class);
        Call<Member> call = api.insertMember(member);
        call.enqueue(new Callback<Member>() {
            @Override
            public void onResponse(Call call, Response response) {
                if (response.code() == 200) {
                    Toast.makeText(MainActivity.this, "Thêm thành công", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Thêm thất bại", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "Thêm thất bại", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
