package com.textgame.anluxi.UI;

import java.util.ArrayList;

public class AnFrame extends UI
{
	//标题
	public String titleString = null;
	//显示窗口
	public String showframeString;
	
	
	public String ui(float x,float y,int width,int height)
	{
		//╔ ╗╝╚║═
		//╔════════════════════╗
		//║标题              - x ║
		//║------------------ -║
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
		
		for(int  h= 0;h<width;h++)
		{
			hchargroup.add(""+hbar);
			
		}
		
		for(int v = 0;v<height + 3;v++)
		{
			vchargroup.add( "\n" + vbar);
		}
		
		for(int i=0;i<width;i++)
		{
			vstringgroup.add(" ");
			threestringgroup.add("-");
			
		}
		if(titleString == null)
		{
			for(String s : hchargroup)
			{
				zerostring = zerostring + s;
				endstring = endstring + s;
			}
		}else
		{
			
		}
		
		if(titleString == null)
		{
			for(String s : vstringgroup)
			{
				voidstring = voidstring + s;
			}
		}else
		{
			int i = titleString.length();
			for(int j = 0;j<vstringgroup.size() - (i + 4);j++)
			{
				onestring = onestring + vstringgroup.get(j);
			}
			for(String s : vstringgroup)
			{
				voidstring = voidstring + s;
			}
			for(int j = 0;j < hchargroup.size();j++)
			{
				zerostring = zerostring + hchargroup.get(j);
				endstring = endstring + hchargroup.get(j);
			}
		}
		
		
		for(String s : threestringgroup)
		{
			twostring = twostring + s;
		}
		
		if(titleString == null)
		{
			
			
			for(int v = 0;v <= height;v++)
			{
				
				if(v == 0)
				{
					copystring =   copystring + lefttop + zerostring + righttop + "\n";
				}
				
				if(v == 2)
				{
					copystring =   copystring + vbar + twostring + vbar + "\n";
				}
				if(v == height  )
				{
					copystring =   copystring + leftdown + endstring + rightdown;
				}
				if(v >= 2)
				{
					if(v != height)
					{
						copystring =  copystring + vbar + voidstring + vbar + "\n";
					}
					
				}
				
				
			}
			
		}
		else
		{
			if(titleString.length() < width)
			{
				for(int v = 0;v <= height;v++)
				{
					
					if(v == 0)
					{
						copystring =    copystring + v +" " + lefttop + zerostring + righttop + "\n";
					}
					if(v == 1)
					{
						copystring =  copystring + v+" " + vbar + titleString + onestring + "[0]X" + vbar + "\n";
					}
					if(v == 2)
					{
						copystring =   copystring + v+" " + vbar + twostring + vbar + "\n";
					}
					if(v == height  )
					{
						copystring =   copystring + v +""+ leftdown + endstring + rightdown;
					}
					if(v != 0)
					{
						if(v != height)
						{
							copystring =  copystring + v+" " + vbar + voidstring + vbar + "\n";
						}
						
					}
					
					
				}
			}else if(titleString.length() < width)
			{
				for(int v = 0;v <= height;v++)
				{
					
					if(v == 0)
					{
						copystring =    copystring + v+" " + lefttop + zerostring + righttop + "\n";
					}
					if(v == 1)
					{
						copystring =  copystring + v+" " + vbar + titleString + onestring + "[0]X" + vbar + "\n";
					}
					if(v == 2)
					{
						copystring =   copystring + v+" " + vbar + twostring + vbar + "\n";
					}
					if(v == height  )
					{
						copystring =   copystring + v+"" + leftdown + endstring + rightdown;
					}
					if(v != 0)
					{
						if(v != height)
						{
							copystring =  copystring + v + vbar + voidstring + vbar + "\n";
						}
						
					}
					
					
				}
			}
			
		}
		showframeString = copystring;
		
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
		
		show();
	}
	
	public void setTitleString(String titleString) 
	{
		this.titleString = titleString;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
