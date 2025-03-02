/**
 * Copyright (c) 2021 Bosch.IO GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.hawkbit.mgmt.rest.api;

import org.eclipse.hawkbit.mgmt.json.model.auth.MgmtUserInfo;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Api for handling basic auth user validation
 */
@SuppressWarnings("squid:S1609")
// no request mapping specified here to avoid CVE-2021-22044 in Feign client
public interface MgmtBasicAuthRestApi {
    /**
     * Handles the GET request of basic auth.
     *
     * @return the userinfo with status OK.
     */
    @GetMapping(value = MgmtRestConstants.AUTH_V1_REQUEST_MAPPING, produces = { MediaTypes.HAL_JSON_VALUE,
            MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<MgmtUserInfo> validateBasicAuth();
}
