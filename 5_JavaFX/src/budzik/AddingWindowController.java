/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budzik;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 * FXML Controller class
 *
 * @author marci
 */
public class AddingWindowController implements Initializable {

    
    @FXML
    private Spinner<Integer> godzinaSpinner= new Spinner<Integer>();

    @FXML
    private Spinner<Integer> minutaSpinner = new Spinner<Integer>();
    
    SpinnerValueFactory<Integer> godzinaFactory =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 24, 0);
    
    SpinnerValueFactory<Integer> minutaFactory =
            new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 60, 0);

    public AddingWindowController() {
        godzinaSpinner.setValueFactory(godzinaFactory);
        minutaSpinner.setValueFactory(minutaFactory);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
