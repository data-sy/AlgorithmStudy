package no01_�ܼ��Է�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04_BufferedReader {

	public static void main(String[] args) throws IOException  {
		
		// InputStream, InputStreamReader ��ü�� ���������� �Է����ڷ� ����		
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        // BufferedReader�� readLine�޼���
        String a = br.readLine();
        System.out.println(a);
        
        // InputStream - byte
        // InputStreamReader - character
        // BufferedReader - String
        
        // InputStream�� ����Ʈ�� �а�, InputStreamReader�� ���ڸ� �а�,
        // BufferedReader�� ���ڿ��� �д´�.

	}

}
