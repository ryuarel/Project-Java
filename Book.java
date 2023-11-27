public class Book{
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private int quantity;
    private double price;
    

    public Book(String isbn, String title, String author, int publicationYear, int quantity , double price){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.quantity = quantity;
        this.price = price;
       
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }


}
