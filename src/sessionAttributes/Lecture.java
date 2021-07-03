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
public class Lecture implements Account {

    private static String name;
    
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

    @Override
    public String setHeader() {
        String headerName = getName();
        return headerName;
    }
    
}
