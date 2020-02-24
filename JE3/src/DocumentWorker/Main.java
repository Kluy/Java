package DocumentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ключ продукта");
        String productKey = in.nextLine();
        DocumentWorker document;

        if (productKey.equals("pro")){
            document = new ProDocumentWorker();
            document.editDocument();
            document.saveDocument();
        } else if (productKey.equals("exp")){
            document = new ExpertDocumentWorker();
            document.saveDocument();
        } else {
            document = new DocumentWorker();
            document.openDocument();
            document.editDocument();
            document.saveDocument();
        }
    }
}