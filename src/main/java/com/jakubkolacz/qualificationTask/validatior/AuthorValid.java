package com.jakubkolacz.qualificationTask.validatior;

import com.jakubkolacz.qualificationTask.validatior.impl.AuthorValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AuthorValidator.class)
public @interface AuthorValid {

    String message() default "firstName nor lastName does not starts with 'A' character";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
