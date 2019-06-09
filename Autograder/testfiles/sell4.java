public class sell4 
{ 
    
	 public static void main(String []args) 
	    { 
	        int k=2; 
	       
	        int[] p= {2,4,1};
	        int n = p.length; 
	        System.out.println("Max profit = " + profit(p,n,k)); 
	    } 
	
		
    static int profit(int[] p,int n,int k) 
    { 
      int[][] s=new int[k + 1][n + 1]; 
  
       int i=0;
        while (i<=k) {
        	
        	s[i][0]=0;
  
       
        for (int j=0;j<=n;j++) 
            s[0][j] = 0;
        
        i++;
        }
       
        for (int a=1;a<=k;a++)  
        { 
            for (int j=1;j<n;j++) 
            { 
                int pr=0; 
  
                for (int m=0;m<j;m++) 
                pr= Math.max(pr, p[j]-p[m]+s[a - 1][m]); 
  
                s[a][j] = Math.max(s[a][j-1],pr); 
            } 
        } 
  
        return s[k][n-1]; 
    } 
  
   
} 
  