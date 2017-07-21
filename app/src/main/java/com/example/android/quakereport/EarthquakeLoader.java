package com.example.android.quakereport;


import java.util.List;
import android.content.Context;
import android.content.AsyncTaskLoader;

/**
 * Created by nxf31834 on 7/21/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    /** 日志消息标签 */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** 查询 URL */
    private String mUrl;
    public EarthquakeLoader(Context context,String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        // 执行网络请求、解析响应和提取地震列表。
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}