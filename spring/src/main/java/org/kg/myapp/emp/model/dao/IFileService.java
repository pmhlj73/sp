package org.kg.myapp.emp.model.dao;

import org.kg.myapp.emp.model.vo.FileVO;

public interface IFileService {
	
	void uploadFile(FileVO file);
	FileVO getFile(int fileId);
	
}
