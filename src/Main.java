public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Эрих Мария", "Ремарк");
        Author author2 = new Author("Оскар", "Уайльд");

        Book book1 = new Book("Жизнь взаймы", author1, 1977);
        Book book2 = new Book("Портрет Дориана Грея", author2, 1890);

        book1.setPublicationYear(1978);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println();
        System.out.println(book1);
        System.out.println(book2);
    }
}