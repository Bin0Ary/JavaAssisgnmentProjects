public class Main {
    public static void main(String[] args){
       Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
       System.out.println(ahTeck);
       Book dummyBook = new Book("Java for dummy", ahTeck,19.95, 99);
       System.out.println(dummyBook);
       dummyBook.setPrice(29.95);
       dummyBook.setQty(28);
       System.out.println("name is: "+dummyBook.getName());
       System.out.println("price is: " + dummyBook.getPrice());
       System.out.println("qty is: " + dummyBook.getQty());
       System.out.println("Author is: " + dummyBook.getAuthor());
       System.out.println("Author's email is: " + dummyBook.getAuthorEmail());
       System.out.println("Author's gender is: " + dummyBook.getAuthorGender());
       Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
       System.out.println(anotherBook);
    }
}
class Author {
    private String name;
    private String email;
    private char gender;
    Author(String name,  String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Author[name="+getName()+", email=" + getEmail()+", gender="+getGender()+"]";
    }
}
class Book{
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    Book(String name, Author author, double price){
        this(name,author,price,0);
    }
    Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Author getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return "Book[name=" + getName() + "," + author.toString() + ",price=" + getPrice() + ",qty=" + getQty() + "]";
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }
}