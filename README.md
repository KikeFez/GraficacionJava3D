# GraficacionJava3D

Expliacion de javaFX:
Es un conjunto de herramientas para la creación de interfaces gráficas en Java, que permite desarrollar aplicaciones con interfaces modernas y atractivas, incluyendo gráficos 2D y 3D. Su capacidad para manejar animaciones y efectos visuales lo convierte en una opción ideal para el desarrollo de aplicaciones interactivas.

Librerias usadas:

javafx.application.Application → Permite crear aplicaciones JavaFX.
javafx.stage.Stage → Representa la ventana principal de la aplicación.
javafx.scene.Scene → Contenedor principal donde se añaden los elementos gráficos.
javafx.scene.Group → Agrupa múltiples nodos para manipularlos en conjunto.
javafx.scene.paint.Color → Permite definir colores para los objetos.
javafx.scene.paint.PhongMaterial → Se usa para aplicar materiales con efectos de luz a los objetos.
javafx.scene.shape.Box, Sphere, Cylinder → Clases que crean figuras geométricas 3D.
javafx.scene.transform.Rotate → Permite aplicar rotaciones a los objetos.
javafx.animation.RotateTransition → Controla las animaciones de rotación.
javafx.animation.Animation → Proporciona configuraciones generales para animaciones.
javafx.scene.PerspectiveCamera → Permite crear una cámara con perspectiva para visualizar los objetos en 3D.
javafx.util.Duration → Define la duración de las animaciones.

Codigo del Cubo3D:

Se instancia un objeto de la clase Box con dimensiones de 200x200x200 píxeles.
Se define un material (PhongMaterial) con color azul (Color.DODGERBLUE) y reflejos en un tono más claro (Color.LIGHTBLUE).
Se asigna el material al cubo para mejorar su apariencia visual.
Animación del cubo:

Se usa RotateTransition para animar el cubo girando sobre su eje Y.
Se establece un ciclo de rotación de 360 grados en un lapso de 4 segundos.
La animación se configura para repetirse indefinidamente con Animation.INDEFINITE.
Configuración de la cámara y la escena:

Se crea una PerspectiveCamera, que permite visualizar la escena con profundidad.
Se posiciona la cámara en Z = -600, alejándola del origen para ver el cubo completo.
Se configura el "near clip" y "far clip", que definen los límites de visión de la cámara.
Creación de la escena:

Se crea un Group que contiene el cubo.
Se instancia una Scene con dimensiones de 800x600 píxeles y se le asigna un fondo gris claro.
Se asigna la cámara a la escena y se muestra la ventana (Stage).

Codigo de la Escena3D:

Se instancian tres figuras geométricas en 3D:
Cubo rojo: Tamaño de 100x100x100 píxeles, desplazado a la izquierda (X = -150).
Esfera púrpura: Radio de 50 píxeles, ubicada en el centro (X = 0).
Cilindro gris: Radio de 30 píxeles y altura de 150, desplazado a la derecha (X = 150).
A cada figura se le asigna un PhongMaterial con su respectivo color.
Animaciones de rotación:

Cubo:
Rota sobre el eje Y con una animación de 2 segundos.
Esfera:
Gira sobre el eje X con una animación de 3 segundos.
Cilindro:
Rota sobre el eje Z con una animación de 4 segundos.
Todas las animaciones están configuradas para repetirse indefinidamente.
Agrupación de los objetos:

Se usa un Group para almacenar las tres figuras.
Configuración de la cámara:

Se usa una PerspectiveCamera, similar a la del código anterior, pero con modificaciones:
Se aleja en Z = -500 para dar espacio a todos los objetos.
Se ajusta su altura en Y = -50 para mejorar la perspectiva de visualización.
Creación de la escena:

Se genera una Scene de 600x400 píxeles con un fondo gris claro.
Se asigna la cámara y se muestra la ventana.

