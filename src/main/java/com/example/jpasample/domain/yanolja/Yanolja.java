package com.example.jpasample.domain.yanolja;

import com.example.jpasample.domain.sanha.Sanha;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Yanolja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "YANOLJA_ID")
    private Long id;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ITEM")
    private String item;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "yanolja")
    private List<Sanha> sanhaList = new ArrayList<>();

    public Yanolja(Long id, String phoneNo, String address, String item, List<Sanha> sanhaList) {
        this.id = id;
        this.phoneNo = phoneNo;
        this.address = address;
        this.item = item;
        this.sanhaList = sanhaList;
    }

}
