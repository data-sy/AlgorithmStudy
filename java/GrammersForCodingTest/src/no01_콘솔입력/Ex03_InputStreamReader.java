package no01_�ܼ��Է�;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03_InputStreamReader {

	public static void main(String[] args) throws IOException {
		
		// InputStreamReader
		// �Է��� �ƽ�Ű�ڵ尪�� �ƴ� ���ڰ� �״�� ���
        InputStream in = System.in;
        
        // InputStreamReader ��ü ����
        // InputStream ��ü�� in�� �Է����ڷ� ����
        InputStreamReader reader = new InputStreamReader(in);
        
        char[] a = new char[3];
        reader.read(a);
        System.out.println(a);
        
        // ���� : ������ ������ ���̷θ� ��Ʈ���� ����
        // ����ڰ� ����Ű�� �Է��� ������ ������� �Է��� ���� �޾Ƶ��̰� �;� => BufferedReader
	}

}
