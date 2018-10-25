/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.componentInterface.serializer;

import com.google.inject.Inject;
import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import ros.GlobalNamespace;
import ros.PrivateNamespace;
import ros.RelativeNamespace;
import ros.RosPackage;

@SuppressWarnings("all")
public class ComponentInterfaceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ComponentInterfaceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentInterfacePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentInterfacePackage.COMPONENT_INTERFACE:
				sequence_ComponentInterface(context, (ComponentInterface) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_PUBLISHER:
				sequence_RosPublisher(context, (RosPublisher) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT:
				sequence_RosServiceClient(context, (RosServiceClient) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_SERVER:
				sequence_RosServiceServer(context, (RosServiceServer) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SUBSCRIBER:
				sequence_RosSubscriber(context, (RosSubscriber) semanticObject); 
				return; 
			}
		else if (epackage == RosPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RosPackage.GLOBAL_NAMESPACE:
				sequence_GlobalNamespace(context, (GlobalNamespace) semanticObject); 
				return; 
			case RosPackage.PRIVATE_NAMESPACE:
				sequence_PrivateNamespace(context, (PrivateNamespace) semanticObject); 
				return; 
			case RosPackage.RELATIVE_NAMESPACE:
				sequence_RelativeNamespace_Impl(context, (RelativeNamespace) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ComponentInterface returns ComponentInterface
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         namespace=Namespace? 
	 *         (RosTopicPublisher+=RosPublisher RosTopicPublisher+=RosPublisher*)? 
	 *         (RosTopicSubscriber+=RosSubscriber RosTopicSubscriber+=RosSubscriber*)? 
	 *         (RosServiceServer+=RosServiceServer RosServiceServer+=RosServiceServer*)? 
	 *         (RosServiceClient+=RosServiceClient RosServiceClient+=RosServiceClient*)?
	 *     )
	 */
	protected void sequence_ComponentInterface(ISerializationContext context, ComponentInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns GlobalNamespace
	 *     GlobalNamespace returns GlobalNamespace
	 *
	 * Constraint:
	 *     (parts+=EString parts+=EString*)?
	 */
	protected void sequence_GlobalNamespace(ISerializationContext context, GlobalNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns PrivateNamespace
	 *     PrivateNamespace returns PrivateNamespace
	 *
	 * Constraint:
	 *     (parts+=EString parts+=EString*)?
	 */
	protected void sequence_PrivateNamespace(ISerializationContext context, PrivateNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns RelativeNamespace
	 *     RelativeNamespace_Impl returns RelativeNamespace
	 *
	 * Constraint:
	 *     (parts+=EString parts+=EString*)?
	 */
	protected void sequence_RelativeNamespace_Impl(ISerializationContext context, RelativeNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosPublisher returns RosPublisher
	 *
	 * Constraint:
	 *     (TopicName=EString? TopicRef=[Publisher|EString]? NameSpace=EString?)
	 */
	protected void sequence_RosPublisher(ISerializationContext context, RosPublisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceClient returns RosServiceClient
	 *
	 * Constraint:
	 *     (ServiceName=EString? SrvRef=[ServiceClient|EString]? NameSpace=EString?)
	 */
	protected void sequence_RosServiceClient(ISerializationContext context, RosServiceClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceServer returns RosServiceServer
	 *
	 * Constraint:
	 *     (ServiceName=EString? SrvRef=[ServiceServer|EString]? NameSpace=EString?)
	 */
	protected void sequence_RosServiceServer(ISerializationContext context, RosServiceServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosSubscriber returns RosSubscriber
	 *
	 * Constraint:
	 *     (TopicName=EString? TopicRef=[Subscriber|EString]? NameSpace=EString?)
	 */
	protected void sequence_RosSubscriber(ISerializationContext context, RosSubscriber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
