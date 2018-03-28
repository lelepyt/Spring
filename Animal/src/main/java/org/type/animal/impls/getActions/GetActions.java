package org.type.animal.impls.getActions;

import org.type.animal.interfaces.Actions;
import org.type.animal.interfaces.Bear;
import org.type.animal.interfaces.Sloth;
import org.type.animal.interfaces.Tiger;

public class GetActions implements Actions {

	private Bear bear;
	private Sloth sloth;
	private Tiger tiger;

	public GetActions() {

	}

	public GetActions(Bear bear, Sloth sloth, Tiger tiger) {

		this.bear = bear;
		this.sloth = sloth;
		this.tiger = tiger;
	}

	@Override
	public void eat() {
		bear.bite();
		sloth.sleap();
		tiger.scratch();

	}

	@Override
	public void voice() {
		System.out.println("-arrrrr-");

	}

	public Bear getBear() {
		return bear;
	}

	public void setBear(Bear bear) {
		this.bear = bear;
	}

	public Sloth getSloth() {
		return sloth;
	}

	public void setSloth(Sloth sloth) {
		this.sloth = sloth;
	}

	public Tiger getTiger() {
		return tiger;
	}

	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}

}
