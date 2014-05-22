package com.example.addressbook;

import com.vaadin.server.DeploymentConfiguration;
import com.vaadin.server.ServiceException;
import com.vaadin.server.VaadinPortlet;
import com.vaadin.server.VaadinPortletService;
import com.vaadin.server.VaadinRequest;

public class CustomVaadinPortlet extends VaadinPortlet {

	/**
	 *
	 */
	private static final long serialVersionUID = -13615405654173335L;

	private class CustomVaadinPortletService extends VaadinPortletService {

		/**
		 *
		 */
		private static final long serialVersionUID = -6282242585931296999L;

		public CustomVaadinPortletService(final VaadinPortlet portlet,
				final DeploymentConfiguration config) throws ServiceException {
			super(portlet, config);
		}

		@Override
		public String getStaticFileLocation(final VaadinRequest request) {
			return request.getContextPath();
		}

	}

	@Override
	protected VaadinPortletService createPortletService(
			final DeploymentConfiguration deploymentConfiguration)
			throws ServiceException {
		final CustomVaadinPortletService customVaadinPortletService = new CustomVaadinPortletService(
				this, deploymentConfiguration);
		customVaadinPortletService.init();
		return customVaadinPortletService;
	}

}
