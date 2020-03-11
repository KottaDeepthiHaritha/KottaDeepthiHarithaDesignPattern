package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class StrategypatternSubtract extends DesignPattern implements Strategy {
	
	private  final Logger LOGGER=LogManager.getLogger(StrategypatternSubtract.class);
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 - num2;
	   }
	}
		