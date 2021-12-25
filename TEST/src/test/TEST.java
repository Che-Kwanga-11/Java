/*


*/
package test;


public class TEST {
 public static void print_int_matrix(String name, int[] a)
  {
    System.out.printf("%7s: ", name);
    for (int i = 0; i < a.length; i++)
    {
      System.out.printf("%7d", a[i]);
    }
    System.out.printf("\n");
  }
  
  public static void foo(int[] x, int[] y)
  {
    for (int i = 0; i < x.length; i++)
    {
      x[i] = 100 + x[i];
    }
  
    int[] q = {1, 2, 3};
    y = q;
  }
  
  public static void main(String[] args)
  {
    int[] a = {3, 2, 5};                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
    int[] b = a;
    int[] c = {3, 2, 5};
    int[] d = c;
      
    foo(b, d);
    System.out.println(b[0]);
    System.out.println(d[0]);
    print_int_matrix("a", a);
    print_int_matrix("c", c);
  }
    
    

    
}
