package com.example.piedrapapeltijera;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    Label lblResultado = new Label("Elige un numero del 1 al 6");
    Random random = new Random();

    @Override
    public void start(Stage stage) {
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");

        btn1.setOnAction(e -> jugar("1"));
        btn2.setOnAction(e -> jugar("2"));
        btn3.setOnAction(e -> jugar("3"));
        btn4.setOnAction(e -> jugar("4"));
        btn5.setOnAction(e -> jugar("5"));
        btn6.setOnAction(e -> jugar("6"));

        VBox root = new VBox(10, lblResultado, btn1, btn2, btn3, btn4, btn5, btn6);
        root.setStyle("-fx-padding: 20px; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Adivina el numero");
        stage.setScene(scene);
        stage.show();
    }

    private void jugar(String opcionJugador) {
        int num = random.nextInt(6) + 1; // numero aleatorio 1-6
        String cpu;

        if (num == 1) {
            cpu = "1";
        } else if (num == 2 ) {
            cpu = "2";
        } else if (num == 3 ) {
            cpu = "3";
        } else if (num == 4 ) {
            cpu = "4";
        } else if (num == 5 ) {
            cpu = "5";
        } else {
            cpu = "6";
        }
        String resultado; //stringf vacio donde se guarda el resultado futuro

        //comparaciones de si has acertado
        if (opcionJugador.equals(cpu)) {
            resultado = "Acertaste, ganaste";
        } else {
            resultado = "Fallaste, vuelve a intentar";
        }

        lblResultado.setText("Tú: " + opcionJugador + " | CPU: " + cpu + " → " + resultado);
    }

    public static void main(String[] args) {
        launch();
    }
}
