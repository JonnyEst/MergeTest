package com.bbva.cpqr.lib.r050.impl;

import com.bbva.cpqr.lib.r050.CPQRR050;
import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class CPQRR050Abstract extends AbstractLibrary implements CPQRR050 {

	protected ApplicationConfigurationService applicationConfigurationService;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}