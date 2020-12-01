package org.kg.myapp.emp.model.vo;

public class LoginMemberVO {

	private int userIndex;
	private String userId;
	private String userPassword;
	private String userName;
	private int fileId;
	public int getUserIndex() {
		return userIndex;
	}
	public void setUserIndex(int userIndex) {
		this.userIndex = userIndex;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	@Override
	public String toString() {
		return "LoginMemberVO [userIndex=" + userIndex + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userName=" + userName + ", fileId=" + fileId + "]";
	}
	
	
	
}
