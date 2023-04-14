/* What will be the output of the following programs :

public class Test {
public static void main(String[] args){
int x = 2, y = 5;
int exp1 = (x * y / x);
int exp2 = (x * (y / x));
System.out.print(exp1 + “ , ”);
System.out.print(exp2);
}
} */

/* Solution
  exp1 = (2 * 5/2)According to higher Precedence
       = 10/2
       =5

   exp2 = (2 * (5/2))
        = 2* 2.5(int)so take as 2
        = 2 * 2
        = 4    

    output: 5,4.

 */