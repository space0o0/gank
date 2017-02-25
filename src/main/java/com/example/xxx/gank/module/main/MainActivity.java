package com.example.xxx.gank.module.main;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.xxx.gank.R;
import com.example.xxx.gank.annotation.ActivityFragmentInject;
import com.example.xxx.gank.base.BaseActivity;
import com.example.xxx.gank.bean.DataInfo;
import com.example.xxx.gank.common.Url;
import com.example.xxx.gank.http.HttpManager;
import com.example.xxx.gank.http.gankService;
import com.example.xxx.gank.module.newdata.NewDataFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@ActivityFragmentInject(contentViewId = R.layout.activity_main)
public class MainActivity extends BaseActivity implements NewDataFragment.OnFragmentInteractionListener{

    @Bind(R.id.bottom_navigation_bar)
    BottomNavigationBar bottomNavigationBar;


    gankService gankService;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    //4个fragment
    NewDataFragment newDataFragment;

    @Override
    protected void initView() {
        ButterKnife.bind(this);

        initBottomNavigationBar();
        initFragment();

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

    private void initFragment() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        newDataFragment = NewDataFragment.newInstance("最新");
        fragmentTransaction.replace(R.id.content_main, newDataFragment);
        fragmentTransaction.commit();
    }

    /**
     * 初始化bottomNavigationBar
     */
    private void initBottomNavigationBar() {
        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.gank_ic_new, "当日"))
                .addItem(new BottomNavigationItem(R.mipmap.gank_ic_list, "所有"))
                .addItem(new BottomNavigationItem(R.mipmap.gank_ic_hot_checked, "待定"))
                .addItem(new BottomNavigationItem(R.mipmap.gank_ic_others, "其他"))
                .initialise();

        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                fragmentTransaction = fragmentManager.beginTransaction();
                switch (position) {
                    case 0:
                        fragmentTransaction.replace(R.id.content_main, NewDataFragment.newInstance("最新"));

                        break;
                    case 1:
                        fragmentTransaction.replace(R.id.content_main, NewDataFragment.newInstance("所有"));

                        break;
                    case 2:
                        fragmentTransaction.replace(R.id.content_main, NewDataFragment.newInstance("待定"));

                        break;
                    case 3:
                        fragmentTransaction.replace(R.id.content_main, NewDataFragment.newInstance("其他"));

                        break;
                }
                fragmentTransaction.commit();

            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }


    private void getDataInfo() {
        gankService= HttpManager.getInstance().get(Url.data).create(com.example.xxx.gank.http.gankService.class);

        Call<DataInfo> call = gankService.getDataInfo("Android", "5", "1");

        call.enqueue(new Callback<DataInfo>() {
            @Override
            public void onResponse(Call<DataInfo> call, Response<DataInfo> response) {

                DataInfo info = response.body();
//                text.setText(info.getResults().get(0).getPublishedAt());
                toast(info.getResults().get(0).getPublishedAt());

            }

            @Override
            public void onFailure(Call<DataInfo> call, Throwable t) {

            }
        });
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
