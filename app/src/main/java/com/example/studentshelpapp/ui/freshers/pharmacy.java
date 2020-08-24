package com.example.studentshelpapp.ui.freshers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.studentshelpapp.R;

public class pharmacy extends Fragment{
    ListView listView;
    String[] Name={"Apollo Pharmacy, Aryabhatta Hostel", "Beside GAMCHA", "Aryabhatta Hostel"};
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pharmacy, container, false);
        listView = (ListView) view.findViewById(R.id.listview);
        pharmacy.CustomAdapter customAdapter = new pharmacy.CustomAdapter();
        listView.setAdapter(customAdapter);
        return view;
    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Name.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout2,null);
            TextView restname_s = (TextView)view.findViewById(R.id.restname_s);
            restname_s.setText(Name[i]);
            return view;
        }
    }
}