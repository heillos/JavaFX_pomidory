/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pomidor1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author tristan
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private JFXTextField textImie;
    @FXML
    private JFXTextField textNazwisko;
    @FXML
    private JFXButton buttonNacisnij;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String imie = textImie.getText() ;
        textNazwisko.setText("Wpisałeś: "+imie);
        System.out.println("Nie dotykaj zboku!");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void textImieAction(ActionEvent event) {
        String imie = textImie.getText() ;
        textNazwisko.setText("Wpisałeś: "+imie);
        
        
    }
    
}
