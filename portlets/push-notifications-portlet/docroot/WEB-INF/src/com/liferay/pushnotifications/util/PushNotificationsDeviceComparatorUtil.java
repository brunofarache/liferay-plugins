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

package com.liferay.pushnotifications.util;

import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.pushnotifications.comparators.PushNotificationsDevicePlatformComparator;
public class PushNotificationsDeviceComparatorUtil {

	public static OrderByComparator getPushNotificationOrderByComparator(
		String orderByCol, String orderByType) {

		boolean orderByAsc = false;

		if ("asc".equals(orderByType)) {
			orderByAsc = true;
		}

		OrderByComparator orderByComparator = null;

		if ("platform".equals(orderByCol)) {
			orderByComparator = new PushNotificationsDevicePlatformComparator(orderByAsc);
		}

		return orderByComparator;
	}

}