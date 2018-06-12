package com.example.admin.grideview.fragmenyt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.admin.grideview.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/6/12.
 */

public class ReportFormFragment extends Fragment {
    private GridView mGridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getContext(), R.layout.fragment_report_form, null);

        //准备要添加的数据条目
        List<Map<String, Object>> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("imageItem", R.mipmap.ic_launcher);//添加图像资源的ID
            item.put("textItem", "icon" + i);//按序号添加ItemText
            items.add(item);
        }

        //实例化一个适配器
        SimpleAdapter adapter = new SimpleAdapter(getActivity(), items, R.layout.grid_item, new String[]{"imageItem", "textItem"}, new int[]{R.id.image_item, R.id.text_item});

        //获得GridView实例
        mGridView = view.findViewById(R.id.mygridview);
        //为GridView设置适配器
        mGridView.setAdapter(adapter);

        return view;
    }
}
