package Decorators;

import Interfaces.IDescription;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class TrafficLightsDecorator implements IDescription {
	@Inject
	@Delegate
	IDescription railRoadGeneralDesc;

	@Override
	public void description() {
		railRoadGeneralDesc.description();
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "- Traffic Lights";
	}
}
