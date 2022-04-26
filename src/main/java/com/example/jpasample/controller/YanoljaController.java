package com.example.jpasample.controller;

import com.example.jpasample.domain.yanolja.Yanolja;
import com.example.jpasample.dto.YanoljaDTO;
import com.example.jpasample.service.YanoljaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/yanolja")
@RestController
public class YanoljaController {

    private final YanoljaService yanoljaService;

    // 등록
    @PostMapping("/register")
    public void register(@RequestBody YanoljaDTO yanoljaDTO) throws Exception{
        yanoljaService.yanoljaSave(yanoljaDTO);
    }

    // 전체 조회
    @GetMapping("/list")
    public List<Yanolja> getList() throws Exception {
        return yanoljaService.yanoljaFindAll();
    }

    // 단건 조회
    @GetMapping("/{id}")
    public Optional<Yanolja> get(@PathVariable("id") Long id) throws Exception{
        return yanoljaService.yanoljaFindById(id);
    }

    // 수정
    @PutMapping("/{id}")
    public String update(@PathVariable("id") Long id, @RequestBody YanoljaDTO yanoljaDTO) throws Exception {
        return yanoljaService.yanoljaUpdate(id, yanoljaDTO);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception {
        yanoljaService.yanoljaDelete(id);
    }
}
