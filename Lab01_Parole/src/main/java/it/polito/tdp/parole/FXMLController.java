package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private Button buttonCancel;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;
    
    @FXML
    private TextArea txtEsecuzione;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	
    	elenco.addParola(txtParola.getText());
    	String s = "";
    	
    	for(String ss : elenco.getElenco()) {
    		s += ss+"\n";
    	}
    	
    	txtResult.setText(s);
    	txtParola.clear();
   
    	txtEsecuzione.appendText(Long.toString(System.nanoTime()) + " nano secondi\n");
    		
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.clear();
    	
    	txtEsecuzione.appendText(Long.toString(System.nanoTime()) + " nano secondi\n");
    }
    
    @FXML
    void doCancel(ActionEvent event) {
    	
    	elenco.removeParola(txtResult.getSelectedText());
    	String s = "";
    	
    	for(String ss : elenco.getElenco()) {
    		s += ss+"\n";
    	}
    	
    	txtResult.setText(s);
    	
    	txtEsecuzione.appendText(Long.toString(System.nanoTime()) + " nano secondi\n");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
