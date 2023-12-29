package javaApp5.ch17.sec01;


import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx02 {

	public static void main(String[] args) throws Exception {
		// ��ǥ: 1�ܰ� �÷���, �迭�� ��Ʈ������ ���� ����� �� ���
		
		List< Product > list = new ArrayList< Product >();
		
		
		//�ڷ� �ֱ� ��üȭ ��Ŵ
		for( int i = 1; i<=5; i++) {
			Product product = new Product( i, "��ǰ" +i, "����ȸ��", (int)(10000*Math.random())); // 0.0<= Math.random()
			list.add(product); //
			
		}
		
		//�÷��� --> ��Ʈ������ ����
		Stream<Product> stream = list.stream();
		stream.forEach( p -> System.out.println( p ));
		
		//�� �ڵ� ����ȭ
		list.stream()
		    .forEach( p -> System.out.println( p ));
		
		//�迭�� ��Ʈ������ �����
		String[] strArr = {"ȫ�浿", "�ſ��", "��̳�","���ֹ�"};
		Stream<String> streamstr = Arrays.stream(strArr); //�迭�� �������� ��Ʈ������ �ٲ��.
		
				streamstr.filter( t -> t.startsWith("��") )
						 .forEach( p -> System.out.println( p ));
				
		//���� ������ ��Ʈ�� ���
		//�䱸���� 1 ~ 100���� ���� ���ϱ�
		IntStream is = IntStream.range(1,101); // 1<= IntStream.range(1, 100) < 100
		System.out.println( is.count() );	//������Ʈ������ �������� ��Ʈ�� �ڷ� �Ҹ�ȴ�.
		
		is = IntStream.range(1,101); //�ٽ� �������� ��Ʈ���� ����� �־�� �Ѵ�.
		System.out.println(is.max().toString());
		
		is = IntStream.range(1,101);
		System.out.println(is.min().toString());
		
		//���Ϸκ��� ��Ʈ�� ����
		//���� ���α׷����� dat.txt �ڷḦ ������ ������
		Path path = Paths.get(StreamEx02.class.getResource("data.txt").toURI());
		//�ش� ����� ������ ��Ʈ������ �ٲپ� �ش�. Charset.defaultCharset() ������ �����ڵ�� �ڹٿ� �⺻ �����ڵ�(UTF-8)�� �̿��Ѵ�.
		Stream<String> fileStream = Files.lines( path );
		fileStream.forEach( p -> System.out.println( p ));
		fileStream.close(); //������ �޸𸮸� Ŭ�����ϱ�
		
		
		
		
	}

}

class Product {
	
	private int pno;
	private String name;
	private String company;
	private int price;
	
	@Override
	public String toString() {
		
		return pno + " " + name + " " + company + " " + price;
	}
	
	public Product(int pno, String name, String company, int price) {
		super();
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	
	public int getPno() {
		return pno;
	}


	public void setPno(int pno) {
		this.pno = pno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	
	
}
