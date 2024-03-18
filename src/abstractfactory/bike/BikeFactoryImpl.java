package abstractfactory.bike;

import abstractfactory.abst.BikeFactory;
import abstractfactory.abst.Body;
import abstractfactory.abst.Wheel;

public class BikeFactoryImpl implements BikeFactory {
	@Override
	public Body createBody() {
		return new SamBikeBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamBikeWheel();
	}
}
