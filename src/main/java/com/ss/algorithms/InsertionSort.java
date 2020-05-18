package com.ss.algorithms.sort;


public class InsertionSort {

    public static void main(String[] args){
        // System.out.println("In InsertionSort");
        InsertionSort is = new InsertionSort();
        int[] arrayToSort={7, 5, 8, 7, 1, 2, 30};

        int[] result=is.doSort(arrayToSort);
        //System.out.println("Result is " + result );
        for ( int i=0 ; i < result.length ; i++ ) {
            System.out.println("result[" + i + "] = " + result[i]);
        }

    }

    public int[] doSort( int[] input )
    {

        // System.out.println("In InsertionSort" + input);
        int i, j = 0 ;
        int currentValue=0;
        for ( i =0 ; i < input.length ; i ++ )
        {
            currentValue=input[i];
            for ( j=i+1 ; j < input.length ; j++ )
            {
                if ( input[i] > input[j] )
                {
                    // Switch
                    input[i]=input[j];
                    input[j]=currentValue;
                    currentValue=input[i];
                }
            }
        }

        for ( i=0 ; i < input.length ; i++ ) {
            System.out.println("End of doSort: input[" + i + "] = " + input[i]);
        }
        return input;
    }
}
