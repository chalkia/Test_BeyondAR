package pl.grobacz.test_beyondar;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.beyondar.android.fragment.BeyondarFragmentSupport;
import com.beyondar.android.world.World;


public class MainActivity extends FragmentActivity {

    private static Context context;
    private BeyondarFragmentSupport mBeyondarFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.context = getApplicationContext();
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.camera);
        mBeyondarFragment = (BeyondarFragmentSupport) getSupportFragmentManager().findFragmentById(R.id.beyondarFragment);

        World world = WorldHelper.generateObjects(this);

        mBeyondarFragment.setWorld(world);
        mBeyondarFragment.showFPS(true);
    }

    @Override
    protected void onResume(){
        super.onResume();

        mBeyondarFragment.startRenderingAR();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mBeyondarFragment.stopRenderingAR();
    }


}
