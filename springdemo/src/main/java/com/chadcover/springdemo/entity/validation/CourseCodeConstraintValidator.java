package com.chadcover.springdemo.entity.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
        implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    public void initialize(CourseCode courseCodes) {
        coursePrefixes = courseCodes.value();
    }

    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = false;
        if (code != null) {
            for (String coursePrefix: coursePrefixes) {
                result = code.startsWith(coursePrefix);
                if (result) {
                    break;
                }
            }
        } else {
            // if null, default prefix is set to "CDC' in CourseCode
            result = true;
        }
        return result;
    }

}
