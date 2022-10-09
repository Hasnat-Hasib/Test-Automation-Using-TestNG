import org.testng.annotations.Test;

public class FirstTestng {
    @Test (priority = 3)
    void mess(){
        System.out.println("Hello");
    }
    @Test(priority = 1)
    void night(){
        System.out.println("Good night");
    }
    @Test(priority = 2)
    void morning(){
        System.out.println("Good Morning");
    }
}
