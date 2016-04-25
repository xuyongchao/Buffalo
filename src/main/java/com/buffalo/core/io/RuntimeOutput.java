package com.buffalo.core.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 命令输入对象
 * @author 陈伯鑫
 *
 */
public class RuntimeOutput {
	
	//输出对象
	private OutputStream       om = null;
	private BufferedWriter     bw = null;
	private OutputStreamWriter ow = null;
	
	/**
	 * 获取命令输入对象
	 * @param process 执行命令的进程对象
	 * @return 命令输入对象
	 */
	public BufferedWriter getBufferedWriter(Process process) {
		om = process.getOutputStream();
		ow = new OutputStreamWriter(om);
		return (bw = new BufferedWriter(ow));
	}
	
	/**
	 * 释放命令输入对象
	 */
	public void close() {
		try {
			this.om.close();
			this.ow.close();
			this.bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
