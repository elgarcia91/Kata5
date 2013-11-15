/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

/**
 *
 * @author usuario
 */
class Mail {
    private String address;
    
    public Mail (String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public String getDomain() {
        return address.split("@")[1];
    }
}
