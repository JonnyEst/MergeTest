package com.bbva.cpqr.lib.r052;

import com.bbva.cpqr.dto.datos.GrantingTicket;
import com.bbva.cpqr.dto.datos.OutAutehenticationGranting;

/**
 * The  interface CPQRR052 class...
 */
public interface CPQRR052 {

	/**
	 * The execute method...
	 */
	GrantingTicket execute(String consumerId, String idAuthenticationData);

	OutAutehenticationGranting OutExecute(GrantingTicket grantingTicket);

}
