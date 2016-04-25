package com.buffalo.core.compiler.bash;

import java.io.IOException;

import com.buffalo.core.compiler.AbstractProcess;

/**
 * 执行Linux命令的进程对象
 * @author 陈伯鑫
 *
 */
public class LinuxProcess extends AbstractProcess {

	public LinuxProcess() throws IOException {
		super("");
	}
	
	@Override
	public Object[] runSysCMD(String[] cmds) throws IOException {
		return null;
	}

}
