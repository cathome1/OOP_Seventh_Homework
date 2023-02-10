package dto.iterators;

import dto.Student;
import dto.StudentGroup;

import java.util.List;
import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return cursor < students.size();
    }

    @Override
    public Student next() {
        return students.get(cursor++);
    }

    @Override
    public void remove() {
        this.students.remove(cursor);
    }
}
