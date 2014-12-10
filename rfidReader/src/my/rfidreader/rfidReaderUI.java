/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.rfidreader;
import com.thingmagic.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.EnumSet;
import java.util.Vector;
import jssc.*;

/**
 *
 * @author Owner
 */
public class rfidReaderUI extends javax.swing.JFrame {

    Reader r = null;
    ReadListener rl = new PrintListener();
    
    /**
     * Creates new form rfidReaderUI
     */
    public rfidReaderUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RFID Reader");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("# of Reads");

        jSplitPane3.setDividerLocation(300);
        jSplitPane3.setMinimumSize(new java.awt.Dimension(53, 50));
        jSplitPane3.setName(""); // NOI18N
        jSplitPane3.setPreferredSize(new java.awt.Dimension(50, 179));

        jList1.setMaximumSize(new java.awt.Dimension(100, 80));
        jList1.setMinimumSize(new java.awt.Dimension(50, 80));
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jSplitPane3.setLeftComponent(jScrollPane1);

        jList2.setMinimumSize(new java.awt.Dimension(50, 80));
        jScrollPane2.setViewportView(jList2);

        jSplitPane3.setRightComponent(jScrollPane2);

        jLabel2.setText("EPC ID");

        jButton4.setText("Scan ports");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton5.setText("Connect");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Set Baud Rate");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jLabel4.setText("Reserved Memory Bank");

        jLabel5.setText("EPC Memory Bank");

        jLabel6.setText("TID Memory Bank");

        jLabel7.setText("User Memory Bank");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9600", "19200", "38400", "115200", "230400", "460800", "921600" }));

