/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Bean.Member_card;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;


@Stateless
public class MemberCardManager {
    @PersistenceContext
    EntityManager em;
    
    public Member_card getMemBercode(String mem_barcode){
        System.out.println("getMemBarcode");
        Member_card m = null;
        System.out.println(1);
        TypedQuery query = em.createNamedQuery(Member_card.Comemem, Member_card.class);
        query.setParameter(1,mem_barcode);
        m = (Member_card)query.getSingleResult();
        System.out.println(2);
        System.out.println(m.getMember_no());
        System.out.println(m.getMem_barcode());
        System.out.println(m.getDel_flg());
        System.out.println(m.getIssue_date());
        System.out.println(3);
        
        return m;
    }
}
