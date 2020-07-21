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
      super("비트캠프");
      boardPanel = new BoardPanel();
      contactPanel = new ContactPanel();
      projectPanel = new ProjectPanel();
      memberPanel = new MemberPanel();
      prepareMenu();
      //1)윈도우의 닫기 버튼 이밴트를 처리할 리스너 등록
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      //2)윈도우 크기 지정
       setSize(500,400);
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
	   // add()의 문제점: 갱신되는 게 아닌 기존의 값들에 더해져서 만들어진다. 
	   // 즉, 게시판 화면을 만들고 다음에 프로젝트 메뉴를 선택하면 
	   // -> " 게시판 화면 프로젝트 화면 " 이 만들어짐( 원하는 것은 "프로젝트 화면" 만 보이게 하는 것)
	   // -> 선택한 놈의 내용만 나오게 하고 싶다. 
	   // => MainApp2로 다시 구현하기. 
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