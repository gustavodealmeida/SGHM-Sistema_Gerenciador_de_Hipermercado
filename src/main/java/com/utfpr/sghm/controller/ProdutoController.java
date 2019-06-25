package com.utfpr.sghm.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.utfpr.sghm.entidades.Produto;

public class ProdutoController {

    public EntityManager getEM() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sghm");
        return emf.createEntityManager();
    }

    // Funcao para inserir a informação no banco de dados
    public void create(Produto prod) {
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();
            em.persist(prod); // Executa insert no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

    public void update(Produto prod) throws Exception{
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();

            if(!em.contains(prod)){
                em.persist(prod); // Executa atualização no banco de dados
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
    public Produto consultaPorID(String cod_barras){
        EntityManager em = this.getEM();
        Produto prod = null;

        try {
            em.getTransaction().begin();
            prod = em.find(Produto.class, cod_barras); // Executa atualização no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }

        return prod;
    }

    // funcao para remover
    public void delete(String cod_barras) {
        EntityManager em = this.getEM();

        Produto prod = em.find(Produto.class, cod_barras);

        try {
            em.getTransaction().begin();
            em.remove(prod); // Executa a remoção por id
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

}