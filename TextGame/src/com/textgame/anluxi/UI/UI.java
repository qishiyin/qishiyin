package com.textgame.anluxi.UI;

import java.util.ArrayList;

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
	public String showUIstring = "";
	//长宽组
	public ArrayList<String> hchargroup,vchargroup,vstringgroup,threestringgroup;
	//输出的片段
	public String copystring,zerostring,onestring,twostring,endstring,voidstring;
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
	
	public String ui(float x,float y,int width,int height)
	{
		//╔ ╗╝╚║═
		//╔════════════════════╗
		//║                    ║
		//║                    ║
		//║                    ║
		//║                    ║
		//║                    ║
		//║                    ║
		//║                    ║
		//║                    ║
		//╚════════════════════╝
		//如果是正方形则width = height +1
		//无法制作单位为一的正方形
		//
		//
		hchargroup = new ArrayList<String>();
		vchargroup = new ArrayList<String>();
		vstringgroup = new ArrayList<String>();
		threestringgroup = new ArrayList<String>();
		copystring = "";
		zerostring = "";
		onestring = "";
		twostring = "";
		endstring = "";
		voidstring = "";
		
		for(int  widths= 0;widths<width;widths++)
		{
			hchargroup.add(""+hbar);
		}
		
		for(int heights = 0;heights<height + 3;heights++)
		{
			vchargroup.add( "\n" + vbar);
		}
		
		for(int widths=0;widths<width;widths++)
		{
			vstringgroup.add(" ");
			threestringgroup.add("-");
			
		}
		for(String widthsstring : hchargroup)
		{
			zerostring = zerostring + widthsstring;
			endstring = endstring + widthsstring;
		}
		
		for(String heightsstring : vstringgroup)
		{
			voidstring = voidstring + heightsstring;
		}
		
		
		for(String threesstring : threestringgroup) 
		{
			twostring = twostring + threesstring;
		}
		
		for(int heights = 0;heights <= height;heights++)
		{
			if(heights == 0)
			{
				copystring =   copystring + lefttop + zerostring + righttop + "\n";
			}
			
			
			if(heights == height  )
			{
				copystring =   copystring + leftdown + endstring + rightdown;
			}
			if(heights != 0)
			{
				if(heights != height)
				{
					copystring =  copystring + vbar + voidstring + vbar + "\n";
				}
				
			}
		}
		
		showUIstring = copystring;
		return showUIstring;
	}
}
