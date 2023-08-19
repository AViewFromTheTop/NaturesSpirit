package net.hibiscus.naturespirit.world.feature;


import net.hibiscus.naturespirit.NatureSpirit;
import net.hibiscus.naturespirit.blocks.HibiscusBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.biome.OverworldBiomeCreator;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class HibiscusPlacedFeatures {


   public static final RegistryKey <PlacedFeature> LARGE_REDWOOD_CHECKED = registerKey("large_redwood_checked");
   public static final RegistryKey <PlacedFeature> REDWOOD_CHECKED = registerKey("redwood_checked");
   public static final RegistryKey <PlacedFeature> ASPEN_CHECKED = registerKey("aspen_checked");
   public static final RegistryKey <PlacedFeature> ASPEN_BEES_CHECKED = registerKey("aspen_bees_checked");
   public static final RegistryKey <PlacedFeature> RED_MAPLE_CHECKED = registerKey("red_maple_checked");
   public static final RegistryKey <PlacedFeature> ORANGE_MAPLE_CHECKED = registerKey("orange_maple_checked");
   public static final RegistryKey <PlacedFeature> YELLOW_MAPLE_CHECKED = registerKey("yellow_maple_checked");
   public static final RegistryKey <PlacedFeature> CYPRESS_CHECKED = registerKey("cypress_checked");
   public static final RegistryKey <PlacedFeature> FIR_CHECKED = registerKey("fir_checked");
   public static final RegistryKey <PlacedFeature> WILLOW_CHECKED = registerKey("willow_checked");
   public static final RegistryKey <PlacedFeature> WILLOW_PLACED = registerKey("willow_placed");
   public static final RegistryKey <PlacedFeature> WHITE_WISTERIA_CHECKED = registerKey("white_wisteria_checked");
   public static final RegistryKey <PlacedFeature> BLUE_WISTERIA_CHECKED = registerKey("blue_wisteria_checked");
   public static final RegistryKey <PlacedFeature> PINK_WISTERIA_CHECKED = registerKey("pink_wisteria_checked");
   public static final RegistryKey <PlacedFeature> PURPLE_WISTERIA_CHECKED = registerKey("purple_wisteria_checked");
   public static final RegistryKey <PlacedFeature> SUGI_CHECKED = registerKey("sugi_checked");
   public static final RegistryKey <PlacedFeature> OLIVE_CHECKED = registerKey("olive_checked");
   public static final RegistryKey <PlacedFeature> JOSHUA_CHECKED = registerKey("joshua_checked");

   public static final RegistryKey <PlacedFeature> OAK_BUSH_CHECKED = registerKey("oak_bush_checked");
   public static final RegistryKey <PlacedFeature> SPRUCE_BUSH_CHECKED = registerKey("spruce_bush_checked");

   public static final RegistryKey <PlacedFeature> FLOWER_WISTERIA_PLACED = registerKey("flower_wisteria_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_SUGI_PLACED = registerKey("flower_sugi_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_REDWOOD_PLACED = registerKey("flower_redwood_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_FIR_PLACED = registerKey("flower_fir_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_LAVENDER_PLACED = registerKey("flower_lavender_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_FOXGLOVE_PLACED = registerKey("flower_foxglove_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_RIVER_PLACED = registerKey("flower_river_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_GOLDEN_PLACED = registerKey("flower_golden_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_GOLDEN2_PLACED = registerKey("flower_golden2_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_CYPRESS_PLACED = registerKey("flower_cypress_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_CARNATION_PLACED = registerKey("flower_carnation_placed");
   public static final RegistryKey <PlacedFeature> PATCH_SCORCHED_GRASS_PLACED = registerKey("patch_scorched_grass_placed");
   public static final RegistryKey <PlacedFeature> PATCH_TALL_SCORCHED_GRASS_PLACED = registerKey("patch_tall_scorched_grass_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_BLOOMING_DUNES_PLACED = registerKey("flower_blooming_dunes_placed");
   public static final RegistryKey <PlacedFeature> FLOWER_STRATIFIED_DESERT_PLACED = registerKey("flower_stratified_desert_placed");

   public static final RegistryKey <PlacedFeature> WISTERIA_WATER = registerKey("wisteria_water_placed");
   public static final RegistryKey <PlacedFeature> LAVENDER_WATER = registerKey("lavender_water_placed");
   public static final RegistryKey <PlacedFeature> SWAMP_WATER = registerKey("swamp_water_placed");
   public static final RegistryKey <PlacedFeature> RIVER_WATER = registerKey("river_water_placed");

   public static final RegistryKey <PlacedFeature> LARGE_REDWOOD_PLACED = registerKey("large_redwood_placed");
   public static final RegistryKey <PlacedFeature> REDWOOD_PLACED = registerKey("redwood_placed");
   public static final RegistryKey <PlacedFeature> ASPEN_PLACED = registerKey("aspen_placed");
   public static final RegistryKey <PlacedFeature> MAPLE_PLACED = registerKey("maple_placed");
   public static final RegistryKey <PlacedFeature> FEW_ASPEN_PLACED = registerKey("few_aspen_placed");
   public static final RegistryKey <PlacedFeature> DENSE_CYPRESS_PLACED = registerKey("dense_cypress_placed");
   public static final RegistryKey <PlacedFeature> CYPRESS_PLACED = registerKey("cypress_placed");
   public static final RegistryKey <PlacedFeature> FIR_PLACED = registerKey("fir_placed");
   public static final RegistryKey <PlacedFeature> DENSE_FIR_PLACED = registerKey("dense_fir_placed");
   public static final RegistryKey <PlacedFeature> SPRUCE_BUSH_PLACED = registerKey("spruce_bush_placed");
   public static final RegistryKey <PlacedFeature> REDWOOD_ROCK_PLACED = registerKey("redwood_rock_placed");
   public static final RegistryKey <PlacedFeature> WISTERIA_PLACED = registerKey("wisteria_placed");
   public static final RegistryKey <PlacedFeature> SUGI_PLACED = registerKey("sugi_placed");
   public static final RegistryKey <PlacedFeature> OLIVE_PLACED = registerKey("olive_placed");
   public static final RegistryKey <PlacedFeature> JOSHUA_PLACED = registerKey("joshua_placed");

   public static final RegistryKey <PlacedFeature> OAK_BUSH_PLACED = registerKey("oak_bush_placed");
   public static final RegistryKey <PlacedFeature> CUSTOM_FANCY_OAK_TREE_PLACED = registerKey(
           "custom_fancy_oak_tree_placed");
   public static final RegistryKey <PlacedFeature> CUSTOM_FANCY_OAK_TREE2_PLACED = registerKey(
           "custom_fancy_oak_tree2_placed");
   public static final RegistryKey <PlacedFeature> CATTAILS = registerKey("cattails_placed");
   public static final RegistryKey <PlacedFeature> ROOTED_DESERT_TURNIP = registerKey("rooted_desert_turnip_placed");

   private static final PlacementModifier TREE_THRESHOLD = SurfaceWaterDepthFilterPlacementModifier.of(0);

   public static void bootstrap(Registerable <PlacedFeature> context) {
      var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


      registerKey(context,
              LARGE_REDWOOD_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.LARGE_REDWOOD_TREE),
              List.of(PlacedFeatures.wouldSurvive(HibiscusBlocks.REDWOOD_SAPLING[0]))
      );
      registerKey(context,
              REDWOOD_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.REDWOOD_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.REDWOOD_SAPLING[0])
      );
      registerKey(context,
              ASPEN_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.ASPEN_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.ASPEN_SAPLING[0])
      );
      registerKey(context,
              ASPEN_BEES_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.ASPEN_TREE_BEES),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.ASPEN_SAPLING[0])
      );
      registerKey(context,
              RED_MAPLE_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.RED_MAPLE_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.RED_MAPLE_SAPLING[0])
      );
      registerKey(context,
              ORANGE_MAPLE_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.ORANGE_MAPLE_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.ORANGE_MAPLE_SAPLING[0])
      );
      registerKey(context,
              YELLOW_MAPLE_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.YELLOW_MAPLE_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.YELLOW_MAPLE_SAPLING[0])
      );
      registerKey(context,
              CYPRESS_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.CYPRESS_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.CYPRESS_SAPLING[0])
      );
      registerKey(context,
              JOSHUA_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.JOSHUA_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.JOSHUA_SAPLING[0])
      );
      registerKey(context,
              FIR_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FIR_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.FIR_SAPLING[0])
      );
      registerKey(context,
              WILLOW_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.WILLOW_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.WILLOW_SAPLING[0])
      );
      registerKey(context,
              WHITE_WISTERIA_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.WHITE_WISTERIA_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.WHITE_WISTERIA_SAPLING[0])
      );
      registerKey(context,
              BLUE_WISTERIA_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.BLUE_WISTERIA_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.BLUE_WISTERIA_SAPLING[0])
      );
      registerKey(context,
              PINK_WISTERIA_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.PINK_WISTERIA_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.PINK_WISTERIA_SAPLING[0])
      );
      registerKey(context,
              PURPLE_WISTERIA_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.PURPLE_WISTERIA_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.PURPLE_WISTERIA_SAPLING[0])
      );
      registerKey(context,
              SUGI_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.SUGI_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.SUGI_SAPLING[0])
      );
      registerKey(context,
              OLIVE_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.OLIVE_TREE),
              PlacedFeatures.wouldSurvive(HibiscusBlocks.OLIVE_SAPLING[0])
      );

      registerKey(context,
              OAK_BUSH_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.OAK_BUSH),
              PlacedFeatures.wouldSurvive(Blocks.OAK_SAPLING)
      );
      registerKey(context,
              SPRUCE_BUSH_CHECKED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.SPRUCE_BUSH),
              PlacedFeatures.wouldSurvive(Blocks.SPRUCE_SAPLING)
      );

      registerKey(context,
              FLOWER_WISTERIA_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_WISTERIA_FOREST),
              CountPlacementModifier.of(3),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_SUGI_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_SUGI_FOREST),
              CountPlacementModifier.of(3),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_REDWOOD_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_REDWOOD_FOREST),
              CountPlacementModifier.of(3),
              RarityFilterPlacementModifier.of(10),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_LAVENDER_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_LAVENDER_FIELD),
              CountPlacementModifier.of(5),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_FOXGLOVE_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_FOXGLOVE_FIELD),
              CountPlacementModifier.of(8),
              RarityFilterPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_RIVER_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_ERODED_RIVER),
              CountPlacementModifier.of(5),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_GOLDEN_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_GOLDEN_WILDS),
              CountPlacementModifier.of(3),
              RarityFilterPlacementModifier.of(5),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_GOLDEN2_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_GOLDEN_WILDS),
              CountPlacementModifier.of(5),
              RarityFilterPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_FIR_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_FIR_FOREST),
              CountPlacementModifier.of(5),
              RarityFilterPlacementModifier.of(5),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_CYPRESS_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_CYPRESS_FIELDS),
              CountPlacementModifier.of(3),
              RarityFilterPlacementModifier.of(15),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FLOWER_CARNATION_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_CYPRESS_FIELDS),
              CountPlacementModifier.of(5),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              PATCH_SCORCHED_GRASS_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.PATCH_SCORCHED_GRASS),
              CountPlacementModifier.of(4),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              PATCH_TALL_SCORCHED_GRASS_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.PATCH_TALL_SCORCHED_GRASS),
              CountPlacementModifier.of(3),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );

      registerKey(context,
              FLOWER_BLOOMING_DUNES_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_BLOOMING_DUNES),
              CountPlacementModifier.of(5),
              RarityFilterPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );

      registerKey(context,
              FLOWER_STRATIFIED_DESERT_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FLOWER_STRATIFIED_DESERT),
              CountPlacementModifier.of(3),
              RarityFilterPlacementModifier.of(15),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );

      registerKey(context,
              WISTERIA_WATER,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.WISTERIA_DELTA),
              CountMultilayerPlacementModifier.of(20),
              BiomePlacementModifier.of()
      );
      registerKey(context,
              LAVENDER_WATER,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.WISTERIA_DELTA),
              CountMultilayerPlacementModifier.of(12),
              BiomePlacementModifier.of()
      );
      registerKey(context,
              SWAMP_WATER,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.SWAMP_DELTA),
              CountMultilayerPlacementModifier.of(10),
              BiomePlacementModifier.of()
      );
      registerKey(context,
              RIVER_WATER,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.RIVER_DELTA),
              CountMultilayerPlacementModifier.of(20),
              BiomePlacementModifier.of()
      );

      registerKey(context,
              LARGE_REDWOOD_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.LARGE_REDWOOD_TREE_SPAWN),
              CountPlacementModifier.of(3),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              REDWOOD_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.REDWOOD_TREE_SPAWN),
              CountPlacementModifier.of(7),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              ASPEN_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.ASPEN_TREE_SPAWN),
              CountPlacementModifier.of(4),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              DENSE_CYPRESS_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.CYPRESS_TREE_SPAWN),
              CountPlacementModifier.of(20),
              RarityFilterPlacementModifier.of(80),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              CYPRESS_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.CYPRESS_TREE_SPAWN),
              CountPlacementModifier.of(20),
              RarityFilterPlacementModifier.of(110),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FEW_ASPEN_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.ASPEN_TREE_SPAWN),
              CountPlacementModifier.of(20),
              RarityFilterPlacementModifier.of(80),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
