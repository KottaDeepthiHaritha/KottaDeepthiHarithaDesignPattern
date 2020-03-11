package patterns.design_patterns;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
abstract class Vehicle { 
    protected Workshop workShop1; 
    protected Workshop workShop2; 
  
    protected Vehicle(Workshop workShop1, Workshop workShop2) 
    { 
        this.workShop1 = workShop1; 
        this.workShop2 = workShop2; 
    } 
  
    abstract public void manufacture(); 
} 
class Cars extends Vehicle { 
	private  final Logger LOGGER=LogManager.getLogger(Cars.class);
    public Cars(Workshop workShop1, Workshop workShop2) 
    { 
        super(workShop1, workShop2); 
    } 
  
    @Override
    public void manufacture() 
    { 
        System.out.print("Car "); 
        workShop1.work(); 
        workShop2.work(); 
    } 
} 
class Bike extends Vehicle { 
	private  final Logger LOGGER=LogManager.getLogger(Bike.class);
    public Bike(Workshop workShop1, Workshop workShop2) 
    { 
        super(workShop1, workShop2); 
    } 
  
    @Override
    public void manufacture() 
    { 
        System.out.print("Bike "); 
        workShop1.work(); 
        workShop2.work(); 
    } 
} 
interface Workshop 
{ 
    abstract public void work(); 
} 

class Produce implements Workshop {
	private  final Logger LOGGER=LogManager.getLogger(Produce.class);
    @Override
    public void work() 
    { 
    	LOGGER.info("Produced"); 
    } 
} 
class Assemble implements Workshop { 
	private  final Logger LOGGER=LogManager.getLogger(Assemble.class);
    @Override
    public void work() 
    { 
    	LOGGER.info(" And"); 
    	LOGGER.info(" Assembled."); 
    } 
} 
  
