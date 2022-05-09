package com.zh.sergei.learn.user.learning.user.controller;

import com.zh.sergei.learn.user.learning.user.service.UserInfoServiceImpl;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserInfoController {

    UserInfoServiceImpl userInfoServiceImpl;

    @GetMapping
    public ResponseEntity<String> getUserInfo() {
        return ResponseEntity.ok(userInfoServiceImpl.getUserInfo());
    }

}
