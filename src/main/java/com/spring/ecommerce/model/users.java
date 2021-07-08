
package com.spring.ecommerce.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 *
 * @author Ahmed E. Rizk
 */
@Data
@Entity
public class users extends BaseEntity {
     private int userid ;
     private String phone  ;
     private int  favoriteorder ;
}
