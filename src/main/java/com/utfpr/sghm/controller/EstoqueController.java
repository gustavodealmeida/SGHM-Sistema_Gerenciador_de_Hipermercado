package com.utfpr.sghm.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.utfpr.sghm.entidades.Estoque;

public class EstoqueController {

    public EntityManager getEM() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sghm");
        return emf.createEntityManager();
    }

    // Funcao para inserir a informação no banco de dados
    public void create(Estoque est) {
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();
            em.persist(est); // Executa insert no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

    public void update(Estoque est) throws Exception{
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();

            if(!em.contains(est)){
                em.persist(est); // Executa atualização no banco de dados
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

    // funcao para ler uma informação
    // primeiramente vai ser implementado uma função para pesquisar por id
    public Estoque consultaPorID(int id){
        EntityManager em = this.getEM();
        Estoque est = null;

        try {
            em.getTransaction().begin();
            est = em.find(Estoque.class, id); // Executa atualização no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }

        return est;
    }

    // funcao para remover
    public void delete(int id) {
        EntityManager em = this.getEM();

        Estoque est = em.find(Estoque.class, id);

        try {
            em.getTransaction().begin();
            em.remove(est); // Executa a remoção por id
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

}