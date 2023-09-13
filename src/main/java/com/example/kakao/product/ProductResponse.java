package com.example.kakao.product;

import com.example.kakao.option.Option;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

public class ProductResponse {

    @Getter @Setter
    public static class FindAllDTO {
        private int id;
        private String productName;
        private String description;
        private String image;
        private int price;
        private List<OptionDTO> options;

        public FindAllDTO(Product product, List<Option> optionList){
            this.id = product.getId();
            this.productName = product.getProductName();
            this.description = product.getDescription();
            this.image = product.getImage();
            this.price = product.getPrice();
            this.options = optionList.stream().map(OptionDTO::new).collect(Collectors.toList());
        }

        @Getter @Setter
        public class OptionDTO {
            private int id;
            private String optionName;
            private int price;

            public OptionDTO(Option option){
                this.id = option.getId();
                this.optionName = option.getOptionName();
                this.price = option.getPrice();
            }
        }
    }


    @Getter @Setter
    public static class FindByIdDTO extends FindAllDTO{

        public FindByIdDTO(Product product, List<Option> optionList){
            super(product, optionList);
        }
    }
}
