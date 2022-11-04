package com.textgame.anluxi.UI;

public abstract class UI 
{
	//显示ui
		//─━│┃┄┅┆┇┈┉┊┋┌┍┎┏┐┑┒┓└┕┖┗┘┙┚┛

		//├┝┞┟┠┡┢┣┤┥┦┧┨┩┪┫┬┭┮┯┰┱┲┳┴┵┶┷┸┹┺┻

		//┼┽┾┿╀╁╂╃╄╅╆╇╈╉╊╋

		//═║╒╓╔╕╖╗╘╙╚╛╜╝╞╟╠╡╢╣╤╥╦╧╨╩╪╫╬╳

		//╔ ╗╝╚ ╬ ═ ╓ ╩ ┠ ┨┯ ┷┏ ┓┗ ┛┳⊥﹃﹄┌╭╮╯╰
		//╔═════╗
		//║show ║
		//║     ║
		//╚═════╝
		//
		//
	//左上
	public char lefttop = '╔';
	//右上
	public char righttop = '╗';
	//横杠
	public char hbar = '═';
	//竖杠
	public char vbar = '║';
	//左下
	public char leftdown = '╚';
	//右下
	public char rightdown = '╝';
	public char vbars = '+';
	public char hbars = '-';
	//ui名字
	public String Uiname;
	
	//宽度，高度
	public int width,height;
	//坐标
	public float x,y;
	//可见性
	public boolean Visible;
	
	public int getHeight() 
	{
		return height;
	}
	public int getWidth() 
	{
		return width;
	}
	public float getX() 
	{
		return x;
	}
	public float getY() 
	{
		return y;
	}
	
	public String getUiname( ) 
	{
		return Uiname;
	}
}
