package com.textgame.anluxi.UI;

public class AnFrame extends UI
{
	//标题
	public String titleString = null;
	
	public String showframeString;
	public char[] chargroup;
	
	public String ui(float x,float y,int width,int height)
	{
		//╔ ╗╝╚║═
		//╔═════╗
		//║     ║
		//║     ║
		//╚═════╝
		//如果是正方形则width = height +1
		//无法制作单位为一的正方形
		//
		//
		//showframeString = "" + lefttop + hbar+righttop+"\n"+vbar+" "+vbar+"\n"+leftdown+hbar+rightdown;
		if(titleString != null)
		{
			showframeString = ""+vbars+hbars+vbars+"\n"+vbars+ titleString+vbars+"\n"+vbars+hbars+vbars;
		}
		else 
		{
			showframeString = ""+vbars+hbars+vbars+"\n"+vbars+ " "+vbars+"\n"+vbars+hbars+vbars;
		}
		return showframeString;
	}
	
	public boolean show()
	{
		String uiString = ui(x, y, width, height);
		System.out.println(uiString);
		return true;
	}
	
	public AnFrame(float x,float y,int width,int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		show();
	}
	
	public AnFrame(String titleString,float x,float y,int width,int height) 
	{
		this.titleString = titleString;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		for(int i=0;i<titleString.length();i++) 
		{
			chargroup[i] = '-';
		}
		show();
	}
	
	public void setTitleString(String titleString) 
	{
		this.titleString = titleString;
	}
}
