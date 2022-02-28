import atividades.*;

public class MaquinaWorkflow{
    Atividade atividade;
    public void executar(Workflow workflow) {
        this.atividade = workflow.atividades;
    }

}
