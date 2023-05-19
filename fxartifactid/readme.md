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


```  
  
   
   
### FXML的样式文件 CSS
