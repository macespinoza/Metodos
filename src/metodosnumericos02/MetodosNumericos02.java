/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos02;

import BE.ValoresBE;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mac
 */
public class MetodosNumericos02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<ValoresBE> valores = new ArrayList();
        /*
        valores.add(new ValoresBE(100, -160));
        valores.add(new ValoresBE(200, -35));
        valores.add(new ValoresBE(300, -4.2));
        valores.add(new ValoresBE(400, 9));
        valores.add(new ValoresBE(500, 16.9));
        valores.add(new ValoresBE(600, 21.3));*/
        valores.add(new ValoresBE(1, 15));
        valores.add(new ValoresBE(2, 14));
        valores.add(new ValoresBE(3, 15));
        valores.add(new ValoresBE(4, 16));
        valores.add(new ValoresBE(5, 16));
        valores.add(new ValoresBE(6, 16));
        valores.add(new ValoresBE(7, 15));
        valores.add(new ValoresBE(8, 15));
        valores.add(new ValoresBE(9, 15));
        valores.add(new ValoresBE(10, 15));
        valores.add(new ValoresBE(11, 15));
        valores.add(new ValoresBE(12, 15));
        valores.add(new ValoresBE(13, 15));
        valores.add(new ValoresBE(14, 15));
        valores.add(new ValoresBE(16, 16));
        calcular(valores,11.5);
    }   
    public static double calcular(List<ValoresBE> valores,double valorDeCalculoX){
        for(int i=0;i<valores.size();i++){
            BigDecimal sumatoriaW = new BigDecimal(1);
            for(int j=0;j<valores.size();j++){
                if(i!=j){
                    sumatoriaW = sumatoriaW.multiply(new BigDecimal(1/(valores.get(i).getValorX()-valores.get(j).getValorX())));
                }  
            }
            valores.get(i).setValorW(sumatoriaW);
        }
        BigDecimal Calculo1 = new BigDecimal(1);
        BigDecimal Calculo2 = new BigDecimal(0);
        for(int k=0;k<valores.size();k++){
            Calculo1 = Calculo1.multiply(new BigDecimal(valorDeCalculoX-valores.get(k).getValorX()));
            BigDecimal calculoWY  = valores.get(k).getValorW().multiply(new BigDecimal(valores.get(k).getValorY()));
            BigDecimal CalculoDivisionWYX = calculoWY.divide(new BigDecimal(valorDeCalculoX-valores.get(k).getValorX()), new MathContext(2, RoundingMode.CEILING));
            Calculo2 = Calculo2.add(CalculoDivisionWYX);
        }
        Calculo1 = Calculo1.multiply(Calculo2);
        System.out.println("Resultado : " + Calculo1);
        return 0;
    }
}
