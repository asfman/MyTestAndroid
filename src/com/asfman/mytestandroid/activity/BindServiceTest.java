package com.asfman.mytestandroid.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.TextView;

import com.asfman.mytestandroid.service.BindService;
import com.asfman.util.Helper;

/**
 * bindService测试activity
 *
 */
public class BindServiceTest extends Activity {

	private TextView logTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		logTextView = new TextView(this);
		Intent serviceIntent = new Intent(this, BindService.class);
		bindService(serviceIntent, new ServiceConnection() {
			
			@Override
			public void onServiceDisconnected(ComponentName name) {
				logTextView.setText("onServiceDisconnected");
				
			}
			
			@Override
			public void onServiceConnected(ComponentName name, IBinder service) {
				logTextView.setText("onServiceConnected");
				
			}
		}, BIND_AUTO_CREATE);
	}

	@Override
	protected void onDestroy() {
		Helper.showLog("BindServiceTest::onDestroy");
		super.onDestroy();
	}

}
