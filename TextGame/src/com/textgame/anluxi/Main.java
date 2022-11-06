package com.textgame.anluxi;

import com.textgame.anluxi.UI.AnFrame;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//new AnFrame("jadhfvbacjvbuhnviohncv",0, 0, 0, 0);
		Runtime r = Runtime.getRuntime();
		Long ls = ((r.freeMemory()) / 1024) / 1024;
		System.out.println("刚刚的内纯" + ls + "MB");
		AnFrame a = new AnFrame("fsdfsd",0, 0,  50,10);
		long le = ((r.freeMemory()) / 1024) / 1024;
		System.out.println("现在的内纯" + le + "MB\n用了" + (ls - le) + "MB的内存\n" );
		if(a.titleString != null)
		{
			System.out.println("窗口的终值为" + a.titleString.length());
		}
	}

}
