package com.water.service;

import com.water.entity.Apply;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 朱晨乾 on 2017/7/17.
 */
public interface ApplyService {

    public void addApply();

//    public Apply sendApplication(String idApply, Double longitude, Double latitude, String number, String address, Integer postcode, Date applyDate, Integer state, String image, String waterAddress);

    public boolean updateState(long id,Integer state);

    public Apply addApplication(Long idApply, Double longitude, Double latitude, String number, String address, Date applyDate, Integer state,String image, String name, String waterAddress);

    public Apply searchApplication(long idApply);

    public ArrayList<Apply> getApplicationList(int state);

    public boolean deleteApply(long id);
}
