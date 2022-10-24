package malwork.content;

import arc.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.struct.ObjectMap.*;
import mindustry.content.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;

public class MWUnitTypes {
	
	private static final Entry<Class<? extends Entityc>, Prov<? extends Entityc>>[] types = new Entry[]{
		
	};
	
	private static final ObjectIntMap<Class<? extends Entityc>> idMap = new ObjectIntMap<>();

    /**
     * Internal function to flatmap {@code Class -> Prov} into an {@link Entry}.
     * @author GlennFolker
     */
    private static <T extends Entityc> Entry<Class<T>, Prov<T>> prov(Class<T> type, Prov<T> prov){
        Entry<Class<T>, Prov<T>> entry = new Entry<>();
        entry.key = type;
        entry.value = prov;
        return entry;
    }

    /**
     * Setups all entity IDs and maps them into {@link EntityMapping}.
     * @author GlennFolker
     */

    private static void setupID(){
        for(
            int i = 0,
            j = 0,
            len = EntityMapping.idMap.length;

            i < len;

            i++
        ){
            if(EntityMapping.idMap[i] == null){
                idMap.put(types[j].key, i);
                EntityMapping.idMap[i] = types[j].value;

                if(++j >= types.length) break;
            }
        }
    }

    /**
     * Retrieves the class ID for a certain entity type.
     * @author GlennFolker
     */
    public static <T extends Entityc> int classID(Class<T> type){
        return idMap.get(type, -1);
    }
	
	public static UnitType 
	
	legged1;
	
	public static void load(){
		setupID();
		
		//Region Legged
		legged1 = new UnitType("legged1"){{
			speed = 1.1f;
			
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
			
			legRegion = Atlas.find("tecta-leg");
			legBaseRegion = Atlas.find("tecta-leg-base");
			footRegion = Atlas.find("tecta-foot");
			
		}};
	}
}
