package com.example.jpasample.service.impl;

import com.example.jpasample.domain.sanha.Sanha;
import com.example.jpasample.domain.sanha.SanhaRepository;
import com.example.jpasample.dto.SanhaDTO;
import com.example.jpasample.service.SanhaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SanhaServiceImpl implements SanhaService {

    private final SanhaRepository sanhaRepository;

    @Override
    public void sanhaSave(SanhaDTO sanhaDTO) throws Exception {
        Sanha sanha = new Sanha(sanhaDTO.getId(), sanhaDTO.getPhoneNo(), sanhaDTO.getAddress(), sanhaDTO.getItem(), sanhaDTO.getYanolja());
        sanhaRepository.save(sanha);
    }

    @Override
    public Optional<Sanha> sanhaFindById(Long id) throws Exception {
        return sanhaRepository.findById(id);
    }

    @Override
    public List<Sanha> sanhaFindAll() throws Exception {
        return sanhaRepository.findAll();
    }

    @Override
    public String sanhaUpdate(Long id, SanhaDTO sanhaDTO) throws Exception {
        if(sanhaRepository.findById(id).isEmpty()) {
            return "NOT EXIST";
        } else {
            Sanha sanha = new Sanha(sanhaDTO.getId(), sanhaDTO.getPhoneNo(), sanhaDTO.getAddress(), sanhaDTO.getItem(), sanhaDTO.getYanolja());
            sanhaRepository.save(sanha);
        }
        return "UPDATE SUCCESS";
    }

    @Override
    public String sanhaDelete(Long id) throws Exception {
        if(sanhaRepository.findById(id).isEmpty()) {
            return "NOT EXIST";
        } else {
            sanhaRepository.deleteById(id);
            return "DELETE SUCCESS";
        }
    }

}
