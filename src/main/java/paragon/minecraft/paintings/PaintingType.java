package paragon.minecraft.paintings;

import java.util.stream.Stream;

import net.minecraft.world.entity.decoration.Motive;

public enum PaintingType {
	ARCHWAY("archway", 2),
	BOULDERS("boulders", 2),
	CASTLE("castle", 3),
	DESERT_CLIFF("desert_cliff", 2),
	FRIENDS("friends", 1),
	GRASS_HILL("grass_hill", 3, 2),
	MEETING("meeting", 2, 1),
	PICNIC("picnic", 3, 2),
	PORTRAIT("portrait", 3),
	TRADE("trade", 3, 2),
	TRAVELER("traveler", 3),
	VISITOR("visitor", 1, 2),
	ZOMBIE("zombie", 1)
	;
	
	/* Internal Fields */
	protected String NAME;
	protected int WIDTH;
	protected int HEIGHT;
	
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