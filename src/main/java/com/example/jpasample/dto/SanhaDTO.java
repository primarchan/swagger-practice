package com.example.jpasample.dto;

import com.example.jpasample.domain.yanolja.Yanolja;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@NoArgsConstructor
public class SanhaDTO {

    private Long id;

    private String phoneNo;

    private String Address;

    private String item;

    private Yanolja yanolja;

    private Long yanoljaId;

}
