package com.example.jpasample.domain.sanha;

import com.example.jpasample.domain.yanolja.Yanolja;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Sanha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SANHA_ID")
    private Long id;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ITEM")
    private String item;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "YANOLJA_ID")
    private Yanolja yanolja;

    public Sanha(Long id, String phoneNo, String address, String item, Yanolja yanolja) {
        this.id = id;
        this.phoneNo = phoneNo;
        this.address = address;
        this.item = item;
        this.yanolja = yanolja;
    }

    public static Sanha createSanha(String phoneNo, String address, String item, Yanolja yanolja) {
        Sanha sanha = new Sanha();
        sanha.setYanolja(yanolja);
        sanha.setPhoneNo(phoneNo);
        sanha.setAddress(address);
        sanha.setItem(item);
        return sanha;
    }

}
