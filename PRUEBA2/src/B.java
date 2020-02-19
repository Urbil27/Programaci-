public class B extends A {
 private int a = 123;
 public B() {
 a = 2222;
 }
 public void rollBackA () {
 a = super.getA();
 }
 public void setA( int value) {
 a = value;
 }
 public int getA() {
 return a;
 }
} //class B