package sec02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class 논버퍼vs버퍼 {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 = "c:/temp/originalFile1.jpg";
		String targetFilePath1 = "c:/temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		String originalFilePath2 = "c:/temp/originalFile2.jpg";
		String targetFilePath2 = "c:/temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않을 때 : " + nonBufferTime + "ns");

		long BufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용할 때 : " + BufferTime + "ns");

		fis.close();
		fos.close();
	}

	static int data = -1;

	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while (true) {
			data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);
	}

}
