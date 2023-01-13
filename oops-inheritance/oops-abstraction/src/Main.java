                                     //abstraction--
             //     detail ko hide karna and main chejo ko dikhana

//type of abstraction -

// 1.abstract class(0-100%) hide kar skte
//2.interfaces(100%)

//1.abstraction class
abstract class vehicle{

    public void ayush(){
        System.out.println("my name is lakhan");
    }

    abstract void start();
}
//note=abstract method ese method hote h jinki body nhi hoti {no implimentation}

// note2-if kise class main abstract method ata h to uss class ko abstract bnana compulsari hota h,
// likin abstract class main abstract method ho ye compulsari nhi h


 /*class car extends vehicle{
     @Override
     void start() {
         System.out.println("start with key");
     }
 }
//note3- if abstract class ko extends kiya jata h normal class main to abstract
// class ke abstract method ko difine karna padta h

class bike extends vehicle{
    @Override
    void start() {
        System.out.println("start with kick");
    }
}
public class Main {
    public static void main(String[] args) {

//  note4=abstract class ka object creat nhi kiya ja skta
        car c =new car();
        c.start();
        c.ayush();
        bike b=new bike();
        b.start();

    }
}*/


//2.interfaces =

// syntax=interface & interface name

// interface ke andr "method" and "field" dono ate h..{but java "8" kke andr -1.= "default concrite  mathod bhi bna skte h
//                                                                             2.="static" concrite  mathod bhi bna skte h}
//                                                       {but java "9" ke andr -1.="private"concrite  mathod bhi bna skte h}
//method = "abstract" type ke hote h  sabhi mathod + "public" bhi lga hota h unmain..[public abstract]

//field=ismaain field sare by default " public static final" type ka hota h
//  ex-int a= 10; likhna h to ye by default public static final int a =10 ho jayega
//
// default method=
//ex-default void student(){}
//
// static method=
// public static void(){}
//
// private method=
// private satic void(){}

//interface face{
//    public void show();}
//
//  class test  implements face{
//    public void show(){
//        System.out.println("my name is ayush");
//    }}
//
//public class Main {
//
//      public static void main(String[] args) {
//        test s =new test();
//        s.show();
//
//      }
//}



//interface bicycle {
//    int a = 45;
//
//    void ApplyBreak();
//
//    void SpeedUp();
//}
//interface hornbicycle{
//    void blowhornayushh();
//    void blowhornarpit();
//}
//class avoncycle implements bicycle,hornbicycle{
//    void BlowHorn(){
//        System.out.println("pee pee pee pee");
//    }
//
//
//    public void ApplyBreak() {
//        System.out.println("apply break");
//    }
//
//
//    public void SpeedUp() {
//        System.out.println("speed up");
//    }
//
//
//    public void blowhornayushh() {
//        System.out.println(" kabhi khushhi kabhi gum pee pee pee");
//
//    }
//
//
//    public void blowhornarpit() {
//        System.out.println(" main hhun na poo poo poo");
//
//    }}
//    public class Main {
//    public static void main(String[] args) {
//        avoncycle show=new avoncycle();
//        show.ApplyBreak();
//        show.blowhornayushh();
//    }



//interface camera{
//    void TakeSnap();
//    void ClickPhoto();
//}
//interface wifi{
//    String [] Getnetwork();
//    void connectthenetwork(String network);
//}
//class cellphone{
//    void callthenumber(int phonenumber){
//        System.out.println("calling"+phonenumber);
//    }
//    void pickcall() {
//        System.out.println("connecing");
//    }
//
//}
//class smartphone  extends cellphone implements camera,wifi{
//    @Override
//    public void TakeSnap() {
//        System.out.println("take snap");
//    }
//
//    @Override
//    public void ClickPhoto() {
//        System.out.println("click photo");
//    }
//
//    @Override
//    public String[] Getnetwork() {
//        System.out.println("getting the network ");
//        String [] networklist={"ayush","arpit","akash","aman"};
//        return networklist;
//
//    }
//
//
//    @Override
//    public void connectthenetwork(String network) {
//        System.out.println("connecting"+network);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        smartphone show=new smartphone();
//      show.connectthenetwork("aayush");
//        show.Getnetwork();
//    }
//}

// do interface ke beech main inharetance kar skte h ..
//bhut kisi interface ko class main innharetance nhhi kar skte..
// interface sampleinterface{
//     void math1();
//     void math2 ();
//}
//interface chidinterface extends sampleinterface{
//     void math3();
//     void math4();
////}
//class sampleclass implements chidinterface{
//     public void math1(){
//         System.out.println("math1");
//     }
//
//    @Override
//    public void math2() {
//        System.out.println(math2);
//    }
//
//    @Override
//    public void math3() {
//        System.out.println("math3");
//    }
//
//    @Override
//    public void math4() {
//        System.out.println("math4");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//    sampleclass ayush=new sampleclass();
//    ayush.math1();
//    ayush.math4();
//    }
//}

//abstract class pen{
//    abstract void write();
//    abstract void refill();
//}
//class fountainpen extends pen{
//    public void changenib(){
//        System.out.println("change  the nib ");
//    }
//    public void write(){
//        System.out.println("write something ");
//    }
//    public void refill(){
//        System.out.println("refill the ink ");
//    }}
//    public class Main{
//        public static void main(String[] args) {
//            fountainpen ayush=new fountainpen();
//             ayush .refill();
//             ayush.write();
//             ayush.changenib();
//}
//        }

 interface animal{
     void eat();
     void sleep();
 }
abstract class monkey {
   abstract void jump();
   abstract void bite();

}

class human extends monkey implements animal {
    public void jump(){
        System.out.println("jump ");
    }
    public void bite(){
        System.out.println("bite");
    }

    @Override
    public void eat() {
        System.out.println("eat the food");
    }

    @Override
    public void sleep() {
        System.out.println("plzz go and sleep");
    }
}
public class Main {
    public static void main(String[] args) {
        human show=new human();
        show.bite();
        show.eat();
        show.jump();
        show.sleep();
    }
}
