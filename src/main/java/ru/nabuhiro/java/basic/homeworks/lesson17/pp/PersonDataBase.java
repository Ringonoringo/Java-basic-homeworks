package ru.nabuhiro.java.basic.homeworks.lesson17.pp;

import java.util.Map;
import java.util.HashMap;

public class PersonDataBase {
    private Map<Long, Person> personMap;

    public PersonDataBase() {
        personMap = new HashMap<>();
    }

   public Person findById(Long id) {
        return personMap.get(id);
    }

   public void add(Person person) {
        personMap.put(person.getId(), person);
    }

     public boolean isManager(Person person) {
         if (person == null) return false;
         Position position = person.getPosition();
        switch (position) {
            case MANAGER:
                return true;
            case DIRECTOR:
                return true;
            case DRIVER:
                break;
            case ENGINEER:
                break;
            case SENIOR_MANAGER:
                return true;
            case DEVELOPER:
                break;
            case QA:
                break;
            case JANITOR:
                break;
            case PLUMBER:
                break;
            case BRANCH_DIRECTOR:
                return true;
            case JUNIOR_DEVELOPER:
                break;
            default:
                 throw new IllegalArgumentException("Unsupported operation: " + position);
         }
         return false;
     }

   public boolean isEmployee(Long id) {
       Person person = findById(id);
       if (person == null) return false;
    return !isManager(person);
    }
}
/*
* Реализуйте класс PersonDataBase, содержащий список Person, и имеющий методы, со следующей асимптотической сложностью
* (методы и конструктор класса Person реализовать самостоятельно)

- Person findById(Long id) - найти Person по id - O(1)
- void add(Person person) - добавить Person - O(1)
- isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER
- isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position*/