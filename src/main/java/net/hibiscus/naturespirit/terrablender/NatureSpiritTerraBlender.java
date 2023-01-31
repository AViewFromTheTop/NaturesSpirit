package net.hibiscus.naturespirit.terrablender;

import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

import static net.hibiscus.naturespirit.NatureSpirit.MOD_ID;

public class NatureSpiritTerraBlender implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        {
            Regions.register(new HibiscusRegion(new Identifier(MOD_ID, "overworld"), 1));
            Regions.register(new HibiscusRegion2(new Identifier(MOD_ID, "overworld_2"), 2));
            Regions.register(new HibiscusRegion3(new Identifier(MOD_ID, "overworld_3"), 1));


            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, NatureSpiritSurfaceRule.makeRules());
        }
    }
}
