package com.example.jpasample.dto;

import com.example.jpasample.domain.sanha.Sanha;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@NoArgsConstructor
@Slf4j
public class YanoljaDTO {

    private Long id;

    private String phoneNo;

    private String address;

    private String item;

    private List<Sanha> sanhaList;
}
