/*
 ZeeshanQavi_BucketSizesAssignment
 ======================================================================================================== 
 =Zeeshan Qavi
 =Frontiers in Science (FIS) Program 2015 - Summer Research Fellowship 
 =Rice University - University of Houston 
 =ORIGINAL CODE DATE: 4/10/2015
 =HISTORY OF MAINTENANCE: 4/10/2015-4/10/2015 

 DESCRIPTION: This program counts  the size of the Bucket array and compares it to the value of the 
 N/L to determine if the Bucket can reach the target goal for N/L. 

 -I have written two seperate Programs, one that counts and returns: "True" for satisfying the target 
 value of N, and another for not satisfying the value of N.
 ======================================================================================================== 
 */
package zeeshanqavi_bucketsizesassignment;

public class ZeeshanQavi_BucketSizesAssignment {

    public static void main(String[] args) {
        int[] M = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] X = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99, 108};
        int N = 492;

        int Total = 0;
        for (int i : M) {
            Total += i;
        }

        if (Total <= N) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Total = 0;
        for (int i : X) {
            Total += i;
        }

        if (Total <= N) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
