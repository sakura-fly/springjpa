package springjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import net.sf.json.JSONObject;

@Entity
@Table(name = "user")
public class UserModel {

	@Id
	private int id;
	@Column(name = "user_name")
	private String userName;
	private String pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		JSONObject r = new JSONObject();
		r.put("userName", userName);
		r.put("pwd", pwd);
		return r.toString();
	}
	
}
