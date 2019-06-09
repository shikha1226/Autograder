public class sell22
{
    	
    public static int maxp(int[] p) {
        int maxp=0;
        
        if (p.length<= 1) {
            return maxp;
        }
        
        for (int i=1; i<p.length;i++) {
            if (p[i]>p[i-1]) {
               maxp += p[i]-p[i-1]; 
            }
        }
    
        return maxp;
    }
    
    public static void main(String[] args) {
	    
    	int a = maxp(new int[]{7,1,5,3,6,4});
    	  System.out.println(a);
    	 }
    	
    }
