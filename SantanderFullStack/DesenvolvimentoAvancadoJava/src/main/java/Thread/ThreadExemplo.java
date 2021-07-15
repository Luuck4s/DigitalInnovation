package Thread;

public class ThreadExemplo {
    public static void main(String[] args) {
        GerarPDF gerarpdf = new GerarPDF();
        BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento(gerarpdf);

        gerarpdf.start();
        barraDeCarregamento.start();
    }
}

class BarraDeCarregamento extends Thread {
    private Thread gerarPdf;

    public BarraDeCarregamento(Thread gerarPdf) {
        this.gerarPdf = gerarPdf;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if(!gerarPdf.isAlive()){
                    break;
                }

                System.out.println("Loading....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class GerarPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Iniciar gerar PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerou PDF");
    }
}

