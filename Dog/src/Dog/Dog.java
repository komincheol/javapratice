package Dog;


public class Dog {
    String name;
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        //now make a Dog array
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //now access the dogs using the array
        //references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        //what is mydogs[2] name?
        System.out.print("last don't name is ");
        System.out.println(myDogs[2].name);
        //now loop through the array
        //and tell all dogs a bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    
    public void eat() { }
    
    public void chaseCat() { }
}