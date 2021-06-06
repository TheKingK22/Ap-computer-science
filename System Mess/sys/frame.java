import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class frame extends JFrame implements ActionListener, KeyListener{
	
	JButton button;
	JLabel label;
	JMenuBar menubar;
	JMenuItem List;
	JMenuItem Locations;
	JMenuItem Hiker;
	JMenuItem Instructions;
	JFrame fr = new JFrame();
	JFrame dr = new JFrame();
	JFrame hr = new JFrame();
	JFrame ir = new JFrame();
	JTextField texta = new JTextField();
	JTextField textb = new JTextField();
	JTextField textc = new JTextField();
	JTextField textd = new JTextField();
	String a;
	String b;
	String c;
	JLabel hikerss = new JLabel();
	JButton fbutton = new JButton();
	JList hlist, dlist, llist;
	
	ArrayList hikers = new ArrayList<>();
	ArrayList duration = new ArrayList<>();
	ArrayList location = new ArrayList<>();
	
	frame(){
		
		hikers.add("kionne");
		hikers.add("rem");
		duration.add("666");
		duration.add("777");
		location.add("store");
		location.add("japan");
		
		//frame size and name of frame
		this.setTitle("Hiking Club");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setSize(1020,720);
		this.setLayout(new FlowLayout());;
		
		//text
		
				
		//label.setBounds(150, 250, 100, 40);
		/*label.setText("gurren logan best anime");
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);*/
		
		
		//menu
		menubar = new JMenuBar();
		menubar.setBounds(0,0,200,400);
		JMenu choices = new JMenu("Choices");
		JMenu help = new JMenu("click for list|        !!When adding or removing, delete list page first!!");
		List = new JMenuItem("See List");
		Locations = new JMenuItem("Location Distances");
		Hiker = new JMenuItem("Hiker Distances");
		Instructions = new JMenuItem("click for list");
		
		List.addActionListener(this);
		Locations.addActionListener(this);
		Hiker.addActionListener(this);
		Instructions.addActionListener(this);
		
		//next windows
		fr.setTitle("List");
		fr.setResizable(true);
		fr.setSize(1000,950);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER));
		fr.setVisible(false);
		
		//jlist
		hlist = new JList(hikers.toArray());
		hlist.setVisibleRowCount(hikers.size());
		hlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		hlist.addListSelectionListener(
					new ListSelectionListener() {

						@Override
						public void valueChanged(ListSelectionEvent pe) {
							if (pe.getValueIsAdjusting() == false) {
					            if (hlist.getSelectedIndex() == -1) {
					                //No selection.
					                fbutton.setEnabled(false);
					            } else {
					                //Selection.
					                fbutton.setEnabled(true);  
					            }
					        }
						}
					}
				);
		hlist.setMinimumSize(new java.awt.Dimension(20,40));
		
		hlist.setVisible(true);
		
		dlist = new JList(duration.toArray());
		dlist.setVisibleRowCount(duration.size());
		dlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		dlist.addListSelectionListener(
				new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent pe) {
						if (pe.getValueIsAdjusting() == false) {
				            if (dlist.getSelectedIndex() == -1) {
				                //No selection.
				                fbutton.setEnabled(false);
				            } else {
				                //Selection.
				                fbutton.setEnabled(true);  
				            }
				        }
					}
				}
			);
	
		dlist.setMinimumSize(new java.awt.Dimension(20,40));
		dlist.setVisible(true);
		
		llist = new JList(location.toArray());
		llist.setVisibleRowCount(location.size());
		llist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		llist.addListSelectionListener(
				new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent pe) {
						if (pe.getValueIsAdjusting() == false) {
				            if (llist.getSelectedIndex() == -1) {
				                //No selection.
				                fbutton.setEnabled(false);
				            } else {
				                //Selection.
				                fbutton.setEnabled(true);  
				            }
				        }
					}
				}
			);
		llist.setMinimumSize(new java.awt.Dimension(20,40));
	
		llist.setVisible(true);
		
		
		
		
		fbutton = new JButton();
		fbutton.addActionListener(this);
		fbutton.setBounds(100,100,500,250);
		fbutton.setText("remove");
		fbutton.setVisible(true);
		
		
		
		dr.setTitle("Destination distances");
		dr.setResizable(true);
		dr.setSize(540,520);
		dr.setLayout(new FlowLayout(FlowLayout.CENTER));
		dr.setVisible(false);
		
		hr.setTitle("Hiker distances");
		hr.setResizable(true);
		hr.setSize(620,520);
		hr.setLayout(new FlowLayout(FlowLayout.CENTER));
		hr.setVisible(false);
		
		ir.setTitle("List");
		ir.setResizable(true);
		ir.setSize(620,520);
		ir.setLayout(new FlowLayout(FlowLayout.CENTER));
		ir.setVisible(false);
		
		
		//textfields
		texta.setPreferredSize(new Dimension(230,40));
		textb.setPreferredSize(new Dimension(230,40));
		textc.setPreferredSize(new Dimension(230,40));
		textd.setPreferredSize(new Dimension(230,40));
		texta.setText("Location");
		textb.setText("Duration");
		textc.setText("Hiker");
		textd.setText("remove hiker by number");
		texta.setVisible(true);
		textb.setVisible(true);
		textc.setVisible(true);
		textd.setVisible(true);
		
		
		//lists
		for(int i = 0; i < hikers.size(); i++) {   
		    
		} 
		
		
		//buttons
		button = new JButton();
		button.addActionListener(this);
		button.setBounds(100,100,500,250);
		button.setText("add");
		button.setVisible(true);
		
		
		
		
		//keep at bottom
		this.setJMenuBar(menubar);
		//menubar.add(choices);
		menubar.add(help);
		choices.add(List);
		choices.add(Locations);
		choices.add(Hiker);
		help.add(Instructions);
		
		
		this.add(texta);
		this.add(textb);
		this.add(textc);
		this.add(button);
		this.add(textd);
		
		fr.add(hlist);
		fr.add(dlist);
		fr.add(llist);
		fr.add(new JScrollPane(llist));
		fr.add(new JScrollPane(dlist));
		fr.add(new JScrollPane(hlist));
		this.add(fbutton);
		fr.pack();
		dr.add(dlist);
		dr.add(llist);
		dr.add(new JScrollPane(dlist));
		dr.add(new JScrollPane(llist));
		dr.pack();
		hr.add(hlist, dlist);
		hr.add(new JScrollPane(hlist));
		hr.add(new JScrollPane(dlist));
		hr.pack();
		this.pack();
		this.setVisible(true);
		//adds buttons and text to windows
	}
	

	@Override
	//sees if button is clicked and then directs to different window
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==fbutton) {
			
			int q = Integer.parseInt(textd.getText());
			
			if(textd.equals("")){
				
			}
			else {
				if(q < hikers.size() && q > 0 ) {
					hikers.remove(q-1);
					location.remove(q-1);
					duration.remove(q-1);
				}
				
			}
			
		}
		if(e.getSource()==Locations) {
			dr.setVisible(true);
			
			
		}
		if(e.getSource()==Hiker) {
			hr.setVisible(true);
		}
		if(e.getSource()==Instructions) {
			
			String output = "";
			for(int i = 0; i<hikers.size(); i++){
			    String everything = hikers.get(i).toString();
			    String everything2 = duration.get(i).toString();
			    String everything3 = location.get(i).toString();
			    int r = i + 1;
			    
			    
			    output +=  r + ". " + everything +" "+ everything2 + " " + everything3 + "\n";       
			}
			String hh = "Hikers  Duration  Location \n";
			JOptionPane.showMessageDialog(null, hh + output);



			
			
		}
		
		if(e.getSource()== button) {
			if(textc.getText().equals("")) {
				
			}
			else {
				if(textb.getText().equals("")) {
					
				}
				else {
					if(textc.getText().equals("")) {
						
					}
					else {
						duration.add(textb.getText().toString());
						location.add(texta.getText().toString());
						hikers.add(textc.getText().toString());
						System.out.println("kill");
						for(int i = 0; i <hikers.size();i++) {
							System.out.println(hikers.get(i));
							System.out.println(duration.get(i));
							System.out.println(location.get(i));
						}
					}
				}
			}
		}
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		switch (arg0.getKeyCode())
        {
            case KeyEvent.VK_ESCAPE:
            //F Key
                JOptionPane.showMessageDialog(null, "esc");
                break;
        }
		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


 

	
	


	

}
