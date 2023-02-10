package repository;

import dto.User;

import java.util.Collection;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByLastName(String lastName);

    boolean deleteByLastName(String lastName);

    boolean deleteByAgeAndGroupNumber(int age, int groupNumber);

    Collection<E> findAll();
}
