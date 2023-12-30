package codeSignal;

public class MakeArrayConsecutive {
    public static void main(String[] arg){
        //take an array
        System.out.println("New file");
        int [] statues={6,2,3,8};

        //iterate through the array and sort it first in ascending order

        for(int i=0; i<statues.length; i++){
            System.out.println(statues[i]);
        }
        int temp=0;
        for(int i=0; i<statues.length; i++){
            for(int j=i+1; j<statues.length; j++){
                if(statues[i]>statues[j]){
                    temp=statues[i];
                    statues[i]=statues[j];
                    statues[j]=temp;
                }
            }
        }
        System.out.println("Elements in ascending order: ");
        for(int i=0; i<statues.length; i++){
            System.out.println(statues[i]);
        }

        // find the missing numbers in the array
//        arr[N-1] – arr[0] + 1 – N
        int N=statues.length;
        int count=statues[N-1]-statues[0]+1-N;
        System.out.println(count);
    }
}