package GUİ;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Action {
   
///// NESNELERİMİZ 
    
Random random = new Random();    
TimerTask Task =null;
Timer timer = new Timer();
main_gui gui=null;

////// DEĞİŞKENLER 

ArrayList<String> dizi_4 = new ArrayList<String>(); 
ArrayList<String> dizi_5 = new ArrayList<String>(); 
ArrayList<String> dizi_6 = new ArrayList<String>(); 
ArrayList<String> dizi_7 = new ArrayList<String>(); 
ArrayList<String> dizi_8 = new ArrayList<String>(); 
ArrayList<String> dizi_9 = new ArrayList<String>(); 
ArrayList<String> dizi_10 = new ArrayList<String>(); 

ArrayList<String> bulunanlar = new ArrayList<String>(); 
ArrayList<String> çıkmış_sorular = new ArrayList<String>(); 

int süre =4*60;
int dif =4;
int dif_counter=0;
boolean running = true;
int i = 3;
int soru_sayisi=1;
int satir_sayisi=-1;

////////////////////////////////////////////////////////////////////////////

public void read_txt_4() throws FileNotFoundException{
      BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\4 harfli.txt"));
			String line = reader.readLine();
                        int i=0;
			while (line != null) {
                          if(!line.equals("")){
                            dizi_4.add(line);
                            satir_sayisi+=1;
                            i++;}
			line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
public void read_txt_5() throws FileNotFoundException{

      BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\5 harfli.txt"));
			String line = reader.readLine();
                        int i=0;
			while (line != null) {
                            
				
                                    if(!line.equals("")){
                                    dizi_5.add(line);
                                   
                                    satir_sayisi+=1;
                                    i++;}
                                   
                                
                              
			
				line = reader.readLine();
			}
                  
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
public void read_txt_6() throws FileNotFoundException{
     
      
      
      BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\6 harfli.txt"));
			String line = reader.readLine();
                        int i=0;
			while (line != null) {
                            
				
                                    if(!line.equals("")){
                                    dizi_6.add(line);
                              
                                    satir_sayisi+=1;
                                    i++;}
                                   
                                
                              
				
				line = reader.readLine();
			}
                   
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    
    
}
public void read_txt_7() throws FileNotFoundException{
     
      
      
      BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\7 harfli.txt"));
			String line = reader.readLine();
                        int i=0;
			while (line != null) {
                            
				
                                    if(!line.equals("")){
                                    dizi_7.add(line);
                                     
                                     satir_sayisi+=1;
                                    i++;}
                                   
                                
                              
				
				line = reader.readLine();
			}
                       
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    
    
}
public void read_txt_8() throws FileNotFoundException{
     
      
      
      BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\8 harfli.txt"));
			String line = reader.readLine();
                        int i=0;
			while (line != null) {
                            
				
                                    if(!line.equals("")){
                                    dizi_8.add(line);
                      
                                    satir_sayisi+=1;
                                    i++;}
                                   
                                
                              
				
				line = reader.readLine();
			}
                                   
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    
    
}
public void read_txt_9() throws FileNotFoundException{
     
      
      
      BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\9 harfli.txt"));
			String line = reader.readLine();
                        int i=0;
			while (line != null) {
                            
				
                                    if(!line.equals("")){
                                    dizi_9.add(line);
                          
                                    satir_sayisi+=1;
                                    i++;}
                                   
                                
                              
				
				line = reader.readLine();
			}
                                
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    
    
}
public void read_txt_10() throws FileNotFoundException{
     
      
      
      BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\10 harfli.txt"));
			String line = reader.readLine();
                        int i=0;
			while (line != null) {
                            
				
                                    if(!line.equals("")){
                                    dizi_10.add(line);
                                     
                                    satir_sayisi+=1;
                                    i++;}
                                   
                                
                              
				
				line = reader.readLine();
			}
                      
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    
    
    
}

public void write(JTextField soru,JTextField cevap){
    PrintWriter dosyayaz = null;
    String soru_str= soru.getText();
    String cevap_str= cevap.getText();
    String formated_file=soru_str+"@"+cevap_str;
    int num =cevap_str.length();
    
    
        try
        {
            String path = "C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\"+num+" harfli.txt";
            File Dosya = new File(path);
            if(Dosya.exists())
                System.out.println("");
            else
                System.out.println("DOSYA YOK --- YENİ DOSYA OLUŞTURULDU.");
        dosyayaz = new PrintWriter((new FileOutputStream(Dosya, true)));
      
        dosyayaz.close();
        
        String path2 = "C:\\Users\\kaank\\OneDrive\\Masaüstü\\soru\\"+num+" harfli.txt";
        File dosya = new File(path2);
        try
        {
            if (!dosya.exists())
                dosya.createNewFile();
            else
                System.out.println("");

        }
        catch (IOException e)
        {
            System.out.println((e.getMessage()));
        }
        PrintWriter dosyayaz2 = new PrintWriter(new FileOutputStream(dosya, true));
            System.out.println("Sorunuz başarılı bir şekilde eklendi.");
        dosyayaz2.println(formated_file);
     
        dosyayaz2.close();

        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        dosyayaz.close();
    }
    
    
    
}

public void soru_getir_4(JLabel label,JLabel cevap,JLabel dogru_cevap){
     
    try {
        read_txt_4();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
    }
          int random_indis= random.nextInt(satir_sayisi);
          String soru=dizi_4.get(random_indis);
          String[] part =null;
          part=soru.split("@");
          String soru_new=part[0];
          String cevap_new= part[1];
         
             while(çıkmış_sorular.contains(soru_new)){
                  
                random_indis= random.nextInt(satir_sayisi);
                soru=dizi_4.get(random_indis);
                part=soru.split("@");
                soru_new=part[0];
                cevap_new= part[1];
              }
              dizi_4.remove(satir_sayisi-1);
              label.setText(soru_new);
          çıkmış_sorular.add(soru_new);
          System.out.println("DOĞRU CEVAP : "+cevap_new);
          dogru_cevap.setText(cevap_new);
          
          cevap.setText("_ _ _ _");
          
    
  
}
public void soru_getir_5(JLabel label,JLabel cevap,JLabel dogru_cevap){
    //  reset_array();
    try {
        read_txt_5();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
    }
          int random_indis= random.nextInt(satir_sayisi);
          String soru=dizi_5.get(random_indis);
          String[] part =null;
          part=soru.split("@");
          String soru_new=part[0];
          String cevap_new= part[1];
        
             while(çıkmış_sorular.contains(soru_new)){
                  
                random_indis= random.nextInt(satir_sayisi);
                soru=dizi_5.get(random_indis);
                part=soru.split("@");
                soru_new=part[0];
                cevap_new= part[1];
              }
              dizi_5.remove(satir_sayisi-1);
               label.setText(soru_new);
          çıkmış_sorular.add(soru_new);
          System.out.println("DOĞRU CEVAP : "+cevap_new);
          dogru_cevap.setText(cevap_new);
          cevap.setText("_ _ _ _ _");
              
    
  
}
public void soru_getir_6(JLabel label,JLabel cevap,JLabel dogru_cevap){
      //reset_array();
    try {
        read_txt_6();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
    }
          int random_indis= random.nextInt(satir_sayisi);
           String soru=dizi_6.get(random_indis);
          String[] part =null;
          part=soru.split("@");
          String soru_new=part[0];
          String cevap_new= part[1];
             while(çıkmış_sorular.contains(soru_new)){
                  
                random_indis= random.nextInt(satir_sayisi);
                soru=dizi_6.get(random_indis);
                part=soru.split("@");
                soru_new=part[0];
                cevap_new= part[1];
              }
             dizi_6.remove(satir_sayisi-1);
          label.setText(soru_new);
          çıkmış_sorular.add(soru_new);
         System.out.println("DOĞRU CEVAP : "+cevap_new);
          dogru_cevap.setText(cevap_new);
          cevap.setText("_ _ _ _ _ _");
              
    
  
}
public void soru_getir_7(JLabel label,JLabel cevap,JLabel dogru_cevap){
     //reset_array();
    try {
        read_txt_7();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
    }
          int random_indis= random.nextInt(satir_sayisi);
          String soru=dizi_7.get(random_indis);
          String[] part =null;
          part=soru.split("@");
          String soru_new=part[0];
          String cevap_new= part[1];
             while(çıkmış_sorular.contains(soru_new)){
                  
                random_indis= random.nextInt(satir_sayisi);
                soru=dizi_7.get(random_indis);
                part=soru.split("@");
                soru_new=part[0];
                cevap_new= part[1];
              }
              dizi_7.remove(satir_sayisi-1);
          label.setText(soru_new);
          çıkmış_sorular.add(soru_new);
         System.out.println("DOĞRU CEVAP : "+cevap_new);
          dogru_cevap.setText(cevap_new);
          cevap.setText("_ _ _ _ _ _ _");
              
    
  
}
public void soru_getir_8(JLabel label,JLabel cevap,JLabel dogru_cevap){
     
    try {
        read_txt_8();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
    }
          int random_indis= random.nextInt(satir_sayisi);
          String soru=dizi_8.get(random_indis);
          String[] part =null;
          part=soru.split("@");
          String soru_new=part[0];
          String cevap_new= part[1];
             while(çıkmış_sorular.contains(soru_new)){
                  
                random_indis= random.nextInt(satir_sayisi);
                soru=dizi_8.get(random_indis);
                part=soru.split("@");
                soru_new=part[0];
                cevap_new= part[1];
              }
          label.setText(soru_new);
          dizi_8.remove(satir_sayisi-1);
          çıkmış_sorular.add(soru_new);
        System.out.println("DOĞRU CEVAP : "+cevap_new);
          dogru_cevap.setText(cevap_new);
          cevap.setText("_ _ _ _ _ _ _ _");
              
    
  
}
public void soru_getir_9(JLabel label,JLabel cevap,JLabel dogru_cevap){
  // reset_array();  
    try {
        read_txt_9();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
    }
          int random_indis= random.nextInt(satir_sayisi);
           String soru=dizi_9.get(random_indis);
          String[] part =null;
          part=soru.split("@");
          String soru_new=part[0];
          String cevap_new= part[1];
            while(çıkmış_sorular.contains(soru_new)){
                  
                random_indis= random.nextInt(satir_sayisi);
                soru=dizi_9.get(random_indis);
                part=soru.split("@");
                soru_new=part[0];
                cevap_new= part[1];
              }
          label.setText(soru_new);
          dizi_9.remove(satir_sayisi-1);
          çıkmış_sorular.add(soru_new);
         System.out.println("DOĞRU CEVAP : "+cevap_new);
          dogru_cevap.setText(cevap_new);
          cevap.setText("_ _ _ _ _ _ _ _ _");
              
    
  
}
public void soru_getir_10(JLabel label,JLabel cevap,JLabel dogru_cevap){
    try {
        read_txt_10();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
    }
      
          int random_indis= random.nextInt(satir_sayisi);

          String soru=dizi_10.get(random_indis);
          String[] part =null;
          part=soru.split("@");
          String soru_new=part[0];
          String cevap_new= part[1];
              while(çıkmış_sorular.contains(soru_new)){
                  
                random_indis= random.nextInt(satir_sayisi);
                soru=dizi_10.get(random_indis);
                part=soru.split("@");
                soru_new=part[0];
                cevap_new= part[1];
              }
              
                        label.setText(soru_new);
                         dizi_10.remove(satir_sayisi-1);
          çıkmış_sorular.add(soru_new);
        System.out.println("DOĞRU CEVAP : "+cevap_new);
          dogru_cevap.setText(cevap_new);
          cevap.setText("_ _ _ _ _ _ _ _ _ _");
              
    
  
}

public void change_screen(JPanel a,JPanel b){
       a.setVisible(false);
       b.setVisible(true);  
   }
public void zaman_basla(JPanel a,JPanel b,JLabel sayac,JTextField username,JLabel puan,JLabel score,JPanel oyun_ekran,JLabel score2){
       Task=new TimerTask() {
           @Override
           public void run() {
               if(running!=false){
                süre-=1;
               String a = Integer.toString(süre);
               sayac.setText(a);
               if(soru_sayisi>14){
                timer.cancel();
                String str_username= username.getText();
                   score2.setText("Merhaba "+ str_username+", Puan : "+puan.getText());
         
               }
               }
               if(süre==0){
                   running=false;          
                   change_screen(a,b);
                   timer.cancel();
                   String str_username= username.getText();
                   score.setText("Merhaba "+ str_username+", Puan : "+puan.getText());
               }
           }
       };
       timer.schedule(Task,0,1000);
    }
public void take_name(JTextField username,JPanel a,JPanel b,JPanel c,JLabel sayac,JLabel score,JLabel soru,JLabel cevap,JLabel dogru_cevap,JLabel soru_puanı,JLabel toplam_puan,JPanel kazandın_ekranı,JLabel score2){
    String str_username= username.getText();
     
    if(str_username.equals("") || str_username==null)
        JOptionPane.showMessageDialog(null,"Kullanıcı ismi giriniz.","HATA",JOptionPane.WARNING_MESSAGE);
    else{ 
    System.out.println("Hello, "+str_username);
    change_screen(a,b);
    zaman_basla(b,c,sayac,username,toplam_puan,score,b,score2); 
    soru_getir_4(soru,cevap,dogru_cevap);
    String x = dogru_cevap.getText();
    int y = x.length();
    int point = y*100;
    String str_point=Integer.toString(point);
    soru_puanı.setText(str_point);
       }
   }
public void reset_harf_al_hak(){
i=3;
bulunanlar.clear();
çıkmış_sorular.clear();
} 
public void change_q(JLabel q,JLabel cevap,JLabel dogru_cevap,JPanel a,JPanel b,JLabel soru_puanı,JPanel c){
    soru_sayisi+=1;
    dif_counter+=1;
    satir_sayisi=0;
    if(soru_sayisi>14)
        change_screen(a,c);
    if(dif_counter%2==0)
        dif+=1;
    if (dif == 4)
        soru_getir_4(q, cevap, dogru_cevap);
    else if (dif == 5)
        soru_getir_5(q, cevap, dogru_cevap);
    else if (dif == 6)
        soru_getir_6(q, cevap, dogru_cevap);
    else if (dif == 7)
        soru_getir_7(q, cevap, dogru_cevap);
    else if (dif == 8)
        soru_getir_8(q, cevap, dogru_cevap);
    else if (dif == 9) 
        soru_getir_9(q, cevap, dogru_cevap);
    else if (dif == 10) 
        soru_getir_10(q, cevap, dogru_cevap);
    String x = dogru_cevap.getText();
    int y = x.length();
    int point = y*100;
    String str_point=Integer.toString(point);
    soru_puanı.setText(str_point);
    reset_harf_al_hak();
}
public void harf_al(JLabel dogru_cevap,JLabel cevap,JLabel soru_puanı){
ArrayList<String> harfler = new ArrayList<String>();  
String dogru = dogru_cevap.getText();
dogru=dogru.toUpperCase();
for(int i=0;i<dogru.length();i++){
  char a =dogru.charAt(i);
  String str = Character.toString(a);
  harfler.add(str);
}
ArrayList<String> harfler2 = new ArrayList<String>(); 
String text_field=cevap.getText();
text_field=text_field.toUpperCase();
for(int i=0;i<text_field.length();i++){
  char a =text_field.charAt(i);
  String str = Character.toString(a);
  harfler2.add(str);  
}
if(i!=0){
    int random_indis= random.nextInt(harfler.size());
    while(bulunanlar.contains(harfler.get(random_indis)))
        random_indis= random.nextInt(harfler.size());
    bulunanlar.add(harfler.get(random_indis));
    harfler2.add((random_indis*2),harfler.get(random_indis));
    harfler2.remove((random_indis*2)+1);
    harfler.remove(random_indis);
    String kelime="";
    for( int i=0;i<harfler2.size();i++){
       kelime = kelime + harfler2.get(i);
    }   
    cevap.setText(kelime);
    String x = soru_puanı.getText();
    int point=Integer.parseInt(x);  
    point=point-100;
    String str_point=Integer.toString(point);
    soru_puanı.setText(str_point);
    i-=1;
  }
  else
    JOptionPane.showMessageDialog(null,"HAKKINIZ KALMADI.","HATA",JOptionPane.WARNING_MESSAGE);
  
    
}
public boolean cevap_ver(JLabel dogru_cevap,JLabel puan,JLabel soru_puanı,JPanel oyun_ekranı,JPanel kazandın_ekranı){
        running=false;
        String dogruC= dogru_cevap.getText();        
        String cevap = JOptionPane.showInputDialog(null,"Cevap :", "Cevap Ekranı",JOptionPane.PLAIN_MESSAGE);
        dogruC=dogruC.toLowerCase();
        cevap=cevap.toLowerCase();
        if(cevap.equals(dogruC)){
            String  b=soru_puanı.getText();
            int y =Integer.parseInt(b);
            String  a=puan.getText();
            int x =Integer.parseInt(a);
            int new_puan = x+y;
            String yeni_puan=Integer.toString(new_puan);
            puan.setText(yeni_puan);
            running =true;
            return true;
            }
        else if(cevap==null){
            String  a=puan.getText();
            int x =Integer.parseInt(a);
            int new_puan = x-100;
            String yeni_puan=Integer.toString(new_puan);
            puan.setText(yeni_puan);
            running=true;
        }
        else{
            String  a=puan.getText();
            int x =Integer.parseInt(a);
            int new_puan = x-100;
            String yeni_puan=Integer.toString(new_puan);
            puan.setText(yeni_puan); 
             return false;
        }
        running=true;
        return false;
    }
}
