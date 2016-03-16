package pl.grobacz.test_beyondar;

/**
 * Created by grobacz on 2016-03-16.
 */

import android.annotation.SuppressLint;
import android.content.Context;

import com.beyondar.android.world.GeoObject;
import com.beyondar.android.world.World;

@SuppressLint("SdCardPath")
public class WorldHelper {
    public static final int LIST_TYPE_EXAMPLE_1 = 1;

    public static World sharedWorld;

    public static World generateObjects(Context context) {
        if (sharedWorld != null) {
            return sharedWorld;
        }
        sharedWorld = new World(context);

        sharedWorld.setGeoPosition(41.90533734214473d, 2.565848038959814d);

        // Create an object with an image in the app resources.
        GeoObject go1 = new GeoObject(1l);
        go1.setGeoPosition(41.90523339794433d, 2.565036406654116d);
        go1.setImageResource(R.drawable.rabbit);
        go1.setName("Creature 1");

        // Add the GeoObjects to the world
        sharedWorld.addBeyondarObject(go1);

        return sharedWorld;
    }

}
