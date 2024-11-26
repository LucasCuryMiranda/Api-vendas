package com.api_vendinha.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "produtos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "name")
    private String name ;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "preco")
    private BigInteger preco;
    @Column
    private Boolean is_active;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
