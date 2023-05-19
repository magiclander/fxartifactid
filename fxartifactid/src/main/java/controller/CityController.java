package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.CodeTransform;

import java.io.IOException;


public class CityController {
    @FXML
    private TextField tField;
    @FXML
    private TextArea tArea;
    @FXML
    private Button btnTrans;
    @FXML
    private Button btnClose;
    @FXML
    private Stage stage;
    @FXML
    private  TextArea tArea2;
    @FXML
    private Button btnJieMa;
    public  void init(Stage stage1){
        this.stage =stage1;
        stage.show();
    }
    public void btnClick(){
        String sStr0=tField.getText();
        sStr0=  CodeTransform.getBase64Encode(sStr0);
        tArea.setText(sStr0);
    }
    public void Close(){
        stage.close();
    }
    public void funcDecode() throws IOException {
        String str0=tArea.getText();
        str0=CodeTransform.getMyDeconde(str0);
        tArea2.setText((str0));
    }
}
