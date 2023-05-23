package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class Restaurant {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, bnt3, bnt4, bnt5;

    Jollibee jollibee = new Jollibee();
    KFC kfc = new KFC();
    McDonalds mcdonalds = new McDonalds();
    MangInasal mangInasal = new MangInasal();
    Shakeys shakeys = new Shakeys();


    public void initialize() {

        jollibee.setColor("Red");
        jollibee.setTaste("Bida ang saya");

        kfc.setColor("RedWhite");
        kfc.setTaste("Matanda Lasa<3");

        mcdonalds.setColor("OrangeRed");
        mcdonalds.setTaste("Love ko to");

        mangInasal.setColor("Green");
        mangInasal.setTaste("Roasted Chicken");

        shakeys.setColor("Red Yellow");
        shakeys.setTaste("Masarap na pizza<3");


    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Jollibee are " + jollibee.getColor() + " and " + jollibee.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("KFC are " + kfc.getColor() + " and " + kfc.getTaste());
        }

        if (sourceButton == bnt3) {
            alert.setContentText("Mcdonalds are " + mcdonalds.getColor() + " and " + mcdonalds.getTaste());
        }

        if (sourceButton == bnt4) {
            alert.setContentText("Mang Inasal are " + mangInasal.getColor() + " and " + mangInasal.getTaste());
        }

        if (sourceButton == bnt5) {
            alert.setContentText("Mcdonalds are " + shakeys.getColor() + " and " + shakeys.getTaste());
        }

        alert.showAndWait();

    }
}
