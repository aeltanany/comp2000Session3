package templatePattern;

public abstract class ModelExporter {
    public boolean Textures = true;

    public final void ProcessAll() {
//begin of modifiable zone(JavaCode)......C/93f41707-550d-4e3a-98df-40796c874e88
        System.out.println("gather models  ");
        Startmodel();

        if (Textures == true){
         AddTexture();
        }else {
            NOTexture();
        }

        end();
//end of modifiable zone(JavaCode)........E/93f41707-550d-4e3a-98df-40796c874e88
    }

    protected abstract void Startmodel();

    protected abstract void AddTexture();

    protected  void  NOTexture(){
           System.out.println(" doesn't include textures");
    }

    protected void end() {
//begin of modifiable zone(JavaCode)......C/7958077e-5d91-4462-9ddc-b3482575ec55
        System.out.println("save to disk  ");

//end of modifiable zone(JavaCode)........E/7958077e-5d91-4462-9ddc-b3482575ec55
    }

}
