package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class DesignPattern 
{
	private static final Logger LOGGER=LogManager.getLogger(DesignPattern.class);
    public static void main( String[] args )
    {
        LOGGER.info("State pattern example" );
        Statepattern sp=new Statepattern();
        sp.Unlock();
        sp.Lock();
        sp.LowCharge();
        LOGGER.info("Decorator pattern example" );
        DecoratorpatternBasicCar bs=new DecoratorpatternBasicCar();
        DecoratorpatternLuxuryCar ls=new DecoratorpatternLuxuryCar();
        bs.assemble();
        LOGGER.info("-------------");
        ls.assemble();
        LOGGER.info("SingletonPattern");
        Singletonpattern ss=new Singletonpattern();
        Singletonpattern ob=Singletonpattern.getInstance();
        ob.Message();
        LOGGER.info("FactoryPattern");
        FactorypatternCircle x=new FactorypatternCircle();
        FactorypatternSquare y=new FactorypatternSquare();
        x.draw();
        y.draw();
        LOGGER.info("StrategyPattern");
        Strategypatternadd ap= new Strategypatternadd(2,3);
        StrategypatternSubtract ts=new  StrategypatternSubtract(2,3);
        ap.doOperation();
        ts.doOperation();
        
         

    }
}
