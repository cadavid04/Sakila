/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import entities.Film;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import seassion.FilmManager;

/**
 *
 * @author itmanager
 */
@Named(value = "filmMbean")
@SessionScoped
public class FilmMbean implements Serializable {

    
    @EJB
    private FilmManager filmManager;
    private Film film;
    private List <Film> films;

    /**
     * Creates a new instance of FilmMbean
     */
    public FilmMbean() {
    }
    
    public List <Film>getFilms (){
        if((films == null) || (films.isEmpty())) refresh();
       return films; 
    }
    
    private void refresh() {
        films = filmManager.getAllFilms();
    }
    
    
    
    public Film getDetails(){
        return film;
    }
    
    public String ShowDetails (Film film){
        this.film = film;
        return "FilmDetails";
    }
    
    public String update (){
        System.out.println("###UPDATE###");
        film = filmManager.update(film);
        return "FilmList";
        }
    public String list (){
        System.out.println("###LIST###");
        return "FilmList";
    }

}
