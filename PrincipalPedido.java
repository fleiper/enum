package enem;

public class PrincipalPedido {
	public static void main(String[]args) {
	StatusPedido status = StatusPedido.ABERTO;
	System.out.println(status);
	StatusPedido status2 = StatusPedido.EM_ANDAMENTO;
	System.out.println(status2);
	StatusPedido status3 = StatusPedido.ENTREGUE;
	System.out.println(status3);
	StatusPedido status4 = StatusPedido.CANCELADO;
	System.out.println(status4);
}
}
