package core;

public class VData {

	int cor, /* flag usado no algoritmo para cada v�rtice*/
		  td, /* tempo de descoberta do v�rtice */
		  tt;
	/* tempo de termino do v�rtice */

	String pred;
	/* predecessor/antecessor do v�rtice na busca tanto no DFS quanto no BFS*/
	float dist;
	float custo;

	public void print() {
		System.out.println("pred   custo");
		System.out.println(this.pred + "   " + this.custo);
	}
}
