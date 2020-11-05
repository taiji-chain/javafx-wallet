package io.taiji;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Wallet extends Application {
    @Override
    public void start(Stage stage) {
        // create a menu bar
        MenuBar mainMenu = new MenuBar();
        // create menu objects
        Menu file = new Menu("File");
        Menu balance = new Menu("Balance");
        Menu transaction = new Menu("Transaction");
        Menu application = new Menu("Application");
        Menu help = new Menu("Help");


        // add them to the menu bar
        mainMenu.getMenus().add(file);
        mainMenu.getMenus().add(balance);
        mainMenu.getMenus().add(transaction);
        mainMenu.getMenus().add(application);
        mainMenu.getMenus().add(help);

        MenuItem openWallet = new MenuItem("Open a Wallet");
        MenuItem generateWallet = new MenuItem("Generate a Wallet");
        MenuItem exportWallet = new MenuItem("Export a Wallet");
        MenuItem importWallet = new MenuItem("Import a Wallet");

        MenuItem privacyPolicy = new MenuItem("Privacy Policy");
        MenuItem about = new MenuItem("About");

        file.getItems().add(generateWallet);
        file.getItems().add(openWallet);
        file.getItems().add(exportWallet);
        file.getItems().add(importWallet);

        help.getItems().add(privacyPolicy);
        help.getItems().add(about);

        // create layout and add menu bar
        BorderPane root = new BorderPane();
        root.setTop(mainMenu);
        // add layout to a scene
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Taiji Wallet");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
