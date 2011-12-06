/**
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 * 
 */
package org.emftext.language.javaproperties.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.javaproperties.JavapropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.javaproperties.impl.KeyValuePairImpl#getTypedKey <em>Key</em>}</li>
 *   <li>{@link org.emftext.language.javaproperties.impl.KeyValuePairImpl#getTypedValue <em>Value</em>}</li>
 *   <li>{@link org.emftext.language.javaproperties.impl.KeyValuePairImpl#getWhiteSpaceBefore <em>White Space Before</em>}</li>
 *   <li>{@link org.emftext.language.javaproperties.impl.KeyValuePairImpl#getWhiteSpaceAfter <em>White Space After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyValuePairImpl extends EObjectImpl implements BasicEMap.Entry<String,String> {
	/**
	 * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypedValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTypedValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhiteSpaceBefore() <em>White Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String WHITE_SPACE_BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhiteSpaceBefore() <em>White Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected String whiteSpaceBefore = WHITE_SPACE_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhiteSpaceAfter() <em>White Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String WHITE_SPACE_AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhiteSpaceAfter() <em>White Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected String whiteSpaceAfter = WHITE_SPACE_AFTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyValuePairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavapropertiesPackage.Literals.KEY_VALUE_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypedKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavapropertiesPackage.KEY_VALUE_PAIR__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypedValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypedValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavapropertiesPackage.KEY_VALUE_PAIR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhiteSpaceBefore() {
		return whiteSpaceBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteSpaceBefore(String newWhiteSpaceBefore) {
		String oldWhiteSpaceBefore = whiteSpaceBefore;
		whiteSpaceBefore = newWhiteSpaceBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_BEFORE, oldWhiteSpaceBefore, whiteSpaceBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhiteSpaceAfter() {
		return whiteSpaceAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteSpaceAfter(String newWhiteSpaceAfter) {
		String oldWhiteSpaceAfter = whiteSpaceAfter;
		whiteSpaceAfter = newWhiteSpaceAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_AFTER, oldWhiteSpaceAfter, whiteSpaceAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavapropertiesPackage.KEY_VALUE_PAIR__KEY:
				return getTypedKey();
			case JavapropertiesPackage.KEY_VALUE_PAIR__VALUE:
				return getTypedValue();
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_BEFORE:
				return getWhiteSpaceBefore();
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_AFTER:
				return getWhiteSpaceAfter();
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
			case JavapropertiesPackage.KEY_VALUE_PAIR__KEY:
				setTypedKey((String)newValue);
				return;
			case JavapropertiesPackage.KEY_VALUE_PAIR__VALUE:
				setTypedValue((String)newValue);
				return;
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_BEFORE:
				setWhiteSpaceBefore((String)newValue);
				return;
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_AFTER:
				setWhiteSpaceAfter((String)newValue);
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
			case JavapropertiesPackage.KEY_VALUE_PAIR__KEY:
				setTypedKey(KEY_EDEFAULT);
				return;
			case JavapropertiesPackage.KEY_VALUE_PAIR__VALUE:
				setTypedValue(VALUE_EDEFAULT);
				return;
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_BEFORE:
				setWhiteSpaceBefore(WHITE_SPACE_BEFORE_EDEFAULT);
				return;
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_AFTER:
				setWhiteSpaceAfter(WHITE_SPACE_AFTER_EDEFAULT);
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
			case JavapropertiesPackage.KEY_VALUE_PAIR__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case JavapropertiesPackage.KEY_VALUE_PAIR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_BEFORE:
				return WHITE_SPACE_BEFORE_EDEFAULT == null ? whiteSpaceBefore != null : !WHITE_SPACE_BEFORE_EDEFAULT.equals(whiteSpaceBefore);
			case JavapropertiesPackage.KEY_VALUE_PAIR__WHITE_SPACE_AFTER:
				return WHITE_SPACE_AFTER_EDEFAULT == null ? whiteSpaceAfter != null : !WHITE_SPACE_AFTER_EDEFAULT.equals(whiteSpaceAfter);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(", whiteSpaceBefore: ");
		result.append(whiteSpaceBefore);
		result.append(", whiteSpaceAfter: ");
		result.append(whiteSpaceAfter);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int hash = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHash() {
		if (hash == -1) {
			Object theKey = getKey();
			hash = (theKey == null ? 0 : theKey.hashCode());
		}
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(int hash) {
		this.hash = hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return getTypedKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String key) {
		setTypedKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return getTypedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setValue(String value) {
		String oldValue = getValue();
		setTypedValue(value);
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, String> getEMap() {
		EObject container = eContainer();
		return container == null ? null : (EMap<String, String>)container.eGet(eContainmentFeature());
	}

} //KeyValuePairImpl
