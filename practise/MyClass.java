public class MyClass {
    private int myInteger;

    // Default constructor
    public MyClass() {
        // Initialize the variable using some default value, for example, 0
        myInteger = 0;
    }

    // Parameterized constructor
    public MyClass(int initialValue) {
        // Initialize the variable using the provided value
        myInteger = initialValue;
    }

    // Getter method to retrieve the value of the instance variable
    public int getMyInteger() {
        return myInteger;
    }

    // Setter method to set the value of the instance variable
    public void getMyInteger(int newValue) {
        myInteger = newValue;
    }

    public static void main(String[] args) {
        // Creating an instance using the default constructor
        MyClass defaultInstance = new MyClass();

        // Creating an instance using the parameterized constructor
        MyClass paramInstance = new MyClass(42);

        // Retrieving and printing the values
        System.out.println("Default Instance Value: " + defaultInstance.getMyInteger());
        System.out.println("Parameterized Instance Value: " + paramInstance.getMyInteger());
    }
}

