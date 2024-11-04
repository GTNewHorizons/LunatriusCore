package com.github.lunatrius.core.world.chunk;

import java.util.Random;

public class ChunkHelper {

    private static final Random RANDOM = new Random();

    public static boolean isSlimeChunk(long seed, int x, int z) {
        // noinspection IntegerMultiplicationImplicitCastToLong - we want to do the casts as integers and *then* cast
        RANDOM.setSeed(
            seed + (long) (x * x * 0x4c1906) + (long) (x * 0x5ac0db) + (long) (z * z) * 0x4307a7L + (long) (z * 0x5f24f)
                ^ 0x3ad8025fL);
        return RANDOM.nextInt(10) == 0;
    }
}
