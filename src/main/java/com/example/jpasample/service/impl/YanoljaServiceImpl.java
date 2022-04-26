package com.example.jpasample.service.impl;

import com.example.jpasample.domain.sanha.Sanha;
import com.example.jpasample.domain.yanolja.Yanolja;
import com.example.jpasample.domain.yanolja.YanoljaRepository;
import com.example.jpasample.dto.SanhaDTO;
import com.example.jpasample.dto.YanoljaDTO;
import com.example.jpasample.service.YanoljaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class YanoljaServiceImpl implements YanoljaService {

    private final YanoljaRepository yanoljaRepository;

    @Override
    public void yanoljaSave(YanoljaDTO yanoljaDTO) throws Exception {
        Yanolja yanolja = new Yanolja(yanoljaDTO.getId(), yanoljaDTO.getPhoneNo(), yanoljaDTO.getAddress(), yanoljaDTO.getItem(), yanoljaDTO.getSanhaList());
        yanoljaRepository.save(yanolja);
    }

    @Override
    public Optional<Yanolja> yanoljaFindById(Long id) throws Exception {
        return yanoljaRepository.findById(id);
    }

    @Override
    public List<Yanolja> yanoljaFindAll() throws Exception {
        return yanoljaRepository.findAll();
    }

    @Override
    public String yanoljaUpdate(Long id, YanoljaDTO yanoljaDTO) throws Exception {
        if(yanoljaRepository.findById(id).isEmpty()) {
            return "NOT EXIST";
        } else {
            Yanolja yanolja = new Yanolja(yanoljaDTO.getId(), yanoljaDTO.getPhoneNo(), yanoljaDTO.getAddress(), yanoljaDTO.getItem(), yanoljaDTO.getSanhaList());
            yanoljaRepository.save(yanolja);
        }
        return "UPDATE SUCCESS";
    }

    @Override
    public String yanoljaDelete(Long id) throws Exception {
        if(yanoljaRepository.findById(id).isEmpty()) {
            return "NOT EXIST";
        } else {
            yanoljaRepository.deleteById(id);
            return "DELETE SUCCESS";
        }
    }

}
