import java.sql.*;
public class HelloMongoDBJDBC {

    public  static void main(String[] args) throws SQLException {
    	if ( args.length != 4 ) {
	    System.out.println("Usage: java -cp <CLASSPATH> HelloMongoDBJDBC <user> <passwd> <host:port> <sql>");
	    System.exit(1);
    	}
    	String user = args[0];
    	String passwd = args[1];
	String hostPort = args[2];
	String sql = args[3];
    	String connectionString = "jdbc:mysql://"+hostPort+"?useSSL=true&authenticationPlugins=org.mongodb.mongosql.auth.plugin.MongoSqlAuthenticationPlugin";
    	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    	ResultSet res = DriverManager.
      		getConnection(connectionString, user, passwd).
      		prepareCall(sql).
      		executeQuery();
    	while (res.next()) {
        	System.out.println(res.getString("_id"));
    	}
  }
}
