package no01_�ܼ��Է�;

import java.io.IOException;
import java.io.InputStream;

public class Ex01_Systemin {

	public static void main(String[] args) throws IOException {
		// ��ó : ���� �� �ڹ� https://wikidocs.net/226
		
		// System.in�� InputStream�� ��ü (�ܼ��Է�)
		// InputStream�� java.io ��Ű���� ����Ʈ ���� �Է��� ���� �ֻ��� �Է� ��Ʈ�� Ŭ�����Դϴ�.
		InputStream in = System.in;

        int a;
        // read�޼��� : 1 byte�� ������� �Է��� �޾Ƶ���
        // ����Ǵ� int ���� 0-255 ������ ���������� �ƽ�Ű �ڵ尪
        // �����Ű�� ������� �Է��� ���� ������ ���α׷��� ��� (���� : �Է� ����)
        a = in.read();

        System.out.println(a);
		
		// cf. throws IOException
        // InputStream���� ���� ���� �о���� ���� IOException �߻��� �� ���� => ���� ó���ؾ� ��
		// throws�� �� ����ó���� �ڷ� �̷�

	}

}
