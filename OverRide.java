class Parent {
    public void sayHello(){
        System.out.println("Hello from parent.");
    }

}

class child extends Parent{

    @Override 
    public void sayHello(){
        System.out.println("Hello from child");
    }
}

class OverRide{
    public static void main(String[]args){
        Parent p = new child();
        p.sayHello();
    }
}