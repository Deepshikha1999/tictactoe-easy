import java.awt.*;
import java.awt.event.*;

class Game extends Frame implements ActionListener{
	public static void main(String[]args)
	{
		Game gm=new Game();
		gm.setSize(250,250);
		gm.setVisible(true);
	}
	private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bu,bu1,bu2;
	public Game(){
		b1=new Button();
		b2=new Button();
		b3=new Button();
		b4=new Button();
		b5=new Button();
		b6=new Button();
		b7=new Button();
		b8=new Button();
		b9=new Button();
		bu=new Button("Reset");
		bu1=new Button("Result");
		bu2=new Button("Cancel");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(bu);
		add(bu1);
		add(bu2);
		GridLayout g=new GridLayout(4,3);
		setLayout(g);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bu.addActionListener(this);
		bu1.addActionListener(this);
		bu2.addActionListener(this);
	}
	private int t=0;
	String [][]L=new String[3][3];
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource()==b1){
			String X=b1.getLabel();
			if(X.length()==0)
			{
				if(t%2==0)
				{
					L[0][0]="X";
					b1.setLabel("X");
				}
				else
				{	
					L[0][0]="0";
					b1.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b2){
			String X1=b2.getLabel();
			if(X1.length()==0)
			{
				if(t%2==0)
				{
					L[0][1]="X";
					b2.setLabel("X");
				}
				else
				{
					L[0][1]="0";
					b2.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b3){
			String X2=b3.getLabel();
			if(X2.length()==0)
			{
				if(t%2==0)
				{
					L[0][2]="X";
					b3.setLabel("X");
				}
				else
				{
					L[0][2]="0";
					b3.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b4){
			String X3=b4.getLabel();
			if(X3.length()==0)
			{
				if(t%2==0)
				{
					L[1][0]="X";
					b4.setLabel("X");
				}
				else
				{
					L[1][0]="0";
					b4.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b5){
			String X4=b5.getLabel();
			if(X4.length()==0)
			{
				if(t%2==0)
				{
					L[1][1]="X";
					b5.setLabel("X");
				}
				else
				{
					L[1][1]="0";
					b5.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b6){
			String X5=b6.getLabel();
			if(X5.length()==0)
			{
				if(t%2==0)
				{
					L[1][2]="X";
					b6.setLabel("X");
				}
				else
				{
					L[1][2]="0";
					b6.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b7){
			String X6=b7.getLabel();
			if(X6.length()==0)
			{
				if(t%2==0)
				{
					L[2][0]="X";
					b7.setLabel("X");
				}
				else
				{
					L[2][0]="0";
					b7.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b8){
			String X7=b8.getLabel();
			if(X7.length()==0)
			{
				if(t%2==0)
				{
					L[2][1]="X";
					b8.setLabel("X");
				}
				else
				{
					L[2][1]="0";
					b8.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==b9){
			String X8=b9.getLabel();
			if(X8.length()==0)
			{
				if(t%2==0)
				{
					L[2][2]="X";
					b9.setLabel("X");
				}
				else
				{
					L[2][2]="0";
					b9.setLabel("0");
				}
				t++;
			}
		}

		if(e.getSource()==bu)
				{
					b1.setLabel("");
					b2.setLabel("");
					b3.setLabel("");
					b4.setLabel("");
					b5.setLabel("");
					b6.setLabel("");
					b7.setLabel("");
					b8.setLabel("");
					b9.setLabel("");
				}

				if(e.getSource()==bu1){
				int k=0,c=0;
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{	if(i==j)
						{
						if(L[i][j]=="X")
						{
							k++;
						}
						if(L[i][j]=="0")
						{
							c++;
						}
						}
						
					}
				}
				if(k==3||c==3)
				{if(k==3)
				System.out.println("X is the winner");
					
				if(c==3)
				System.out.println("0 is the winner");}
				else
				{k=0; 
				c=0;

				for(int i=0;i<3;i++)
				{

					for(int j=0;j<3;j++)
					{	if(i+j==2)
						{
						if(L[i][j]=="X")
						{
							k++;
						}
						if(L[i][j]=="0")
						{
							c++;
						}
						}
						
					}
				}
				if(k==3||c==3)
				{if(k==3)
				System.out.println("X is the winner");
					
				if(c==3)
				System.out.println("0 is the winner");}
				else
				{k=0; 
				c=0;

				int i=0;
				
				while(i<3){
				k=0;
				c=0;
				for(int j=0;j<3;j++)
				{
						
						if(L[i][j]=="X")
						{
							k++;
						}
						if(L[i][j]=="0")
						{
							c++;
						}
						
						
					
				}
				if(k==3||c==3)
				{if(k==3)
				System.out.println("X is the winner");
					
				if(c==3)
				System.out.println("0 is the winner");
				
				break;}
				
				++i;}

				if(k!=3 &&c!=3)
				{
				System.out.println("match draw");
				}
				}
				}
				}

				if(e.getSource()==bu2)
				{
					System.exit(0);
				}
	}
}