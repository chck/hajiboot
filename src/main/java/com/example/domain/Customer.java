package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by chck on 2015/11/07.
 */
@Data
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}
