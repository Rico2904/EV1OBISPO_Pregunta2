package pe.edu.i201120110.Utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201120110.domain.City;
import pe.edu.i201120110.domain.Country;
import pe.edu.i201120110.domain.CountryLanguage;

public class JPAPersist {

    public static void main(String[] args) {

        // referncias
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();


            // Iniciar transacción
            em.getTransaction().begin();

            // Crear un país imaginario
                 Country country = new Country("IM1", "Namek", "Asia", "Asia", 500000.0,
                2000, 1000000, 75.5, 150000.0, 145000.0,
                "Terra", "Democratic", "Picoro", 1, "IM");

            // Crear 3 ciudades
            City city1 = new City(4080, "Veyita", "IM1", "D1", 500000);
            City city2 = new City(4081, "Kaio", "IM1", "D2", 300000);
            City city3 = new City(4082, "Sufuru", "IM1", "D3", 200000);

            // lenguas nativas
            CountryLanguage language1 = new CountryLanguage("IM1", "Namesiano", "T", 80.0); // Official language
            CountryLanguage language2 = new CountryLanguage("IM1", "Sayan", "F", 20.0); // Not official language

            em.persist(country);
            em.persist(city1);
            em.persist(city2);
            em.persist(city3);
            em.persist(language1);
            em.persist(language2);
            em.getTransaction().commit();

            System.out.println("Realizado correctamente.");

            // cerrar
            em.close();
            emf.close();
    }
}
