/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.AdministradorImages;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.TimerTask;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author breyn
 */
public class FXMLDocumentController implements Initializable {

    Modelo.AdministradorImages adIm;
    TimerTask timertsk;
    Timeline timeline;

    @FXML
    Label imagen;

    private void Cambio() {
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        //timeline.getKeyFrames().add(new KeyFrame(Duration.millis(1000),
          //      new KeyValue(imagen.setGraphic(new ImageView(adIm.retorarImagen())), 25)));
        
        timeline.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        adIm = new AdministradorImages();
        timeline = new Timeline();
        Cambio();
    }

}
