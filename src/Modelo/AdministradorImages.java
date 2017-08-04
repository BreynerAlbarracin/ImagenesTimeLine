package Modelo;

import java.util.LinkedList;
import javafx.scene.image.Image;

/**
 *
 * @author breyn
 */
public class AdministradorImages {

    LinkedList<Image> imagenes;
    int iterador;

    public AdministradorImages() {
        iterador = 0;
        imagenes = new LinkedList<>();
        CargarImagenes();
    }

    private void CargarImagenes() {
        imagenes.add(new Image("/Images/image1.jpg"));
        imagenes.add(new Image("/Images/image2.jpg"));
        imagenes.add(new Image("/Images/image3.jpg"));
        imagenes.add(new Image("/Images/image4.jpg"));
    }

    public Image retorarImagen() {
        Image im;
        
        if(iterador >= imagenes.size()){
            iterador = 0;
        }
        
        im = imagenes.get(iterador);  
        iterador++;
        return im;
    }
}
