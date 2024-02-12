package Singleton.Part1;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        
        // Illegal Construct

        // Compile Time Error: The constructor SingleObject() is not visible (Private)

        // SingleObject object = new SingleObject();


        // Get the only object available.

    SingleObject object = SingleObject.getInstance();

    // Show the message.

    object.ShowMessage();
    
    }
    
}
