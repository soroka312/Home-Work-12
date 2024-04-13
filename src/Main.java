public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Маргарет", "Митчелл");
        Book book1 = new Book("Унесённые ветром", author1, 1936);

        System.out.println(book1);

        Author author2 = new Author("Анджей", "Сапковский");
        Book book2 = new Book("Последнее желание", author2, 1996);
        book2.setYear(1986);

        System.out.println(book2);
    }
}