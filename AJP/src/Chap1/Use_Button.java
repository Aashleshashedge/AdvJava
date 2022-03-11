package Chap1;
	import java.awt.*;
	public class Use_Button {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Frame fr=new Frame("This Program is for Displaying the Button");
			fr.setSize(400,200);
			fr.setLayout(new FlowLayout());
			fr.setVisible(true);
			Button B1=new Button("OK");
			Button B2=new Button("RESET");
			Button B3=new Button("CANCEL");
			fr.add(B1);
			fr.add(B2);
			fr.add(B3);
			
	}

	}

