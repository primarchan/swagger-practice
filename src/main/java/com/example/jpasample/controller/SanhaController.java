package com.example.jpasample.controller;

import com.example.jpasample.domain.sanha.Sanha;
import com.example.jpasample.dto.SanhaDTO;
import com.example.jpasample.service.SanhaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/sanha")
@RestController
public class SanhaController {

    private final SanhaService sanhaService;

    // 등록
    @PostMapping("/register")
    public void register(@RequestBody SanhaDTO sanhaDTO) throws Exception{
        sanhaService.sanhaSave(sanhaDTO);
    }

    // 전체 조회
    @GetMapping("/list")
    public List<Sanha> getList() throws Exception {
        return sanhaService.sanhaFindAll();
    }

    // 단건 조회
    @GetMapping("/{id}")
    public Optional<Sanha> get(@PathVariable("id") Long id) throws Exception{
        return sanhaService.sanhaFindById(id);
    }

    // 수정
    @PutMapping("/{id}")
    public String update(@PathVariable("id") Long id, @RequestBody SanhaDTO sanhaDTO) throws Exception {
        return sanhaService.sanhaUpdate(id, sanhaDTO);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception {
        sanhaService.sanhaDeleteById(id);
    }
}
