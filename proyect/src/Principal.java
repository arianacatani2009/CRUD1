import javax.swing.*;
import java.io.*;

public class Principal {
    public static void main (String[] args){
        String filepath="datos.dat";
        Miclase miobjeto=new Miclase("Ingrith",20);
        try(
                FileOutputStream fileOut = new FileOutputStream(filepath);
        ObjectOutputStream obOut= new   ObjectOutputStream(fileOut)


        ){
            obOut.writeObject(miobjeto);
            System.out.println("Archivo escrito correctamente");
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        try(
                FileInputStream fileIn = new FileInputStream(filepath);
                ObjectInputStream objIn= new ObjectInputStream(fileIn);
        ){
            Miclase readObject =(Miclase) objIn.readObject();
            System.out.println("El objeto en disco es: "+readObject);
            System.out.println(readObject.getEdad());
            System.out.println(readObject.getNombre());
        }catch ( IOException e){
            throw new RuntimeException();
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }



    }
}
