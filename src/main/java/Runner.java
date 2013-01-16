import com.relayClient.raspi.PowerController;

public class Runner
{
    public static void main(String[] args)
    {
        // create controller instance and start it up
        PowerController powerSocket = new PowerController();
        
        while(true) {
            System.out.println("");
        	System.out.println("Turn Relay ON/OFF?");
  
	        String event = System.console().readLine();
	        
	        if (event == "On" || event == "on") {
	        	powerSocket.turnOn();
	        }
	        
	        if (event == "Off" || event == "off") {
	        	powerSocket.turnOff();
	        }
        }
    }
}
