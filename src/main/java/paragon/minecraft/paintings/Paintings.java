package paragon.minecraft.paintings;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod(Paintings.MOD_ID)
@Mod.EventBusSubscriber(bus = Bus.MOD)
public class Paintings {
	
	public static final String MOD_ID = "paragon_paintings";

	public Paintings() { }
	
	/**
	 * Creates a {@link ResourceLocation} in the {@value Paintings#MOD_ID} domain with
	 * the provided suffix as a path.
	 * 
	 * @param suffix - The {@link ResourceLocation} path to use
	 * @return A suitable {@link ResourceLocation}
	 */
	public static ResourceLocation resource(String suffix) {
		return new ResourceLocation(Paintings.MOD_ID, suffix);
	}
	
	@SubscribeEvent
	public static void onRegisterPaintings(final RegistryEvent.Register<Motive> event) {
		PaintingType.streamTypes().forEach(event.getRegistry()::register);
	}

}
