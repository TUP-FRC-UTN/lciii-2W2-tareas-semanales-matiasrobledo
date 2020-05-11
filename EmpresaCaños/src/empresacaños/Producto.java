package empresacaños;

public class Producto {
    
    public String descripcion;
    public Material[] materiales;
    
    public String getDescripcion()
            {return descripcion;}
    public void setDescripcion(String descripcion)
            {this.descripcion=descripcion;}
    
    public Material[] getMaterial()
            {return materiales;}
    public void setMaterial(Material[] material)
            {this.materiales=material;}
    
    public Producto(){}
    
    public Producto(String descripcion, Material[] material)
            {this.descripcion=descripcion;
            this.materiales=material;}
    
    public Producto(int cantidad){
        materiales=new Material[cantidad];
    }
    
    public void agregarMaterial(Material m){
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = m;
                break;
            }            
        }
    }
    
    public double costoTotalMateriales(){
        double suma = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                suma += materiales[i].getValorUnitario();
            }            
        }
        return suma;
    }
    
    public boolean esDelProducto(int codigo){
        boolean b = false;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null && codigo == materiales[i].getCodigo()){
                b = true;
                break;
            }            
        }
        return b;
    }
    
    public Material[] menorMateriales(int valor){
        Material[] m = null;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getValorUnitario() < valor) {
                m = new Material[i];
            }            
        }
        return m;
    }
    
    public double[] cantidadMaterialesXPrecio(){
        double c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        double[] mat = new double[4];
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                if (materiales[i].getValorUnitario() > 0 && materiales[i].getValorUnitario() <= 10) {
                    c1++;
                }
                if (materiales[i].getValorUnitario() > 10 && materiales[i].getValorUnitario() <= 20) {
                    c2++;
                }
                if (materiales[i].getValorUnitario() > 20 && materiales[i].getValorUnitario() <= 30) {
                    c3++;
                }
                if (materiales[i].getValorUnitario() > 30) {
                    c4++;
                }
            }            
        }
        mat[0] = c1;
        mat[1] = c2;
        mat[2] = c3; 
        mat[3] = c4;
        return mat;
    }
}