package com.jwttoken.controller;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TokenDTO {

    private String type;
    private String token;

}
