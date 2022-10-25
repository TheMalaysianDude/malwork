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
	
	//decompiled EntityMapping.class
	static {
		EntityMapping.nameMap.put("malwork-legged1", EntityMapping.idMap[24]);
	}
	
	public static UnitType 
	
	legged1;
	
	public static void load(){
		
		//Region Legged
		legged1 = new UnitType("legged1"){
			{
				drag = 0.1f;
				speed = 1.1f;
				hitSize = 20f;
				rotateSpeed = 1.6f;
				lockLegBase = true;
				legContinuousMove = true;
				legStraightness = 0.6f;
				baseLegStraightness = 0.5f;
				outlineColor = Pal.darkOutline;
				
				constructor = UnitEntity::create;
				
				legCount = 8;
				legLength = 30f;
				legForwardScl = 2.1f;
				legMoveSpace = 1.05f;
				rippleScale = 1.2f;
				stepShake = 0.5f;
				legGroupSize = 2;
				legExtension = -6f;
				legBaseOffset = 19f;
				legStraightLength = 0.9f;
				legMaxLength = 1.2f;
			}
			
			@Override
			public void load(){
				super.load();
				
				legRegion = Core.atlas.find("tecta-leg");
				legBaseRegion = Core.atlas.find("tecta-leg-base");
				footRegion = Core.atlas.find("tecta-foot");
			}
		};
	}
}
