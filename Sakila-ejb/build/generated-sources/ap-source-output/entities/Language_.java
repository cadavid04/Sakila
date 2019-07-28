package entities;

import entities.Film;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-27T23:22:15")
@StaticMetamodel(Language.class)
public class Language_ { 

    public static volatile SingularAttribute<Language, Date> lastUpdate;
    public static volatile CollectionAttribute<Language, Film> filmCollection;
    public static volatile SingularAttribute<Language, Short> languageId;
    public static volatile SingularAttribute<Language, String> name;
    public static volatile CollectionAttribute<Language, Film> filmCollection1;

}