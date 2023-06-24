package hust.soict.dsai.aims.screen;

import javax.swing.JFrame;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.swing.StoreScreen;
import java.util.List;
import java.util.ArrayList;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import java.io.IOException;
import javafx.application.Platform;

public class addDVDScreen extends JFrame {
    private Store store;
    private StoreScreen storeScreen;

    public addDVDScreen(Store store, StoreScreen storeScreen) {
        super();
        this.store = store;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Add DVD");
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("AddDVDToStoreScreen.fxml"));
                    AddDVDToStoreScreenController controller = new AddDVDToStoreScreenController(store, storeScreen);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
