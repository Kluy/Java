package Book;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название книги");
        String titleIn = in.nextLine();

        System.out.println("Введите имя автора");
        String authorIn = in.nextLine();

        System.out.println("Введите содержание");
        String contentIn = in.nextLine();

        title.show(titleIn);
        author.show(authorIn);
        content.show(contentIn);
    }
}