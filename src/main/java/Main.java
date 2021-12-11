import Implemetentations.RailroadCrossingDescription;
import Interfaces.IDescription;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Main {
	public static void main(String[] args) {

		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		SeContainer container = initializer.initialize();

		IDescription obj = container.select(RailroadCrossingDescription.class).get();
		obj.description();
	}
}
