package less3;

public class Book {
    private String title;       // название
    private String author;      // автор
    private int year;           // год издания
    private boolean isAvailable = true; // доступна ли книга

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable();
    }

    // getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

//setters

    public void setTitle(String title) {
        if (title == null && title.isEmpty()) {
            this.title = title;
        }

    }

    public void setAuthor(String author) {
        if (author != null || !author.isEmpty()) {
            this.author = author;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        return isAvailable = true;
    }

    public String getInfo() {
        String status = isAvailable ? "Доступна" : "Выдана";
        String itog = "\"" + title + "\" - " + author + " (" + year + ") [" + status + "]";
        return itog;
    }
}

