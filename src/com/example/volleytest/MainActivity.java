package com.example.volleytest;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView listView;
	private List<Info> infos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		listView=(ListView) findViewById(R.id.listView);
		
		initData();
		Adapter adapter=new Adapter(this, infos);
		
		listView.setAdapter(adapter);
	}
	private void initData() {  
	    infos = new ArrayList<Info>();  
		Info info1 = new Info("http://imgstatic.baidu.com/img/image/shouye/fanbingbing.jpg");  
		Info info2 = new Info("http://imgstatic.baidu.com/img/image/shouye/liuyifei.jpg");  
		Info info3 = new Info("http://imgstatic.baidu.com/img/image/shouye/wanglihong.jpg");  
		Info info4 = new Info("http://imgstatic.baidu.com/img/image/shouye/gaoyuanyuan.jpg");  
		Info info5 = new Info("http://imgstatic.baidu.com/img/image/shouye/yaodi.jpg");  
		Info info6 = new Info("http://imgstatic.baidu.com/img/image/shouye/zhonghanliang.jpg");  
		Info info7 = new Info("http://imgstatic.baidu.com/img/image/shouye/xiezhen.jpg");  
		infos.add(info1);  
		infos.add(info2);  
		infos.add(info3);  
		infos.add(info4);  
		infos.add(info5);  
		infos.add(info6);  
		infos.add(info7);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
