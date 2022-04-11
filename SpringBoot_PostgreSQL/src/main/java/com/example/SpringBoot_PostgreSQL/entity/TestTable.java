package com.example.SpringBoot_PostgreSQL.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "tabela_testowa")
@Data
@NoArgsConstructor
public class TestTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String kolumna1;

    @Column
    private String kolumna2;

    @Column
    private String kolumna3;

    @Column
    private Integer kolumna4;

}
