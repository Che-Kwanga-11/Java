/*
 if statement
 */
package lecture.pkg5;
import java.util.Scanner;
/*
if statement examples
<
>
<=
>=    // order matters
==  // used for numbers. NOT for STring
!=   // not equal. Not for String

"_john_smith"
 0
first = ""
last = "john_smith"

new task:
I do not want # in teh name. If there is # in teh name, I will print invalid.
nm.indexOf("#")

I do not want symbols # and & in teh name. If there is # in teh name, I will print invalid.
nm.indexOf("#&")

Question: is the name correct (i.e it doe not have any of teh symbols)
((nm.indexOf("#") == -1)  && (nm.indexOf("&") == -1))    // # is not in nm and & is not in nm
&& and
*/

public class Lecture5 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String nm, first, last;
        int idx;
        
        System.out.print("ENter your first and last name: ");
        nm = kb.nextLine();
        
        if ((nm.indexOf("#") == -1)  && (nm.indexOf("&") == -1)){
            System.out.println("There is no & or # in your name!");
        }
        else {
            System.out.println("There is at least one bad symbol (#,&) in your name.");
        }                        
        
        idx = nm.indexOf(" ");
        if (idx == -1)   // must use ==, NOT =
        {
            // this means there is no space in the name
            System.out.println("There is no space in your name. Cannot process.");
        }
        else {
            // process the name
            // grab first name: nm.substring(0,idx)
            //System.out.println("hello " + nm.substring(0,idx) );
            first = nm.substring(0,idx);
            last = nm.substring(idx+1);
            System.out.println("first is:" + first);
            System.out.println(" the length of first is: " + first.length() );
            System.out.println("last is:" + last); // alex alex           
            System.out.println(" the length of last is: " + last.length() );
            
//if (first == last){  // WRONG
           
            if ( first.equals(last) )  {
                System.out.println("The first and last name are the same!");
            }                    
        }
        System.out.println("Bye");
        
        
    }}
    

