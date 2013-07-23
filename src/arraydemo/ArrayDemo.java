package arraydemo;
/**
 *
 * @author  Karan Sharma
 * @time     Jul 19, 2013 7:41:54 AM 
 */
public class ArrayDemo {

    public static void main(String[] args) {
        
        //Method - 1 : First declare array, then separately allocate memory 
        int[] anArray; //declaring an array
        anArray = new int[10]; // allocating memory
        
        //Method - 2 : Create array and initialize at same time 
        int[] values = {
        1, 2,3, 4, 5 };     // "declaring" and "initializing" array at same time 
        
        int lengthOfValues = values.length;     //calculating the length of array named values
        
        // initializing "anArray"
        anArray[0] = 1;
        anArray[1] = 1;
        anArray[2] = 1;
        anArray[3] = 7;
        anArray[4] = 1;
        
        // Priniting comtents of "anArray"
        System.out.println("Element at anArray[0] : " + anArray[0] );
        System.out.println("Element at anArray[1] : " + anArray[1] );
        System.out.println("Element at anArray[2] : " + anArray[2] );
        System.out.println("Element at anArray[5] : " + anArray[5] );

        // Priniting comtents of array "values"
        System.out.println("Values[0] : " + values[0] );
        System.out.println("Values[1] : " + values[1] );
        System.out.println("Values[2] : " + values[2] );
        System.out.println("Values[3] : " + values[3] );
        
        System.out.println("Length of Values array : " + values.length);
        System.out.println("Length of Values array : " + lengthOfValues);
        
        // creating 2D array of type String
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Maven", "Jack", "Steve"}
        };
        
        // Printing contents of String type Array
        System.out.println(names[0][0] + names[1][0]);        
        System.out.println(names[0][2] + names[1][1]);
        System.out.println(names[2][0] + names[1][1]);

    }
}
