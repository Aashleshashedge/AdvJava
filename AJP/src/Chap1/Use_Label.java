package Chap1;
	import java.awt.*;
	public class Use_Label {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Frame fr=new Frame("This Program is for Displaying the Label");
	     fr.setSize(400,200);
	     fr.setLayout(new FlowLayout());
	     fr.setVisible(true);
	     Label L1=new Label("Welcome To Java");
	     fr.add(L1);
		}

	}

