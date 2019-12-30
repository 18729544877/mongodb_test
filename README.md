# mongodb_test
mongoDB练习:
练习本地安装mongoDB好的前提下：
1. 启动mongoDB server://bin目录下面执行，mongod --dbpath=D:/data/db
2. 使用java连接。
pom里面添加的依赖：

<dependency>            
   <groupId>org.mongodb</groupId>            
   <artifactId>mongo-java-driver</artifactId>            
   <version>3.0.0</version>        
</dependency>
目的是使用MongoClient类。

学习的内容：
1. 启动mondoDb的步骤；
2. java连接mongoDB的步骤；
3. 熟悉mondoDB的操作CRUD;
4. 熟悉mongoDB存取数据的格式，已经id是随着insert之后字段生成的，通过find可以查到_id的值。
