package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface MobileAlertState  
{ 
    public void alert(Statepattern ctx); 
} 
  
class Statepattern  extends DesignPattern
{ 
	private static final Logger LOGGER=LogManager.getLogger(Statepattern.class);
    private MobileAlertState currentState; 
  
    public Statepattern()  
    { 
        currentState = new Vibration(); 
    } 
  
    public void setState(MobileAlertState state)  
    { 
        currentState = state; 
    } 
  
    public void alert()  
    { 
        currentState.alert(this); 
    } 
} 
  
class Vibration implements MobileAlertState  
{ 
	private static final Logger LOGGER=LogManager.getLogger(Vibration.class);
    @Override
    public void alert(Statepattern ctx)  
    { 
         LOGGER.info("vibration..."); 
    } 
  
} 
  
class Silent implements MobileAlertState 
{ 
	private static final Logger LOGGER=LogManager.getLogger(Silent.class);
    @Override
    public void alert(Statepattern ctx)  
    { 
    	LOGGER.info("silent..."); 
    } 
  
} 