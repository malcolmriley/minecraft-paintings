package paragon.minecraft.paintings;

import java.util.stream.Stream;

import net.minecraft.world.entity.decoration.Motive;

public enum PaintingType {
	ARCHWAY("archway", 2),
	BOULDERS("boulders", 2),
	CASTLE("castle", 3),
	CLEAR("clear"),
	COTTAGE("cottage", 2),
	CRAGS("crags", 2),
	CREEPER("creeper", 3),
	DANCE("dance"),
	DESERT_CLIFF("desert_cliff", 2),
	DIAMONDS("diamonds", 2),
	FRIENDS("friends"),
	GRASS_HILL("grass_hill", 3, 2),
	HEROBRINE("herobrine", 2, 3),
	JOURNEY("journey", 3),
	JUNGLE("jungle", 2),
	LIBRARIAN("librarian", 2, 3),
	MEETING("meeting", 2, 1),
	MOUNTAIN("mountain", 4, 2),
	NITWIT("nitwit", 2, 3),
	OBSIDIAN("obsidian", 4),
	OUTSKIRTS("outskirts", 3, 2),
	PARTY("party", 2),
	PICNIC("picnic", 3, 2),
	PORTRAIT("portrait", 3),
	PRIEST("priest", 2, 3),
	STUDYING("studying", 2),
	SUMMONED("summoned", 4, 5),
	TRADE("trade", 3, 2),
	TRAVELER("traveler", 3),
	VILLAGER("villager", 2),
	VISITOR("visitor", 1, 2),
	WITHER("wither", 4, 4),
	ZOMBIE("zombie")
	;
	
	/* Internal Fields */
	protected String NAME;
	protected int WIDTH;
	protected int HEIGHT;
	
	private PaintingType(String name) {
		this(name, 1);
	}
	
	private PaintingType(String name, int dimensions) {
		this(name, dimensions, dimensions);
	}
	
	private PaintingType(String name, int width, int height) {
		this.NAME = name;
		this.WIDTH = width;
		this.HEIGHT = height;
	}
	
	public Motive asPainting() {
		return new Motive(this.WIDTH * 16, this.HEIGHT * 16).setRegistryName(Paintings.resource(this.NAME));
	}
	
	public static Stream<Motive> streamTypes() {
		return Stream.of(PaintingType.values()).map(PaintingType::asPainting);
	}
	
}