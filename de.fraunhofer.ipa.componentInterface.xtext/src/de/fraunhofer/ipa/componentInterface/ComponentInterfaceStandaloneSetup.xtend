/*
 * generated by Xtext 2.15.0
 */
package de.fraunhofer.ipa.componentInterface


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ComponentInterfaceStandaloneSetup extends ComponentInterfaceStandaloneSetupGenerated {

	def static void doSetup() {
		new ComponentInterfaceStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
