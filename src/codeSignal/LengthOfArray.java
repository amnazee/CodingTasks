package codeSignal;

public class LengthOfArray {
    public static void  main(String[] arg){

        String[] inputArray={"aba", "aa", "ad", "vcd","aba"};
        //output array which will store all the longest length strings
        //a variable which will store the length of the longest string in the array
        int longest =0;
//        keeps the count of the strings of longest length
        int count=0;
        //find the longest possible strings
        for (String s : inputArray) {
            if (s.length() >= longest) {
                longest = s.length();
                count++;
            }
        }

        System.out.println(count);
        //initialize new array to store the longest length elements
//        String[] outputArray=new String[count];
        String[] outputArray=new String[count];
        //copy the longest length strings to a new array
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i].length()==longest){
                outputArray[i]=inputArray[i];
            }
        }
        //printing the input array/original array
//        for(int i=0; i<inputArray.length-1; i++){
//            System.out.print(inputArray[i]+" ");
//        }
        //printing the output array/longest length string array
//        for(int i=1; i<outputArray.length; i++){
//            System.out.print(outputArray[i]+" ");
//        }
    }
}
