//we can have variable of same name in two different blocks

package variableDecalrationAndInitialization;

public class variable1
{
  public static void main (String [] args)
  {
   {
	  char ch ='o';
	  System.out.println(ch);
   }
   {
	   double ch=0.0;
	   System.out.println(ch);
   }
  }
}
