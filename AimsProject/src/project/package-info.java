package project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
    public static void main(String[] args) {
        // Creating instance of JFrame
        JFrame frame = new  JFrame("Dự án Java Swing Đầu Tiên");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        // Thêm Panel vào Frame
        frame.add(panel);
        placeComponents(panel);

        // Hiển thị frame cho người dùng
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        // Tạo một JLabel
        JLabel userLabel = new JLabel("Người dùng");
        /**
         * Chỉ định vị trí và kích thước của userLabel.
         *  setBounds(x, y, width, height)
         *  x,y là toạ đồ từ phía trên và bên trái của label
         *  2 tham số còn lại chỉ định chiều rộng và chiều cao của label
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        // Tạo Inout cho người dùng nhập username
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Tương tự taọ label và input cho người dùng nhập mật khẩu
        JLabel passwordLabel = new JLabel("Mật khẩu");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // Tạo Button cho user chọn đăng nhập
        JButton loginButton = new JButton("Đăng nhập");
        loginButton.setBounds(10, 80, 100, 25);
        panel.add(loginButton);
    }

