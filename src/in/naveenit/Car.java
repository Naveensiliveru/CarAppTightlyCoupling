package in.naveenit;

public class Car  extends Engine{

	
	 public   void drive() {
		   int status=  super.start();
		    if (status>=1) {
		    	 System.out.println(" journey is Started");
		    	
		    } else {
		    	 System.out.println(" Engine is  Trouble");
		    }
		  
		  
	 }
}
