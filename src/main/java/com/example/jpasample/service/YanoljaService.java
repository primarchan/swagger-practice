package com.example.jpasample.service;

import com.example.jpasample.domain.yanolja.Yanolja;
import com.example.jpasample.dto.YanoljaDTO;

import java.util.List;
import java.util.Optional;

public interface YanoljaService {

    // 등록
    public void yanoljaSave(YanoljaDTO yanoljaDTO) throws Exception;

    // 단건 조회
    public Optional<Yanolja> yanoljaFindById(Long id) throws Exception;

    // 전체 조회
    public List<Yanolja> yanoljaFindAll() throws Exception;

    // 수정
    public String yanoljaUpdate(Long id, YanoljaDTO yanoljaDTO) throws Exception;

    // 삭제
    public String yanoljaDelete(Long id) throws Exception;

}
