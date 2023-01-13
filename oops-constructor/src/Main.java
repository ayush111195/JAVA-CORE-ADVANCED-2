class animal{
    String  name;
    String color;
    String  type;
    int age;
    animal(String name , String color , String type , int age ){
          this.name=name;
        this.color=color;
        this.type=type;
        this.age=age;

    }
}

public class Main {

    public static void main(String[] args) {
        animal d1 = new animal("harry", "black", "indian", 12);

        System.out.println(d1.name+  d1.color  +  d1.type +  d1.age);
    }

}

//type of constructors=

// 1.default constructor  2.user defined  3.parametrized constructor
