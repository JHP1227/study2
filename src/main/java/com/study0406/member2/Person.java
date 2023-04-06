package com.study0406.member2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class Person {

    @Id
    private String I_EMPNO;
    private String N_HNAME;
    private String UID;
    private String EMP_PASS;
    
    public String getI_EMPNO() {
        return I_EMPNO;
    }
    public void setI_EMPNO(String i_EMPNO) {
        I_EMPNO = i_EMPNO;
    }
    public String getN_HNAME() {
        return N_HNAME;
    }
    public void setN_HNAME(String n_HNAME) {
        N_HNAME = n_HNAME;
    }
    public String getUID() {
        return UID;
    }
    public void setUID(String uID) {
        UID = uID;
    }
    public String getEMP_PASS() {
        return EMP_PASS;
    }
    public void setEMP_PASS(String eMP_PASS) {
        EMP_PASS = eMP_PASS;
    }
    @Override
    public String toString() {
        return "Person [I_EMPNO=" + I_EMPNO + ", N_HNAME=" + N_HNAME + ", UID=" + UID + ", EMP_PASS=" + EMP_PASS + "]";
    }

}
