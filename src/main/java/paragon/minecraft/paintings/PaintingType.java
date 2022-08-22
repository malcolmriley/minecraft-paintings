package paragon.minecraft.paintings;

import java.util.stream.Stream;

import net.minecraft.world.entity.decoration.Motive;

public enum PaintingType {
	
	;
	
	/* Internal Fields */
	protected String NAME;
	protected int WIDTH;
	protected int HEIGHT;
	
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