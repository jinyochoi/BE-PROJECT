package com.example.kakao.user;


import com.example.kakao._core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class UserRestController {

    //private final UserService userService;

    // TODO : (기능1) 회원가입
    @PostMapping("/join")
    public ResponseEntity<?> join() {

        return ResponseEntity.ok(ApiUtils.success(null));
    }

    // TODO : (기능2) 로그인
    @PostMapping("/login")
    //public ResponseEntity<?> login() {
    public void login() {
        // return 힌트
        // return ResponseEntity.ok().header(JwtTokenProvider.HEADER, jwt).body(ApiUtils.success(null));
    }

    // TODO : 중복 체크
    @PostMapping("/check")
    public ResponseEntity<?> check() {
        return ResponseEntity.ok(ApiUtils.success(null));
    }

    // TODO :  (기능3) - 로그아웃  -> 추후 프론트에서 localStorage JWT 토큰을 삭제하면 됨.
    @GetMapping("/logout")
    public void logout() {
    }
}