        jButton6.setText("Tag Inspector");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("New EPC"));

        jTextField1.setText("jTextField1");

        jButton7.setText("Write");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButton2.setText("Start Read");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSplitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addGap(124, 124, 124))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(jTextField4)
                                .addComponent(jTextField5))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSplitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:        
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(portScan()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String btnTxt = jButton5.getText();
        if (btnTxt.equals("Connect")) {
            String getPort = (String)jComboBox1.getSelectedItem();
            try
            {
                System.out.println("test1");
                createReader(getPort, 115200);
                
                System.out.println("test2");
                jButton5.setText("Disconnect");
                System.out.println("test3");
            }
            catch (ReaderException ex)
            {
                System.out.print("Reader disconnnected!");
            }
        } else {
            jButton5.setText("Connect");   
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String btnTxt = jButton2.getText();
        if (btnTxt.equals("Start Read")) {
            jButton2.setText("Stop Read");
            startAsyncRead();
            jList1.setListData(readTags());
        } else {
            jButton2.setText("Start Read");
            stopAsyncRead();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ReaderException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rfidReaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rfidReaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rfidReaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rfidReaderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rfidReaderUI().setVisible(true);
            } 
        });
    }
    
    public String[] portScan()
    {
        String[] ports;
        ports = SerialPortList.getPortNames();
        return ports;
    }
    
    // Sets baud rate to parameter
    public void setBaudRate(int baudRate)
    {
        if(baudRate > 1)
        {
            try
            {
                r.paramSet("/reader/baudrate", baudRate);
            }
            catch (ReaderException ex)
            {
                r.destroy();
            }
        }
    }
    
    // Sets regions to UNSPEC
    public void unspecRegion() throws Exception
    {
        if (Reader.Region.UNSPEC == (Reader.Region)r.paramGet("/reader/region/id"))
        {
            Reader.Region[] supportedRegions = (Reader.Region[])r.paramGet(TMConstants.TMR_PARAM_REGION_SUPPORTEDREGIONS);
            
            if (supportedRegions.length < 1)
            {
                r.destroy();
                throw new Exception("Reader doesn't support any regions");
            }
            else
            {
                r.paramSet("/reader/region/id", supportedRegions[0]);
            }
        }
    }
    
    public void createReader(String port, int baudRate) throws ReaderException
    {
        try
        {
            r = Reader.create("tmr:///" + port);
            setBaudRate(baudRate);
            r.connect();
            unspecRegion();
        }
        catch (ReaderException ex)
        {
            r.destroy();
        }
        catch (Exception ex)
        {
            System.out.print("Reader doesn't support any regions");
        }
    }
    
    public TagReadData[] readTags()
    {
        TagReadData[] tags = null;
        try
        {
            tags = r.read(1000);
        }
        catch (ReaderException ex)
        {
            r.destroy();
        }
        
        return tags;
    }
    
    public void startAsyncRead()
    {
        r.addReadListener(rl);
        r.startReading();
    }
    
    public void stopAsyncRead()
    {
        r.stopReading();
        r.removeReadListener(rl);
    }
    
    public void writeEPC(TagData tag, String newEPC) throws ReaderException
    {
        TagData replaceEPC = new TagData(newEPC);
        TagFilter target = tag;
        
        if(newEPC.length() == 24)
        {
            r.writeTag(target, replaceEPC);
        }
    }
    
    private String[] readEPCMem(TagData target)
    {
        String[] message = new String[3];
        try{
            //reading the CRC
            short []crc = r.readTagMemWords(target, 01, 0, 1);
            message[0] = "";
            for (int i = 0; i < crc.length; i++)
            {
                message[0] += String.format("%04x", crc[i]);
            }
            
            //reading the PC
            short []pc = r.readTagMemWords(target, 01, 1, 1);
            message[1] = "";
            for (int i = 0; i < pc.length; i++)
            {
                message[1] += String.format("%04x", pc[i]);
            }
            
            //reading the epc
            short []epc = r.readTagMemWords(target, 01, 2, 6);
            message[2] = "";
            for (int i = 0; i < epc.length; i++)
            {
                message[2] += String.format("%04x", epc[i]);
            }
        }
        catch(Exception ex)
        {
            for(int x = 0; x < 3; x++)
            {
                message[x] = "Read Error";
            }
        }
        return message;
    }
    
    private String readAccessMem(TagData target)
    {
        String message = "";
        try{
            short []accessPassword = r.readTagMemWords(target, 0, 2, 2);
            for (int i = 0; i < accessPassword.length; i++)
            {
                message += String.format("%04x", accessPassword[i]);
            }
        }
        catch(Exception e)
        {
            message = "Read Error";
        }
        return message;
    }
    
    private String readKillMem(TagData target)
    {
        String message = "";
        try{
            short []killPassword = r.readTagMemWords(target, 0, 0, 2);
            for (int i = 0; i < killPassword.length; i++)
            {
                message += String.format("%04x", killPassword[i]);
            }
        }
        catch(Exception e)
        {
            message = "Error reading User Memory";
        }
        return message;
    }
    
    private String[] readTIDMem(TagData target)
    {
        String []message = new String[4];
        try{
            short []other = r.readTagMemWords(target, 2, 0, 2);
            message[0] = "";
            message[1] ="";
            message[2] ="";
            message[3] = "";
            System.out.println("Other Length: " + other.length);
            for (int i = 0; i < other.length; i++)
            {
                String tidString = String.format("%04x", other[i]);
                if(i<1){
                    message[0] = tidString.substring(0, 2);
                    message[1] = tidString.substring(2);
                }
                else{
                    message[1] += tidString.substring(0, 1);
                    message[2] = tidString.substring(1);
                }
            }
        }
        catch(Exception e)
        {
            for(int x = 0; x < 4; x++)
            {
                message[x] = "Read Error";
            }
        }
        return message;
    }
    
    private String readUserMem(TagData target)
    {
        String message = "";
        try{
            short []user = r.readTagMemWords(target, 3, 0, 1);
            for (int i = 0; i < user.length; i++)
            {
                message += String.format("%04x", user[i]);
            }
        }
        catch(Exception e)
        {
            message = "Read Error";
        }
        return message;
    }
    
    public String[] inspectTag(TagData target)
    {
        String []inspection = new String[10];
        String []epcMemBank = readEPCMem(target);
        inspection[0] = epcMemBank[0]; //CRC
        inspection[1] = epcMemBank[1]; //PC
        inspection[2] = epcMemBank[2]; //EPC
        inspection[3] = readAccessMem(target);
        inspection[4] = readKillMem(target);
        String []tidMemBank = readTIDMem(target);
        inspection[5] = tidMemBank[0]; //ClsID
        inspection[6] = tidMemBank[1]; //Vendor ID
        inspection[7] = tidMemBank[2]; //Model ID
        inspection[8] = tidMemBank[3]; //Unique ID
        inspection[9] = readUserMem(target);
        return inspection;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

class PrintListener implements ReadListener
{
    Vector<TagReadData> tags = new Vector<TagReadData>();
    Vector<Integer> count = new Vector<Integer>();
    
    public void tagRead(Reader r, TagReadData tr)
    {
        listTags(tr);
    }
    
    private void listTags(TagReadData tr)
    {
        if(tags.size() == 0){
            tags.add(tr);
            count.add(1);
        }
        boolean duplicate = false;
        for(int x = 0; x < tags.size(); x++)
        {
            String epc = tr.epcString();
            //checking for same epc
            if(epc.compareTo(tags.get(x).epcString()) == 0){
                duplicate = true;
                count.set(x, count.get(x)+1);
            }
        }
        if(!duplicate)
        {
            tags.add(tr);
            count.add(1);
        }
    }
}