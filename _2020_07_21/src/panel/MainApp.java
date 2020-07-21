package panel;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp extends Frame implements ActionListener{
	BoardPanel boardPanel;
	ContactPanel contactPanel;
	ProjectPanel projectPanel;
	MemberPanel memberPanel;
	
	
   public MainApp() {
      super("��Ʈķ��");
      boardPanel = new BoardPanel();
      contactPanel = new ContactPanel();
      projectPanel = new ProjectPanel();
      memberPanel = new MemberPanel();
      prepareMenu();
      //1)�������� �ݱ� ��ư �̹�Ʈ�� ó���� ������ ���
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      //2)������ ũ�� ����
       setSize(500,400);
   }
   private void prepareMenu() {
      MenuBar menuBar = new MenuBar();
      setMenuBar(menuBar); //�޴��ٸ� ������ �����쿡 �߰��Ѵ�.
      
      Menu adminMenu = new Menu("����");
      menuBar.add(adminMenu);
      
      MenuItem boardMI = new MenuItem("�Խ���");
      boardMI.setActionCommand("board"); //���߿� �̺�Ʈ�� ������ �� ����ϱ� ����.
      boardMI.addActionListener(this);   //MainApp �ڽ��� ActionListener�� �����Ѵ�.
      adminMenu.add(boardMI);            //�Խ��� �޴��� ���� �޴��� �߰��Ѵ�.
      
      MenuItem projectMI = new MenuItem("������Ʈ");
      projectMI.setActionCommand("project");
      projectMI.addActionListener(this);
      adminMenu.add(projectMI);
      
      MenuItem contactMI = new MenuItem("����ó");
      contactMI.setActionCommand("contact");
      contactMI.addActionListener(this);
      adminMenu.add(contactMI);
      
      MenuItem memberMI = new MenuItem("ȸ��");
      memberMI.setActionCommand("memberMI");
      memberMI.addActionListener(this);
      adminMenu.add(memberMI);
   }
   
   public static void main(String[] args) {
      
      MainApp app = new MainApp();
      app.setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
	   switch(e.getActionCommand()) {
	   // add()�� ������: ���ŵǴ� �� �ƴ� ������ ���鿡 �������� ���������. 
	   // ��, �Խ��� ȭ���� ����� ������ ������Ʈ �޴��� �����ϸ� 
	   // -> " �Խ��� ȭ�� ������Ʈ ȭ�� " �� �������( ���ϴ� ���� "������Ʈ ȭ��" �� ���̰� �ϴ� ��)
	   // -> ������ ���� ���븸 ������ �ϰ� �ʹ�. 
	   // => MainApp2�� �ٽ� �����ϱ�. 
	   case "board":
		   add(boardPanel, BorderLayout.CENTER);
		   revalidate();
		   break;
	   case "project":
		   add(projectPanel, BorderLayout.EAST);
		   revalidate();
		   break;
	   case "contact":
	   case "member": 
	   }
	   
   }
}