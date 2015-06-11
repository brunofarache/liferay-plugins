/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.pushnotifications.comparators;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.pushnotifications.model.PushNotificationsDevice;

/**
 * @author Javier Gamarra
 * @author Salva Tejero
 */
public class PlatformComparator extends OrderByComparator {

	public static String ORDER_BY_ASC = "platform ASC";

	public static String ORDER_BY_DESC = "platform DESC";

	public PlatformComparator(boolean asc) {
		_ascending = asc;
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		PushNotificationsDevice dev1 = (PushNotificationsDevice)arg0;
		PushNotificationsDevice dev2 = (PushNotificationsDevice)arg1;

		int result = dev1.getPlatform().compareToIgnoreCase(dev2.getPlatform());
		return (_ascending)?result:(-1)*result;
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		} else {
			return ORDER_BY_DESC;
		}
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private boolean _ascending;

}