package com.renato.entities;

import com.renato.entities.enums.Color;

public abstract class FormaAbstrata implements Forma {

    protected Double espessura;
    protected Color cor; // enum

    public FormaAbstrata() {
    }

    public FormaAbstrata(Double espessura, Color cor) {
        this.espessura = espessura;
        this.cor = cor;
    }

    public Double getEspessura() {
        return espessura;
    }

    public void setEspessura(Double espessura) {
        this.espessura = espessura;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

}