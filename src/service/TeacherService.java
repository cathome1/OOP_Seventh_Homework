package service;

import dto.Student;
import dto.Teacher;
import dto.comparators.UserComparator;
import repository.TeacherRepository;

import java.util.Collections;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createUser(Teacher user) {
        return teacherRepository.save(user);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByLastName(String lastName) {
        return teacherRepository.findByLastName(lastName);
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
    public void sortUsers(List<Teacher> users) {
        this.sortUsersByName(users);
    }

    @Override
    public void sortUsersByName(List<Teacher> users) {
        Collections.sort(users, new UserComparator());
    }
}
