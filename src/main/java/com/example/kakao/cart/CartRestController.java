package com.example.kakao.cart;

import com.example.kakao._core.security.CustomUserDetails;
import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao._core.utils.ApiUtils.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class CartRestController {

    private final CartService cartListService;

    // TODO : (기능8) 장바구니 담기
    @PostMapping("/carts/add")
    public void addCartList (){
    }

    // TODO : (기능11) 주문하기 - (장바구니 업데이트)
    @PostMapping("/carts/update")
    public void update(){
    }

    // TODO : (기능9) 장바구니 보기 - (주문화면, 결재화면)
    @GetMapping("/carts")
    public void findAll(){
    }

    //TODO : 장바구니 비우기
    @PostMapping("/carts/clear")
    public void clear(){
    }
}
