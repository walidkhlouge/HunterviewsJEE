package tn.hunterViews.domain;
// Generated Apr 9, 2017 11:16:58 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity;

/**
 * Skills generated by hbm2java
 */
@Entity
public class Skill  {

	private Integer id;
	private User user;
	private int category;
	private String name;
    private int userid;
	public Skill(Integer id, User user, int category, String name, int userid) {
		super();
		this.id = id;
		this.user = user;
		this.category = category;
		this.name = name;
		this.userid = userid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Skill() {
	}

	public Skill(int category, String name) {
		this.category = category;
		this.name = name;
	}

	public Skill(User user, int category, String name) {
		this.user = user;
		this.category = category;
		this.name = name;
	}

		public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
