package action;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownAction extends ActionSupport {
	private String basePath, fileName;
	private String contentType, contentDisposition;
	private long contentLength;
	private String inputName, bufferSize;
	private FileInputStream input;

	public String execute() throws Exception {
		String basePath = getText("file.path");
		String path = basePath + "/" + fileName; // ���� ��� ����
		File f = new File(path);
		// ����� ���̸� ����
		setContentLength(f.length());
		// Ŭ���̾�Ʈ�κ��� ���۵� �� ���ڵ��� ����� �Ѵ�.
		// �ѱ�ó���� ���ֱ� ���ؼ� �ݵ�� �ؾ��Ѵ�.
		setContentDisposition("attachment;" + "filename=" + URLEncoder.encode(fileName, "utf-8"));
		input = new FileInputStream(path);
		return SUCCESS;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	public void setContentDisposition(String contentDisposition) {
		this.contentDisposition = contentDisposition;
	}

	public long getContentLength() {
		return contentLength;
	}

	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String getBufferSize() {
		return bufferSize;
	}

	public void setBufferSize(String bufferSize) {
		this.bufferSize = bufferSize;
	}

	public FileInputStream getInput() {
		return input;
	}

	public void setInput(FileInputStream input) {
		this.input = input;
	}

}