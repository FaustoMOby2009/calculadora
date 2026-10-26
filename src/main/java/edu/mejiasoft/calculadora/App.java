package main.java.edu.mejiasoft.calculadora;

import javafx.application.Application;
import javafx.stage.Stage;
import main.java.edu.mejiasoft.calculadora.utils.scenemanager.SceneManager;

public class App extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage mainScene) throws Exception {
        primaryStage = mainScene;
        mainScene.setTitle("");
        SceneManager manager = new SceneManager(primaryStage);
        manager.mostrarCalculadoraView();
        mainScene.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
