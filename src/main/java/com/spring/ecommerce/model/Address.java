/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.ecommerce.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 *
 * @author Ahmed E. Rizk
 */
@Data
@Entity
public class Address extends BaseEntity{
    private int addressid ;
    private int userid ;
    private String  description ;

}
//