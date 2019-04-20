package adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import com.hh.listveiweaxm.R;

import java.util.List;

import data.Store;

public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;



    public StoreAdapter(Context context, List<Store> list) {
        super(context, R.layout.store_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }


}
