package com.springsecurity.springsecurityexample.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Customer {

    private int custId;
    private String custName;
}
