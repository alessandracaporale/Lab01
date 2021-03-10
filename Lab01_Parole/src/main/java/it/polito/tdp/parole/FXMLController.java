package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco;
	String inserita;
	//double tempo;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempo;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    @FXML
    void doInsert(ActionEvent event) {
    	//tempo = System.nanoTime()*10^9;
    	inserita = txtParola.getText();
    	elenco.addParola(inserita);
    	txtResult.setText("Elenco di parole inserite: \n"+elenco.getElenco());
    	txtParola.setText("");
    	txtTempo.setText("Il tempo impiegato è: \n"+System.nanoTime()+" nanosecondi");
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.setText("Elenco vuoto!");
    	txtTempo.setText("Il tempo impiegato è: \n"+System.nanoTime()+" nanosecondi");
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	elenco.cancellaParola(inserita);
    	txtResult.setText("Elenco di parole inserite: \n"+elenco.getElenco());
    	txtParola.setText("");
    	txtTempo.setText("Il tempo impiegato è: \n"+System.nanoTime()+" nanosecondi");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
