public class CodeSignal {

    public static int main(String[] arg){
        int[] inputArray={1,2,4,5,6,7,8};
        int maximum=inputArray[0]*inputArray[1];

        for(int i = 0; inputArray.length - 1 > i; i++){
            int product=inputArray[i]*inputArray[i+1];
            if(maximum<product)
            {
                maximum=product;
            }
        }
        return maximum;
    }

//    int solution(int[] inputArray) {
//        int maximum=inputArray[0]*inputArray[1];
//
//        for(int i = 0; inputArray.length - 1 > i; i++){
//            int product=inputArray[i]*inputArray[i+1];
//            if(maximum<product)
//            {
//                maximum=product;
//            }
//        }
//        return maximum;
//    }

}
