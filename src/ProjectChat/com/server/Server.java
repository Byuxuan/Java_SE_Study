package ProjectChat.com.server;

import ProjectChat.com.util.CharacterUtil;
import com.sun.javaws.util.JfxHelper;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Server extends JFrame {



    private JLabel jLabel1;

    private JLabel jLabel2;

    private JLabel jLabel3;

    private JButton jButton;

    private JPanel jPanel1;

    private JPanel jPanel2;
    private JPanel jPanel3;

    private JTextArea jTextArea;

    private JTextField jTextField;

    private JScrollPane jScrollPane;

    public Server(String string) {
        super(string);
        this.initComponents();

    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();

        jButton = new JButton();

        jTextArea = new JTextArea();
        jTextField = new JTextField(10);

        jScrollPane = new JScrollPane();

        jPanel1.setBorder(BorderFactory.createTitledBorder("服务器信息"));
        jPanel2.setBorder(BorderFactory.createTitledBorder("在线用户列表"));
        jPanel3.setBorder(BorderFactory.createTitledBorder("端口信息"));

        jLabel1.setText("服务器状态");
        jLabel2.setText("停止");
        jLabel3.setForeground(new Color(204, 0, 51));

        jLabel3.setText("端口号");

        jButton.setText("启动服务器");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Server.this.execute();
            }
        });

        this.jTextField.setEnabled(true);


        this.jTextField.setForeground(new Color(245, 0, 0));

        jPanel1.add(jLabel1);
        jPanel1.add(jLabel2);
        jPanel3.add(jLabel3);
        jPanel3.add(jTextField);
        jPanel3.add(jButton);

        jTextArea.setColumns(30);
        jTextArea.setForeground(new Color(0, 51, 204));
        jTextArea.setRows(20);
        jScrollPane.setViewportView(jTextArea);
        jPanel2.add(jScrollPane);

        this.getContentPane().add(jPanel1, BorderLayout.NORTH);
        this.getContentPane().add(jPanel3, BorderLayout.CENTER);
        this.getContentPane().add(jPanel2, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(true);
        this.pack();
        this.setVisible(true);

    }

    private void execute() {
        String hostPost = this.jTextField.getText();

        if (CharacterUtil.isEmpty(hostPost)) {
            JOptionPane.showMessageDialog(this, "端口号不为空", "警告", JOptionPane.WARNING_MESSAGE);

            jTextField.requestFocus();

            return;
        }
        if (!CharacterUtil.isNumber(hostPost)) {
            JOptionPane.showMessageDialog(this, "端口号不为数字", "警告", JOptionPane.WARNING_MESSAGE);

            jTextField.requestFocus();

            return;
        }

        if (!CharacterUtil.isPortCorrect(hostPost)) {
            JOptionPane.showMessageDialog(this, "端口号不正确", "警告", JOptionPane.WARNING_MESSAGE);

            jTextField.requestFocus();

            return;
        }


    }



    public static void main(String[] args) {
        Server server=new Server("Server");



    }
}
