package malwork.content;

import arc.*;
import arc.util.*;
import arc.math.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.type.unit.*;
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
				
				parts.add(new RegionPart("-side"){{
					moveRot = 14f;
					moveY = 1f;
					moveX = -1f;
					progress = PartProgress.warmup;
					mirror = true;
					moves.add(new PartMove(PartProgress.reload, 1f, -2f, -5f));
				}});
				
				weapons.add(new Weapon(){{
					mirror = false;
					reload = 100f;
					minWarmup = 0.95f;
					x = 0f;
					y = 0f;
					bullet = new BasicBulletType(){{
						
					}};
				}});
			}
			
			@Override
			public void load(){
				super.load();
				
				legRegion = Core.atlas.find("cleroi-leg");
				legBaseRegion = Core.atlas.find("anthicus-leg-base");
				baseJointRegion = Core.atlas.find("spiroct-joint");
			}
		};
	}
}
