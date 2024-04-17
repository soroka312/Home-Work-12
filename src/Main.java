public class Main {
    public static void main(String[] args) {

        Author[] author = {new Author("Маргарет", "Митчелл"),
                new Author("Анджей", "Сапковский")};
        Book[] book = {new Book("Унесённые ветром", author[0], 1936),
                new Book("Последнее желание", author[1], 1996)};

        System.out.println("Имя автора: " + author[0].getName());
        System.out.println("Фамилия автора: " + author[0].getSurname());

        System.out.println("Название: " + book[0].getTitle());
        System.out.println("Автор: " + book[0].getAuthor());
        System.out.println("Год: " + book[0].getYear());

        System.out.println(book[0]);


        book[1].setYear(1986);

        System.out.println("Имя автора: " + author[1].getName());
        System.out.println("Фамилия автора: " + author[1].getSurname());

        System.out.println("Название: " + book[1].getTitle());
        System.out.println("Автор: " + book[1].getAuthor());
        System.out.println("Год: " + book[1].getYear());

        System.out.println(book[1]);
    }
}