                          //   final keyword===
// agr hum final keyword ka use karte h to uss case main hum usko na extend kar skte na hi inherit
// public class Main{
//    public static void main(String[] args) {
//      final int i = 15;
//      //  i =i+20;
//        System.out.println(i);// 35 hoga result but if we use final keyword then we can get result=== 15
       // and i  ke sath hum kuch nhi kar skte na  kuch jod payenge na kuch ghata payenge ..
//    }
//}
class demo{
      final void ayush(){
        System.out.println("my name is ramu");

    }}
                          //agr hum yhan fina keyword ka use kr lenge to humusko inharitate (extends)
                         // nhi karwa payenge
    class test extends demo {
      void ayush(){             // yhan error show karwa dega

          System.out.println("my name is shyamu");
      }

        public static void main(String[] args) {
            test s1=new test();
            s1.ayush();
        }
    }
