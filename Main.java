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


        // 02 - interface with anonymous 
        Animal2 a2 = new Animal2(){
            public void Dog(){
                System.out.println("Interface with anonymous class");
            }
        };

        a2.Dog();
        

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