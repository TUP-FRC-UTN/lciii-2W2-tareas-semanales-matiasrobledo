package empresacaños;

public class Material {
    
    public String descripcion;
    public int codigo;
    public float valorUnitario;
    
    public String getDescripcion()
            {return descripcion;}
    public void setDescripcion(String descripcion)
            {this.descripcion = descripcion;}
    
    public int getCodigo()
            {return codigo;}
    public void setCodigo(int codigo)
            {this.codigo=codigo;}
    
    public float getValorUnitario()
            {return valorUnitario;}
    public void setValorUnitario(float valorUnitario)
            {this.valorUnitario=valorUnitario;}
    
    public Material(){}
    
    public Material(String descripcion, int codigo, float valorUnitario)
            {
            this.descripcion=descripcion;
            this.codigo=codigo;
            this.valorUnitario=valorUnitario;}
}
