package Zadaca23;

public class Zadaca2 {
		
	public boolean zbir(int a) {
		for	(int i = 11; i <= 99; i++)
		   {
			   a += i;
		   }
		if (a == 4905) {
			return true;
		}
		
		return false;
	}
	
	public boolean palindrom(String palindrom) {
		
		String revWord;
		
        StringBuilder strBuild = new StringBuilder(); 
       
        strBuild.append(palindrom); 
        
        strBuild = strBuild.reverse();
        
        revWord = strBuild.toString();
        
        if (palindrom.equals(revWord)) {
			return true;
		}
          
        return false;
	}
	
}
