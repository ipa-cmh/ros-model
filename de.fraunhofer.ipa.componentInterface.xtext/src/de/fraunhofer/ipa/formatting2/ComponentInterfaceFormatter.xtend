/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.formatting2

import com.google.inject.Inject
import componentInterface.ComponentInterface
import componentInterface.RosPublisher
import componentInterface.RosServiceClient
import componentInterface.RosServiceServer
import componentInterface.RosSubscriber
import de.fraunhofer.ipa.services.ComponentInterfaceGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ComponentInterfaceFormatter extends AbstractFormatter2 {
	
	@Inject extension ComponentInterfaceGrammarAccess

	def dispatch void format(ComponentInterface componentInterface, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		componentInterface.getNamespace.format;
		for (RosPublisher rosPublisher : componentInterface.getRosTopicPublisher()) {
			rosPublisher.format;
		}
		for (RosSubscriber rosSubscriber : componentInterface.getRosTopicSubscriber()) {
			rosSubscriber.format;
		}
		for (RosServiceServer rosServiceServer : componentInterface.getRosServiceServer()) {
			rosServiceServer.format;
		}
		for (RosServiceClient rosServiceClient : componentInterface.getRosServiceClient()) {
			rosServiceClient.format;
		}
	}
	
	// TODO: implement for 
}
