
package desings.metodos;

public class MetodosPila {
    
    private String ar[];
    private int cima;
    private int tamaño;
    
    public MetodosPila(int t) {
        this.tamaño=t;
        this.cima = 0;
        this.ar=new String[tamaño];
    }

    public String[] getAr() {
        return ar;
    }

    public int getCima() {
        return cima;
    }

    public void setAr(String[] ar) {
        this.ar = ar;
    }

    public void setCima(int Cima) {
        this.cima = Cima;
    }


    public void insertar(String dato){
        if (cima<tamaño) {
            ar[cima]=dato;
            cima++;
        }
    }
    
    public boolean eliminar(){
        if(cima>0){
        ar[cima-1]=null;
        cima--;
        return true;
        }
        return false;
        }
    
    public String mostrar(){
        String text="";
        
        for (int i = 0; i < ar.length; i++) {
        
             text+="["+ar[i]+"] ";   
            
        }
        
        return text;
    }
    
}
