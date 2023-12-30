package chapter;

public class Patern {
    public static void main(String[] arg){
       int n=6;
       for(int i=0; i<=n; i++){
           StringBuilder row= new StringBuilder();
           for(int j=0; j<=i; j++){
               row.append((n - j)).append(" ");
           }
           System.out.println(row);
       }
    }
}

//    let num = 1;
//    for (let i = 1; i <= n; i++) {
//            let row = "";
//            for (let j = 1; j <= i; j++) {
//            row += num + " ";
//            num++;
//            }
//            console.log(row);
//            }
//            }
//// Example usage
//            const n = 6;
//            printPattern(n);





