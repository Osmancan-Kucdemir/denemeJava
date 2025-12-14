package app;

import javax.swing.*;
import java.awt.*;

public class AnaMenuGUI extends JFrame {

    public AnaMenuGUI() {

        setTitle("Kampüs Yönetim Sistemi");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Ekranın ortasına alır

        // Ana panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));

        // Butonlar
        JButton ogrenciBtn = new JButton("Öğrenci Yönetimi");
        JButton akademisyenBtn = new JButton("Akademisyen Yönetimi");
        JButton dersBtn = new JButton("Ders Yönetimi");
        JButton kutuphaneBtn = new JButton("Kütüphane");
        JButton yurtBtn = new JButton("Yurt Yönetimi");
        JButton cikisBtn = new JButton("Çıkış");

        // Panele ekleme
        panel.add(ogrenciBtn);
        panel.add(akademisyenBtn);
        panel.add(dersBtn);
        panel.add(kutuphaneBtn);
        panel.add(yurtBtn);
        panel.add(cikisBtn);

        add(panel);

        // Çıkış butonu
        cikisBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
