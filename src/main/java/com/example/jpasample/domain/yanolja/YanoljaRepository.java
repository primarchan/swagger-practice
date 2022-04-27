package com.example.jpasample.domain.yanolja;

import com.example.jpasample.dto.SanhaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface YanoljaRepository extends JpaRepository<Yanolja, Long> {

    @Query("select y from Yanolja y where y.id= :id")
    public Yanolja findOne(@Param("id") Long id);
}
