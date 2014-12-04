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

package com.liferay.sampleservicebuilder.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.sampleservicebuilder.model.Foo;
import com.liferay.sampleservicebuilder.model.impl.FooImpl;
import com.liferay.sampleservicebuilder.service.base.FooServiceBaseImpl;
import com.liferay.portal.service.ServiceContext;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class FooServiceImpl extends FooServiceBaseImpl {

	public User getUser(long userId) throws PortalException {
		return UserLocalServiceUtil.getUserById(userId);
	}

	public List<Group> getUserSitesGroups() throws PortalException {
		return GroupServiceUtil.getUserSitesGroups();
	}

	public Foo getFoo() throws PortalException {
		return fooLocalService.addFoo("field1", true, 0, new Date(), "field5", new ServiceContext());
	}

}