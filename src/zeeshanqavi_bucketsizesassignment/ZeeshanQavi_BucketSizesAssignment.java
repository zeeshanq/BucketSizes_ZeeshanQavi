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
value of N/L, and another for not satisfying the value of N/L.
======================================================================================================== 
*/

package zeeshanqavi_bucketsizesassignment;

public class ZeeshanQavi_BucketSizesAssignment

{

    public static void main(String[] args) 
    {
        int M [];
        M = new int[12];
        M[0] = 1;
        M[1] = 2;
        M[2] = 3;
        M[3] = 4;
        M[4] = 5;
        M[5] = 6;
        M[6] = 7;
        M[7] = 8;
        M[8] = 9;
        M[9] = 10;
        M[10] = 11;
        M[11] = 12; 
        
        int N=492;
        int Total=M[0]+M[1]+M[2]+M[3]+M[4]+M[3]+M[4]+M[5]+M[6]+M[7]+M[8]+M[9]+M[10]+M[11];
        
        if (Total<=N)
        {
            System.out.println ("True");
        }
        else
            System.out.println("False"); 
    
        int X [];
        X = new int[12];
        X[0] = 9;
        X[1] = 18;
        X[2] = 27;
        X[3] = 36;
        X[4] = 45;
        X[5] = 54;
        X[6] = 63;
        X[7] = 72;
        X[8] = 81;
        X[9] = 90;
        X[10] = 99;
        X[11] = 108; 
        
        int L=492;
        int Sum=X[0]+X[1]+X[2]+X[3]+X[4]+X[3]+X[4]+X[5]+X[6]+X[7]+X[8]+X[9]+X[10]+X[11];
        
        if (Sum<=L)
        {
            System.out.println ("True");
        }
        else
            System.out.println("False"); 
        
        }

    }


    
    

