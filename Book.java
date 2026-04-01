package Encapsulation;

public class Book {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        if (pages > 0)
            this.pages = pages;
        else
            System.out.println("Invalid Pages");
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setPages(300);

        System.out.println("Title: " + b.getTitle());
        System.out.println("Pages: " + b.getPages());
    }
}