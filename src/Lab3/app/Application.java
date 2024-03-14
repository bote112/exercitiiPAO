package Lab3.app;

import java.util.Scanner;

import Lab3.service.StorageService;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StorageService storageService = new StorageService();

        while (true) {
            System.out.println("Available commands:\ncreate\nread\nupdate\ndelete\nquit\nEnter command:");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "create":
                    System.out.println("Command received: create");
                    storageService.create(scanner);
                    break;
                case "read":
                    System.out.println("Command received: read");
                    storageService.read(scanner);
                    break;
                case "update":
                    System.out.println("Command received: update");
                    storageService.update(scanner);
                    break;
                case "delete":
                    System.out.println("Command received: delete");
                    storageService.delete(scanner);
                    break;
                case "quit":
                    System.out.println("Application exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
