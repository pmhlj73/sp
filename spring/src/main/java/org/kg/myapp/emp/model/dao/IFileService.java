package org.kg.myapp.emp.model.dao;

import java.util.List;

import org.kg.myapp.emp.model.vo.FileVO;

public interface IFileService {
	
	void uploadFile(FileVO file);
	FileVO getFile(int fileId);
	void deleteFile(int fileId);
	List<FileVO> getFileList(String directoryName);
	List<FileVO> getAllFileList();
	void updateDirectory(int[] fileIds, String directoryName);
	void updateFile(FileVO file);
	
}
