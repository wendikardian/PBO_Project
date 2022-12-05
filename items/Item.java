package items;

import interfaces.*;

public abstract class Item implements Describable {

	private final String NAME;
	protected final String DESCRIPTION;

	public Item(String name, String description) {
		this.NAME = name;
		this.DESCRIPTION = description;
	}

	public String getNAME() {
		return this.NAME;
	}

	@Override
	public String readDescription() {
		return this.DESCRIPTION;
	}
}