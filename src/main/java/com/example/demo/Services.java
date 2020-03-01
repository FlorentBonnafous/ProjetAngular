/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import generated.World;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author ssylvest
 */
public class Services {

    String readWorldFromXml() throws JAXBException {

        
        InputStream input = getClass().getClassLoader().getResourceAsStream("world.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(World.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        World world = (World) jaxbUnmarshaller.unmarshal(input);
        
        
        
        world.getLogo();
        world.getMoney();
        world.getName();
        world.getActiveangels();
        world.getAllunlocks();
        world.getAngelbonus();
        world.getLastupdate();
        world.getAngelupgrades();
        world.getManagers();
        world.getProducts();
        world.getScore();
        world.getTotalangels();
        world.getUpgrades();
        System.out.println(world);
        return world.getLogo()+world.getName()+world.getMoney()+world.getActiveangels()+world.getAllunlocks()+world.getAngelbonus()+world.getLastupdate()+world.getAngelupgrades()+world.getManagers()+world.getProducts()+world.getScore()+world.getTotalangels()+world.getUpgrades();
        
    }

    void saveWorldToXml(World world) {

        //OutputStream output = new FileOutputStream(file);

    }
}
