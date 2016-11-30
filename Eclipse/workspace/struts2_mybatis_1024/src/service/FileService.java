package service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileService {
	public void makeBasePath(String path) {
		File dir = new File(path);
		// ��ΰ� ������ ��������.
		if(!dir.exists()) {
			// mkdir()�� ������ ������ ����� �ִ� ��.
			// mkdirs()�� ���� �������� ������ ����� �ִ� ��.
			dir.mkdirs();
		}
	}
	public String saveFile(File file, String basePath, String fileName) throws IOException {
		// ���� ��ü�� null�̸� null�� ��ȯ�Ѵ�. 
		if(file == null) {
			return null;
		}
		
		makeBasePath(basePath);
		// ���н�, �������� ��ΰ� �ٸ��� ������
		// �ü���� �⺻ ��� Ÿ���� �������� ����.
		// System.getProperty("file.separator")
		String serverFullPath = basePath + System.getProperty("file.separator") + fileName;
		// FileInputStream fis = new FileInputStream(file);
		// FileOutputStream fos = new FileOutputStream(serverFullPath);
		// �̹����� �ӽ÷� ����Ǵ� ���� ex) temp
		// ���� ������ ������ �̹����� ���� *****
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(serverFullPath));
		int readSize = 0;
		while((readSize = bis.read()) != -1) {
			bos.write(readSize);
		}
		bis.close();
		bos.close();
		// fos.close();
		// fis.close();
		
		return  serverFullPath;
	}
}
