package com.example.springcec.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Tenis {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String marca;
    private String modelo;
    private String cor;
    private String tamanho;
    private Float preco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() { 
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() { 
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() { 
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() { 
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Float getPreco() { 
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}
