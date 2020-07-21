package panel3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class BoardPanel1 extends Panel implements ActionListener{
	TextArea listTA;
	TextField titleTF;
	TextField passwordTF;
	TextArea contentTA;
	Button addBtn;
	Button cancelBtn;
	Button deleteBtn;
	java.awt.List boardLST;
	BoardDao boardDao;
	public BoardPanel1() {
		
		boardDao = new BoardDao();
		setLayout(new FlowLayout(FlowLayout.LEFT));
	    
	    Label label = new Label("게시판 화면");
	    label.setPreferredSize(new Dimension(400, 30));
	    add(label);
	    
	    label = new Label("게시물 목록");
	    label.setPreferredSize(new Dimension(400,30));
	    add(label);
	    
	    Panel rowPanel = new Panel(new BorderLayout());
	    rowPanel.setPreferredSize(new Dimension(400,200));
	    boardLST = new java.awt.List();
	    boardLST.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.DESELECTED)
					return;
				loadForm((int)e.getItem());
				
			}
	    });
	    
	    rowPanel.add(boardLST,BorderLayout.CENTER);
	    add(rowPanel);
	    
	    label = new Label("게시물 입력/상세정보");
	    label.setPreferredSize(new Dimension(400,30));
	    add(label);
	    
	    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
	    label = new Label("제목");
	    label.setPreferredSize(new Dimension(40,30));
	    rowPanel.add(label);
	    
	    titleTF = new TextField();
	    titleTF.setPreferredSize(new Dimension(350,30));
	    rowPanel.add(titleTF);
	    add(rowPanel);
	    
	    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
	    label = new Label("내용");
	    label.setPreferredSize(new Dimension(40,30));
	    rowPanel.add(label);
	    
	    contentTA = new TextArea();
	    contentTA.setPreferredSize(new Dimension(350,80));
	    rowPanel.add(contentTA);
	    add(rowPanel);
	    
	    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
	    label = new Label("암호");
	    label.setPreferredSize(new Dimension(40,30));
	    rowPanel.add(label);
	    
	    passwordTF = new TextField();
	    passwordTF.setPreferredSize(new Dimension(350,30));
	    passwordTF.setEchoChar('*');
	    rowPanel.add(passwordTF);
	    add(rowPanel);
	    
	    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
	    addBtn = new Button("등록");
	    addBtn.addActionListener(this);
	    rowPanel.add(addBtn);
	    cancelBtn = new Button("취소");
	    cancelBtn.addActionListener(this);
	    rowPanel.add(cancelBtn);
	    
	    
	    deleteBtn = new Button("삭제");
	    deleteBtn.setEnabled(false);
	    deleteBtn.addActionListener(this);
	    rowPanel.add(deleteBtn);
	    
	    add(rowPanel);
	}

	private void loadForm(int no) {
		Board board = boardDao.selectOne(no);
		if(board == null)
			return;
		titleTF.setText(board.title);
		contentTA.setText(board.contents);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addBtn) {
			Board board = new Board();
			board.title = titleTF.getText();
			board.contents = contentTA.getText();
			board.password = passwordTF.getText();
			boardDao.insert(board);
			loadList();
			cancelBtn.dispatchEvent(new ActionEvent(cancelBtn,
					ActionEvent.ACTION_PERFORMED,null));
		}else {
			
			titleTF.getText();
			titleTF.setText("");
			contentTA.getText();
			contentTA.setText("");
			passwordTF.getText();
			passwordTF.setText("");

		}	
	}
	private void loadList() {
		boardLST.removeAll();
		List<Board> boards = boardDao.selectList();
		for(Board board: boards) {
			boardLST.add(
					board.title + "," +
					board.writer + "," +
					board.createdDate + "," +
					board.viewCount);
		}
	}
}

