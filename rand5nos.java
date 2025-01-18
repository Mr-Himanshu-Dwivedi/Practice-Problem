import java.util.*;

public class rand5nos {
    
    public static void main(String[] args) {
        
        Random random=new Random();
        
        int a=100; 
        int b=999;
        
        System.out.println("Generating random number of three digit ");
	
        int n1=random.nextInt(b-a+1)+a;
        int n2=random.nextInt(b-a+1)+a;
	int n3=random.nextInt(b-a+1)+a;
	int n4=random.nextInt(b-a+1)+a;
	int n5=random.nextInt(b-a+1)+a;

	System.out.println(n1+" \n"+n2+" \n"+n3+" \n"+ n4+" \n"+n5);
	System.out.println("Maximum no is : "+Math.max(n1,Math.max(n2,(Math.max(n3,Math.max(n4,n5))))));
	System.out.println("Minimum no is : "+Math.min(n1,Math.min(n2,(Math.min(n3,Math.min(n4,n5))))));


            
    }
        
}
