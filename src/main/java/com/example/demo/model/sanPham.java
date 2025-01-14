package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="san_pham")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class sanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String tenSanPham;
}
