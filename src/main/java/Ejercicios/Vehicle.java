package Ejercicios;

public class Vehicle {
    int idVehicle;
    String modeloVehicle;
    String dominio ;
    String tipoVehicle ;
    //contructor
    public Vehicle(int idVehicle , String modeloVehicle , String dominio , String tipoVehicle){
        this.dominio = dominio ;
        this.idVehicle = idVehicle ;
        this.modeloVehicle = modeloVehicle ;
        this.tipoVehicle = tipoVehicle ;
    }
    // metodos

    public int velocidad(int hora , int km){
        return km / hora ;
    }
}
