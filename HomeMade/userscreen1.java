import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class userscreen1 extends javax.swing.JFrame implements WindowListener {

    
    public userscreen1() {
        initComponents();
        this.addWindowListener(this);
    }
 public void windowOpened(WindowEvent we)
    {
        System.out.println("Opened...");
    }
    public void windowClosed(WindowEvent we)
    {
        System.out.println("Closed...");
    }
    public void windowClosing(WindowEvent we)
    {
        
        System.out.println("Closing...");
        System.exit(8);
        
    }
    public void windowActivated(WindowEvent we)
    {
        System.out.println("Activated...");
    }
    public void windowDeactivated(WindowEvent we)
    {
        System.out.println("De-Activated...");
    }
    public void windowIconified(WindowEvent we)
    {
        System.out.println("Iconified...");
        
    }
    public void windowDeiconified(WindowEvent we)
    {
        System.out.println("DeIconified...");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mb = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\ayushjava\\project1\\pic\\burger1.png")); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, 261, 270));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("See Recipes And Order It's Ingredients");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 1000, 97));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\ayushjava\\project1\\pic\\coffee.jpg")); // NOI18N
        jButton2.setText("jButton2");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 180, 270, 270));

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\ayushjava\\project1\\pic\\pizza.jpg")); // NOI18N
        jButton3.setText("jButton3");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 180, 266, 270));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Now No More Compromise,");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 582, 517, 99));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Eat Whatever You Want In a Healthy Way");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 688, 812, 59));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\ayushjava\\project1\\pic\\food2.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 509, 1000, 450));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\ayushjava\\project1\\pic\\b1.jpg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 510));

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HOME COOK.com");
        jInternalFrame1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1020, 340, 60));

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Ready To Add Ingredients To cart");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jInternalFrame1.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 966, 366, 46));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\ayushjava\\project1\\pic\\b1.jpg")); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 926, 1000, 170));

        jPanel1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1130));

        mb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        jMenu1.setText("Home");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        mb.add(jMenu1);

        jMenu2.setText("Recipes");
        mb.add(jMenu2);

        jMenu3.setText("Pages");
        mb.add(jMenu3);

        setJMenuBar(mb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userscreen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar mb;
    // End of variables declaration//GEN-END:variables

}
