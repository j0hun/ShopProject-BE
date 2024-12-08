package com.jyhun.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

    private Long id;
    private String email;
    private String name;
    private String phoneNumber;
    private String password;
    private String role;
    private List<OrderItemDTO> orderItemList;
    private AddressResponseDTO address;

}
