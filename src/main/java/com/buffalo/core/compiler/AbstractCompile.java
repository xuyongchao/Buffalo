package com.buffalo.core.compiler;

import com.buffalo.core.io.project.IProject;

/**
 * 编译器的抽象基类
 * @author 陈伯鑫
 *
 */
public abstract class AbstractCompile {

	public abstract boolean doCompile(IProject project);
	
}
