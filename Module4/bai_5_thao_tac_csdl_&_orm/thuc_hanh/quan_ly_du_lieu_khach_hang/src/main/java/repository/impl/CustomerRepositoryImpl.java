package repository.impl;

import entity.Customer;

import org.springframework.stereotype.Repository;
import repository.CustomerRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> typedQuery =
                BaseRepository.entityManager.createQuery("select c from customer c", Customer.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Customer customer) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(customer);
        entityTransaction.commit();
//        BaseRepository.entityManager.flush();
//        BaseRepository.entityManager.clear();
    }

    @Override
    public Customer findById(Integer id) {
        return BaseRepository.entityManager.find(Customer.class, id);
//        TypedQuery<Customer> typedQuery =
//                BaseRepository.entityManager.createQuery("select c from customer c where id =:idCustomer", Customer.class);
//        typedQuery.setParameter("idCustomer", id);
//        return typedQuery.getSingleResult();
    }

    @Override
    public void update(Integer id, Customer customer) {

        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(customer);
        entityTransaction.commit();
    }

    @Override
    public void remove(Customer customer) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(customer.getId()));
//        BaseRepository.entityManager.remove( BaseRepository.entityManager.merge(customer));
        entityTransaction.commit();
    }
}
