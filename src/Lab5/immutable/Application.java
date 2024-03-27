package Lab5.immutable;

public class Application {
        public static void main(String[] args) {
                User admin = new User("adminUser", "admin@example.com", "securePassword");

                Server server = new Server("192.168.0.1", 8080, 200, admin);
                System.out.println("Initial Mutable Server: " + server);

                ServerImmutable serverImmutable = new ServerImmutable("192.168.0.2", 443, 100, admin);
                System.out.println("Immutable Server: " + serverImmutable);

                admin.setPassword("newPassword");
                System.out.println("Updated Mutable Server with New Admin: " + server);

                System.out.println("Immutable Server remains unchanged: " + serverImmutable);
        }
}
