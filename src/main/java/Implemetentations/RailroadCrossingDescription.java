package Implemetentations;

import Interfaces.IDescription;

public class RailroadCrossingDescription implements IDescription {

	@Override
	public void description() {
		System.out.printf("General description:\n %s", toString());
	}

	@Override
	public String toString() {
		String barrier = "Barrier";
		String rails = "Rails";

		return "-" + barrier + "\n" +
				"-" + rails + "\n";
	}


}
