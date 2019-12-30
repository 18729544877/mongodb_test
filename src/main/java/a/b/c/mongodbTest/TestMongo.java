package a.b.c.mongodbTest;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
/**
 * mondb的使用步骤：
 * 本地mondodb的bin目录，在命令行输入：mongod --dbpath=D:/data/db
 * 出现27017端口的字样表示mongo db的服务端启动。
 * 然后打开mongo.exe文件就可以执行操作：
 * show dbs;          显示所有的数据库以及占用的空间大小
 * show collections.  显示所有的表
 * db.student.find()，  查询表student的所有内容
 * db.student.find({name: 'zs'})              查询name是zs的这条数据
 * db.student.insert({name: 'zs', age: 20})   插入操作；
 * db.student.update({name: 'zs'})            更新操作
 * db.student.remove({name: 'zs'})            删除操作
 * @author Administrator
 *
 */
public class TestMongo {
public static void main(String[] args) {
	//mongoDB server的端口是： 27017
	MongoClient client = new MongoClient("localhost", 27017);
	MongoDatabase database = client.getDatabase("test");
	MongoCollection<Document> collection = database.getCollection("student");
	System.err.println(collection);
	FindIterable<Document> find = collection.find();
	MongoCursor<Document> iterator = find.iterator();
	while(iterator.hasNext()) {
		Document next = iterator.next();
		System.out.println(next.get("_id"));//key取name,key还有'_id'
	}
	/*
	 * 5e06de55aaf84fdaba01abbe
     *5e06e0d5aaf84fdaba01abc4
     *5e09a2ffcf6e2900859c3a69
	 */
   }
}
