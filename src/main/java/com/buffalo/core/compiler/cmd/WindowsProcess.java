package com.buffalo.core.compiler.cmd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.buffalo.core.compiler.AbstractProcess;

/**
 * 执行Windows命令的进程对象
 * @author 陈伯鑫
 *
 */
public class WindowsProcess extends AbstractProcess {
	
	public WindowsProcess() throws IOException {
		super("cmd");
	}
		
	@Override
	public Object[] runSysCMD(String[] cmds) throws IOException {
		List<Object> cmdOutObjs = new ArrayList<Object>();
		for(String cmd : cmds) {
			this.getCmdBuffer().write(cmd + " \n");
			this.getCmdBuffer().flush();
			cmdOutObjs.add(this.getRuntimeInput());
		}
		return cmdOutObjs.toArray();
	}

}
