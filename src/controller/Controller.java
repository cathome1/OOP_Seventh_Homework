package controller;

public interface Controller<E, I> {
    E create(E entity);

    E findById(I id);
}
