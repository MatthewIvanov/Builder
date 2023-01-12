package builder;
import java.lang.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
    Person person = new PersonBuilderIMPL().setName("Nick").setAge(18).builder();
        System.out.println(person.toString());


    }
}
