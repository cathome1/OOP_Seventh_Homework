package repository;

import dto.Teacher;

import java.util.Collection;

public class TeacherRepository implements UserRepository<Teacher, Integer> {

    @Override
    public Teacher save(Teacher entity) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByLastName(String LastName) {
        return null;
    }

    @Override
    public boolean deleteByLastName(String lastName) {
        return false;
    }

    @Override
    public boolean deleteByAgeAndGroupNumber(int age, int groupNumber) {
        return false;
    }

    @Override
    public Collection<Teacher> findAll() {
        return null;
    }
}
