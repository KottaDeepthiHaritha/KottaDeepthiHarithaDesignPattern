package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class StrategypatternSubtract extends DesignPattern implements Strategy {
	int a,b;
	private  final Logger LOGGER=LogManager.getLogger(StrategypatternSubtract.class);
	public StrategypatternSubtract(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	public  void doOperation() {
		int x=this.a-this.b;
		LOGGER.info("SUBTRACT:",x);
		
	}

}
