package InheritancePolymorphism.src;

public class Input {
    private boolean isEnabled = true;

    public void render(){
        
    }
    public void disable() {
        this.isEnabled = false;
    }
    public boolean isEnabled(){
        return this.isEnabled;
    }

    @Override
    public String toString(){
        return "Ini toString Input";
    }
}