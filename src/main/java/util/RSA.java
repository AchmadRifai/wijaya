/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author ai
 */
public class RSA {
    private File pri,pub;

    public RSA(File pri, File pub) throws GeneralSecurityException, IOException {
        this.pri = pri;
        this.pub = pub;
        if(!pri.exists()&&!pub.exists())createKey();
    }

    private void createKey() throws GeneralSecurityException, IOException{
        java.security.KeyPairGenerator kpg=java.security.KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2101);
        java.security.KeyPair kp=kpg.genKeyPair();
        savePri(kp.getPrivate());
        savePub(kp.getPublic());
    }

    private void savePub(PublicKey k) throws IOException {
        if(!pub.getParentFile().exists())pub.getParentFile().mkdirs();
        java.io.ObjectOutputStream o=new java.io.ObjectOutputStream(new java.io.FileOutputStream(pub));
        o.writeObject(k);
        o.close();
    }

    private void savePri(PrivateKey k) throws IOException {
        if(!pri.getParentFile().exists())pri.getParentFile().mkdirs();
        java.io.ObjectOutputStream o=new java.io.ObjectOutputStream(new java.io.FileOutputStream(pri));
        o.writeObject(k);
        o.close();
    }

    public byte[]encrypt(String pt)throws GeneralSecurityException, IOException, ClassNotFoundException{
        javax.crypto.Cipher c=javax.crypto.Cipher.getInstance("RSA");
        PublicKey k=loadPub();
        c.init(javax.crypto.Cipher.ENCRYPT_MODE, k);
        return c.doFinal(pt.getBytes());
    }

    public String decrypt(byte[]e)throws GeneralSecurityException, IOException, ClassNotFoundException{
        javax.crypto.Cipher c=javax.crypto.Cipher.getInstance("RSA");
        PrivateKey k=loadPri();
        c.init(javax.crypto.Cipher.DECRYPT_MODE, k);
        return new String(c.doFinal(e));
    }

    private PublicKey loadPub() throws IOException, ClassNotFoundException {
        java.io.ObjectInputStream i=new java.io.ObjectInputStream(new java.io.FileInputStream(pub));
        PublicKey k=(PublicKey) i.readObject();
        i.close();
        return k;
    }

    private PrivateKey loadPri() throws IOException, ClassNotFoundException {
        java.io.ObjectInputStream i=new java.io.ObjectInputStream(new java.io.FileInputStream(pri));
        PrivateKey k=(PrivateKey) i.readObject();
        i.close();
        return k;
    }
}