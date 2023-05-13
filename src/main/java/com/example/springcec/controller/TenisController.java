package com.example.springcec.controller;

import com.example.springcec.dominio.Tenis;

public class TenisController {

    public boolean isTenisValido(Tenis tenis) {
        return isModeloValido(tenis) && isMarcaValida(tenis) && isCorValida(tenis) && isTamanhoValido(tenis)
                && isPrecoValido(tenis) && isQuantidadeValida(tenis);
    }

    private boolean isModeloValido(Tenis tenis) {
        if ((tenis.getModelo().isEmpty())) {
            return false;
        }
        return true;
    }

    private boolean isMarcaValida(Tenis tenis) {
        if ((tenis.getMarca().isEmpty())) {
            return false;
        }
        return true;
    }

    private boolean isCorValida(Tenis tenis) {
        if ((tenis.getCor().isEmpty())) {
            return false;
        }
        return true;
    }

    private boolean isTamanhoValido(Tenis tenis) {
        if ((tenis.getTamanho().isEmpty())) {
            return false;
        }
        return true;
    }

    private boolean isPrecoValido(Tenis tenis) {
        if ((tenis.getPreco() == null)) {
            return false;
        }
        return true;
    }

    private boolean isQuantidadeValida(Tenis tenis) {
        if ((tenis.getQuantidade() < 0)) {
            return false;
        }
        return true;
    }
}
