import java.util.LinkedList;
import java.util.Queue;

public class Atendente {
    private Queue<Comando> filaComandos = new LinkedList<>();

    public void adicionarComando(Comando comando) {
        filaComandos.add(comando);
    }

    public void processarPedidos() {
        while (!filaComandos.isEmpty()) {
            Comando comando = filaComandos.poll();
            comando.executar();
        }
    }
}
