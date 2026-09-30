package less3;

public class Library {
    private String name;
    private Book[] books;
    private int bookCount;

    public Library(String name, int maxSize) {
        this.books = new Book[maxSize];
        this.bookCount = 0;
        this.name = name;
    }

    public void addBook(Book book) {
        if (bookCount >= books.length) {
            return;
        }
        books[bookCount++] = book;
    }

    public void findByAuthor(String author) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(" " + books[i].getInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет такого: " + author);
        }
    }

    public void printAvailable() {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(" " + books[i].getInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет такого: ");
        }
    }

    public void getStats() {
        int availableCount = 0;
        int borrowedCount = 0;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                availableCount++;
            } else {
                borrowedCount++;
            }
        }

        System.out.println("Библиотека \"" + name + "\"");
        System.out.println("Всего книг: " + bookCount);
        System.out.println("Доступно: " + availableCount);
        System.out.println("Выдано: " + borrowedCount);
    }
}
