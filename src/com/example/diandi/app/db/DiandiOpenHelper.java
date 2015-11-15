package com.example.diandi.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DiandiOpenHelper extends SQLiteOpenHelper{

	/*
	 * ���ݿ⽨�����
	 */
	public static final String CREATE_ACCOUNTINFO = "create table AccountInfo ("
			+ "id integer primary key autoincrement, " + "address text, "
			+ "password text, " + "username text)";
	
	public DiandiOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}


	/*
	 * ����
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_ACCOUNTINFO);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
}