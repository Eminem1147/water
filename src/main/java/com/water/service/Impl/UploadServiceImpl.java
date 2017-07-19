package com.water.service.Impl;

import com.water.dao.UploadDao;
import com.water.entity.Sample;
import com.water.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * Created by 朱晨乾 on 2017/7/17.
 */
@Service
public class UploadServiceImpl implements UploadService {
    @Autowired
    private UploadDao uploadDao;

    public void addUpload() {
        Sample sample = new Sample();
        sample.setIdSample(Long.valueOf(1564654));
        sample.setImage("dsfasdfasg");
        sample.setLatitude(5.65446);
        sample.setLongitude(8.546);
        sample.setRemark("23333");
        sample.setVolume(2.454);
        uploadDao.save(sample);
    }
}
