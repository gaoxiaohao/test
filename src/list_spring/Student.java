package list_spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 高志浩
 * @version 1.0
 */
public class Student {
    private String name;
    private String phone;
    private List<Books> booksList;
    private Map<String,Books> booksMap;
    private Set<Books> booksSet;
    private List<String> booksLists;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    public void setBooksMap(Map<String, Books> booksMap) {
        this.booksMap = booksMap;
    }

    public void setBooksSet(Set<Books> booksSet) {
        this.booksSet = booksSet;
    }

    public void setBooksLists(List<String> booksLists) {
        this.booksLists = booksLists;
    }

    public void toAO(){
        System.out.println("name:"+name+"phone:"+phone+"booksList"+booksList+"booksMap"+booksMap+"booksSet"+booksSet+"booksLists"+booksLists);
    }
}
