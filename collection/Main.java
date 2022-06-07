package collection;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import java.util.Set;


public class Main {

    
    public static void main(String[] args) {
    //list goes by proper order index
    List<String> todos = new LinkedList<>();
    //set is unordered but stores only unique element, no duplicates
    Set<String> pokemon = new HashSet<>();
    

    todos.add("eat");
    todos.add("sleep");
    todos.add("shit");
    todos.add("eat");
    for(String item: todos){
        System.out.println(item);
    }
    pokemon.add("pikachu");
    pokemon.add("charmander");
    pokemon.add("squirtle");
    pokemon.add("charmander");
    pokemon.add("charmander");
    pokemon.add("bulbasaur");
    for(String poke: pokemon){
        System.out.println(poke);
    }

    //Map<String,NoteBook> noteBook = new HashMap<>();

    /*for(String n:todos){

        NoteBook todo = new NoteBook(n);
        noteBook.put(todo.getThings(), todo);
        String str = noteBook.toString();
        System.out.println(str);
    */
    

     
    }
    
}
