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

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Prueba extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox=new VBox();
        ComponenteReloj cp=new ComponenteReloj();
        LocalDate date=LocalDate.now();
        LocalDate date2=LocalDate.of(2014 , 2 , 11);
        Tarea tarea = new Tarea(4, 3, 5 , "pruebaAlarma", date);
        Tarea tarea2 = new Tarea(4, 3,10,"prueba2",date2);
        cp.setFormato24h(false);
        cp.registarTarea(tarea);
        cp.registarTarea(tarea2);
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
