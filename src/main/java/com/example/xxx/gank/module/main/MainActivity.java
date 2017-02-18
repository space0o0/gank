package com.example.xxx.gank.module.main;

import android.util.Log;
import android.widget.TextView;

import com.example.xxx.gank.R;
import com.example.xxx.gank.annotation.ActivityFragmentInject;
import com.example.xxx.gank.base.BaseActivity;
import com.example.xxx.gank.bean.DataInfo;
import com.example.xxx.gank.bean.DayInfo;
import com.example.xxx.gank.bean.FundBean;
import com.example.xxx.gank.common.ConstantSet;
import com.example.xxx.gank.common.Url;
import com.example.xxx.gank.http.gankService;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.logger.Logger;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@ActivityFragmentInject(contentViewId = R.layout.activity_main)
public class MainActivity extends BaseActivity {
    Retrofit retrofit;
    gankService gankService;
    OkHttpClient client;

    @Bind(R.id.text)
    TextView text;

    @Override
    protected void initView() {
        ButterKnife.bind(this);


        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
//        builder.addNetworkInterceptor(new LogInterceptor());

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.interceptors().add(interceptor);
        client = builder.build();


        retrofit = new Retrofit.Builder()
                .baseUrl(Url.data)
                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
                .build();

        gankService = retrofit.create(com.example.xxx.gank.http.gankService.class);


        new Thread(new Runnable() {
            @Override
            public void run() {
//                getDayInfo();
                getDataInfo();
//                testGetFund();
            }
        }).start();
    }


    public void getDayInfo() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Url.dayData)
                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
                .build();


        Call<DayInfo> call = gankService.getDayInfo("2015", "08", "06");

        call.enqueue(new Callback<DayInfo>() {
            @Override
            public void onResponse(Call<DayInfo> call, Response<DayInfo> response) {
                Gson gson = new Gson();
                DayInfo list = gson.fromJson(response.body().toString(), new TypeToken<DayInfo>() {
                }.getType());
                Log.d(ConstantSet.TAG_HTTP, "category:" + response.body().toString());
            }

            @Override
            public void onFailure(Call<DayInfo> call, Throwable t) {
                toast("请求失败");
            }
        });
    }

    JSONObject jsonObject;

    private void getDataInfo() {
        Call<DataInfo> call = gankService.getDataInfo("Android", "5", "1");

        call.enqueue(new Callback<DataInfo>() {
            @Override
            public void onResponse(Call<DataInfo> call, Response<DataInfo> response) {

//                DataInfo info = new Gson().fromJson(response.body().toString(), new TypeToken<DataInfo>() {
//                }.getType());
                try {
                    jsonObject = new JSONObject(response.body().getResults().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                JsonParser parser = new JsonParser();
                String retVal = parser.parse(response.body().toString()).getAsString();

//                text.setText(response.body().toString());
//                DataInfo info2 = new Gson().fromJson(response.body().toString(), DataInfo.class);
//                DataInfo info = parseJSON(response.body().toString(), DataInfo.class);

                DataInfo info=response.body();
                text.setText(info.getResults().get(0).getPublishedAt());

            }

            @Override
            public void onFailure(Call<DataInfo> call, Throwable t) {

            }
        });
    }

    public static String JSONTokener(String in) {
        // consume an optional byte order mark (BOM) if it exists
        if (in != null && in.startsWith("\ufeff")) {
            in = in.substring(1);
        }
        return in;
    }


    private void testGetFund() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://mobile.ytfjr.com")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        com.example.xxx.gank.http.gankService gk = retrofit.create(com.example.xxx.gank.http.gankService.class);

        JSONObject json = new JSONObject();
        try {
            json.put("action", "GetAllFundList");
            json.put("controller", "fund");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json.toString());
        Call<FundBean> call = gk.getFund(body);
        call.enqueue(new Callback<FundBean>() {
            @Override
            public void onResponse(Call<FundBean> call, Response<FundBean> response) {
                JSONObject json;
                try {
                    json = new JSONObject(response.body().toString());
                    Logger.i("fundBean", response.body().getData().size() + "//.//");

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                Gson gson = new Gson();
//                FundBean fundBean=gson.fromJson(response.body().toString(),FundBean.class);
            }

            @Override
            public void onFailure(Call<FundBean> call, Throwable t) {

            }
        });

    }


    public static <T> T parseJSON(String json, Class<T> tClass) {
        Gson gson = new Gson();
        T info = gson.fromJson(json, tClass);
        return info;
    }


}
