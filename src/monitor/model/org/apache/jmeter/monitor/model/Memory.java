/*
 * Created on Mar 12, 2004
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package org.apache.jmeter.monitor.model;

/**
 * @author pete<p>
 * @version 0.1<p>
 * 
 * Description:<p>
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public interface Memory
{
	long getMax();
	void setMax(long value);
	long getFree();
	void setFree(long value);
	long getTotal();
	void setTotal(long value);

}
