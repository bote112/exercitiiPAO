package Lab5.immutable;

public final class ServerImmutable {
    private final String ipAddress;
    private final int port;
    private final int maxConnections;
    private final User admin;

    public ServerImmutable(String ipAddress, int port, int maxConnections, User admin) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.maxConnections = maxConnections;
        this.admin = new User(admin);
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getPort() {
        return port;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public User getAdmin() {
        return new User(admin);
    }

    @Override
    public String toString() {
        return "ServerImmutable{" +
                "ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", maxConnections=" + maxConnections +
                ", admin=" + admin.getUsername() +
                ", admin password=" + admin.getPassword() +
                '}';
    }
}
