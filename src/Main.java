public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Маргарет", "Митчелл");
        Book book1 = new Book("Унесённые ветром", author1, 1936);

        System.out.println("Имя автора: " + author1.getName());
        System.out.println("Фамилия автора: " + author1.getSurname());

        System.out.println("Название: " + book1.getTitle());
        System.out.println("Автор: " + book1.getAuthor());
        System.out.println("Год: " + book1.getYear());


        System.out.println(book1);

        Author author2 = new Author("Анджей", "Сапковский");
        Book book2 = new Book("Последнее желание", author2, 1996);
        book2.setYear(1986);

        System.out.println("Имя автора: " + author2.getName());
        System.out.println("Фамилия автора: " + author2.getSurname());

        System.out.println("Название: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println("Год: " + book2.getYear());

        System.out.println(book2);
    }
}