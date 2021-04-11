package GUİ;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;
public class main_gui  {
    
    ////////////// NESNELER
    Action action = new Action(); // Oluşturuduğumuz Action sınıfından nesne oluşturup methodları kullanıyoruz.
    Random random = new Random(); 
    main_gui gui=null;
 
    /////////////////////// JFRAME TANIMLAMA
    JFrame frame = new JFrame("Kelime Oyunu");
    
    ////////////////////////////GİRİŞ EKRANI TANIMLAMA
    JPanel giris_ekranı=new JPanel();
    JButton basla = new JButton("");
    JButton nasıl = new JButton("");
    ImageIcon arkaplan = new ImageIcon(new ImageIcon(getClass().getResource("giris_resmi1.png")).getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT));
    JLabel label = new JLabel(arkaplan);
    JButton soru_ekle_button = new JButton("");
    
    /////////////////////////////SORU EKLEME EKRANI
    JPanel ekleme_ekranı=new JPanel();
    ImageIcon ekleme_arkaplan = new ImageIcon(new ImageIcon(getClass().getResource("soru_ekle.png")).getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT));
    JLabel ekle_label = new JLabel(ekleme_arkaplan);
    JLabel soru_listesi = new JLabel("");
    JButton ekle_geri_button =new JButton("");
    JButton ekle_button = new JButton("");
    JTextField soru_bosluk = new JTextField("Soru giriniz.");
    JTextField cevap_bosluk = new JTextField("cevabı giriniz");
    
    ////////////////////////// OYUN EKRANI TANIMLAMA
    JPanel oyun_ekranı = new JPanel();
    ImageIcon arkaplan_oyun = new ImageIcon(new ImageIcon(getClass().getResource("KELİME_OYUNU.png")).getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT));
    JLabel label_oyun = new JLabel(arkaplan_oyun);
    JButton harf=new JButton("HARF AL");
    JButton cevap=new JButton("CEVAP VER");
    JLabel sayac= new JLabel("");
    JLabel toplam_puan=new JLabel("0");
    JLabel soru_puanı = new JLabel("0");
    JLabel soru_text=new JLabel("");
    JLabel cevap_text=new JLabel("");
    JLabel dogru_cevap=new JLabel("");
    
    ////////////////////// NASIL EKRANI TANIMLAMA
    JPanel nasıl_ekranı = new JPanel();
    ImageIcon arkaplan_nasıl = new ImageIcon(new ImageIcon(getClass().getResource("NASIL OYNANIR1.png")).getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT));
    JLabel label_nasıl = new JLabel(arkaplan_nasıl);
    JButton geri = new JButton();
    
    ////////////////////////////// USERNAME EKRANI TANIMLAMA
    JPanel username_ekranı= new JPanel();
    ImageIcon arkaplan_username = new ImageIcon(new ImageIcon(getClass().getResource("Play.png")).getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT));
    JLabel username_label=new JLabel(arkaplan_username);

    JButton go_button = new JButton();
    JButton geri2 = new JButton();
    JTextField username = new JTextField("oyuncu 1");
    
    
    //////////////////////////////// GAMER OVER EKRANI SÜRE BİTTİ KISMI 
    JPanel süre_bitti = new JPanel();
    ImageIcon game_over_arkaplan = new ImageIcon(new ImageIcon(getClass().getResource("GAME OVER.png")).getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT));
    JLabel label_over = new JLabel(game_over_arkaplan);
    ImageIcon exit_logo = new ImageIcon(new ImageIcon(getClass().getResource("exit.png")).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
    JButton exit_button= new JButton(exit_logo);
    JLabel score = new JLabel("");
   
    
    //////////////// GAME OVER KAZANDIN KISMI 
    JPanel kazandın_panel= new JPanel();
    ImageIcon kazandın_arkaplan = new ImageIcon(new ImageIcon(getClass().getResource("12.png")).getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT));
    JLabel label_kazandın = new JLabel(kazandın_arkaplan);
    JLabel score2 = new JLabel();
    
    
   public void main_gui(){
       
      gui = new main_gui();
       //////////////////// FRAME 
       frame.setVisible(true);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000,650);
       frame.setLocationRelativeTo(null); // frame in ortaya gelmesini sağlıyor
    
       //////////////////// NASIL OYNANIR EKRANI ?
       nasıl_ekranı.setBounds(0,-30,1000,650);
       label_nasıl.setBounds(0,0,1000,650);
       nasıl_ekranı.setVisible(false);
       geri.setBounds(30,380,230,230);
       geri.setFocusPainted(false);
       geri.setContentAreaFilled(false);
       geri.setBorderPainted(false);
       geri.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
       oyun_ekranı.setBounds(0,0,1000,650);
       label_oyun.setBounds(0,0,1000,650);
       oyun_ekranı.setVisible(false);
       /////////////// KAZANDIN EKRANI 
       kazandın_panel.setBounds(0,-30,1000,650);
       label_kazandın.setBounds(0,0,1000,650);
       kazandın_panel.setVisible(false);
       score2.setBounds(266,300,800,90);
       score2.setFont(new Font("Corbel",Font.BOLD,30));
       score2.setForeground(Color.black);
       
       
       ////////////// GİRİŞ EKRANI
       giris_ekranı.setBounds(0,-15,1000,650);
       label.setBounds(0,0,1000,650);
       giris_ekranı.setVisible(true);
       
       basla.setFont(new Font("Corbel", Font.PLAIN, 75));
       basla.setForeground(Color.yellow);
       basla.setBounds(60,220,320,100);
       basla.setOpaque(true);
       basla.setCursor(new Cursor(Cursor.HAND_CURSOR));
       basla.setContentAreaFilled(false);
       basla.setBorder(null);
       basla.setFocusPainted(false);
       
       
       nasıl.setFont(new Font("Corbel",Font.PLAIN,35));
       nasıl.setForeground(Color.yellow);
       nasıl.setBounds(100,500,350,100);
       nasıl.setOpaque(true);
       nasıl.setCursor(new Cursor(Cursor.HAND_CURSOR));
       nasıl.setContentAreaFilled(false);
       nasıl.setBorder(null);
       nasıl.setFocusPainted(false);
       
       
       
       soru_ekle_button.setFont(new Font("Corbel",Font.PLAIN,35));
       soru_ekle_button.setBounds(300,240,350,100);
       soru_ekle_button.setOpaque(true);
       soru_ekle_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
       soru_ekle_button.setContentAreaFilled(false);
       soru_ekle_button.setBorder(null);
       soru_ekle_button.setFocusPainted(false);
       
       /////////////////////////EKLEME EKRANI 

       ekle_geri_button.setFont(new Font("Corbel",Font.PLAIN,35));
       ekle_geri_button.setBounds(300,420,200,100);
       ekle_geri_button.setOpaque(true);
       ekle_geri_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
       ekle_geri_button.setContentAreaFilled(false);
       ekle_geri_button.setBorder(null);
       ekle_geri_button.setFocusPainted(false);
       
       ekle_button.setFont(new Font("Corbel",Font.PLAIN,35));
       ekle_button.setBounds(50,340,200,100);
       ekle_button.setOpaque(true);
       ekle_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
       ekle_button.setContentAreaFilled(false);
       ekle_button.setBorder(null);
       ekle_button.setFocusPainted(false);
       
       
       ekle_label.setBounds(0,0,1000,650);
       ekleme_ekranı.setBounds(0,-10,1000,650);
       ekleme_ekranı.setVisible(false);
       
       
       soru_listesi.setBounds(0,0,300,300);
       soru_listesi.setBackground(Color.white);
       
       soru_bosluk.setBounds(300,60,600,50);
       cevap_bosluk.setBounds(300,150,200,50);
       
       /////////////// OYUN EKRANI
       oyun_ekranı.setBounds(0,-10,1000,650);
       label_oyun.setBounds(0,0,1000,650);
       
       harf.setFont(new Font("Corbel",Font.BOLD,20));
       harf.setBounds(590,460,250,80);
       harf.setOpaque(true);
       harf.setCursor(new Cursor(Cursor.HAND_CURSOR));
       harf.setContentAreaFilled(false);
       harf.setBorder(null);
       harf.setFocusPainted(false);
       
       cevap.setFont(new Font("Corbel",Font.BOLD,20));
       cevap.setBounds(740,370,250,80);
       cevap.setOpaque(true);
       cevap.setCursor(new Cursor(Cursor.HAND_CURSOR));
       cevap.setContentAreaFilled(false);
       cevap.setBorder(null);
       cevap.setFocusPainted(false);
       
       toplam_puan.setBounds(145,129,200,60);
       toplam_puan.setFont(new Font("Corbel",Font.BOLD,30));
       toplam_puan.setForeground(Color.green);
 
       soru_puanı.setBounds(290,40,100,60);
       soru_puanı.setFont(new Font("Corbel",Font.BOLD,30));
       soru_puanı.setForeground(Color.black);
       
       
       sayac.setBounds(138,315,120,60);
       sayac.setFont(new Font("Corbel",Font.BOLD,40));
       sayac.setForeground(Color.black);
       
       
       soru_text.setBounds(500,40,800,60);
       soru_text.setFont(new Font("Corbel",Font.BOLD,14));
       
       cevap_text.setBounds(600,130,250,60);
       cevap_text.setFont(new Font("Corbel",Font.BOLD,30));
       cevap_text.setForeground(Color.black);
       
       dogru_cevap.setBounds(600,130,200,60);
       dogru_cevap.setFont(new Font("Corbel",Font.BOLD,50));
       dogru_cevap.setForeground(Color.black);
       dogru_cevap.setVisible(false);
    
       ////// İSİM ALMA EKRANI
       username_label.setBounds(0,0,1000,650);
       username_ekranı.setBounds(0,-40,1000,650);
       username_ekranı.setVisible(false);
       
       go_button.setBounds(780,400,200,200);
       go_button.setFocusPainted(false);
       go_button.setContentAreaFilled(false);
       go_button.setBorderPainted(false);
       go_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
       geri2.setBounds(68,430,200,200);
       geri2.setFocusPainted(false);
       geri2.setContentAreaFilled(false);
       geri2.setBorderPainted(false);
       geri2.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
       username.setBounds(20,200,600,80);
       username.setFont(new Font("Corbel",Font.PLAIN,50));
      
       ////////////////////////////SÜRE BİTTİ EKRANI
       süre_bitti.setBounds(0,0,1000,650);
       label_over.setBounds(0,0,1000,650);
       süre_bitti.setVisible(false);
       
       exit_button.setBounds(810,440,100,100);
       exit_button.setFocusPainted(false);
       exit_button.setContentAreaFilled(false);
       exit_button.setBorderPainted(false);
       exit_button.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
       score.setBounds(220,400,800,90);
       score.setFont(new Font("Corbel",Font.PLAIN,40));
       score.setForeground(Color.black);
       
       ////////////////////////////////////////////////////////////////////////
       
       
       ///////////////////////// AKSİYONLAR
       
        basla.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
              action.change_screen(giris_ekranı,username_ekranı);
             
              
            }           
        });
        nasıl.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
               action.change_screen(giris_ekranı,nasıl_ekranı);
            }           
        });
        geri.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
                action.change_screen(nasıl_ekranı,giris_ekranı);
            }           
        });
        go_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
 
           action.take_name(username,username_ekranı,oyun_ekranı,süre_bitti,sayac,score,soru_text,cevap_text,dogru_cevap,soru_puanı,toplam_puan,kazandın_panel,score2);
           
            }           
        });
        geri2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
                action.change_screen(username_ekranı,giris_ekranı);
            }           
        });  
        exit_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
              System.exit(0);
              
            }           
        });
        soru_ekle_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
               action.change_screen(giris_ekranı,ekleme_ekranı);
            }           
        });
        ekle_geri_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
               action.change_screen(ekleme_ekranı,giris_ekranı);
            }           
        });
        ekle_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {           
              action.write(soru_bosluk,cevap_bosluk);
            }           
        });
        cevap.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              
                boolean a=action.cevap_ver(dogru_cevap,toplam_puan,soru_puanı,oyun_ekranı,kazandın_panel);
                if(a==true)
                    action.change_q(soru_text, cevap_text, dogru_cevap,oyun_ekranı,süre_bitti,soru_puanı,kazandın_panel);
            }           
        });
        harf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
              action.harf_al(dogru_cevap,cevap_text, soru_puanı);
               
            }
        });
        
       /////////////////// görünür yapmak için ---------- eklemeler ekleme işlemleri
       
       frame.setLayout(null);
       
       label_over.add(score);
       label_over.add(exit_button);
       süre_bitti.add(label_over);       
       
       username_label.add(username);
       username_label.add(go_button);
       username_label.add(geri2);
       username_ekranı.add(username_label);
       
       label_oyun.add(dogru_cevap);
       label_oyun.add(cevap_text);       
       label_oyun.add(soru_text);
       label_oyun.add(sayac);
       label_oyun.add(soru_puanı);
       label_oyun.add(toplam_puan);
       label_oyun.add(harf);
       label_oyun.add(cevap);
       oyun_ekranı.add(label_oyun);
       
       label_nasıl.add(geri);
       nasıl_ekranı.add(label_nasıl);
       
       label.add(soru_ekle_button);
       label.add(nasıl);
       label.add(basla);
       giris_ekranı.add(label);
       
       ekle_label.add(ekle_button);
       ekle_label.add(ekle_geri_button);
       ekle_label.add(cevap_bosluk);
       ekle_label.add(soru_bosluk);
       ekle_label.add(soru_listesi);
       ekleme_ekranı.add(ekle_label);
       
       label_kazandın.add(score2);
       kazandın_panel.add(label_kazandın);
       kazandın_panel.add(label_kazandın);
       
       frame.add(süre_bitti);
       frame.add(giris_ekranı);
       frame.add(oyun_ekranı);
       frame.add(nasıl_ekranı);
       frame.add(username_ekranı);
       frame.add(ekleme_ekranı);
       frame.add(kazandın_panel);  
    }
}
