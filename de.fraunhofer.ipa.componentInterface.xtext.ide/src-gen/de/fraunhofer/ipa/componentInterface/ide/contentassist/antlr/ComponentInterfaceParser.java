/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.componentInterface.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.componentInterface.ide.contentassist.antlr.internal.InternalComponentInterfaceParser;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ComponentInterfaceParser extends AbstractContentAssistParser {

	@Inject
	private ComponentInterfaceGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalComponentInterfaceParser createParser() {
		InternalComponentInterfaceParser result = new InternalComponentInterfaceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNamespaceAccess().getAlternatives(), "rule__Namespace__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getComponentInterfaceAccess().getGroup(), "rule__ComponentInterface__Group__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_2(), "rule__ComponentInterface__Group_2__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_3(), "rule__ComponentInterface__Group_3__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_4(), "rule__ComponentInterface__Group_4__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_4_3(), "rule__ComponentInterface__Group_4_3__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_5(), "rule__ComponentInterface__Group_5__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_5_3(), "rule__ComponentInterface__Group_5_3__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_6(), "rule__ComponentInterface__Group_6__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_6_3(), "rule__ComponentInterface__Group_6_3__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_7(), "rule__ComponentInterface__Group_7__0");
					put(grammarAccess.getComponentInterfaceAccess().getGroup_7_3(), "rule__ComponentInterface__Group_7_3__0");
					put(grammarAccess.getRosPublisherAccess().getGroup(), "rule__RosPublisher__Group__0");
					put(grammarAccess.getRosPublisherAccess().getGroup_4(), "rule__RosPublisher__Group_4__0");
					put(grammarAccess.getRosSubscriberAccess().getGroup(), "rule__RosSubscriber__Group__0");
					put(grammarAccess.getRosSubscriberAccess().getGroup_4(), "rule__RosSubscriber__Group_4__0");
					put(grammarAccess.getRosServiceServerAccess().getGroup(), "rule__RosServiceServer__Group__0");
					put(grammarAccess.getRosServiceServerAccess().getGroup_4(), "rule__RosServiceServer__Group_4__0");
					put(grammarAccess.getRosServiceClientAccess().getGroup(), "rule__RosServiceClient__Group__0");
					put(grammarAccess.getRosServiceClientAccess().getGroup_4(), "rule__RosServiceClient__Group_4__0");
					put(grammarAccess.getGlobalNamespaceAccess().getGroup(), "rule__GlobalNamespace__Group__0");
					put(grammarAccess.getGlobalNamespaceAccess().getGroup_3(), "rule__GlobalNamespace__Group_3__0");
					put(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3(), "rule__GlobalNamespace__Group_3_3__0");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup(), "rule__RelativeNamespace_Impl__Group__0");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3(), "rule__RelativeNamespace_Impl__Group_3__0");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3(), "rule__RelativeNamespace_Impl__Group_3_3__0");
					put(grammarAccess.getPrivateNamespaceAccess().getGroup(), "rule__PrivateNamespace__Group__0");
					put(grammarAccess.getPrivateNamespaceAccess().getGroup_3(), "rule__PrivateNamespace__Group_3__0");
					put(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3(), "rule__PrivateNamespace__Group_3_3__0");
					put(grammarAccess.getComponentInterfaceAccess().getNameAssignment_2_1(), "rule__ComponentInterface__NameAssignment_2_1");
					put(grammarAccess.getComponentInterfaceAccess().getNamespaceAssignment_3_1(), "rule__ComponentInterface__NamespaceAssignment_3_1");
					put(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_2(), "rule__ComponentInterface__RospublisherAssignment_4_2");
					put(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_4_3_1(), "rule__ComponentInterface__RospublisherAssignment_4_3_1");
					put(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_2(), "rule__ComponentInterface__RossubscriberAssignment_5_2");
					put(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_5_3_1(), "rule__ComponentInterface__RossubscriberAssignment_5_3_1");
					put(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_2(), "rule__ComponentInterface__RosserviceserverAssignment_6_2");
					put(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_6_3_1(), "rule__ComponentInterface__RosserviceserverAssignment_6_3_1");
					put(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_2(), "rule__ComponentInterface__RosserviceclientAssignment_7_2");
					put(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_7_3_1(), "rule__ComponentInterface__RosserviceclientAssignment_7_3_1");
					put(grammarAccess.getRosPublisherAccess().getNameAssignment_2(), "rule__RosPublisher__NameAssignment_2");
					put(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1(), "rule__RosPublisher__NsAssignment_4_1");
					put(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6(), "rule__RosPublisher__PublisherAssignment_6");
					put(grammarAccess.getRosSubscriberAccess().getNameAssignment_2(), "rule__RosSubscriber__NameAssignment_2");
					put(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1(), "rule__RosSubscriber__NsAssignment_4_1");
					put(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6(), "rule__RosSubscriber__SubscriberAssignment_6");
					put(grammarAccess.getRosServiceServerAccess().getNameAssignment_2(), "rule__RosServiceServer__NameAssignment_2");
					put(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1(), "rule__RosServiceServer__NsAssignment_4_1");
					put(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6(), "rule__RosServiceServer__SrvserverAssignment_6");
					put(grammarAccess.getRosServiceClientAccess().getNameAssignment_2(), "rule__RosServiceClient__NameAssignment_2");
					put(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1(), "rule__RosServiceClient__NsAssignment_4_1");
					put(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6(), "rule__RosServiceClient__SrvclientAssignment_6");
					put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2(), "rule__GlobalNamespace__PartsAssignment_3_2");
					put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1(), "rule__GlobalNamespace__PartsAssignment_3_3_1");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2(), "rule__RelativeNamespace_Impl__PartsAssignment_3_2");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1(), "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1");
					put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2(), "rule__PrivateNamespace__PartsAssignment_3_2");
					put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1(), "rule__PrivateNamespace__PartsAssignment_3_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ComponentInterfaceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ComponentInterfaceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
