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


        

    }

}

class Animal{
    public void show(){
        System.out.println("Main class");
    }
}


