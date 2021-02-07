import java.lang.reflect.Method;

/*
what class is:
    class is a blueprint of things you want to create.
        attibutes like color, size, movement
        !! class name must start from uppercase
    object is everthing in the world.
        created from the blueprint(class)
*/

public class Main {
    public static void main(String[] args) {
    Books mybook = new Books("mike", "xyz", 12, 300);
    System.out.println(mybook.tellMePrice());
    }

    static class Books {
        String writer;
        String publisher;
        int price;
        int size;

        Books(String writer,
                String publisher,
                int price,
                int size) {
                    this.writer = writer;
                    this.publisher = publisher;
                    this.price = price;
                    this.size = size;
        }

        public int tellMePrice() {
            return this.price;
        } 
           


    }

}