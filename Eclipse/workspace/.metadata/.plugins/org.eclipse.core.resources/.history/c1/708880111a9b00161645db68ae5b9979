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
		// 경로가 없으면 만들어줘라.
		if(!dir.exists()) {
			// mkdir()은 폴더가 없으면 만들어 주는 것.
			// mkdirs()는 하위 폴더까지 없으면 만들어 주는 것.
			dir.mkdirs();
		}
	}
	public String saveFile(File file, String basePath, String fileName) throws IOException {
		// 파일 객체가 null이면 null을 반환한다. 
		if(file == null) {
			return null;
		}
		
		makeBasePath(basePath);
		// 유닉스, 윈도우즈 경로가 다르기 때문에
		// 운영체제의 기본 경로 타입을 가져오는 설정.
		// System.getProperty("file.separator")
		String serverFullPath = basePath + System.getProperty("file.separator") + fileName;
		// FileInputStream fis = new FileInputStream(file);
		// FileOutputStream fos = new FileOutputStream(serverFullPath);
		// 이미지가 임시로 저장되는 폴더 ex) temp
		// 에서 지정한 폴더로 이미지를 복사 *****
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
