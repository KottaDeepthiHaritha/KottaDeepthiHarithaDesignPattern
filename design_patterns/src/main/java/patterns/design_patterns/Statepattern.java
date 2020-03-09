package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface AlertState{
	public void Unlock();
	public void Lock();
	public void LowCharge();
}
class Statepattern extends DesignPattern implements AlertState{
	private static final Logger LOGGER=LogManager.getLogger(Statepattern.class);
	String state;
	public Statepattern(){
		LOGGER.info("Some of the phone operations are:\n");
	}
    public void Unlock() {
    	LOGGER.info("when the phone is unlocked,we can see any thing in phone");
    }
    public void Lock() {
    	LOGGER.info("when the phone is locked,we can't see any thing in phone");
    }
    public void LowCharge() {
    	LOGGER.info("when the phone is lowcharge,plug in the charge");
    }

}
