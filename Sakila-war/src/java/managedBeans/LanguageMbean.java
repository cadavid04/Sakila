/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;


import entities.Language;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import seassion.LanguageManager;

/**
 *
 * @author itmanager
 */
@Named(value = "languageMbean")
@SessionScoped
public class LanguageMbean implements Serializable {

     @EJB
    private LanguageManager languageManager;
    private Language language;
    private List <Language> languages;

    /**
     * Creates a new instance of FilmMbean
     */
    public LanguageMbean() {
    }
    
    public List <Language>getLanguages (){
        if((languages == null) || (languages.isEmpty())) refresh();
       return languages; 
    }
    
    private void refresh() {
        languages = languageManager.getAllLanguages();
    }
     
    public Language getDetails(){
        return language;
    }
    
    public String ShowDetails (Language language){
        this.language = language;
        return "LanguageDetails";
    }
    
    public String update (){
        System.out.println("###UPDATE###");
        language = languageManager.update(language);
        return "LanguageList";
        }
    
    public String delete (){
        System.out.println("###UPDATE###");
        this.languageManager.delete(language);
        return "LanguageList";
        }
    public String list (){
        System.out.println("###LIST###");
        return "LanguageList";
    }

}
