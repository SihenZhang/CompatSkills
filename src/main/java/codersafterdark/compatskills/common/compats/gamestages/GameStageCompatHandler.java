package codersafterdark.compatskills.common.compats.gamestages;

import codersafterdark.compatskills.common.compats.gamestages.gamestagelocks.GameStageLockHandler;
import codersafterdark.compatskills.common.compats.gamestages.gamestagerequirement.GameStageRequirement;
import codersafterdark.compatskills.common.invertedrequirements.InvertedGameStage;
import codersafterdark.reskillable.api.ReskillableAPI;
import net.minecraftforge.common.MinecraftForge;

public class GameStageCompatHandler {
    private static GameStageLockHandler lockHandler;

    public static void setup() {
        lockHandler = new GameStageLockHandler();
        MinecraftForge.EVENT_BUS.register(lockHandler);
        ReskillableAPI.getInstance().getRequirementRegistry().addRequirementHandler("stage", GameStageRequirement::new);
        ReskillableAPI.getInstance().getRequirementRegistry().addRequirementHandler("!stage", InvertedGameStage::new);
    }
}
