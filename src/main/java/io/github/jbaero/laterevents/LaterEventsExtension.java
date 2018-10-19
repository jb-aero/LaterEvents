package io.github.jbaero.laterevents;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.abstraction.Implementation;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;

@MSExtension("LaterEvents")
public class LaterEventsExtension extends AbstractExtension
{
	LaterListener listener;
	@Override
	public Version getVersion() {
		return new SimpleVersion(0, 1, 0);
	}

	@Override
	public void onStartup() {
		if (Implementation.GetServerType() == Implementation.Type.BUKKIT) {
			listener = new BukkitLaterListener();
		} else {
			System.out.println("LaterEvents not supported on this implementation yet.");
		}

		if (listener != null) {
			listener.registerSelf();
		}
	}

	@Override
	public void onShutdown() {
		if (listener != null) {
			listener.unregisterSelf();
		}
	}

	public interface LaterListener {
		void registerSelf();
		void unregisterSelf();
	}
}
