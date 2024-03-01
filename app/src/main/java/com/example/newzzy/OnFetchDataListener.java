package com.example.newzzy;

import com.example.newzzy.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message);
}
