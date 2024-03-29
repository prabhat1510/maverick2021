package com.oauthserver.oauthserver.dto;

import lombok.*;
import java.io.Serializable;

/**
 * @Author : admi on 6/26/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AddressDTO implements Serializable {

    private String addressType;
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String province;
    private String postalCode;
}
