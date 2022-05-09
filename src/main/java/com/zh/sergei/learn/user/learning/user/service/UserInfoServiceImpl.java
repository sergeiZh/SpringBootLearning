package com.zh.sergei.learn.user.learning.user.service;

import com.zh.sergei.learn.user.learning.user.annotation.LogTracking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @LogTracking
    public String getUserInfo() {
        List<String> arrList = new ArrayList<>();
        return "inside serv7ice class";
    }
}
