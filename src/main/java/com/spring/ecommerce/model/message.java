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
public class message extends BaseEntity{
   private int messageid ;
    private int userid ;
    private int chatid ;
     private String mestype ;
   
  
}
