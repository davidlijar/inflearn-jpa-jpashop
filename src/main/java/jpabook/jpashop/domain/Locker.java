package jpabook.jpashop.domain;


import jakarta.persistence.*;

import java.util.concurrent.locks.Lock;

@Entity
public class Locker {
    @Id @GeneratedValue
    @Column(name = "LOCKER_ID")
    private Long id;

    private String name;

    @OneToOne(mappedBy = "locker")
    private Member member;

}
