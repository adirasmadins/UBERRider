package usmanali.uberrider.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import usmanali.uberrider.R;

/**
 * Created by SAJIDCOMPUTERS on 11/6/2017.
 */

public class Custom_info_Window implements GoogleMap.InfoWindowAdapter {
    View v;
    public Custom_info_Window (Context context){
        v= LayoutInflater.from(context).inflate(R.layout.ccustom_rider_info_window,null);
    }
    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtpickuptitle=(TextView) v.findViewById(R.id.txtpickupinfo);
        txtpickuptitle.setText(marker.getTitle());
        TextView txtpickupsnippet=(TextView) v.findViewById(R.id.txtpickupsnippet);
        txtpickupsnippet.setText(marker.getSnippet());
        return v;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
