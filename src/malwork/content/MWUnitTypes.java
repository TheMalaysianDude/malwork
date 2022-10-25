package malwork.content;

import arc.*;
import arc.util.*;
import arc.math.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.unit.*;
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
		EntityMapping.nameMap.put("malwork-legged1", LegsUnit::create);
	}
	
	public static UnitType 
	
	legged1;
	
	public static void load(){
		
		//Region Legged
		legged1 = new ErekirUnitType("legged1"){
			{
				drag = 0.1f;
				speed = 0.6f;
				hitSize = 20f;
				rotateSpeed = 1.6f;
				lockLegBase = true;
				legContinuousMove = true;
				legStraightness = 0.4f;
				baseLegStraightness = 0.5f;
				
				groundLayer = Layer.legUnit;
				
				legCount = 6;
				legLength = 20f;
				legMoveSpace = 1.05f;
				legGroupSize = 3;
				legExtension = -5f;
				legBaseOffset = 15f;
				
				parts.add(new PartRegion("-side"){{
					layerOffset = 0.01f;
					x = 46f;
					y = 16f;
					mirror = true;
				}});
			}
			
			@Override
			public void load(){
				super.load();
				
				legRegion = Core.atlas.find("cleroi-leg");
				legBaseRegion = Core.atlas.find("anthicus-leg-base");
				bseJointRegion = Core.atlas.find("spiroct-joint");
			}
		};
	}
}
