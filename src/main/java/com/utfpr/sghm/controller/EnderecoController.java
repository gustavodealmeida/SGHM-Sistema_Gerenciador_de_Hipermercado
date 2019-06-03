package com.utfpr.sghm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.utfpr.sghm.entidades.Endereco;


/* Classe para a implemtnação do CRUD no banco de dados
    C - create
    R - Read
    U - Update
    D - delete
*/

public class EnderecoController {
    public EntityManager getEM() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sghm");
        return emf.createEntityManager();
    }

    // Funcao para inserir a informação no banco de dados
    public void create(Endereco endereco) {
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();
            em.persist(endereco); // Executa insert no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

    public void update(Endereco endereco) throws Exception{
        EntityManager em = this.getEM();

        try {
            em.getTransaction().begin();

            if(!em.contains(endereco)){
                em.merge(endereco); // Executa atualização no banco de dados
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
    public Endereco read(int id){
        EntityManager em = this.getEM();
        Endereco end = null;

        try {
            em.getTransaction().begin();
            end = em.find(Endereco.class, id); // Executa a procura por ID no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }

        return end;
    }

    //Método de leitura que retorna todas as informações cadastradas
    public List<Endereco> read(){
        EntityManager em = this.getEM();
        List <Endereco> endLista = null;
        Query findAll = em.createQuery("FROM " + Endereco.class.getName());

        try {
            em.getTransaction().begin();
            endLista = findAll.getResultList(); // Executa a procura de todos elementos cadastrados no banco de dados
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }

        return endLista;
    }

    // funcao para remover
    public void delete(int id) {
        EntityManager em = this.getEM();

        Endereco end = em.find(Endereco.class, id);

        try {
            em.getTransaction().begin();
            em.remove(end); // Executa a remoção por id
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        } finally {
            em.close();
        }
    }

}