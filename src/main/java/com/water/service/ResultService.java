package com.water.service;

import com.water.entity.Result;

/**
 * Created by zhanglei on 2017/7/27.
 */
public interface ResultService {
    public boolean addResult(Result result);
    public Result findResultByID(long idResult);
}