package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
           
            MenuBar menuBar = new MenuBar();
            Menu menuArchivo = new Menu("Archivo");
            Menu menuEditar = new Menu("Editar");
            Menu menuAyuda = new Menu("Ayuda");

            
            MenuItem nArchivo = new MenuItem("Nuevo");
            MenuItem openArchivo = new MenuItem("Abrir");
            MenuItem dowArchivo = new MenuItem("Guardar");
            MenuItem salir = new MenuItem("Salir");

            //Separador y elementos 
            menuArchivo.getItems().addAll(nArchivo, openArchivo, dowArchivo, new SeparatorMenuItem(), salir);

            //Editar
            MenuItem copiar = new MenuItem("Copiar");
            MenuItem pegar = new MenuItem("Pegar");
            MenuItem cortar = new MenuItem("Cortar");
            

            menuEditar.getItems().addAll(copiar, pegar, cortar);

            // Ayuda
            MenuItem acercaDe = new MenuItem("Mas informacion de ");

            // Elemento al menú Ayuda
            menuAyuda.getItems().add(acercaDe);

            // Barra de menú
            menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

            //Acciones
            nArchivo.setOnAction(e -> System.out.println("Crear un nuevo archivo"));
            openArchivo.setOnAction(e -> System.out.println("Abrir el archivo seleccionado"));
            dowArchivo.setOnAction(e -> System.out.println("Guardar el archivo seleccionado"));
            salir.setOnAction(e -> {
                System.out.println("Saliendo........");
                primaryStage.close();
            });
            cortar.setOnAction(e -> System.out.println("Cortar seccion "));
            copiar.setOnAction(e -> System.out.println("Copiar seccion"));
            pegar.setOnAction(e -> System.out.println("Pegar seccion"));
            acercaDe.setOnAction(e -> System.out.println("Mas informacion sobre."));

            BorderPane root = new BorderPane();
            root.setTop(menuBar);
            Scene scene = new Scene(root, 700, 300);

            primaryStage.setTitle("Menú Clasico");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}