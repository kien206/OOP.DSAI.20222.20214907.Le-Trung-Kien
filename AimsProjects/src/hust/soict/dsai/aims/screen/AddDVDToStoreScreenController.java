package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.swing.StoreScreen;
import hust.soict.dsai.aims.cart.Cart;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.beans.value.*;
import javafx.event.ActionEvent;

public class AddDVDToStoreScreenController {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    protected String director;
    protected int length;

    private Store store;
    private Cart cart;
    private StoreScreen storeScreen;

    @FXML
    private Button addBtn;

    @FXML
    private TextField tfDVDCategory;

    @FXML
    private TextField tfDVDCost;

    @FXML
    private TextField tfDVDDirector;

    @FXML
    private TextField tfDVDLength;

    @FXML
    private TextField tfDVDTitle;

    public AddDVDToStoreScreenController(Store store, StoreScreen storeScreen) {
        super();
        this.store = store;
        this.storeScreen = storeScreen;
    }

    @FXML
    void btnAddPressed(ActionEvent event) {
        
        if (tfDVDLength.getText().isEmpty() && tfDVDCategory.getText().isEmpty() && tfDVDDirector.getText().isEmpty() && tfDVDCost.getText().isEmpty()) {
            DigitalVideoDisc dvd = new DigitalVideoDisc(title);
            store.addMedia(dvd);
        } else if (tfDVDDirector.getText().isEmpty() && tfDVDLength.getText().isEmpty()) {
            DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, cost);
            store.addMedia(dvd);
        } else if (tfDVDLength.getText().isEmpty()) {
            DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, cost);
            store.addMedia(dvd);
        } else {
            DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
            store.addMedia(dvd);
        }
        storeScreen.updateDisplay();
        store.display();
    }

    @FXML 
    void viewStorePressed(ActionEvent event) {
        new StoreScreen(store, cart);
    }

    @FXML
    void viewCartPressed(ActionEvent event) {
        new CartScreen(cart);
    }

    @FXML
    void addCDPressed(ActionEvent event) {
        new addCDScreen(store, storeScreen);
    }

    @FXML
    void addBookPressed(ActionEvent event) {
        new addBookScreen(store, storeScreen);
    }

    @FXML
    public void initialize() {
        tfDVDCategory.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                category = newValue;
            }
        });

        tfDVDCost.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                cost = Float.valueOf(newValue);
            }
        });

        tfDVDDirector.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                director = newValue;
            }
        });

        tfDVDCategory.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                category = newValue;
            }
        });

        tfDVDTitle.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                title = newValue;
            }
        });
    }

}
