/*package coreJava;

import javax.jws.soap.InitParam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class TicTacToeFrame<cell> extends JFrame{
	
	private char whoseTurn='X';
	//private cell[][] cells=new cell[3][3];
	JLabel jlblstatus=new JLabel("x's turn to play");
	
	public TicTacToeFrame() {
		JPanel panel=new JPanel(new GridLayout(3,3,0,0));
		for(int i=0;i<3;i++)
		 for(int j=0;j<3;j++)
			//	panel.add(cells[i][j]=new Cell());
			
		panel.setBorder(new LineBorder(Color.red,1));
		jlblstatus.setBorder(new LineBorder(Color.yellow,1));
		add(panel,BorderLayout.CENTER);
		add(jlblstatus,BorderLayout.SOUTH);
	}*/
	
	/*//public boolean isFull() {
		for(int i=0;i<3;i++)
			 for(int j=0;j<3;j++) {
				 //if(cells[i][j].getToken()==' ')
					 return false;
				// return true;
			 }}*/
	
/*@param token
 * @return true
 * 
 */
	/*public boolean inWon(char token) {
		for(int i=0;i<3;i++)
			if((cells[i][0]).getToken()==token)&&
			(cells[i][1].getToken()==token)&&
			(cells[i][2].getToken()==token)
			{
				return true;
			}
		
		 for(int j=0;j<3;j++)
			 if((cells[0][j]).getToken()==token)&&
				(cells[1][j].getToken()==token)&&
				(cells[2][j].getToken()==token)
				{
					return true;
				} 
		 if((cells[0][0]).getToken()==token)&&
			(cells[1][1].getToken()==token)&&
			(cells[2][2].getToken()==token)
			{
				return true;
			} 
			return false;
	}
}*/
