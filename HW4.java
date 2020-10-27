
/**
 * HW4 is a main that tests both deque and BST. The lists with the arrows
 * are for the deque and the lists that are stacked on top of each other
 * are for the BST.
 *
 * @Logan Sitar
 * @16 October 2019
 */
public class HW4{
    public static void main(String args[]){
        System.out.println("Deque Tester!");
        deque tester = new deque();
        tester.inject(78);
        tester.push(24);
        tester.push("hello");
        tester.inject(33);
        tester.push("run");
        tester.printDeque();
        System.out.println("\n--POP--");
        tester.pop();
        tester.printDeque();
        System.out.println("\n--EJECT--");
        tester.eject();
        tester.printDeque();
        System.out.println("\n--INJECT/PUSH SOME MORE--");
        tester.inject("candice");
        tester.push(10);
        tester.push(149);
        tester.push("surfs up");
        tester.inject("logan");
        tester.printDeque(); 
        System.out.println("\n--POP--");
        tester.pop();
        tester.printDeque();
        System.out.println("\n--EJECT--");
        tester.eject();
        tester.printDeque();          
        System.out.println("\n--INJECT/PUSH OBJECTS--");
        Person p1 = new Person("Logan", 20);
        Person p2 = new Person("Robbie", 21);
        Person p3 = new Person("Von", 22);
        tester.push(p1);
        tester.inject(p2);
        tester.push(p3);
        tester.printDeque();  
        System.out.println("\n--POP--");
        tester.pop();
        tester.printDeque();
        System.out.println("\n--EJECT--");
        tester.eject();
        tester.printDeque();  
        
        System.out.println("\n");
        System.out.println("BST Tester!");
        BST tester2 = new BST();
        tester2.insert(50);
        tester2.insert(40);
        tester2.insert(60);
        tester2.insert(45);
        tester2.insert(25);
        tester2.insert(69);        
        tester2.insert(1);
        tester2.insert(72);
        tester2.insert(49);
        tester2.insert(47);
        tester2.insert(70);
        tester2.insert(58);
        tester2.printTreeLevelOrder();
        System.out.println("Number of parents with one child: " + tester2.countParentsOfOne());
        
        System.out.println();
        
        BST tester3 = new BST();
        tester3.insert("logan");
        tester3.insert("robbie");
        tester3.insert("von");
        tester3.insert("jt");
        tester3.insert("austin");
        tester3.insert("kyle");        
        tester3.insert("shay");
        tester3.insert("chris");
        tester3.insert("adrian");
        tester3.insert("matt");
        tester3.insert("cam");
        tester3.insert("dorian");
        tester3.insert("tyson");
        tester3.printTreeLevelOrder();        
        System.out.println("Number of parents with one child: " + tester3.countParentsOfOne());

        
        
        
        


        
    }
}
