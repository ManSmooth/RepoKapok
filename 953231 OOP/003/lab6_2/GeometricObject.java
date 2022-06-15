//642115003 Kan Katpark

import java.util.Date;

class GeometricObject {

    private String color ;
    private boolean filled ;
    private Date dateCreated ;

    public GeometricObject(){
        this.color = "none" ;
        this.filled = false ;
        Date date= new Date(System.currentTimeMillis());  
        this.dateCreated = date ;
    }

    public GeometricObject(String color , boolean filled){
        this.color = color ;
        this.filled = filled ;
        Date date= new Date(System.currentTimeMillis());  
        this.dateCreated = date ;
    }

    public String getColor(){
        return this.color ;
    }

    public boolean isFilled(){
        return this.filled ;
    }

    public void setColor(String color){
        this.color = color ; 
    }

    public void setFilled(boolean filled){
        this.filled = filled ;
    }

    public Date getDate(){
        return this.dateCreated ;
    }

    public String toString(){
        return "Object color :" + this.color + " isFilled : "+ this.isFilled() +" CreatedAt : "+ this.dateCreated ;
    }

}