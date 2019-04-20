package adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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


    //1줄씩 그려주는역할
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View row= convertView;

        if( row == null){   // row가 비어있으면

            row = inf.inflate(R.layout.store_item, null)     // xml을 읽어서 실제 화면에 그려달라

        }

        // 실제 Store 데이터를 이용해서 row를 적재적소에 뿌려주기.

        Store data = mList.get(position);
        // XML에 그려진 컴포넌트들을 찾아서 JAVA로 연결.

        TextView storeNameTxt = row.findViewById(R.id.storeNameText);

        // data가 가진 값을 컴포넌트에 set.
        storeNameTxt.setText(data.name);




        return row;




    }
}
