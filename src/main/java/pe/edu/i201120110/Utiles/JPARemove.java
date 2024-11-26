package pe.edu.i201120110.Utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201120110.domain.Country;

public class JPARemove {
    public static void main(String[] args) {
        //referencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        Country country = em.find(Country.class, "IM1");


        //referencias a un pais
        em.remove(country);
        System.out.println("País y dependencias eliminados correctamente.");


         em.getTransaction().begin();
         em.getTransaction().commit();

            em.close();
            emf.close();

    }
}
