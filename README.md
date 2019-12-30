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


mongoDB:

1.弱数据结构模式，添加1个新字段不会对旧表格有任何影响，整个过程会非常快速；因此，在应用程序发生改变时，你不需要专门的1个DBA去修改数据库模式。
2.MongoDB在启动后会将数据库中的数据以文件映射的方式加载到内存中
3.默认情况下，对比事务安全，MongoDB更关注高的插入速度。如果你需要加载大量低价值的业务数据，比如日志收集，那么MongoDB将很适合你的用例，
但是必须避免在要求高事务安全的情景下使用MongoDB，比如较高的金额交易。
