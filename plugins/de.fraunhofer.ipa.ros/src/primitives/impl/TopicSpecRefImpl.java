/**
 */
package primitives.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import primitives.PrimitivesPackage;
import primitives.TopicSpecRef;

import ros.TopicSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic Spec Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link primitives.impl.TopicSpecRefImpl#getTopicSpec <em>Topic Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicSpecRefImpl extends AbstractTypeImpl implements TopicSpecRef {
	/**
	 * The cached value of the '{@link #getTopicSpec() <em>Topic Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicSpec()
	 * @generated
	 * @ordered
	 */
	protected TopicSpec topicSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicSpecRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimitivesPackage.Literals.TOPIC_SPEC_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicSpec getTopicSpec() {
		if (topicSpec != null && topicSpec.eIsProxy()) {
			InternalEObject oldTopicSpec = (InternalEObject)topicSpec;
			topicSpec = (TopicSpec)eResolveProxy(oldTopicSpec);
			if (topicSpec != oldTopicSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrimitivesPackage.TOPIC_SPEC_REF__TOPIC_SPEC, oldTopicSpec, topicSpec));
			}
		}
		return topicSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicSpec basicGetTopicSpec() {
		return topicSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicSpec(TopicSpec newTopicSpec) {
		TopicSpec oldTopicSpec = topicSpec;
		topicSpec = newTopicSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimitivesPackage.TOPIC_SPEC_REF__TOPIC_SPEC, oldTopicSpec, topicSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrimitivesPackage.TOPIC_SPEC_REF__TOPIC_SPEC:
				if (resolve) return getTopicSpec();
				return basicGetTopicSpec();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrimitivesPackage.TOPIC_SPEC_REF__TOPIC_SPEC:
				setTopicSpec((TopicSpec)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrimitivesPackage.TOPIC_SPEC_REF__TOPIC_SPEC:
				setTopicSpec((TopicSpec)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrimitivesPackage.TOPIC_SPEC_REF__TOPIC_SPEC:
				return topicSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //TopicSpecRefImpl
