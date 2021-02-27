package com.programmer.legend.development.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String password;

    private Integer restaurantId;
    private Integer menuId;

}
