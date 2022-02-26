package project.leetcode.code;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class sd {

	public static void main(String[] args) {
		
		 JTable tbl = new JTable();
		 DefaultTableModel dtm = new DefaultTableModel(0, 0);

		// add header of the table
		String header[] = new String[] { "Prority", "Task Title", "Start",
		            "Pause", "Stop", "Statulses" };

		// add header in table model     
		 dtm.setColumnIdentifiers(header);

		       tbl.setModel(dtm);

		     // add row dynamically into the table      
		for (int count = 1; count <= 30; count++) {
		        dtm.addRow(new Object[] { "data", "data", "data",
		                "data", "data", "data" });
		 }
	}
}
