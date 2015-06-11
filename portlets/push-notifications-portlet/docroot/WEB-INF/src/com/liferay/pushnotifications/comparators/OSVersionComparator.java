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
public class OSVersionComparator extends OrderByComparator {

	public static String ORDER_BY_ASC = "OSVersion ASC";

	public static String ORDER_BY_DESC = "OSVersion DESC";

	public OSVersionComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
	public int compare(Object object1, Object object2) {
		PushNotificationsDevice dev1 = (PushNotificationsDevice)object1;
		PushNotificationsDevice dev2 = (PushNotificationsDevice)object2;

		int result =
			dev1.getOSVersion().compareToIgnoreCase(dev2.getOSVersion());

		if (_ascending) {
			return result;
		}

		return -result;
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}

		return ORDER_BY_DESC;
	}

	private boolean _ascending;

}