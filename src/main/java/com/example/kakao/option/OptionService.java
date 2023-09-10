package com.example.kakao.option;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class OptionService {

    private final OptionJPARepository optionRepository;

    public List<OptionResponse.FindByProductIdDTO> findByProductId(int id) {

    }

    public List<OptionResponse.FindAllDTO> findAll() {

    }

    public String findOptionNameByOptionId(int id) {
        return optionRepository.findById(id).get().getOptionName();
    }
}
