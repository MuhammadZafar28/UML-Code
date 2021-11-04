public class Rectangle extends Shape {
    
    private int width;
    private int height;
    
    public Rectangle (int sz){
        width = 0;
        height = 0;
    }
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public void setBrdrW(int b){
        
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public void setHeight(int h){
        height = h;
    }
    
}
