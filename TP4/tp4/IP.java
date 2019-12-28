/**
 * 
 */
package tp4;

/**
 * @author edwin
 *
 */
public class IP {

    // VARIABLES D'INSTANCE
    private String o1;
    private String o2;
    private String o3;
    private String o4;

    //GETTERS & SETTERS
    public void setO1(String o){
        this.o1 = o;
    }

    public void setO2(String o){
        this.o2 = o;
    }

    public void setO3(String o){
        this.o3 = o;
    }

    public void setO4(String o){
        this.o4 = o;
    }

    public String getO1(){
        return this.o1;
    }

    public String getO2(){
        return this.o2;
    }

    public String getO3(){
        return this.o3;
    }

    public String getO4(){
        return this.o4;
    }

    //CONSTRUCTEUR
    public IP(String o1, String o2, String o3, String o4){
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
    }

    //MMETHODES
    public String toString(){
        return this.o1 + "." + this.o2 +"." + this.o3 + "." + this.o4; 
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
	IP ipv4 = new IP(args[0], args[1], args[2], args[3]);

	System.out.println(ipv4.toString());
    }

}
