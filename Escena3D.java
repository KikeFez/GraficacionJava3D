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
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Escena3D extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear el cubo
        Box cubo = new Box(100, 100, 100);
        PhongMaterial materialCubo = new PhongMaterial(Color.RED);
        cubo.setMaterial(materialCubo);
        cubo.setTranslateX(-150); // Desplazarlo hacia la izquierda

        // Crear la esfera
        Sphere esfera = new Sphere(50);
        PhongMaterial materialEsfera = new PhongMaterial(Color.PURPLE);
        esfera.setMaterial(materialEsfera);
        esfera.setTranslateX(0); // Dejarla en el centro

        // Crear el cilindro
        Cylinder cilindro = new Cylinder(30, 150);
        PhongMaterial materialCilindro = new PhongMaterial(Color.GREY);
        cilindro.setMaterial(materialCilindro);
        cilindro.setTranslateX(150); // Desplazarlo hacia la derecha

        // Configurar animación de rotación para el cubo
        RotateTransition rotateCubo = new RotateTransition(Duration.seconds(2), cubo);
        rotateCubo.setAxis(Rotate.Y_AXIS);
        rotateCubo.setFromAngle(0);
        rotateCubo.setToAngle(360);
        rotateCubo.setCycleCount(Animation.INDEFINITE);
        rotateCubo.play();

        // Configurar animación de rotación para la esfera
        RotateTransition rotateEsfera = new RotateTransition(Duration.seconds(3), esfera);
        rotateEsfera.setAxis(Rotate.X_AXIS);
        rotateEsfera.setFromAngle(0);
        rotateEsfera.setToAngle(360);
        rotateEsfera.setCycleCount(Animation.INDEFINITE);
        rotateEsfera.play();

        // Configurar animación de rotación para el cilindro
        RotateTransition rotateCilindro = new RotateTransition(Duration.seconds(4), cilindro);
        rotateCilindro.setAxis(Rotate.Z_AXIS);
        rotateCilindro.setFromAngle(0);
        rotateCilindro.setToAngle(360);
        rotateCilindro.setCycleCount(Animation.INDEFINITE);
        rotateCilindro.play();

        // Agrupar todos los objetos
        Group root = new Group();
        root.getChildren().addAll(cubo, esfera, cilindro);

        // Crear una cámara de perspectiva
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-500); // Alejar la cámara
        camera.setTranslateY(-50);  // Ajustar altura para mejor perspectiva
        camera.setFarClip(1000);    // Definir límite de visión de la cámara
        camera.setNearClip(0.1);

        // Crear una escena 3D con los objetos y la cámara
        Scene scene = new Scene(root, 600, 400, true); // Habilitar profundidad 3D
        scene.setFill(Color.LIGHTGRAY); // Fondo de la escena
        scene.setCamera(camera);

        // Configurar y mostrar la ventana principal
        primaryStage.setTitle("Escena 3D con Objetos en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



