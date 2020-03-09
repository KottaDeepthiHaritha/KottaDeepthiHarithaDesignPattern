package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface Strategy {
	   public void doOperation();
	}
class Strategypatternadd extends DesignPattern implements Strategy {
	int a,b;
	private final Logger LOGGER=LogManager.getLogger(Strategypatternadd.class);
    	public Strategypatternadd(int a, int b) {
		this.a=a;
		this.b=b;
		// TODO Auto-generated constructor stub
	}
	public void doOperation() {
		LOGGER.info("ADD:",this.a+this.b);
	}
    
}
