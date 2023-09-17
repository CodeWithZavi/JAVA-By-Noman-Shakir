public class Constructor {

    int b;
    String name;

    Constructor() { // Constructor (special method) // you can initialize the values
        b = 0;
        name = null;
    }

    void show() {
        System.out.println(b + " " + name); // Fixed the concatenation here
    }

    public static void main(String[] args) {
        Constructor ref = new Constructor(); // Creating an object of the Constructor class

        // Calling the show method on the object
        ref.show();
    }
}
