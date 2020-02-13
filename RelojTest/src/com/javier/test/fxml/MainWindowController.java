package com.javier.test.fxml;

import com.javier.componente.ComponenteReloj;
import com.javier.componente.EnHoraQueCoincide;
import com.javier.componente.Tarea;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private ComponenteReloj cp;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Tarea tarea=new Tarea(3, 23, 0, "Alarma comprar pan");
        Tarea tarea2=new Tarea(3, 23, 3, "Alarma comprar leche");
        cp.registarTarea(tarea);
        cp.registarTarea(tarea2);
        cp.borrarTarea(tarea2);
        cp.addEnHoraQueCoincide(new EnHoraQueCoincide() {
            @Override
            public void ejecuta(Tarea tarea) {
                System.out.println("Se ejecuta el listener");
            }
        });
        cp.iniciar();
    }
}
