/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author gropp
 * JAVAFX trabalha com midias para diferentes interfaces micro/cel/video games/TVs
 * é um modo mais moderno de trabalhar com interfaces/ancoragens
 */
/**
 * 
 * implements remete a interfaces - no caso FXML 
 */
public class FXMLDocumentController implements Initializable {
    /* Declaracao das variaveis ligadas aos elementos das telas ID,s */
    @FXML
    private Label lblMensagem;
    private Button btnClique;
    /* Criação dos metodos envolvendo as variaveis */
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
