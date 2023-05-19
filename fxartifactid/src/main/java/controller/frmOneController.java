package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import util.MyTreeNode;

public class frmOneController {
    @FXML
    private SplitPane splitPane;
    @FXML
    private TreeView<String> treeView;
    @FXML
    private Button btn1;
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private  TableView<String> tableView;


    public void btnClick(ActionEvent actionEvent) {
        String temp = getTf1().getText();
        tf2.setText(temp);

    }

    public TextField getTf1() {
        return tf1;
    }


    public void onShow(Stage stage) {
        stage.setTitle("FormOne");


        MyTreeNode root = new MyTreeNode("");//增加根节点
        root.nodeNum = "0";
        treeView.setRoot(root);
        System.out.println("on_show");
        stage.show();
        treeView.addEventHandler(MouseEvent.MOUSE_PRESSED,new myMouseClick());
        treeView.addEventHandler(MouseEvent.MOUSE_RELEASED,new myMouserRelease());

    }



    //鼠标按下事件
    private class myMouseClick implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent event) {
            MouseButton mb=event.getButton();


        }
    }
    private class myMouserRelease implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent event) {

        }
    }

}
