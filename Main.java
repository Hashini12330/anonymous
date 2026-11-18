public class Main{
    public static void main(String[] args){

        // 01 - normal class with anonymous
        Animal a = new Animal(){

            @Override 

            public void show(){
                System.out.println("This is anonymous class");
            }

        };
        
        a.show();

        System.out.println("---------------------------------------");


        // 02 - interface with anonymous 
        Animal2 a2 = new Animal2(){
            public void Dog(){
                System.out.println("Interface with anonymous class");
            }
        };

        a2.Dog();

        System.out.println("---------------------------------------");



        // 03 - abstract class with anonymous
        Animal3 a3 = new Animal3() {
            public void abs(){
                System.out.println("This is abstract with anonymous");

            }
        };
        
        a3.abs();

    }

}


// 01
class Animal{
    public void show(){
        System.out.println("Main class");
    }
}



// 02
interface Animal2{
    public void Dog();
}



// 03
abstract class Animal3{
    abstract void abs();
}