import java.io.*;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
            FileOutputStream fis = null;
            ObjectOutputStream obj = null;
            try {
                fis = new FileOutputStream(getNomeArquivo());
                obj = new ObjectOutputStream(fis);
                obj.writeObject(estudantes);

            }catch (NullPointerException | IOException e  ) {
                System.out.println("Nao foi possivel serializar");
            }finally {
                try {
                    assert fis != null;
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    assert obj != null;
                    obj.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    public List<Estudante> desserializar(){
            FileInputStream fis = null;
            ObjectInputStream obj = null;

            try{
                fis = new FileInputStream(nomeArquivo);
                obj = new ObjectInputStream(fis);

                return (List<Estudante>) obj.readObject();

            } catch (ClassNotFoundException | NullPointerException | IOException e) {
                System.out.println("Nao foi possivel desserializar");
            }
        return null;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }
}
