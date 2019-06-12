import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Labka1 {
	private JTextArea display;
	private JFrame frame; 
	
	
	public static void main (String[] args) {
		Labka1 reader = new Labka1();	
		reader.go();
	}
	
	public void go() {
		// ��������� gui
		frame = new JFrame("��������� \"��������� ������\" ������ ����� �����������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		display = new JTextArea(15,20); display.setFont(bigFont);
		display.setLineWrap(true); display.setEditable(false);
		JScrollPane qScroller = new JScrollPane(display);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); 
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		mainPanel.add(qScroller); 
		
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem loadMenuItem = new JMenuItem("��������� ������  ������"); loadMenuItem.addActionListener(new OpenMenuListener()); fileMenu. add (loadMenuItem); menuBar. add (fileMenu); frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel); 
                frame.setSize(640,600); 
                frame.setVisible(true);
	} // ������� ����� go
	
	
	
	public class OpenMenuListener implements ActionListener {
		 public void actionPerformed(ActionEvent ev) { 
			JFileChooser fileOpen = new JFileChooser(); 
			fileOpen.showOpenDialog(frame); 
			loadFile (fileOpen.getSelectedFile ()) ;
		}
	}

	private void loadFile(File file) {
		
		try{
			BufferedReader reader1 = new BufferedReader(new FileReader(file));
			BufferedReader reader2 = new BufferedReader(new FileReader(file));
                        String line = null;
                        String Str = "", Otvet="";
                        int count=0 ;
                       
                       
                        
			while((line = reader1.readLine()) != null){
                            count++;
                        }
                        
                        //������ ��� �������� �������
                         double[] msv = new double[count];
                         int i =0;
                         //���������� ������ �� �����
                        while((line = reader2.readLine()) != null){
                          String s = line; 
                          msv[i]=Double.parseDouble(s);
                          i++;  
                        }
                         //��������� ���������� �������
                        double m1=0;       
                          for (double d : msv) {
                            m1 += d;
                         }
                          m1/=msv.length;
                     
                      //��������� ��������� ���������
                       double dispersya = 0;
                       for(double d: msv){
                           dispersya += (Math.pow((d-m1), 2));
                       }
                       dispersya /=(msv.length-1);
                       
                       //���������� ��������� ������� �������������� ����������
                       double srdkv = Math.sqrt(dispersya);
                       

                        //���������� �������
                       bubbleSort(msv);
                       for(double d: msv){
                           Str+=d+"   ";
                       }
                       
                       //����������   ����������� ��������
                       double kvar = srdkv/m1;
                       
                       
                        //����������   ����������
                        double assm = 0;
                       for (double d : msv){
                           assm += (Math.pow((d-m1), 3));
                       }
                       
                        assm /= msv.length;
                        assm /= (Math.pow(srdkv,3)) ;
                                                                       
                        //���������� ������
                        
                        double eks = 0;
                         for (double d : msv){
                           eks += (Math.pow((d-m1), 4));
                        }
                       
                        eks /= msv.length;
                        eks /= (Math.pow(srdkv,4)) ;
                        eks -=3;
                        
                       
                        //��������� ������������� ��������
                       double i1 = m1 - (2.0095 *(srdkv/Math.sqrt(msv.length)));
                       double i2 = m1 + (2.0095 *(srdkv/Math.sqrt(msv.length)));
                       
                        //��������� �������
                        double median=(msv[msv.length/2]+msv[(msv.length/2)+1])/2;
                        
                       int uniqueNumber = msv.length; // ������ ���������� � ��������� ��������, ������ ������� ������� (�����������, ��� ��� ��������� ��������)
                            for(int i3=1;i3<msv.length;i3++){ // ����������� �� �������
                                if(msv[i3-1]==msv[i3]) uniqueNumber--; // ���� ������� �������� �����, �� �������� uniqueNumber ��������� �� �������
                            }
                       
                         
                                    
                            
                            
                       Otvet="��������������� ������:\n [  "+Str+"]";
                       Otvet+="\n"+String.format(" ����: %.2f", mostPopular(msv));
                       Otvet+="\n"+String.format(" �������: %.3f", median);
                       Otvet+="\n"+String.format(" ���������� �������: %.3f", m1);
                       Otvet+="\n"+String.format(" ���������� ���������: %.3f", dispersya);
                       Otvet+="\n"+String.format(" ���������� ������� �������������� ����������: %.3f", srdkv);
                       Otvet+="\n"+String.format(" K���������� ��������: %.3f", srdkv); 
                    
                       if(assm>0)Otvet+="\n"+String.format(" A���������: %.3f   �����: ���������� �������� ��������������", assm); 
                       else Otvet+="\n"+String.format(" A���������: %.3f   �����: ���������� �������� �������������", assm);
                       
                       if(eks>0)Otvet+="\n"+String.format(" �������: %.3f   �����: ������������� �������� ��������������", eks); 
                       else Otvet+="\n"+String.format(" �������: %.3f   �����: ������������� �������� ���������������", eks);
                       
                       Otvet+="\n"+String.format(" ������������� ��������: \n %.3f", i1)+String.format(" < m < %.3f", i2); 
                       
                       
                    display.setText(Otvet);
                    reader1.close();
                                     
		}catch(Exception ex){
			System.out.println("couldn't write the array out");
			ex.printStackTrace();	
		}
	
         }
	
        //�������� ���������� ����������
        public static void bubbleSort(double[] arr){
            /*������� ���� ������ ��� ��������� �������� �������, 
            ��� ��� ���������� ���� ������ ��� ������ � �����
            ��������� ������������ �������*/   
            for(int i = arr.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){
            /*���������� �������� �������, 
              ���� ��� ����� ������������ �������, 
              �� ������ �������*/
                    if( arr[j] > arr[j+1] ){
                       double tmp = arr[j];
                       arr[j] = arr[j+1];
                      arr[j+1] = tmp;
                     }
                }
            }
        }
        
        
        //�������� ��
        public static double mostPopular(double[] array) {
    
 
            double prev = array[0];
            double popular = array[0];
            int count = 1;
            int maxCount = 1;
 
             for (int i = 1; i < array.length; i++) {
                  if (array[i] == prev) {
                        count++;
                   } else {
                         if (count > maxCount) {
                            popular = array[i - 1];
                            maxCount = count;
                             }
                    prev = array[i];
                    count = 1;
                    }
            }
             return count > maxCount ? array[array.length - 1] : popular;
        }
        
}