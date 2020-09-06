package virtual_pet;

public class TimeIncrementer extends Thread {
	 public void run() {

	        
	        VirtualPetsContainer p = VirtualPetsContainer.getInstance();
	        while (p.isRunning()) {

	        	
	            for (int i = 0; i < p.array.size(); i++) {
	                p.array.get(i).incrementAttributes();
	           
	            }
	            try {

	                Thread.sleep(4000); //increments increase by 4 seconds each time the while loop is ran

	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	        }


	    }

}
