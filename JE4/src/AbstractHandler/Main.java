package AbstractHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AbstractHandler handler;
        String operation;

        do {
            System.out.println("\nВведите формат документа");
            operation = in.next();
            switch (operation){
                case "doc":
                    handler = new DOCHandler();
                    handler.change();
                    handler.create();
                    handler.open();
                    handler.save();
                    break;
                case "txt":
                    handler = new TXTHandler();
                    handler.change();
                    handler.create();
                    handler.open();
                    handler.save();
                    break;
                case "xml":
                    handler = new XMLHandler();
                    handler.change();
                    handler.create();
                    handler.open();
                    handler.save();
                    break;
                case "stop":
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Не правильный формат");
            }
        }  while (!operation.equals("stop"));
    }
}