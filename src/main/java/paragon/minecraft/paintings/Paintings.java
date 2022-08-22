package paragon.minecraft.paintings;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(Paintings.MOD_ID)
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

}
