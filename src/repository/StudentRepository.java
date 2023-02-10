package repository;

import db.StudentTable;
import dto.Student;

import java.util.Collection;

public class StudentRepository implements UserRepository<Student, Integer> {

    private final StudentTable studentTable;

    public StudentRepository() {
        this.studentTable = new StudentTable();
    }

    @Override
    public Student save(Student entity) {
        return studentTable.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByLastName(String LastName) {
        return null;
    }

    @Override
    public boolean deleteByLastName(String lastName) {
        return studentTable.deleteByFio(lastName);
    }

    @Override
    public boolean deleteByAgeAndGroupNumber(int age, int groupNumber) {
        return studentTable.deleteByFio(age, groupNumber);
    }

    @Override
    public Collection<Student> findAll() {
        return studentTable.getElements();
    }
}
