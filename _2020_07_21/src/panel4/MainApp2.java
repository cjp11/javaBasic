package panel4;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp2 extends Frame implements ActionListener{
	BoardPanel boardPanel = new BoardPanel();
	ContactPanel contactPanel = new ContactPanel();
	ProjectPanel projectPanel = new ProjectPanel();
	MemberPanel memberPanel = new MemberPanel();
	Panel currPanel;
	CardLayout cardLayout = new CardLayout();
	
   public MainApp2() {
      super("비트캠프");
      setLayout(cardLayout);
      prepareMenu();
      preparePanels();
      //1)윈도우의 닫기 버튼 이밴트를 처리할 리스너 등록
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      //2)윈도우 크기 지정
       setSize(500,600);
   }
   private void prepareMenu() {
      MenuBar menuBar = new MenuBar();
      setMenuBar(menuBar); //메뉴바를 프레임 윈도우에 추가한다.
      
      Menu adminMenu = new Menu("관리");
      menuBar.add(adminMenu);
      
      MenuItem boardMI = new MenuItem("게시판");
      boardMI.setActionCommand("board"); //나중에 이벤트를 구분할 때 사용하기 위함.
      boardMI.addActionListener(this);   //MainApp 자신이 ActionListener를 구현한다.
      adminMenu.add(boardMI);            //게시판 메뉴를 관리 메뉴에 추가한다.
      
      MenuItem projectMI = new MenuItem("프로젝트");
      projectMI.setActionCommand("project");
      projectMI.addActionListener(this);
      adminMenu.add(projectMI);
      
      MenuItem contactMI = new MenuItem("연락처");
      contactMI.setActionCommand("contact");
      contactMI.addActionListener(this);
      adminMenu.add(contactMI);
      
      MenuItem memberMI = new MenuItem("회원");
      memberMI.setActionCommand("member");
      memberMI.addActionListener(this);
      adminMenu.add(memberMI);
   }
   
   public static void main(String[] args) {
      
      MainApp2 app = new MainApp2();
      app.setVisible(true);
   }
   
   private void preparePanels() {
	   add(boardPanel, "board");	//board이름으로 boardPanel에 등록
	   add(projectPanel, "project");
	   add(contactPanel, "contact");
	   add(memberPanel, "member");
	   
   }
   @Override
   public void actionPerformed(ActionEvent e) {
	   cardLayout.show(this, e.getActionCommand());
	   revalidate();
   }
   
  
}