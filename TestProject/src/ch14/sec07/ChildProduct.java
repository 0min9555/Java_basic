package ch14.sec07;

// 제네릭 타입의 상속
// 자식 클래스에도 타입 파리미터 기술
// 자식 클래스는 추가적인 타입 파라미터 가질 수 있음
public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
