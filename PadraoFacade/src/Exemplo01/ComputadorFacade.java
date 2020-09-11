package Exemplo01;

class ComputadorFacade {
   
	private CPU cpu;
    private Memoria memoria;
    private DiscoRigido discoRigido;

    public ComputadorFacade() {
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.discoRigido = new DiscoRigido();
    }

    public void run() {
        cpu.processaDado();
        memoria.carregaDado();
        discoRigido.leDado();
    }
}