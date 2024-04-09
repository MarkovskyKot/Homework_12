public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев ", "Толстой ");
//        System.out.println(tolstoy.getFirstName() + tolstoy.getLastName());
        Author carnegie = new Author("Dale ", "Carnegie ");
//        System.out.println(carnegie.getFirstName() + carnegie.getLastName());
        Book collectedWorks = new Book("Собрание сочинений в 14 томах",
                tolstoy.getFirstName() + tolstoy.getLastName(), 1951);
        Book bookCarnegie = new Book("How to Stop Worrying and Start Living",
                carnegie.getFirstName() + carnegie.getLastName(), 1948);
        System.out.println(bookCarnegie.getBookName());
        System.out.println("Author - " + bookCarnegie.getAuthor());
        System.out.println("Publishing year - " + bookCarnegie.getPublishingYear());
        System.out.println(collectedWorks.getBookName());
        System.out.println("Автор - " + collectedWorks.getAuthor());
        System.out.println("Год издания - " + collectedWorks.getPublishingYear());
        collectedWorks.setPublishingYear(1953);
        System.out.println("Переиздание - " + collectedWorks.getPublishingYear());
    }
}