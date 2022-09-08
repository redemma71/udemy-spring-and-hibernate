package com.chadcover.springdemo;

import javax.persistence.*;

@Entity
@Table(name="instructor")
public class Instructor {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="instructor_detail_id")
    private InstructorDetail instructorDetail;

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private int instructorDetailId;



}
