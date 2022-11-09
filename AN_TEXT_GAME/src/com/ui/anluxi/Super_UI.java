package com.ui.anluxi;

import java.util.ArrayList;

public  class Super_UI 
{
	//ui父类
	// ╝╚╔ ╬  ╓ ╩‖
	//left_top_bar + horizontal_zero_and_two_string + right_top_bar
	//╔════════╗
	//vertically_bar + void_string + vertically
	//║        ║
	//║        ║
	//left_down_bar + horizontal_zero_and_two_string + right_down_bar
	//╚════════╝
	public String _UI_ = "";
	public int width = 0;
	public int height = 0;
	public final char left_top_bar = '╔';
	public final char right_top_bar = '╗';
	public final char left_down_bar = '╚';
	public final char right_down_bar = '╝';
	public final char horizontal_bar = '═';
	public char vertically_bar = '║';
	public String horizontal_zero_string = "";
	public String vertically_all_string = "";
	public String void_string = "";
	
	public ArrayList<String> all_string;
	
	//====*width
	public ArrayList<String> horizontal_amount_group ;
	//
	public ArrayList<String> vertically_amount_group;
	//
	public ArrayList<String> void_group;
	//
	public ArrayList<String> two_group;
	//
	public String two_string;
	
	public int uid = -1;
	public final int UID_FRAME = 0;
	
	public void setting_String()
	{
		for(int i=0;i<width;i++)
		{
			//"=","=","="
			horizontal_amount_group.add("" + horizontal_bar);
			void_group.add(" ");
			two_group.add("-");
		}
		for(String i : horizontal_amount_group)
		{
			//========
			horizontal_zero_string = horizontal_zero_string + i;
		}
		for(String i : void_group)
		{
			void_string = void_string + i;
		}
		for(String s : two_group)
		{
			two_string = two_string + s;
		}
	}
	
	public Super_UI(int width,int height,int uid)
	{
		horizontal_amount_group = new ArrayList<String>();
		vertically_amount_group = new ArrayList<String>();
		void_group = new ArrayList<String>();
		all_string = new ArrayList<String>();
		two_group = new ArrayList<String>();
		
		
	}
	
	public String _UI_(An_UI_Frame an)
	{
		for(int i = 0;i < height;i++)
		{
			if(i == 0)
			{
				all_string.add("" + left_top_bar + horizontal_zero_string + right_top_bar + "\n");
			}
			else if(uid == UID_FRAME & i == 1 & an != null )
			{
				if(an.frame_title_string == null)
				{
					for(int j =0;j < width - 1;j++)
					{
						void_string = void_string + void_group.get(j);
					}
					all_string.add("" + vertically_bar  + void_string + 'X' + vertically_bar + "\n");
				}else
				{
					for(int j =0;j < width - (int)an.frame_title_string.length();j++)
					{
						if((width - (int)an.frame_title_string.length()) >= 0)
						{
							void_string = void_string + void_group.get(j);
							all_string.add("" + vertically_bar + an.frame_title_string  + void_string + 'X' + vertically_bar + "\n");
						}else if((width - (int)an.frame_title_string.length()) < 0)
						{
							for(int e=0;e < width + ((int)an.frame_title_string.length() - width);e++)
							{
								void_group.add(" ");
							}
							for(String s : void_group)
							{
								void_string = void_string + s;
							}
							
							all_string.add("" + vertically_bar + an.frame_title_string  + void_string + 'X' + vertically_bar + "\n");
						}
						
					}
					
				}
				
			}
			else if(i == 2 & an != null)
			{
				
				all_string.add("" + vertically_bar  + two_string  + vertically_bar + "\n");
			}
			else if(i == height )
			{
				all_string.add("" + vertically_bar  + void_string  + vertically_bar + "\n");
			}else
			{
				all_string.add("" + left_down_bar  + vertically_bar  + right_down_bar + "\n");
			}
			
				
		}
		for(String s : all_string)
		{
			_UI_ = _UI_ + s;
		}
		return _UI_;
	}
	
}
