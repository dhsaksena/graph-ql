package com.sample.graphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sample.graphql.modal.Student;
import com.sample.graphql.service.StudentService;

@Component
public class StudentMutationResolver implements GraphQLMutationResolver
{
    @Autowired
    private StudentService studentService;

    public Student createStudent (Student student) {
        return studentService.createStudentRecord(student);
    }
}