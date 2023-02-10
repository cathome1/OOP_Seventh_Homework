package controller;

import dto.User;

public interface UserController<E extends User, I> extends Controller<E, I> {
    E findByLastName(String LastName);
}
