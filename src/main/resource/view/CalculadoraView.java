package main.resource.view;

import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import main.java.edu.mejiasoft.calculadora.controller.CalculadoraController;
import main.java.edu.mejiasoft.calculadora.utils.scenemanager.SceneManager;

public class CalculadoraView {

    private CalculadoraController calculadoraController;
    private SceneManager stage;
    private final StackPane stackPaneRoot;

    public CalculadoraView(CalculadoraController calculadoraControler, SceneManager stage) {
        this.calculadoraController = calculadoraController;
        this.stage = stage;
        this.stackPaneRoot = new StackPane();
    }

    public Parent getRoot() {
        return stackPaneRoot;
    }
}
