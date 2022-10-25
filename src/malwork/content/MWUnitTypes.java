package malwork.content;

import arc.*;
import arc.util.*;
import arc.math.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.content.*;
import mindustry.graphics.*;
import mindustry.ai.types.*;
import mindustry.world.meta.*;
import mindustry.type.weapons.*;
import mindustry.entities.part.*;
import mindustry.entities.bullet.*;
import mindustry.entities.pattern.*;
import mindustry.entities.abilities.*;

public class MWUnitTypes {
	
	public static UnitType 
	
	legged1;
	
	public static void load(){
		
		//Region Legged
		legged1 = new UnitType("legged1"){{
			speed = 1.1f;
			
			constructor = UnitEntity::create;
			
			lockLegBase = true;
			legContinuousMove = true;
			legGroupSize = 3;
			legStraightness = 0.4f;
			baseLegStraightness = 0.5f;
			legMaxLength = 1.3f;
			
			legCount = 6;
			legLength = 30f;
			legForwardScl = 0.45f;
			legMoveSpace = 1.4f;
			legExtension = -5f;
			legBaseOffset = 5f;
			
			legRegion = Core.atlas.find("tecta-leg");
			legBaseRegion = Core.atlas.find("tecta-leg-base");
			footRegion = Core.atlas.find("tecta-foot");
			
		}};
	}
}
