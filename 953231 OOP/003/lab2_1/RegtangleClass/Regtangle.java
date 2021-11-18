// 642215003 Kan Katpark
package RegtangleClass;

public class Regtangle {
    private float height ;
    private float width ;

    public Regtangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    public float getHeight(){
        return this.height;
    }

    public float getWidth(){
        return this.width;
    }

    public float getArea(){
        return this.width * this.height ;
    }

    public float getPerimeter(){
        return 2 * (this.width + this.height) ;
    }

}