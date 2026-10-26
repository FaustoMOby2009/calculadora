package main.java.edu.mejiasoft.calculadora.utils.scenemanager;

import javafx.stage.Stage;
import main.java.edu.mejiasoft.calculadora.controller.CalculadoraController;
import main.java.edu.mejiasoft.calculadora.service.CalculadoraService;
import main.resource.view.CalculadoraView;
import javafx.scene.Scene;

public class SceneManager {

    private final Stage stage;

    public SceneManager(Stage stage) {
        this.stage = stage;
    }

    public void mostrarCalculadoraView() {
        CalculadoraService calculadoraService = new CalculadoraService();
        CalculadoraController calculadoraController = new CalculadoraController(calculadoraService, this);
        CalculadoraView calculadora = new CalculadoraView(calculadoraController, this);
        Scene scene = new Scene(calculadora.getRoot(), 800, 600);
        stage.setScene(scene);
        stage.setTitle("HI");
        stage.centerOnScreen();

    }
}
