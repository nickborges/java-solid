package design_patterns.criational.factory.example2;

import java.sql.Connection;

public class ConnectionFactoryMain {

    public static void main(String[] args) {
        Connection c = new ConnectionFactory().getConnection();
        //...
    }
}
