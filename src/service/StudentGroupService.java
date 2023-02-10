package service;


import dto.StudentGroup;

public interface StudentGroupService {

    StudentGroup getGroup(int number);

    StudentGroup getGroup();

    void removeStudent(String fio);

    void sortStudents(StudentGroup studentGroup);
}
