public class Main 
{
    public static void main(String[] args)
    {
        Author author = new Author("R.F. Kuang", "rf.kuang@gmail.com", "Chinese");
        Book book = new Book("The Poppy Wars", 25.99, author);

        System.out.println(book);
    }

}