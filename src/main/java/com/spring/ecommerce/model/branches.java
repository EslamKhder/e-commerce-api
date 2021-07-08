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
public class branches extends BaseEntity{
    private int branchid ;
    private int userid ;
    private String name ;
    private String  description ;
    private String  icon ;    
    private String  location  ; 
    private String  link ;
}
