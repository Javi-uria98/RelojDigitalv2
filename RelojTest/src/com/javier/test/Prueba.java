package com.javier.test;

import com.javier.componente.ComponenteReloj;
import com.javier.componente.EnHoraQueCoincide;
import com.javier.componente.Tarea;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Prueba extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox=new VBox();
        ComponenteReloj cp=new ComponenteReloj();
        Date date = new Date();
        Tarea tarea = new Tarea(2, 56, 45 , "pruebaAlarma", date);
        cp.setFormato24h(false);
        cp.registarTarea(tarea);
        cp.addEnHoraQueCoincide(new EnHoraQueCoincide() {
            @Override
            public void ejecuta(Tarea tarea) {
                System.out.println("Acuerdate de comprar pan");
            }
        });

        cp.addEnHoraQueCoincide(new EnHoraQueCoincide() {
            @Override
            public void ejecuta(Tarea tarea) {
                System.out.println("Y leche tambien!");
            }
        });

        vBox.getChildren().add(cp);
        Scene scene=new Scene(vBox);
        stage.setScene(scene);
        stage.show();
        cp.iniciar();

    }

    public static void main (String[] args){
        launch(args);
    }
}
