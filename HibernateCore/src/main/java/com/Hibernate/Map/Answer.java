package com.Hibernate.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer_MANY2ONE")
public class Answer {

	
	@Id
	private int answer_id;
	private String answer;
	
	
	//For Many to One keep only single of the one Entity. In this Case Question
	@ManyToOne
	private Question question;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int answer_id, String answer) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", answer=" + answer + "]";
	}
	
	
}
