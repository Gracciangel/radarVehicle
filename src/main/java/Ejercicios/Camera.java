package Ejercicios;

import java.lang.reflect.Array;

public class Camera {
    int IdCamera;
    String cameraType;


    public Camera(int idCamera, String cameraType) {
        this.cameraType = cameraType;
        this.IdCamera = idCamera;
    }
    boolean type ;
    Verify verf = new Verify(1 , type) ;
    public void getPhoto(boolean activate, String[] data) {
        if(activate){
            type = true ;
            verf.report(type, data) ;

        }else{
            type = false;
            verf.report(type, data) ;
        }
    }

}