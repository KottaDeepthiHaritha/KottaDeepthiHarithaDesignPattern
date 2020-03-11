package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface Strategy{
	   public int doOperation(int num1, int num2);
	}
public class Strategypatternadd implements Strategy{
	private final Logger LOGGER=LogManager.getLogger(Strategypatternadd.class);
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
	}
