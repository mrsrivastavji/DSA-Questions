import java.util.*;

class  Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of string: ");
        int n=sc.nextInt();
        System.out.print("Enter the string: ");
        String num=sc.next();
        int count=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=num.charAt(j)-'0';
                if(sum!=(j-i+1)){
                    count++;
                }
            }
        }
        System.out.print("No of sub string: "+count);
    }
}