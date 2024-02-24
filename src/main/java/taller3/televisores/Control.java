package taller3.televisores;

public class Control {
    private TV tv;

    //public Control(TV tv){
        //this.tv = tv;
    //}

    public void setTv(TV tv){
        this.tv = tv;
    }

    public TV getTv(){
        return this.tv;
    }

    //Métodos de estado
    public void turnOn(){
        this.tv.turnOn();
    }

    public void turnOff(){
        this.tv.turnOff();
    }

    //Métodos de canal
    public void canalUp(){
        this.tv.canalUp();
    }

    public void canalDown(){
        this.tv.canalDown();
    }

    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }

    //Métodos de volumen
    public void volumenUp(){
        this.tv.volumenUp();
    }

    public void volumenDown(){
        this.tv.volumenDown();
    }

    public void setVolumen(int volumen){
        this.tv.setVolumen(volumen);
    }

    //Enlazar
    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.setControl(this);
    }
}
