package core;

public class EdgeTypeKruskal implements Comparable<EdgeTypeKruskal> {
	private String origem;
	private String destino;
	private float peso;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public int compareTo(EdgeTypeKruskal outherEdgeKruskal) {
		if (this.peso < outherEdgeKruskal.getPeso()) {
			return -1;
		}
		if (this.peso > outherEdgeKruskal.getPeso()) {
			return 1;
		}
		return 0;
	}
}
