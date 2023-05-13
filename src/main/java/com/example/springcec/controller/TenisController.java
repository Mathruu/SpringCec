package com.example.springcec.controller;

import com.example.springcec.dominio.Tenis;

public class TenisController {

    public boolean isTenisValido(Tenis tenis) {
        return isModeloValido(tenis);
    }

    private boolean isModeloValido(Tenis tenis) {
        if ((tenis.getModelo().isEmpty()) || (tenis.getMarca().isEmpty())) {
            return false;
        }
        return true;
    }
}
