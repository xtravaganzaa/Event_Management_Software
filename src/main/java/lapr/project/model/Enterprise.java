/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class Enterprise {

    private String name;
    private String email;
    private String address;
    private int taxpayerNumber;
    private int contact;

    /**
     *
     * @param name
     * @param email
     * @param address
     * @param nif
     * @param contact
     */
    public Enterprise(String name, String email, String address, int nif, int contact) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.taxpayerNumber = nif;
        this.contact = contact;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Enterprise:" + name + " Email:" + email + " Address:" + address + " Taxpayer num:" + taxpayerNumber + " Contact:" + contact;
    }

    

}
