package abstractfactory.bike;

import abstractfactory.abst.BikeFactory;
import abstractfactory.abst.Body;
import abstractfactory.abst.Wheel;

public class GTFactoryImpl implements BikeFactory {
	@Override
	public Body createBody() {
		return new GTBikeBody();
	}

	@Override
	public Wheel createWheel() {
		return new GTBikeWheel();
	}
}
