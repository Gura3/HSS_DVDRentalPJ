/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Gura3
 */
@Named
@RequestScoped

/* 貸出会員スキャンバッキングビーン */
public class MemberScanCompleteBb {
    private String memberno;            //会員No
    private String birthday;            //生年月日
    private String name;                //氏名
    private String kana;                //会員名(フリガナ)
    private String sex;                 //性別
    private String postal;              //郵便番号
    private String address;             //住所
    private String phone;               //電話番号
    private String occupation;          //職業
    private String mail_address;        //メールアドレス
    private String mail_magazine;       //メールマガジン
    private String registararion_date;  //仮会員登録日
    
    public String next(){
        return "/pages/kashidashi/memberScan";
    }
}
