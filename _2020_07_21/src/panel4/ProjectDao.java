package panel4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// data�� access �ϴ� Ŭ������ ����
public class ProjectDao {
	ArrayList<Project> list = new ArrayList<Project>();
	
	public ProjectDao() {
		// 1) ������ ������ �����. ���� ���丮�� �����ϴ� ���丮. ��, ������Ʈ ����
		File file = new File("project.dat");
		if(!(file.exists()) && file.isFile()) {
			return;
		}
		try (
			// board.dat ������ ����Ʈ ������ �д� ����
			FileInputStream in = new FileInputStream(file);
			// ����Ʈ �����͸� ��ü�� ����� �����ϴ� ������ ���
			ObjectInputStream in2 = new ObjectInputStream(in);)
		{
		// 2) ������ ������ �ش� ���Ͽ��� �����͸� �о� ArrayList�� �����Ѵ�. 
			Project project = null;
			while(true) {
				project = (Project)in2.readObject();
				list.add(project);
			}
		}
		catch(Exception e) {
			// ������ �дٰ� ������ �߻��Ѵ�.
			// -> ������ ������ ó���� ���� ��� �����Ѵ�.
			// -> �̰��� ���� ó�� ������ �����ϴ� ����
		}
	}
	
	
	void insert(Project project) {
		list.add(project);
		saveToFile();
	}
	
	List<Project> selectList() {
		return list;
	}
	
	Project selectOne(int no) {
		if( no >=0 && no < list.size()) {
			return list.get(no);
		}
		return null;
	}
	int update(Project project) {
		if(project.no > 0 && project.no < list.size()) {
			list.set(project.no, project);
			saveToFile();
			return 1;
		}
		return 0;
	}
	
	int delete(int no) {
		if( no >=0 && no < list.size()) {
			list.remove(no);
			saveToFile();
			return 1;
		}
		return 0;
	}
	
	void saveToFile() {
		File file = new File("project.dat");
		try(FileOutputStream out = new FileOutputStream(file);
				ObjectOutputStream out2 = new ObjectOutputStream(out);
				){
			for(Project project: list) {
				out2.writeObject(project);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
