package Lab5.immutable;

public class Server {
    private String ipAddress;
    private int port;
    private int maxConnections;
    private User admin;

    public Server(String ipAddress, int port, int maxConnections, User admin) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.maxConnections = maxConnections;
        this.admin = admin;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", maxConnections=" + maxConnections +
                ", admin=" + admin.getUsername() +
                ", admin password=" + admin.getPassword() +
                '}';
    }
}
