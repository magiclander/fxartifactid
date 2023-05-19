package util;

import javafx.scene.control.TreeItem;

public class MyTreeNode extends TreeItem<String> {
    public String nodeNum;
    private String CPH;




    public MyTreeNode(String str1){
        super(str1);
        CPH="";
    }
    public void nodeNum(String node){
        nodeNum=node;
    }
    public void setCPH(String value){
        this.CPH=value;
    }
    public String getCPH() {
        try {
            if (this.CPH.isEmpty() || this.CPH == null) {
                return "null";
            } else {
                return CPH;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
