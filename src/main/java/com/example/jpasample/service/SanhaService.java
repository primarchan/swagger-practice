package com.example.jpasample.service;

import com.example.jpasample.domain.sanha.Sanha;
import com.example.jpasample.dto.SanhaDTO;

import java.util.List;
import java.util.Optional;

public interface SanhaService {

    // 등록
    public void sanhaSave(SanhaDTO sanhaDTO) throws Exception;

    // 단건 조회
    public Optional<Sanha> sanhaFindById(Long id) throws Exception;

    // 전체 조회
    public List<Sanha> sanhaFindAll() throws Exception;

    // 수정
    public String sanhaUpdate(Long id, SanhaDTO sanhaDTO) throws Exception;

    // 삭제
    public String sanhaDelete(Long id) throws Exception;
}
