public class television {
    //marca de la television
    private String marca;
    //nivel de volumen de la television
    private int volumen;
    //si esta la television encendida o apagada
    private boolean teleEncendida;

    public television(String marcaTV, int volumenTV){
        marca = marcaTV;
        volumen = volumenTV;
        teleEncendida = true;
    }

    public String getMarca(){
        return marca;
    }

    public int getVolumen(){
        return volumen;
    }

    public boolean getEncendida(){
        return teleEncendida;
    }

    public void setMarca(String newMarca){
        marca = newMarca;
    }

    public void setSubirVolumen(int subirVolumen){
        volumen += subirVolumen;
    }

    public void botonApagarEncender(){

        if(teleEncendida == true){

            teleEncendida = false;
        }
        else{
            teleEncendida = true;
        }

    }

    public void infoTV(){
        System.out.println("La marca de la television es " + marca + "|" + "Tiene " + volumen + " de volumen");
        if(teleEncendida == true){
            System.out.println("La television si est� encendida");
        }
        else {
            System.out.println("La television est� apagada" );
        }
    }

    public String estadoTV(){
        String estado; 
        if(teleEncendida == true){
            estado = ("encendida");
        }
        else{
            estado = ("apagada");
        }
        return estado;
    }
}