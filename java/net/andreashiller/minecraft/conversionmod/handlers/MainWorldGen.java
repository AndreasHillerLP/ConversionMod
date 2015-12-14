package net.andreashiller.minecraft.conversionmod.handlers;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MainWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
		
	}

	private void generateInEnd(World world, Random random, int x, int z) {
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) {
		
		// Generate BlockBloodDiamondOre
		for (int i=0; i<5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(15);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(BlockHandler.blockBloodDiamondOre, 6)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		// Generate BlockRedCoalOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(45);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(BlockHandler.blockRedCoal, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		// Generate BlockXPStone
		for (int i=0; i<80; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(BlockHandler.blockXPStone, 25)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
	}

	private void generateInNether(World world, Random random, int x, int z) {
		
		// Generate BlockNetherRedCoal
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(80);
			int chunkZ = z + random.nextInt(16);
				
			(new WorldGenMinable(BlockHandler.blockNetherRedCoal, 10, Blocks.netherrack)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		// Generate BlockXPNetherRack
		for (int i=0; i<80; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(128);
			int chunkZ = z + random.nextInt(16);
					
			(new WorldGenMinable(BlockHandler.blockXPNetherRack, 25, Blocks.netherrack)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		for (int i=0; i<5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(45);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(BlockHandler.blockNetherBloodDiamond, 6, Blocks.netherrack)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
	}

}
