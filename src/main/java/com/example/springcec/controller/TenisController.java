package com.example.springcec.controller;

import com.example.springcec.dominio.Tenis;

public class TenisController {
    
    public boolean isTenisValido(Tenis tenis) {
        return isModeloValido(tenis);
    }

    private boolean isModeloValido(Tenis tenis) {
        if ((tenis.getModelo().isEmpty()) || tenis.getModelo().length() < 2) {
            return false;
        }
    return true;
    }

    public boolean isMarcaValida(Tenis tenis) {
        if ((tenis.getMarca().isEmpty()) || tenis.getMarca().length() < 2) {
            return false;
        }
    return true;
    }
}
