package it.tinkergarage.studentexams.rest;

import java.net.URL;

public class ExamAPI extends RestClient {
	private static final String GET_ALL_EXAMS = "http://students-exam.herokuapp.com/api/exam/?format=json";
	private static final String GET_EXAM = "http://students-exam.herokuapp.com/api/exam/{id}/?format=json";
	
	/* API calls */
	public String getExams() {
		String response;
		try {
			URL url = new URL(ExamAPI.GET_ALL_EXAMS);
			response = getMethod(url);
		} catch (Exception e) {
			response = e.getMessage();
		}
		return response;
	}
	
	public String getExam(int id) {
		String response;
		try {
			URL url = new URL(ExamAPI.GET_EXAM.replace("{id}", String.valueOf(id)));
			response = getMethod(url);
		} catch (Exception e) {
			response = e.getMessage();
		}
		return response;
	}
}
