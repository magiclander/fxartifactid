##在FXML中引入 mybatis 
```java
     //获取 mybatis配置文件中的配置
    //"mybatis-config.xml"文件 放在工程resource目录下
       //将配置文件导入 输入流
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        // 根据配置文件输入流 构建SqlSessionFactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        // 通过SqlSessionFactory创建（打开）SqlSession
        SqlSession ss = ssf.openSession();
        //sqlSession 可以调用  mapper 下 xml文件的sql
        List<MzxDepartment> list=ss.selectList("mapper.MzxDepartment.selectAll");
        
        list.forEach(mzxDepartment -> System.out.println(mzxDepartment.toString()));

        MzxDepartment department=ss.selectOne("dao.MzxDepartment.selectById",1);
        System.out.println(department);
        ss.close();

```

### FXML
1. FXML文件
	<GridPane fx:controller="sample.Controller" ————这个地方对应controller的包名.类名
          xmlns:fx="http://javafx.com/fxml" alignment="center" hgap="10" vgap="10">
2. FXML文件的加载
    FXMLLoader类负责实际加载一个FXML源文件并返回生成的对象图。例如，下面的代码从类路径上相对于加载类的位置加载一个FXML文件，
    并使用名为“com.foo.example”的资源包对其进行本地化。假设根元素的类型是javafx.scene.layout的一个子类。假设文档定义了一个对
    话控制器类型的控制器：
	URL location = getClass().getResource("example.fxml");
ResourceBundle resources = ResourceBundle.getBundle("com.foo.example");
FXMLLoader fxmlLoader = new FXMLLoader(location, resources);

Pane root = (Pane)fxmlLoader.load();
MyController controller = (MyController)fxmlLoader.getController();

3. FXML对应的对象 
  <fxobject fx:id="objName" />
   
   controller 文件中
 ```java
 @FXML
 private  Object objName;

```  
  
   
   
### FXML的样式文件 CSS
