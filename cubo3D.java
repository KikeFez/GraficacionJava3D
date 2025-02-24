
package java3D;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class cubo3D extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear un cubo con dimensiones específicas
        Box cube = new Box(200, 200, 200);

        // Aplicar un material con color al cubo
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.DODGERBLUE); // Color del cubo
        material.setSpecularColor(Color.LIGHTBLUE); // Color de los reflejos
        cube.setMaterial(material);

        // Configurar una rotación animada del cubo
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(4), cube);
        rotateTransition.setAxis(Rotate.Y_AXIS);
        rotateTransition.setFromAngle(0);
        rotateTransition.setToAngle(360);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.play();

        // Crear una cámara de perspectiva
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-600); // Alejar la cámara para ver el cubo completo
        camera.setNearClip(0.1);
        camera.setFarClip(1000.0);

        // Crear una escena con el cubo y la cámara
        Group root = new Group(cube);
        Scene scene = new Scene(root, 800, 600, true);
        scene.setFill(Color.LIGHTGRAY); // Fondo de la escena
        scene.setCamera(camera);

        // Configurar el escenario
        primaryStage.setTitle("cubo 3D en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
