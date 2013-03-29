package com.asfman.mytestandroid.service;

import com.asfman.util.Helper;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class BindService extends Service {
	public static final String TAG = "bind";

	public class MyBinder extends Binder {

		public BindService getService() {
			return BindService.this;
		}
	}

	private MyBinder myBinder = new MyBinder();

	@Override
	public void onCreate() {
		Helper.showLog(TAG, "BindService::onCreate");
		super.onCreate();
	}

	@Override
	public IBinder onBind(Intent intent) {
		Helper.showLog(TAG, "BindService::onBind");
		return myBinder;
	}

	@Override
	public boolean onUnbind(Intent intent) {
		Helper.showLog(TAG, "BindService::onUnbind");
		return super.onUnbind(intent);
	}

	@Override
	public void onRebind(Intent intent) {
		Helper.showLog(TAG, "BindService::onRebind");
		super.onRebind(intent);
	}

	@Override
	public void onDestroy() {
		Helper.showLog(TAG, "BindService::onDestroy");
		super.onDestroy();
	}

}
