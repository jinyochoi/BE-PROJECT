package com.example.kakao.product;

import com.example.kakao._core.errors.exception.Exception400;
import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao.option.Option;
import com.example.kakao.option.OptionJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductJPARepository productRepository;
    private final OptionJPARepository optionRepository;

    public ProductResponse.FindByIdDTO findById(int id) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new Exception404("해당 상품이 존재하지 않습니다."));

        List<Option> options = optionRepository.findByProductId(product.getId());
        return new ProductResponse.FindByIdDTO(product, options);
    }

    public List<ProductResponse.FindAllDTO> findAll(int page) {
        Pageable pageable = PageRequest.of(page, 10);
        Page<Product> result = productRepository.findAll(pageable);
        List<Product> products = result.getContent();

        List<ProductResponse.FindAllDTO> findAllDTOList = products.stream().map(product -> {
            List<Option> options = optionRepository.findByProductId(product.getId());
            return new ProductResponse.FindAllDTO(product, options);
        }).collect(Collectors.toList());

        return findAllDTOList;
    }
}
