package net.hibiscus.naturespirit.world.feature.foliage_placer;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.hibiscus.naturespirit.NatureSpirit;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

import java.util.function.BiConsumer;

public class SugiFoliagePlacer extends FoliagePlacer{
    public static final Codec <SugiFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> {
        return fillFoliagePlacerFields(instance).apply(instance, SugiFoliagePlacer::new);
    });

    public SugiFoliagePlacer(IntProvider intProvider, IntProvider intProvider2) {
        super(intProvider, intProvider2);
    }

    protected FoliagePlacerType <?> getType() {
        return NatureSpirit.SUGI_FOLIAGE_PLACER_TYPE;
    }

    protected void generate(TestableWorld world, BiConsumer <BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, FoliagePlacer.TreeNode treeNode, int foliageHeight, int radius, int offset) {
        boolean bl = treeNode.isGiantTrunk();
        BlockPos blockPos = treeNode.getCenter().up(offset);
        this.generateSquare(world, replacer, random, config, blockPos, radius + treeNode.getFoliageRadius(), -1, false);
        this.generateSquare(world, replacer, random, config, blockPos, radius + 1 + treeNode.getFoliageRadius(), 0, false);
        this.generateSquare(world, replacer, random, config, blockPos, radius + treeNode.getFoliageRadius(), 1, false);
    }

    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return 0;
    }

    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return dx == radius && dz == radius && radius > 0;
    }
}
