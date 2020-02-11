import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        
        char T = sc.next().toUpperCase().charAt(0);
        
        double[][] M = new double[12][12];
        
        for (int i = 0; i < 12; i++) {
        	for (int j = 0; j < 12; j++) {
        		M[i][j] = sc.nextDouble();
        	}
        }
        
        for(int i=0;i<12;i++) {
        	for(int j=0;j<12;j++) {
        		if(i==j && j>(12-i-1)) {
        			soma += M[i][j];
        		}
        	}
        }
        
        if (T == 'M') {
        	soma /= 12;   
        }
        
    	System.out.println(String.format("%.1f", soma));
    }
	
}