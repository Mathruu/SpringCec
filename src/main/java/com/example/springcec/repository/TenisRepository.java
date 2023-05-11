package com.example.springcec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springcec.dominio.Tenis;

public interface TenisRepository extends JpaRepository<Tenis, Long> {
    
    public Tenis getByModelo(String modelo);

}
