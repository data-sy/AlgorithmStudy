package no01_�ܼ��Է�;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputStream {

	public static void main(String[] args) throws IOException {
		// ��Ʈ��(Stream)�̶�?
		// ��������. ���������� Ʋ�� ���� ������ ���������� ��׸� ���� ������ �ʴ´�.
		// ��Ʈ���� A���������� B���������� �̵��ϴ� ���� �帧
			// ���� ������ (������ �� ���۰� ���� �ִ� �������� ��Ʈ���̴�.)
			// HTTP �ۼ��� ������ (�������� ��û�ϰ� ������ �����ϴ� HTTP ������ �����͵� ��Ʈ���̴�.)
			// Ű���� �Է� (����ڰ� Ű����� �Է��ϴ� ���ڿ��� ��Ʈ���̴�.)
        InputStream in = System.in;

        int a;
        int b;
        int c;
        
//        // abc�� �Է��ϸ� �� ��Ʈ���� 1byte �� ���ʴ�� ��
//        a = in.read();
//        b = in.read();
//        c = in.read();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        
        // read �޼����� �Է°����� ���� 3¥�� byte �迭
        byte[] arr = new byte[3];
        in.read(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        // ���� : �о���� ���� �׻� �ƽ�Ű�ڵ� ������ �ؼ��ؾ� ��
        // �Է��� ���ڰ��� �״�� ����ϰ� �;� => InputStreamReader
	}

}
