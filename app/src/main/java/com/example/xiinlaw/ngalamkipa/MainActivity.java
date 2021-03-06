package com.example.xiinlaw.ngalamkipa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextMethod(View view) {
        switch (view.getId()){
            case R.id.glintundBtn:{
                Common.setLatGreen("-7.946027");
                Common.setLngGreen("112.638604");
                Common.setPlaceName("Go Green Glintung");
            }
            break;
            case R.id.kampungDBtn:{
                Common.setLatGreen("-7.981849");
                Common.setLngGreen("112.6359163");
                Common.setPlaceName("Kampung Tridi");
            }
            break;
            case R.id.kayutangan:{
                Common.setLatGreen("-7.9814255");
                Common.setLngGreen("112.628141");
                Common.setPlaceName("kajoetangan heritage");
            }
            break;case R.id.warna:{
                Common.setLatGreen("-7.9832215");
                Common.setLngGreen("112.6354428");
                Common.setPlaceName("warna warni jodipan");
            }
            break;
        }
        startActivity(new Intent(this, MapsActivity.class));
    }
}
