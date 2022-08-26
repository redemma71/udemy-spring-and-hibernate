package com.chadcover.springdemo.mvc;

import com.chadcover.springdemo.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Person {
    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName;

    @NotNull
    @Min(value=0, message="value must be greater than zero")
    @Max(value=125, message="value must be less than 125")
    private Integer age;

    @NotNull(message="value must be 5 characters or digits, e.g., 21209 or 1A23B")
    @Pattern(regexp="^[0-9A-Za-z]{5}", message="value must be 5 characters or digits, e.g., 21209 or 1A23B")
    private String zipCode;

    //@CourseCode(value="ABC", message="code must begin with ABC")
    @CourseCode()
    public String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
