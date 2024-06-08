import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int k=n>m?n:m;
        for(int i=0;i<k;i++){
            if(i<n && i<m){
                System.out.println(a[i]+b[i]);
            }
            else if(i<n){
                System.out.println(a[i]);
            }
            else{
                System.out.println(b[i]);
            }
        }
    }
}