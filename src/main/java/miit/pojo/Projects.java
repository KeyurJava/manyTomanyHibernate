package miit.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {

	@Id
	private int pid;
	private String pname;

	@ManyToMany(mappedBy = "projects")
	List<Employees> elist;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employees> getElist() {
		return elist;
	}

	public void setElist(List<Employees> elist) {
		this.elist = elist;
	}

}
