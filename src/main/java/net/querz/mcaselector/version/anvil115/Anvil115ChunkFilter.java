package net.querz.mcaselector.version.anvil115;

import net.querz.mcaselector.io.BiomeRegistry;
import net.querz.mcaselector.version.anvil113.Anvil113ChunkFilter;
import net.querz.nbt.tag.CompoundTag;
import java.util.Arrays;

public class Anvil115ChunkFilter extends Anvil113ChunkFilter {

	@Override
	public void forceBiome(CompoundTag data, BiomeRegistry.BiomeIdentifier biome) {
		if (data.containsKey("Level")) {
			int[] biomes = new int[1024];
			Arrays.fill(biomes, biome.getID());
			data.getCompoundTag("Level").putIntArray("Biomes", biomes);
		}
	}
}
