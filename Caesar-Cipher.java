import java.util.Scanner;

public class Program
{
    
    private static String encrypt( String line, int n){
        
        char[] encode;
        encode=line.toCharArray();
	    
	    for(int i=0; i<encode.length; i++){
	        if(Character.isLetter(encode[i])){
	            encode[i]=(char)((encode[i]+n - 'a') %26 + 'a');
	        }
	    }
	    line=String.valueOf(encode);
	    
	    return line;
        
    }
    
    
    private static String decrypt( String line, int n){
        
        char[] encode;
        encode=line.toCharArray();
	    
	    for(int i=0; i<encode.length; i++){
	        if(Character.isLetter(encode[i])){
	            encode[i]=(char)((encode[i]-n - 'a') %26 + 'a');
	        }
	    }
	    line=String.valueOf(encode);
	    
	    return line;
        
    }
    
	public static void main(String[] args) {
	    String line;
	    int n,a;
	    char[] encode;
	    
	    System.out.println("Introduce the text:");
	    Scanner scan = new Scanner(System.in);
	    line=scan.nextLine();
	    System.out.println(line);
	    System.out.println("Introduce the number of shifts:");
        n=scan.nextInt();
        System.out.println(n);

	    line=encrypt(line,n);
	    System.out.println(line);
	    
	    line=decrypt(line,n);
	    System.out.println(line);
	    
		
	}
}