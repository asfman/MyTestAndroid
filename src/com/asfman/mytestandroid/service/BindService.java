package com.asfman.mytestandroid.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BindService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

}
