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
        String info;
        if(teleEncendida == true){
            info = ("la television si está encendida");
        }
        else {
            info = ("la television está apagada" );
        }
        System.out.println("La marca de la television es " + marca + " |" + " Tiene " + volumen + " de volumen" + " |" + info);
    }

    public String estadoTV(){
        String estado;
        estado = ("La marca de la television es " + marca + " |" + " Tiene " + volumen + "de volumen | ");
        if(teleEncendida == true){
            estado += ("La television esta encendida");
        }
        else{
            estado += ("La television esta apagada");
        }
        return estado;
    }
}