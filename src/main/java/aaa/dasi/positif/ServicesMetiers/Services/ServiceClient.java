/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa.dasi.positif.ServicesMetiers.Services;

import aaa.dasi.positif.DAO.ClientDAO;
import aaa.dasi.positif.DAO.JpaUtil;
import aaa.dasi.positif.ServicesMetiers.Modeles.AdressePostale;
import aaa.dasi.positif.ServicesMetiers.Modeles.Client;
import aaa.dasi.positif.ServicesMetiers.Modeles.ProfilAstrologique;
import java.util.Date;
import javax.persistence.EntityManager;

/**
 *
 * @author aelomarial
 */
public class ServiceClient{
    public boolean inscriptionClient(Client client){
        boolean resultat = false;
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        ClientDAO clientDao = new ClientDAO();
        clientDao.persist(client);
        JpaUtil.validerTransaction();
        return resultat;
    }
}
