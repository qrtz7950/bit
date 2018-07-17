package kr.co.mlec.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

	public static void close(InputStream is) {
		
		if(is != null) {
			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void close(OutputStream os) {
		
		if(os != null) {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}
	
	public static void close(Reader br, Reader r) {
		close(br);
		close(r);
	}
	
	public static void close(Writer bw, Writer w) {
		close(bw);
		close(w);
	}
}











