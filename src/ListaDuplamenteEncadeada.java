
public class ListaDuplamenteEncadeada {
	private No head = null, tail = null;
	private int size = 0;
	
	public void addH(Object item) {
		No novo = new No(item);
		
		if(head == null) {
			head = novo;
			tail = novo;
		}else {
			head.setAnt(novo);
			novo.setProx(head);
			head = novo;
		}
		
		size++;
		
	}
	
	public void remH() {
		
		if(head.getProx() != null) {
			head = head.getProx();
			head.getAnt().setProx(null);
			head.setAnt(null);
		}else {
			head = null;
			tail = null;
		}
		
		size--;
	}
	
	public Object get(String indice) {
		No aux = head;
		int i = 0;
		while(i < getSize()) {
			User u = (User) aux.getItem();
			
			if(u.getRegistration().equals(indice)) {
				return u;
			}
			
			
			i++;
			aux = aux.getProx();
		}
		
		return null;
	}
	

	public int getSize() {
		return size;
	}
}
