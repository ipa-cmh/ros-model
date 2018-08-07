/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.xtext.ide.contentassist.antlr.internal.InternalRosParser;
import de.fraunhofer.ipa.ros.xtext.services.RosGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RosParser extends AbstractContentAssistParser {

	@Inject
	private RosGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRosParser createParser() {
		InternalRosParser result = new InternalRosParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSpecBaseAccess().getAlternatives(), "rule__SpecBase__Alternatives");
					put(grammarAccess.getDependencyAccess().getAlternatives(), "rule__Dependency__Alternatives");
					put(grammarAccess.getNamespaceAccess().getAlternatives(), "rule__Namespace__Alternatives");
					put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
					put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getPackage_ImplAccess().getGroup(), "rule__Package_Impl__Group__0");
					put(grammarAccess.getPackage_ImplAccess().getGroup_4(), "rule__Package_Impl__Group_4__0");
					put(grammarAccess.getPackage_ImplAccess().getGroup_4_3(), "rule__Package_Impl__Group_4_3__0");
					put(grammarAccess.getPackage_ImplAccess().getGroup_5(), "rule__Package_Impl__Group_5__0");
					put(grammarAccess.getPackage_ImplAccess().getGroup_5_3(), "rule__Package_Impl__Group_5_3__0");
					put(grammarAccess.getArtifactAccess().getGroup(), "rule__Artifact__Group__0");
					put(grammarAccess.getCatkinPackageAccess().getGroup(), "rule__CatkinPackage__Group__0");
					put(grammarAccess.getCatkinPackageAccess().getGroup_4(), "rule__CatkinPackage__Group_4__0");
					put(grammarAccess.getCatkinPackageAccess().getGroup_4_3(), "rule__CatkinPackage__Group_4_3__0");
					put(grammarAccess.getCatkinPackageAccess().getGroup_5(), "rule__CatkinPackage__Group_5__0");
					put(grammarAccess.getCatkinPackageAccess().getGroup_5_3(), "rule__CatkinPackage__Group_5_3__0");
					put(grammarAccess.getCatkinPackageAccess().getGroup_6(), "rule__CatkinPackage__Group_6__0");
					put(grammarAccess.getCatkinPackageAccess().getGroup_6_3(), "rule__CatkinPackage__Group_6_3__0");
					put(grammarAccess.getServiceSpecAccess().getGroup(), "rule__ServiceSpec__Group__0");
					put(grammarAccess.getServiceSpecAccess().getGroup_4(), "rule__ServiceSpec__Group_4__0");
					put(grammarAccess.getServiceSpecAccess().getGroup_5(), "rule__ServiceSpec__Group_5__0");
					put(grammarAccess.getTopicSpecAccess().getGroup(), "rule__TopicSpec__Group__0");
					put(grammarAccess.getTopicSpecAccess().getGroup_4(), "rule__TopicSpec__Group_4__0");
					put(grammarAccess.getActionSpecAccess().getGroup(), "rule__ActionSpec__Group__0");
					put(grammarAccess.getActionSpecAccess().getGroup_4(), "rule__ActionSpec__Group_4__0");
					put(grammarAccess.getActionSpecAccess().getGroup_5(), "rule__ActionSpec__Group_5__0");
					put(grammarAccess.getActionSpecAccess().getGroup_6(), "rule__ActionSpec__Group_6__0");
					put(grammarAccess.getMessageDefinitionAccess().getGroup(), "rule__MessageDefinition__Group__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_4(), "rule__Node__Group_4__0");
					put(grammarAccess.getNodeAccess().getGroup_4_3(), "rule__Node__Group_4_3__0");
					put(grammarAccess.getNodeAccess().getGroup_5(), "rule__Node__Group_5__0");
					put(grammarAccess.getNodeAccess().getGroup_5_3(), "rule__Node__Group_5_3__0");
					put(grammarAccess.getNodeAccess().getGroup_6(), "rule__Node__Group_6__0");
					put(grammarAccess.getNodeAccess().getGroup_6_3(), "rule__Node__Group_6_3__0");
					put(grammarAccess.getNodeAccess().getGroup_7(), "rule__Node__Group_7__0");
					put(grammarAccess.getNodeAccess().getGroup_7_3(), "rule__Node__Group_7_3__0");
					put(grammarAccess.getNodeAccess().getGroup_8(), "rule__Node__Group_8__0");
					put(grammarAccess.getNodeAccess().getGroup_8_3(), "rule__Node__Group_8_3__0");
					put(grammarAccess.getNodeAccess().getGroup_9(), "rule__Node__Group_9__0");
					put(grammarAccess.getNodeAccess().getGroup_9_3(), "rule__Node__Group_9_3__0");
					put(grammarAccess.getNodeAccess().getGroup_10(), "rule__Node__Group_10__0");
					put(grammarAccess.getNodeAccess().getGroup_10_3(), "rule__Node__Group_10_3__0");
					put(grammarAccess.getServiceServerAccess().getGroup(), "rule__ServiceServer__Group__0");
					put(grammarAccess.getPublisherAccess().getGroup(), "rule__Publisher__Group__0");
					put(grammarAccess.getSubscriberAccess().getGroup(), "rule__Subscriber__Group__0");
					put(grammarAccess.getServiceClientAccess().getGroup(), "rule__ServiceClient__Group__0");
					put(grammarAccess.getActionServerAccess().getGroup(), "rule__ActionServer__Group__0");
					put(grammarAccess.getActionClientAccess().getGroup(), "rule__ActionClient__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getGlobalNamespaceAccess().getGroup(), "rule__GlobalNamespace__Group__0");
					put(grammarAccess.getGlobalNamespaceAccess().getGroup_3(), "rule__GlobalNamespace__Group_3__0");
					put(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3(), "rule__GlobalNamespace__Group_3_3__0");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup(), "rule__RelativeNamespace_Impl__Group__0");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3(), "rule__RelativeNamespace_Impl__Group_3__0");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3(), "rule__RelativeNamespace_Impl__Group_3_3__0");
					put(grammarAccess.getPrivateNamespaceAccess().getGroup(), "rule__PrivateNamespace__Group__0");
					put(grammarAccess.getPrivateNamespaceAccess().getGroup_3(), "rule__PrivateNamespace__Group_3__0");
					put(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3(), "rule__PrivateNamespace__Group_3_3__0");
					put(grammarAccess.getParameterType_ImplAccess().getGroup(), "rule__ParameterType_Impl__Group__0");
					put(grammarAccess.getParameterListTypeAccess().getGroup(), "rule__ParameterListType__Group__0");
					put(grammarAccess.getParameterListTypeAccess().getGroup_3(), "rule__ParameterListType__Group_3__0");
					put(grammarAccess.getParameterListTypeAccess().getGroup_3_3(), "rule__ParameterListType__Group_3_3__0");
					put(grammarAccess.getParameterListTypeAccess().getGroup_4(), "rule__ParameterListType__Group_4__0");
					put(grammarAccess.getParameterStructTypeAccess().getGroup(), "rule__ParameterStructType__Group__0");
					put(grammarAccess.getParameterStructTypeAccess().getGroup_3(), "rule__ParameterStructType__Group_3__0");
					put(grammarAccess.getParameterStructTypeAccess().getGroup_3_3(), "rule__ParameterStructType__Group_3_3__0");
					put(grammarAccess.getParameterIntegerTypeAccess().getGroup(), "rule__ParameterIntegerType__Group__0");
					put(grammarAccess.getParameterIntegerTypeAccess().getGroup_3(), "rule__ParameterIntegerType__Group_3__0");
					put(grammarAccess.getParameterStringTypeAccess().getGroup(), "rule__ParameterStringType__Group__0");
					put(grammarAccess.getParameterStringTypeAccess().getGroup_3(), "rule__ParameterStringType__Group_3__0");
					put(grammarAccess.getParameterDoubleTypeAccess().getGroup(), "rule__ParameterDoubleType__Group__0");
					put(grammarAccess.getParameterDoubleTypeAccess().getGroup_3(), "rule__ParameterDoubleType__Group_3__0");
					put(grammarAccess.getParameterDateTypeAccess().getGroup(), "rule__ParameterDateType__Group__0");
					put(grammarAccess.getParameterDateTypeAccess().getGroup_3(), "rule__ParameterDateType__Group_3__0");
					put(grammarAccess.getParameterBooleanTypeAccess().getGroup(), "rule__ParameterBooleanType__Group__0");
					put(grammarAccess.getParameterBooleanTypeAccess().getGroup_3(), "rule__ParameterBooleanType__Group_3__0");
					put(grammarAccess.getParameterBase64TypeAccess().getGroup(), "rule__ParameterBase64Type__Group__0");
					put(grammarAccess.getParameterBase64TypeAccess().getGroup_3(), "rule__ParameterBase64Type__Group_3__0");
					put(grammarAccess.getParameterAnyTypeAccess().getGroup(), "rule__ParameterAnyType__Group__0");
					put(grammarAccess.getParameterAnyTypeAccess().getGroup_3(), "rule__ParameterAnyType__Group_3__0");
					put(grammarAccess.getParameterArrayTypeAccess().getGroup(), "rule__ParameterArrayType__Group__0");
					put(grammarAccess.getParameterArrayTypeAccess().getGroup_4(), "rule__ParameterArrayType__Group_4__0");
					put(grammarAccess.getParameterSequenceAccess().getGroup(), "rule__ParameterSequence__Group__0");
					put(grammarAccess.getParameterSequenceAccess().getGroup_3(), "rule__ParameterSequence__Group_3__0");
					put(grammarAccess.getParameterSequenceAccess().getGroup_3_3(), "rule__ParameterSequence__Group_3_3__0");
					put(grammarAccess.getParameterAnyAccess().getGroup(), "rule__ParameterAny__Group__0");
					put(grammarAccess.getParameterAnyAccess().getGroup_3(), "rule__ParameterAny__Group_3__0");
					put(grammarAccess.getParameterStringAccess().getGroup(), "rule__ParameterString__Group__0");
					put(grammarAccess.getParameterBase64Access().getGroup(), "rule__ParameterBase64__Group__0");
					put(grammarAccess.getParameterIntegerAccess().getGroup(), "rule__ParameterInteger__Group__0");
					put(grammarAccess.getParameterDoubleAccess().getGroup(), "rule__ParameterDouble__Group__0");
					put(grammarAccess.getParameterBooleanAccess().getGroup(), "rule__ParameterBoolean__Group__0");
					put(grammarAccess.getParameterStructAccess().getGroup(), "rule__ParameterStruct__Group__0");
					put(grammarAccess.getParameterStructAccess().getGroup_3(), "rule__ParameterStruct__Group_3__0");
					put(grammarAccess.getParameterStructAccess().getGroup_3_3(), "rule__ParameterStruct__Group_3_3__0");
					put(grammarAccess.getParameterDateAccess().getGroup(), "rule__ParameterDate__Group__0");
					put(grammarAccess.getParameterStructMemberAccess().getGroup(), "rule__ParameterStructMember__Group__0");
					put(grammarAccess.getParameterStructTypeMemberAccess().getGroup(), "rule__ParameterStructTypeMember__Group__0");
					put(grammarAccess.getParameterStructTypeMemberAccess().getGroup_5(), "rule__ParameterStructTypeMember__Group_5__0");
					put(grammarAccess.getPackageDependencyAccess().getGroup(), "rule__PackageDependency__Group__0");
					put(grammarAccess.getExternalDependencyAccess().getGroup(), "rule__ExternalDependency__Group__0");
					put(grammarAccess.getPackage_ImplAccess().getNameAssignment_2(), "rule__Package_Impl__NameAssignment_2");
					put(grammarAccess.getPackage_ImplAccess().getSpecAssignment_4_2(), "rule__Package_Impl__SpecAssignment_4_2");
					put(grammarAccess.getPackage_ImplAccess().getSpecAssignment_4_3_1(), "rule__Package_Impl__SpecAssignment_4_3_1");
					put(grammarAccess.getPackage_ImplAccess().getArtifactAssignment_5_2(), "rule__Package_Impl__ArtifactAssignment_5_2");
					put(grammarAccess.getPackage_ImplAccess().getArtifactAssignment_5_3_1(), "rule__Package_Impl__ArtifactAssignment_5_3_1");
					put(grammarAccess.getArtifactAccess().getNameAssignment_1(), "rule__Artifact__NameAssignment_1");
					put(grammarAccess.getArtifactAccess().getNodeAssignment_4(), "rule__Artifact__NodeAssignment_4");
					put(grammarAccess.getCatkinPackageAccess().getNameAssignment_2(), "rule__CatkinPackage__NameAssignment_2");
					put(grammarAccess.getCatkinPackageAccess().getSpecAssignment_4_2(), "rule__CatkinPackage__SpecAssignment_4_2");
					put(grammarAccess.getCatkinPackageAccess().getSpecAssignment_4_3_1(), "rule__CatkinPackage__SpecAssignment_4_3_1");
					put(grammarAccess.getCatkinPackageAccess().getArtifactAssignment_5_2(), "rule__CatkinPackage__ArtifactAssignment_5_2");
					put(grammarAccess.getCatkinPackageAccess().getArtifactAssignment_5_3_1(), "rule__CatkinPackage__ArtifactAssignment_5_3_1");
					put(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_2(), "rule__CatkinPackage__DependencyAssignment_6_2");
					put(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_3_1(), "rule__CatkinPackage__DependencyAssignment_6_3_1");
					put(grammarAccess.getServiceSpecAccess().getNameAssignment_2(), "rule__ServiceSpec__NameAssignment_2");
					put(grammarAccess.getServiceSpecAccess().getRequestAssignment_4_1(), "rule__ServiceSpec__RequestAssignment_4_1");
					put(grammarAccess.getServiceSpecAccess().getResponseAssignment_5_1(), "rule__ServiceSpec__ResponseAssignment_5_1");
					put(grammarAccess.getTopicSpecAccess().getNameAssignment_2(), "rule__TopicSpec__NameAssignment_2");
					put(grammarAccess.getTopicSpecAccess().getMessageAssignment_4_1(), "rule__TopicSpec__MessageAssignment_4_1");
					put(grammarAccess.getActionSpecAccess().getNameAssignment_2(), "rule__ActionSpec__NameAssignment_2");
					put(grammarAccess.getActionSpecAccess().getGoalAssignment_4_1(), "rule__ActionSpec__GoalAssignment_4_1");
					put(grammarAccess.getActionSpecAccess().getResultAssignment_5_1(), "rule__ActionSpec__ResultAssignment_5_1");
					put(grammarAccess.getActionSpecAccess().getFeedbackAssignment_6_1(), "rule__ActionSpec__FeedbackAssignment_6_1");
					put(grammarAccess.getNodeAccess().getNameAssignment_3(), "rule__Node__NameAssignment_3");
					put(grammarAccess.getNodeAccess().getServiceserverAssignment_4_2(), "rule__Node__ServiceserverAssignment_4_2");
					put(grammarAccess.getNodeAccess().getServiceserverAssignment_4_3_1(), "rule__Node__ServiceserverAssignment_4_3_1");
					put(grammarAccess.getNodeAccess().getPublisherAssignment_5_2(), "rule__Node__PublisherAssignment_5_2");
					put(grammarAccess.getNodeAccess().getPublisherAssignment_5_3_1(), "rule__Node__PublisherAssignment_5_3_1");
					put(grammarAccess.getNodeAccess().getSubscriberAssignment_6_2(), "rule__Node__SubscriberAssignment_6_2");
					put(grammarAccess.getNodeAccess().getSubscriberAssignment_6_3_1(), "rule__Node__SubscriberAssignment_6_3_1");
					put(grammarAccess.getNodeAccess().getServiceclientAssignment_7_2(), "rule__Node__ServiceclientAssignment_7_2");
					put(grammarAccess.getNodeAccess().getServiceclientAssignment_7_3_1(), "rule__Node__ServiceclientAssignment_7_3_1");
					put(grammarAccess.getNodeAccess().getActionserverAssignment_8_2(), "rule__Node__ActionserverAssignment_8_2");
					put(grammarAccess.getNodeAccess().getActionserverAssignment_8_3_1(), "rule__Node__ActionserverAssignment_8_3_1");
					put(grammarAccess.getNodeAccess().getActionclientAssignment_9_2(), "rule__Node__ActionclientAssignment_9_2");
					put(grammarAccess.getNodeAccess().getActionclientAssignment_9_3_1(), "rule__Node__ActionclientAssignment_9_3_1");
					put(grammarAccess.getNodeAccess().getParameterAssignment_10_2(), "rule__Node__ParameterAssignment_10_2");
					put(grammarAccess.getNodeAccess().getParameterAssignment_10_3_1(), "rule__Node__ParameterAssignment_10_3_1");
					put(grammarAccess.getServiceServerAccess().getNameAssignment_3(), "rule__ServiceServer__NameAssignment_3");
					put(grammarAccess.getServiceServerAccess().getServiceAssignment_5(), "rule__ServiceServer__ServiceAssignment_5");
					put(grammarAccess.getServiceServerAccess().getNamespaceAssignment_7(), "rule__ServiceServer__NamespaceAssignment_7");
					put(grammarAccess.getPublisherAccess().getNameAssignment_3(), "rule__Publisher__NameAssignment_3");
					put(grammarAccess.getPublisherAccess().getMessageAssignment_5(), "rule__Publisher__MessageAssignment_5");
					put(grammarAccess.getPublisherAccess().getNamespaceAssignment_7(), "rule__Publisher__NamespaceAssignment_7");
					put(grammarAccess.getSubscriberAccess().getNameAssignment_3(), "rule__Subscriber__NameAssignment_3");
					put(grammarAccess.getSubscriberAccess().getMessageAssignment_5(), "rule__Subscriber__MessageAssignment_5");
					put(grammarAccess.getSubscriberAccess().getNamespaceAssignment_7(), "rule__Subscriber__NamespaceAssignment_7");
					put(grammarAccess.getServiceClientAccess().getNameAssignment_3(), "rule__ServiceClient__NameAssignment_3");
					put(grammarAccess.getServiceClientAccess().getServiceAssignment_5(), "rule__ServiceClient__ServiceAssignment_5");
					put(grammarAccess.getServiceClientAccess().getNamespaceAssignment_7(), "rule__ServiceClient__NamespaceAssignment_7");
					put(grammarAccess.getActionServerAccess().getNameAssignment_3(), "rule__ActionServer__NameAssignment_3");
					put(grammarAccess.getActionServerAccess().getActionAssignment_5(), "rule__ActionServer__ActionAssignment_5");
					put(grammarAccess.getActionServerAccess().getNamespaceAssignment_7(), "rule__ActionServer__NamespaceAssignment_7");
					put(grammarAccess.getActionClientAccess().getNameAssignment_3(), "rule__ActionClient__NameAssignment_3");
					put(grammarAccess.getActionClientAccess().getActionAssignment_5(), "rule__ActionClient__ActionAssignment_5");
					put(grammarAccess.getActionClientAccess().getNamespaceAssignment_7(), "rule__ActionClient__NamespaceAssignment_7");
					put(grammarAccess.getParameterAccess().getNameAssignment_3(), "rule__Parameter__NameAssignment_3");
					put(grammarAccess.getParameterAccess().getNamespaceAssignment_5(), "rule__Parameter__NamespaceAssignment_5");
					put(grammarAccess.getParameterAccess().getTypeAssignment_7(), "rule__Parameter__TypeAssignment_7");
					put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2(), "rule__GlobalNamespace__PartsAssignment_3_2");
					put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1(), "rule__GlobalNamespace__PartsAssignment_3_3_1");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2(), "rule__RelativeNamespace_Impl__PartsAssignment_3_2");
					put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1(), "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1");
					put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2(), "rule__PrivateNamespace__PartsAssignment_3_2");
					put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1(), "rule__PrivateNamespace__PartsAssignment_3_3_1");
					put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3_2(), "rule__ParameterListType__SequenceAssignment_3_2");
					put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3_3_1(), "rule__ParameterListType__SequenceAssignment_3_3_1");
					put(grammarAccess.getParameterListTypeAccess().getDefaultAssignment_4_1(), "rule__ParameterListType__DefaultAssignment_4_1");
					put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3_2(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_3_2");
					put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3_3_1(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_3_3_1");
					put(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterIntegerType__DefaultAssignment_3_1");
					put(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterStringType__DefaultAssignment_3_1");
					put(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterDoubleType__DefaultAssignment_3_1");
					put(grammarAccess.getParameterDateTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterDateType__DefaultAssignment_3_1");
					put(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterBooleanType__DefaultAssignment_3_1");
					put(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_3_1(), "rule__ParameterBase64Type__DefaultAssignment_3_1");
					put(grammarAccess.getParameterAnyTypeAccess().getDefaultAssignment_3_1(), "rule__ParameterAnyType__DefaultAssignment_3_1");
					put(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_3(), "rule__ParameterArrayType__TypeAssignment_3");
					put(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1(), "rule__ParameterArrayType__DefaultAssignment_4_1");
					put(grammarAccess.getParameterSequenceAccess().getValueAssignment_3_2(), "rule__ParameterSequence__ValueAssignment_3_2");
					put(grammarAccess.getParameterSequenceAccess().getValueAssignment_3_3_1(), "rule__ParameterSequence__ValueAssignment_3_3_1");
					put(grammarAccess.getParameterAnyAccess().getValueAssignment_3_1(), "rule__ParameterAny__ValueAssignment_3_1");
					put(grammarAccess.getParameterStringAccess().getValueAssignment_3(), "rule__ParameterString__ValueAssignment_3");
					put(grammarAccess.getParameterBase64Access().getValueAssignment_3(), "rule__ParameterBase64__ValueAssignment_3");
					put(grammarAccess.getParameterIntegerAccess().getValueAssignment_3(), "rule__ParameterInteger__ValueAssignment_3");
					put(grammarAccess.getParameterDoubleAccess().getValueAssignment_3(), "rule__ParameterDouble__ValueAssignment_3");
					put(grammarAccess.getParameterBooleanAccess().getValueAssignment_3(), "rule__ParameterBoolean__ValueAssignment_3");
					put(grammarAccess.getParameterStructAccess().getValueAssignment_3_2(), "rule__ParameterStruct__ValueAssignment_3_2");
					put(grammarAccess.getParameterStructAccess().getValueAssignment_3_3_1(), "rule__ParameterStruct__ValueAssignment_3_3_1");
					put(grammarAccess.getParameterDateAccess().getValueAssignment_3(), "rule__ParameterDate__ValueAssignment_3");
					put(grammarAccess.getParameterStructMemberAccess().getNameAssignment_1(), "rule__ParameterStructMember__NameAssignment_1");
					put(grammarAccess.getParameterStructMemberAccess().getValueAssignment_4(), "rule__ParameterStructMember__ValueAssignment_4");
					put(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_1(), "rule__ParameterStructTypeMember__NameAssignment_1");
					put(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_4(), "rule__ParameterStructTypeMember__TypeAssignment_4");
					put(grammarAccess.getParameterStructTypeMemberAccess().getDefaultAssignment_5_1(), "rule__ParameterStructTypeMember__DefaultAssignment_5_1");
					put(grammarAccess.getPackageDependencyAccess().getPackageAssignment_3(), "rule__PackageDependency__PackageAssignment_3");
					put(grammarAccess.getExternalDependencyAccess().getNameAssignment_2(), "rule__ExternalDependency__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RosGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RosGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
