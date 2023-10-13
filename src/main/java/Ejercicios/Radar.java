package Ejercicios;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Radar {
    int IdRadar;
    String Lugar;
    int suportKm;

    //contructor
    public Radar(int id, String lugar, int kmSuport) {
        this.IdRadar = id;
        this.Lugar = lugar;
        this.suportKm = kmSuport;
    }

    int count = 0;
    Scanner mv = new Scanner(System.in);
    Scanner dv = new Scanner(System.in);
    Scanner tv = new Scanner(System.in);
    Scanner vkm = new Scanner(System.in);
    //instancia de camaras trasera y delantera
    Camera cm1 = new Camera(1, "angular");
    Camera cm2 = new Camera(2, "angular");
    // instancia de vehiculos

    public void activateCamera() {
        System.out.println("ingrese modelo de vehiculo: ");
        String modeloVehiculo = mv.nextLine();

        System.out.println("ingrese patente de vehiculo: ");
        String dominioVehiculo = dv.nextLine() ;

        System.out.println("ingrese tipo de vehiculo: ");
        String tipoVeiculo = tv.nextLine();

        System.out.println("ingrese velocidad") ;
        int velocidadKM = vkm.nextInt();
        Vehicle v1 = new Vehicle(count, modeloVehiculo, dominioVehiculo, tipoVeiculo);
        int km = v1.velocidad(1, velocidadKM);
        String[] dataVehicle  = {
                modeloVehiculo ,
                dominioVehiculo ,
                tipoVeiculo ,
        };

        if (km > this.suportKm) {

            cm1.getPhoto(true, dataVehicle) ;
            cm1.getPhoto(true, dataVehicle);
        } else {
            System.out.println("camara no activada");
        }

    }
}