package com.oauthserver.oauthserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Mr  training admi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_code")
public class OauthCodeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
//    @Lob
    private byte[] authentication;
}
