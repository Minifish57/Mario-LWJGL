package engine;

public class Window {

    private int width, height;
    private String title;
    private static Window window = null;

    private Window(){
        this(1920,1080,"Mario - LWJGL");
    }

    private Window(int width, int height, String title){
        this.height = height;
        this.width = width;
        this.title = title;
    }

    public static Window get(){
        if(window == null){
            window = new Window();
        }
        return window;
    }

    public void run(){
        System.out.println("Dans le run !!!");
    }
}
