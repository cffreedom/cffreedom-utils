package com.cffreedom.exceptions;

/**
 * Original Class: com.cffreedom.exceptions.DbException
 * @author markjacobsen.net (http://mjg2.net/code)
 * Copyright: Communication Freedom, LLC - http://www.communicationfreedom.com
 * 
 * Free to use, modify, redistribute.  Must keep full class header including 
 * copyright and note your modifications.
 * 
 * If this helped you out or saved you time, please consider...
 * 1) Donating: http://www.communicationfreedom.com/go/donate/
 * 2) Shoutout on twitter: @MarkJacobsen or @cffreedom
 * 3) Linking to: http://visit.markjacobsen.net
 * 
 * Changes:
 * 2013-04-16	markjacobsen.net 	Added additional Constructors
 * 2013-07-15	markjacobsen.net 	Removed constructors
 */
public class DbException extends Exception
{
	private static final long serialVersionUID = 1L;

	public DbException(Throwable exception)
	{
		super(exception);
	}
	
	public DbException(String message, Throwable exception)
	{
		super(message, exception);
	}
	
	public DbException(String message)
	{
		super(message);
	}
}
