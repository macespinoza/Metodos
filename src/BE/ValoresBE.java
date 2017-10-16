/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.math.BigDecimal;

/**
 *
 * @author Mac
 */
public class ValoresBE {
    private double valorX;
    private double valorY;
    private BigDecimal valorW;
    
    public ValoresBE(double valorX, double valorY) {
        this.valorX = valorX;
        this.valorY = valorY;
    }

    public double getValorX() {
        return valorX;
    }

    public void setValorX(double valorX) {
        this.valorX = valorX;
    }

    public double getValorY() {
        return valorY;
    }

    public void setValorY(double valorY) {
        this.valorY = valorY;
    }

    public BigDecimal getValorW() {
        return valorW;
    }

    public void setValorW(BigDecimal valorW) {
        this.valorW = valorW;
    }

    
    
}
