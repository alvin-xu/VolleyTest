package com.example.volleytest;

import java.util.List;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.android.volley.toolbox.Volley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Adapter extends BaseAdapter{
	
	private Context context;
	private RequestQueue queue;
	private List<Info> infos;
	private ImageLoader imageLoader;
	
	public Adapter(Context context, List<Info> infos) {
		super();
		this.context = context;
		this.infos = infos;
		queue=Volley.newRequestQueue(context);
		imageLoader=new ImageLoader(queue, new BitmapCache());
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		
		return infos.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView=LayoutInflater.from(context).inflate(R.layout.item, null);
		ImageView imageView=(ImageView) convertView.findViewById(R.id.item);
		ImageListener imageListener=ImageLoader.getImageListener(imageView, R.drawable.ic_launcher, R.drawable.ic_launcher);
		imageLoader.get((String) getItem(position), imageListener);
		return convertView;
	}

}
