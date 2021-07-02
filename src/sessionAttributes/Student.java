/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionAttributes;

/**
 *
 * @author ACER AMD
 */
public class Student {
    
    private static String NIM;
    private static String name;
    private static String email;
    private static String phone;

    /**
     * @return the NIM
     */
    public static String getNIM() {
        return NIM;
    }

    /**
     * @param aNIM the NIM to set
     */
    public static void setNIM(String aNIM) {
        NIM = aNIM;
    }

    /**
     * @return the name
     */
    public static String getName() {
        return name;
    }

    /**
     * @param aName the name to set
     */
    public static void setName(String aName) {
        name = aName;
    }

    /**
     * @return the email
     */
    public static String getEmail() {
        return email;
    }

    /**
     * @param aEmail the email to set
     */
    public static void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * @return the phone
     */
    public static String getPhone() {
        return phone;
    }

    /**
     * @param aPhone the phone to set
     */
    public static void setPhone(String aPhone) {
        phone = aPhone;
    }
    
}
