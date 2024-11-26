package pe.edu.i201120110.Utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201120110.domain.City;
import pe.edu.i201120110.domain.Country;

import java.util.List;

public class JPAFind {
    public static void main(String[] args) {
        // Referencias
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // Buscar el país con código "PER"
        Country peru = em.find(Country.class, "PER");

        if (peru != null) {
            // las ciudades asociadas al país "PER"
            List<City> cities = peru.getCities();

            // mayor a 700,000 usando lambda
            cities.stream()
                    .filter(city -> city.getPopulation() > 700000)
                    .forEach(city -> System.out.println("Ciudad: " + city.getName() + ", Población: " + city.getPopulation()));
        } else {
            System.out.println("error");
        }

        // Cerrar el EntityManager y EntityManagerFactory
        em.close();
        emf.close();
    }
}
