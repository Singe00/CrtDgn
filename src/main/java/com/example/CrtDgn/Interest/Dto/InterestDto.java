package com.example.CrtDgn.Interest.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InterestDto {
    private String email;
    private Long tourid;
    private String token;
}