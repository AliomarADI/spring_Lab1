package kz.inf.first;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DBConnection {

    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    @PostConstruct
    public void init() {
        this.createDbConnection();
    }

    public void createDbConnection() {
        // init connection
        System.out.println("UserService createDbConnection | Init activated");
    }

    @PreDestroy
    public void destroy() {
        this.closeConnections();
    }

    public void closeConnections() {
        System.out.println("UserService closeConnections | Destroy activated");
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}
