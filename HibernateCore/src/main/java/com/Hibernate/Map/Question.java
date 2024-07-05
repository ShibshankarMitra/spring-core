package com.Hibernate.Map;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="question_ONE2MANY")
public class Question {

	
	@Id
	private int question_id;
	private String question;
	
	//For one to one mapping we inject one answer type entity inside question
	//@OneToOne
	//private Answer answer;
	
	
	//For one to many mapping we inject many answers(List<Answer>) inside the Question
	//Cascade has been used Above Answers//to make sure that While we create Question Entities Answer entities get created automatically
	//Mapped by question means(Mapped by Question question of Answer Entity) It will not create a seperate field for the answers inside Question Entity
	@OneToMany (mappedBy = "question", cascade = CascadeType.ALL)
	private List<Answer> answers;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public Question(int question_id, String question, List<Answer> answers) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answers = answers;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question=" + question + ", answers=" + answers + "]";
	}
	
	
	
	
}
