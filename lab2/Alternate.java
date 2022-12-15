
package alternate;



public class Alternate {
    static void printAlter(int[]arr,int n){
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(arr[i] +" ");
            }
        }
    }

       public static void main(String[]args){
           int[]arr={10,20,30,40,50,60,70,80,90,100};
           int n=arr.length;
           printAlter(arr,n);

    
}
}
