package service;


import dto.Student;
import dto.User;

import java.util.List;

public interface UserService<U extends User> {

    U createUser(U user);

    U findById(Integer id);

    U findByLastName(String lastName);

    boolean deleteByLastName(String lastName);

    boolean deleteByAgeAndGroupNumber(int age, int groupNumber);

    void sortUsers(List<U> users);

    void sortUsersByName(List<U> users);

}
