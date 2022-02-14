import java.util.ArrayList;

public class ProcessadorVideo {

ArrayList<CanalNotificacao> canais=new ArrayList<CanalNotificacao>();;
public void registrarCanal(CanalNotificacao channel){
        canais.add(channel);
}

public void processar(Video video){

    for (CanalNotificacao channel : canais){
        Mensagem mensagem = new Mensagem();
        mensagem.texto = video.arquivo;
        mensagem.tipoMensagem = TipoMensagem.LOG;
        mensagem.texto += " - " + video.formatoVideo;
        channel.notificar(mensagem);
    }

}

}
