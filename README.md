This repo has a very simple Hello World example
of using the mysql jdbc driver to connect to a 
MongoDB Atlas cluster with the BI Connector enabled.

Feedback: jason.mimick@mongodb.com


Example usage:

```
java -cp ./:./mongosql-auth-1.1.0.jar:./mysql-connector-java-5.1.46/mysql-connector-java-5.1.46.jar \
HelloMongoDBJDBC \
ycsb?source=admin \
XXXXX \
"ycsb-biconnector-vlyyt.azure.mongodb.net:27015" \
"select _id from test.usertable;"
```

