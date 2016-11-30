package service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileService {
	public void makeBasePath(String path) {
		//makeBasePath �� ��ΰ� ������ ����� �ִ� �޼���
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}//�˻������� dir�� ������ ������.
	}
	public String saveFile(File file, String basePath, String fileName) throws Exception {
		if (file == null) {
			return null;
		}
		makeBasePath(basePath);
		//���н�,����� ��ΰ� Ʋ���� ������
		//�ü���� �⺻ ��� Ÿ���� �������� ����
		//System.getProperty("file.separator")
		String serverFullPath = basePath + System.getProperty("file.separator") + fileName;
		//FileInputStream fis = new FileInputStream(file);
		//FileOutputStream fos = new FileOutputStream(serverFullPath);
		//�̹����� �ӽ÷� ����Ǵ� ���� ex) temp
		//���� ������ ������ �̹����� ����!!!!!!****
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(serverFullPath));
		
		int readSize = 0;
		while ((readSize = bis.read()) != -1) {
			bos.write(readSize);
		}
		bis.close();
		bos.close();
		//fos.close();
		//fis.close();
		return serverFullPath;
	}
}
