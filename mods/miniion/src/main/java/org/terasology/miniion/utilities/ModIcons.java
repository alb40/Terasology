package org.terasology.miniion.utilities;

import org.terasology.model.inventory.Icon;

public final class ModIcons {
	
	public static void loadIcons(){
		Icon.set("minionskull", "miniion:minionicon16", 0, 0);
		Icon.set("minioncommand", "miniion:minionicon16", 0, 1);
		Icon.set("emptycard", "miniion:minionicon16", 0, 2);
		Icon.set("filledcard", "miniion:minionicon16", 0, 3);
	}
}
