package com.ikea.spring.auditing.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class InputRequest<T> {
	@JsonProperty(value = "userId", required = true)
	private String loggedInUser;
	/**
	 * @return the loggedInUser
	 */
	public String getLoggedInUser() {
		return loggedInUser;
	}
	/**
	 * @param loggedInUser the loggedInUser to set
	 */
	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}
	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	/**
	 * @return the employee
	 */
	public T getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(T employee) {
		this.employee = employee;
	}
	private String timeZone;
	private T employee;
}
