package less3;

public class Main {
    public static void main(String[] args) {

        // 1. Создаём библиотеку
        Library lib = new Library("Читай-город", 10);

        // 1.1 Создаём книги в переменных — чтобы потом вызывать у них borrow/returnBook
        Book master = new Book("Мастер и Маргарита", "Булгаков М.", 1967);
        Book orwell = new Book("1984", "Оруэлл Дж.", 1949);
        Book warPeace = new Book("Война и мир", "Толстой Л.", 1869);
        Book anna = new Book("Анна Каренина", "Толстой Л.", 1878);
        Book crime = new Book("Преступление и наказание", "Достоевский Ф.", 1866);

        // 1.2 Добавляем их в библиотеку
        lib.addBook(master);
        lib.addBook(orwell);
        lib.addBook(warPeace);
        lib.addBook(anna);
        lib.addBook(crime);

        System.out.println("=== Библиотека создана ===");
        lib.getStats();

        // 2. Выдаём 2-3 книги через borrow()
        System.out.println("\n=== Выдача книг ===");
        if (orwell.borrow()) System.out.println("Выдана: " + orwell.getInfo());
        if (master.borrow()) System.out.println("Выдана: " + master.getInfo());
        if (warPeace.borrow()) System.out.println("Выдана: " + warPeace.getInfo());

        // 3. Возвращаем одну книгу через returnBook()
        System.out.println("\n=== Возврат книги ===");
        orwell.returnBook();
        System.out.println("Возвращена: " + orwell.getInfo());

        // 4. Доступные книги
        System.out.println("\n=== Доступные книги ===");
        lib.printAvailable();

        // 5. Поиск по автору
        System.out.println("\n=== Книги Толстого ===");
        lib.findByAuthor("Толстой Л.");

        // 6. Итоговая статистика
        System.out.println("\n=== Итоговая статистика ===");
        lib.getStats();
    }
}