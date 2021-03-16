package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClear;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnTraslate;

    @FXML
    void doClear(ActionEvent event) {

    }

    AlienDictionary a = new AlienDictionary();
    @FXML
    void doTranslate(ActionEvent event) {
    	if(Pattern.matches("[a-zA-Z]+",txtParola.getText())!=false) {
    		txtResult.setText("ERRORE: Carattere/i non validi");
    	}
    	else if(txtParola.getText().contains(" ")/* && txtParola.getText().contains("[a-zA-Z]+") Pattern.matches("[a-zA-Z]*",txtParola.getText())*/) {
    		String[] stemp = txtParola.getText().split(Pattern.quote(" "));;
    		String alienString =stemp[0];
    		String translationString = stemp[1];
    	a.addWord(alienString, translationString );
    	txtResult.setText("fatto");
    	txtParola.clear();
    	}
    	else  if (!txtParola.getText().contains(" ") /* && txtParola.getText().contains("[a-zA-Z]+") Pattern.matches("[a-zA-Z]*",txtParola.getText())*/) {
    		a.translateWord(txtParola.getText());
    		txtResult.setText(a.translateWord(txtParola.getText()));
    		txtParola.clear();
    	}
    	
    	txtParola.clear();
    }

    @FXML
    void initialize() {
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTraslate != null : "fx:id=\"btnTraslate\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
