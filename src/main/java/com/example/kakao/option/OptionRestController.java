package com.example.kakao.option;

import com.example.kakao._core.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OptionRestController {

    private final OptionService optionService;

    /**
     * @param id
     *  TODO : ProductId에 해당하는 Option 조회
     * @return
     * 성공 시 Option 리스트 반환
     */
    @GetMapping("/products/{id}/options")
    public ResponseEntity<?> findByProductId(@PathVariable int id) {

    }

    /**
     * @return
     * TODO : Option 전체 반환
     */
    @GetMapping("/options")
    public ResponseEntity<?> findAll() {

    }
}
