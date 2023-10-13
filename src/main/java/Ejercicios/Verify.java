package Ejercicios;

import java.sql.SQLOutput;

public class Verify {
    int idVerify ;
    boolean denunciado;

    public Verify(int idVerify, boolean denunciado){
        this.idVerify = idVerify ;
        this.denunciado = denunciado;
    }
    public void report(boolean report, String[] data){
        String sl = "\n" ;
        if(report){
            System.out.println("***** REPORTE EMITIDO *****");
            for (int i = 0 ; i < data.length ; i++){
                System.out.println("modelo vehiculo: "+ data[i]+ sl
                + "patente vehiculo: "+ data[i + 1] +sl +
                        "tipo vehiculo: "+ data[i + 2 ]);
                break;
            }
        }else{
            System.out.println("REPORTE NO EMITIDO");
        }
    }


}
