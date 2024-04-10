public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев ", "Толстой ");
        Author carnegie = new Author("Dale ", "Carnegie ");
        Book collectedWorks = new Book("Собрание сочинений в 14 томах",
                tolstoy, 1951);
        Book bookCarnegie = new Book("How to Stop Worrying and Start Living",
                carnegie, 1948);
        System.out.println(bookCarnegie.getBookName());
        System.out.println("Author - " + bookCarnegie.getAuthor().getFirstName()+bookCarnegie.getAuthor().getLastName());
        System.out.println("Publishing year - " + bookCarnegie.getPublishingYear());
        System.out.println(collectedWorks.getBookName());
        System.out.println("Автор - " + collectedWorks.getAuthor().getFirstName()+collectedWorks.getAuthor().getLastName());
        System.out.println("Год издания - " + collectedWorks.getPublishingYear());
        collectedWorks.setPublishingYear(1953);
        System.out.println("Переиздание - " + collectedWorks.getPublishingYear());
    }
}