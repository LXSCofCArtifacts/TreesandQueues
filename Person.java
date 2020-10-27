
/**
 * Person class containing a name and age to test the dequewith objects.
 *
 * @Logan Sitar
 * @20 October 2019
 */
public class Person
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return age + "-" + name;
    }
}
