package com.utfpr.sghm.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.utfpr.sghm.entidades.Fornecedor;

/* Classe para a implemtnação do CRUD no banco de dados
    C - create
    R - Read
    U - Update
    D - delete
*/

public class FornecedorController {
    public EntityManager getEM() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sghm");
        return emf.createEntityManager();
    }

    //CREATE
    public void create(Fornecedor fornecedor) {
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();
            em.persist(fornecedor); // Executa insert no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

    //READ
    public Fornecedor consultaPorCNPJ(String cnpj){
        EntityManager em = this.getEM();
        Fornecedor forn = null;
        		
        try {
            em.getTransaction().begin();
            forn = em.find(Fornecedor.class, cnpj); // Executa atualização no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }

        return forn;
    }
    
    //UPDATE
    public void update(Fornecedor fornecedor) throws Exception{
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();

            if(!em.contains(fornecedor)){
                em.persist(fornecedor); // Executa atualização no banco de dados
            }else{
                throw new Exception("Erro ao atualizar");
            }
            
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

    //DELETE
    public void delete(String cnpj) {
        EntityManager em = this.getEM();

        Fornecedor forn = em.find(Fornecedor.class, cnpj);

        try {
            em.getTransaction().begin();
            em.remove(forn); // Executa a remoção por cnpj
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

}