class Main {
public static void main(String[] args) {
  
  int A = 4538, C1, C2, C3, C4;
  String c1, c2, c3, c4;

  C4 = A % 10;

  System.out.println("c4 = "+C4);

 C3 = A % 100 / 10;

  System.out.println("C3 = "+C3);

C2 = A % 1000 / 100;

  System.out.println("C2 = "+C2);

C1 = A % 10000 /1000;

  System.out.println("C1 = "+C1);

c1 = String.valueOf(C1);
c2 = String.valueOf(C2);
c3 = String.valueOf(C3);
c4 = String.valueOf(C4);

System.out.println("El numero "+ A +" ahora es ");
System.out.println(c4+c3+c2+c1);


  }
}