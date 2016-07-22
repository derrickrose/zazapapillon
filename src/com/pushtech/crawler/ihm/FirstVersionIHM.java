package com.pushtech.crawler.ihm;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.log4j.Logger;

public class FirstVersionIHM extends JFrame {

	private static Logger logger = Logger.getLogger(FirstVersionIHM.class);
	
	public FirstVersionIHM(String strTitle) {
		this.setTitle(strTitle);
		this.setSize(700, 220);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel title = new JLabel(" ");
		this.getContentPane().setLayout(new BorderLayout());
		this.add(title, BorderLayout.NORTH);
		this.add(new JLabel("               "), BorderLayout.WEST);
		this.add(new JLabel("               "), BorderLayout.EAST);
		this.getContentPane().add(new DefaultPanel(), BorderLayout.CENTER);
		this.setVisible(true);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				FirstVersionIHM fvihm = new FirstVersionIHM("Alco Distribution");
				fvihm.setOpacity((float) 0.0);
			}
		});

		// new FirstVersionIHM("Alco Distribution");
	}

}