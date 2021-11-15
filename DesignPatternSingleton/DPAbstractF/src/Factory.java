
public class Factory implements AbstractFactory {

	@Override
	public AbstractPulgin getInstance() {
	
		return  new PulginImplA();
	}

	
	

}
