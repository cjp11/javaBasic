package panel4;

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

import javax.swing.JOptionPane;

public class ProjectPanel extends Panel implements ActionListener{
	TextArea listTA;
	TextField titleTF;
	TextField passwordTF;
	TextArea contentTA;
	Button addBtn;
	Button cancelBtn;
	Button deleteBtn;
	java.awt.List projectLST;
	ProjectDao projectDao;
	public ProjectPanel() {
		
		projectDao = new ProjectDao();
		setLayout(new FlowLayout(FlowLayout.LEFT));
	    
	    Label label = new Label("프로젝트 화면");
	    label.setPreferredSize(new Dimension(400, 30));
	    add(label);
	    
	    label = new Label("프로젝트 목록");
	    label.setPreferredSize(new Dimension(400,30));
	    add(label);
	    
	    Panel rowPanel = new Panel(new BorderLayout());
	    rowPanel.setPreferredSize(new Dimension(400,200));
	    projectLST = new java.awt.List();
	    projectLST.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.DESELECTED)
					return;
				loadForm((int)e.getItem());
				
			}
	    });
	    
	    rowPanel.add(projectLST,BorderLayout.CENTER);
	    add(rowPanel);
	    
	    label = new Label("프로젝트 정보 입력/상세정보");
	    label.setPreferredSize(new Dimension(400,30));
	    add(label);
	    
	    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
	    label = new Label("프로젝트 제목");
	    label.setPreferredSize(new Dimension(40,30));
	    rowPanel.add(label);
	    
	    titleTF = new TextField();
	    titleTF.setPreferredSize(new Dimension(350,30));
	    rowPanel.add(titleTF);
	    add(rowPanel);
	    
	    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
	    label = new Label("프로젝트 내용");
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
	    loadList();
	}

	private void loadForm(int no) {
		Project project = projectDao.selectOne(no);
		if(project == null)
			return;
		titleTF.setText(project.title);
		contentTA.setText(project.contents);
		deleteBtn.setEnabled(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addBtn) {
			Project project = new Project();
			project.title = titleTF.getText();
			project.contents = contentTA.getText();
			project.password = passwordTF.getText();
			projectDao.insert(project);
			loadList();
			cancelBtn.dispatchEvent(new ActionEvent(cancelBtn,
					ActionEvent.ACTION_PERFORMED,null));
		}else if(e.getSource() == cancelBtn) { cleanForm();
		}else if(e.getSource() == deleteBtn) { 
		// 함수로 빼자
		//	int selectedBoardNo = boardLST.getSelectedIndex();
		//	Board board = boardDao.selectOne(selectedBoardNo);
		//	if(!board.password.equals(passwordTF.getText())) {
		//		return;
		//	}
			if(!checkAuth()) {
				JOptionPane.showMessageDialog(null,"암호가 맞지 않습니다.");
				return;
			}
			int answer = JOptionPane.showConfirmDialog(null,"정말 삭제 할거야?",
					"삭제 알림!",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if(answer != JOptionPane.YES_OPTION) return;
		
			projectDao.delete(projectLST.getSelectedIndex());
			cleanForm();
			loadList();
		}
		

	}
	
	private boolean checkAuth() {
		int selectedBoardNo = projectLST.getSelectedIndex();
		Project project = projectDao.selectOne(selectedBoardNo);
		if(!project.password.equals(passwordTF.getText())) {
			return true;
		}
		return false;
	}
	
	private void cleanForm() {
		titleTF.getText();
		titleTF.setText("");
		contentTA.getText();
		contentTA.setText("");
		passwordTF.getText();
		passwordTF.setText("");
		deleteBtn.setEnabled(false);
	}
	private void loadList() {
		projectLST.removeAll();
		List<Project> projects = projectDao.selectList();
		for(Project project: projects) {
			projectLST.add(
					project.title + "," +
					project.writer + "," +
					project.createdDate + "," +
					project.viewCount);
		}
	}
}