package com.buffalo.core.compiler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import com.buffalo.core.io.RuntimeInput;
import com.buffalo.core.io.RuntimeOutput;

//提示：还可以抽象出一个cmdruner接口，将命令封装成规范的命令格式，利于命令的执行和解析，以及批量命令的执行

/**
 * 执行进程抽象基类
 * @author 陈伯鑫
 *
 */
public abstract class AbstractProcess {
	
	//执行命令的进程对象引用
	private static Process process;
	//获取执行进程的runtime对象
	private static Runtime runtime = Runtime.getRuntime();
	
	private RuntimeOutput runtimeOutput = new RuntimeOutput();
	private RuntimeInput  runtimeInput  = new RuntimeInput();
	
	//命令执行对象
	private BufferedWriter cmdWriter = null;
	
	/**
	 * 通过制定的命令构造执行命令进程对象
	 * @param cmd 需要执行的命令，Windows是'cmd'，Linux待定
	 * @throws IOException
	 */
	protected AbstractProcess(String cmd) throws IOException {
		process = runtime.exec(cmd);
	}

	/**
	 * 获取进程执行对象的命令输入流，用以执行命令
	 * @return 命令执行流对象
	 */
	protected BufferedWriter getCmdBuffer() {
		if(cmdWriter == null) {
			cmdWriter = runtimeOutput.getBufferedWriter(process);
		}
		return cmdWriter;
	}
	
	/**
	 * 获取执行命令后的输出结果，调用该方法后必须重新执行一侧getCmdBuffer才能使用命令流对象
	 * @return 命令执行结果
	 * @throws IOException
	 */
	protected Object getRuntimeInput() throws IOException {
		String result = "";	
		BufferedReader bReader = runtimeInput.getBufferedReader(process);
    	if(bReader.ready()) {
        	String tempReadLine = null;
			while((tempReadLine = bReader.readLine()) != null){  
				result += tempReadLine;
			}
    	}
    	return result;
	}
	
	/**
	 * 释放命令输入输出对象
	 */
	protected void close() {
		this.runtimeInput.close();
		this.runtimeOutput.close();
	}
	
	/**
	 * 执行系统指令
	 * @param args 命令名称和参数列表
	 * @return 一个输出对象，取决于命令的运行结果
	 */
	public abstract Object[] runSysCMD(String[] args) throws IOException;
	
}