//      registerKey(context,
//              MAPLE_PLACED,
//              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.MAPLE_SPAWN),
//              CountPlacementModifier.of(7),
//              SquarePlacementModifier.of(),
//              TREE_THRESHOLD,
//              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
//              BiomePlacementModifier.of()
//      );
      registerKey(context,
              MAPLE_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.MAPLE_SPAWN),
              NoiseBasedCountPlacementModifier.of(3, 100, 0),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              FIR_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FIR_TREE_SPAWN),
              CountPlacementModifier.of(20),
              RarityFilterPlacementModifier.of(40),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              DENSE_FIR_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FIR_TREE_SPAWN),
              CountPlacementModifier.of(6),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              WILLOW_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.WILLOW_TREE_SPAWN),
              CountPlacementModifier.of(2),
              SquarePlacementModifier.of(),
              SurfaceWaterDepthFilterPlacementModifier.of(2),
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              SPRUCE_BUSH_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.SPRUCE_BUSH_SPAWN),
              CountPlacementModifier.of(4),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              REDWOOD_ROCK_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(MiscConfiguredFeatures.FOREST_ROCK),
              CountPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              WISTERIA_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.WISTERIA_SPAWN),
              CountPlacementModifier.of(15),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              SUGI_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.SUGI_SPAWN),
              CountPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              OLIVE_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.OLIVE_TREE_SPAWN),
              CountPlacementModifier.of(20),
              RarityFilterPlacementModifier.of(80),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              JOSHUA_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.JOSHUA_TREE_SPAWN),
              CountPlacementModifier.of(20),
              RarityFilterPlacementModifier.of(80),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );

      registerKey(context,
              OAK_BUSH_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.OAK_BUSH_SPAWN),
              CountPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );

      registerKey(context,
              CUSTOM_FANCY_OAK_TREE_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FANCY_OAK_TREE_SPAWN),
              CountPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              CUSTOM_FANCY_OAK_TREE2_PLACED,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.FANCY_OAK_TREE_SPAWN),
              RarityFilterPlacementModifier.of(35),
              CountPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              TREE_THRESHOLD,
              PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
              BiomePlacementModifier.of()
      );
      registerKey(context,
              CATTAILS,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.CATTAILS),
              RarityFilterPlacementModifier.of(1),
              SquarePlacementModifier.of(),
              PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
              BiomePlacementModifier.of()
      );

      registerKey(context,
              ROOTED_DESERT_TURNIP,
              configuredFeatureRegistryEntryLookup.getOrThrow(HibiscusConfiguredFeatures.ROOTED_DESERT_TURNIP),
              CountPlacementModifier.of(UniformIntProvider.create(1, 2)),
              SquarePlacementModifier.of(),
              RarityFilterPlacementModifier.of(30),
              HeightRangePlacementModifier.uniform(YOffset.fixed(30), YOffset.fixed(226)),
              EnvironmentScanPlacementModifier.of(Direction.UP, BlockPredicate.solid(), 12),
              RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1)),
              BiomePlacementModifier.of()
      );
   }

   public static RegistryKey <PlacedFeature> registerKey(String name) {
      return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(NatureSpirit.MOD_ID, name));
   }

   private static void registerKey(Registerable <PlacedFeature> context, RegistryKey <PlacedFeature> key, RegistryEntry <ConfiguredFeature <?, ?>> configuration, List <PlacementModifier> modifiers) {
      context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
   }

   private static <FC extends FeatureConfig, F extends Feature <FC>> void registerKey(Registerable <PlacedFeature> context, RegistryKey <PlacedFeature> key, RegistryEntry <ConfiguredFeature <?, ?>> configuration, PlacementModifier... modifiers) {
      registerKey(context, key, configuration, List.of(modifiers));
   }

}
