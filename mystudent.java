class Parent{
    int age , id;
    String name;

    void naming(String name){
        System.out.println("The name is:" + name);
    }
}

class Child extends Parent{
    void ageN(int age) {
        System.out.println("Age of student is: " + age);
    }
}
class mystudent{
    public static void main(String[] er){
        Child childobject = new Child();
        childobject.naming("Aashish");
        childobject.ageN(14);
    }
}