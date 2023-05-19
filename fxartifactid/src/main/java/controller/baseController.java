package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.URL;


public class baseController {

    @FXML
    void loadf01(ActionEvent ae) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getClassLoader().getResource("fxml/f01.fxml"));
        SplitPane mypane = fxmlLoader.load();
        stage.setScene(new Scene(mypane));
        frmOneController controller = fxmlLoader.getController();
        controller.onShow(stage);
        stage.show();
    }
    @FXML
    void loadFormCity() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();//创建fxmloader 用于读取 fxml文件
        fxmlLoader.setLocation(getClass().getClassLoader().getResource("fxml/City.fxml"));
        Pane pane =fxmlLoader.load();// 将根节点 赋值给对象
        Stage stage = new Stage(); //创一个新舞台
        stage.setScene(new Scene(pane));//设置舞台的场景，将根节点对象传给场景 舞台->场景->root对象->布局和控件
        CityController cityController =fxmlLoader.getController();//设置与根对象关联的控制器
         cityController.init(stage);

    }

    @FXML
    void  closeFrom(ActionEvent ae) throws IOException {
      HttpClient httpClient = HttpClientBuilder.create().build();
      HttpGet httpGet=new HttpGet("http://www.eastmoney.com");
        HttpResponse response=httpClient.execute(httpGet);
        if(response.getStatusLine().getStatusCode()== HttpStatus.SC_OK){
            String data = EntityUtils.toString(response.getEntity(), Charsets.UTF_8);
            Document doc= Jsoup.parse(data);
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                System.out.println("link : " + link.attr("href"));
                System.out.println("text : " + link.text());
            }

        }

    }

}
