package com.example.xxx.gank.module.main;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.xxx.gank.R;
import com.example.xxx.gank.annotation.ActivityFragmentInject;
import com.example.xxx.gank.base.BaseActivity;
import com.example.xxx.gank.bean.DataInfo;
import com.example.xxx.gank.http.gankService;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

@ActivityFragmentInject(contentViewId = R.layout.activity_main)
public class MainActivity extends BaseActivity {
    Retrofit retrofit;
    gankService gankService;
    OkHttpClient client;

    @Bind(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;

    @Override
    protected void initView() {
        ButterKnife.bind(this);

        initBottomNavigationBar();

//        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
//
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        builder.interceptors().add(interceptor);
//        client = builder.build();
//
//
//        retrofit = new Retrofit.Builder()
//                .baseUrl(Url.data)
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
//                .build();
//
//        gankService = retrofit.create(com.example.xxx.gank.http.gankService.class);
//
//        getDataInfo();



    }

    /**
     * 初始化bottomNavigationBar
     */
    private void initBottomNavigationBar(){
        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.gank_ic_hot_checked,"当日"))
        .addItem(new BottomNavigationItem(R.mipmap.gank_ic_hot_unchecked,"随机"))
        .addItem(new BottomNavigationItem(R.mipmap.gank_ic_hot_unchecked,"随机1"))
        .addItem(new BottomNavigationItem(R.mipmap.gank_ic_hot_unchecked,"随机2"));
    }


    private void getDataInfo() {
        Call<DataInfo> call = gankService.getDataInfo("Android", "5", "1");

        call.enqueue(new Callback<DataInfo>() {
            @Override
            public void onResponse(Call<DataInfo> call, Response<DataInfo> response) {

                DataInfo info = response.body();
//                text.setText(info.getResults().get(0).getPublishedAt());

            }

            @Override
            public void onFailure(Call<DataInfo> call, Throwable t) {

            }
        });
    }


}
