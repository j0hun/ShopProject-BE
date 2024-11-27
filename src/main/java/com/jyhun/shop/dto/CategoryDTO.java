package com.jyhun.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    private Long id;
    private String name;
    private List<ProductDTO> productDTOList;

}
