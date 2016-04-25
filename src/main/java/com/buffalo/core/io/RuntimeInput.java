package com.buffalo.core.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 命令结果输出对象
 * @author 陈伯鑫
 *
 */
public class RuntimeInput {

	//输入对象
	private InputStream        im = null;
	private BufferedReader     br = null;
	private InputStreamReader  ir = null;
	
	/**
	 * 获取命令执行结果输出对象
	 * @param process 执行命令进程对象
	 * @return 命令执行结果输出对象
	 */
	public BufferedReader getBufferedReader(Process process) {
		im = process.getInputStream();
		ir = new InputStreamReader(im);
		return (br = new BufferedReader(ir));
	}
	
	/**
	 * 释放对象
	 */
	public void close() {
		try {
			this.im.close();
			this.ir.close();
			this.br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
