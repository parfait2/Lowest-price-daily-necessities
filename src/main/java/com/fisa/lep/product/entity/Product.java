package com.fisa.lep.product.entity;

import com.fisa.lep.common.BaseEntity;
import com.fisa.lep.mart.entity.Mart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "product")
@Entity
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    private String name; // 상품명

    private BigDecimal price; // 판매가격

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mart_id")
    private Mart mart; // 판매업소

}