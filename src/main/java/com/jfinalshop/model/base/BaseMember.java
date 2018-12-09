package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMember<M extends BaseMember<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setCreatedDate(java.util.Date createdDate) {
		set("created_date", createdDate);
	}

	public java.util.Date getCreatedDate() {
		return get("created_date");
	}

	public void setLastModifiedDate(java.util.Date lastModifiedDate) {
		set("last_modified_date", lastModifiedDate);
	}

	public java.util.Date getLastModifiedDate() {
		return get("last_modified_date");
	}

	public void setVersion(java.lang.Long version) {
		set("version", version);
	}

	public java.lang.Long getVersion() {
		return getLong("version");
	}

	public void setIsEnabled(java.lang.Boolean isEnabled) {
		set("is_enabled", isEnabled);
	}

	public java.lang.Boolean getIsEnabled() {
		return get("is_enabled");
	}

	public void setIsLocked(java.lang.Boolean isLocked) {
		set("is_locked", isLocked);
	}

	public java.lang.Boolean getIsLocked() {
		return get("is_locked");
	}

	public void setLastLoginDate(java.util.Date lastLoginDate) {
		set("last_login_date", lastLoginDate);
	}

	public java.util.Date getLastLoginDate() {
		return get("last_login_date");
	}

	public void setLastLoginIp(java.lang.String lastLoginIp) {
		set("last_login_ip", lastLoginIp);
	}

	public java.lang.String getLastLoginIp() {
		return getStr("last_login_ip");
	}

	public void setLockDate(java.util.Date lockDate) {
		set("lock_date", lockDate);
	}

	public java.util.Date getLockDate() {
		return get("lock_date");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}

	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
	}

	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

	public void setAttributeValue0(java.lang.String attributeValue0) {
		set("attribute_value0", attributeValue0);
	}

	public java.lang.String getAttributeValue0() {
		return getStr("attribute_value0");
	}

	public void setAttributeValue1(java.lang.String attributeValue1) {
		set("attribute_value1", attributeValue1);
	}

	public java.lang.String getAttributeValue1() {
		return getStr("attribute_value1");
	}

	public void setAttributeValue2(java.lang.String attributeValue2) {
		set("attribute_value2", attributeValue2);
	}

	public java.lang.String getAttributeValue2() {
		return getStr("attribute_value2");
	}

	public void setAttributeValue3(java.lang.String attributeValue3) {
		set("attribute_value3", attributeValue3);
	}

	public java.lang.String getAttributeValue3() {
		return getStr("attribute_value3");
	}

	public void setAttributeValue4(java.lang.String attributeValue4) {
		set("attribute_value4", attributeValue4);
	}

	public java.lang.String getAttributeValue4() {
		return getStr("attribute_value4");
	}

	public void setAttributeValue5(java.lang.String attributeValue5) {
		set("attribute_value5", attributeValue5);
	}

	public java.lang.String getAttributeValue5() {
		return getStr("attribute_value5");
	}

	public void setAttributeValue6(java.lang.String attributeValue6) {
		set("attribute_value6", attributeValue6);
	}

	public java.lang.String getAttributeValue6() {
		return getStr("attribute_value6");
	}

	public void setAttributeValue7(java.lang.String attributeValue7) {
		set("attribute_value7", attributeValue7);
	}

	public java.lang.String getAttributeValue7() {
		return getStr("attribute_value7");
	}

	public void setAttributeValue8(java.lang.String attributeValue8) {
		set("attribute_value8", attributeValue8);
	}

	public java.lang.String getAttributeValue8() {
		return getStr("attribute_value8");
	}

	public void setAttributeValue9(java.lang.String attributeValue9) {
		set("attribute_value9", attributeValue9);
	}

	public java.lang.String getAttributeValue9() {
		return getStr("attribute_value9");
	}

	public void setBalance(java.math.BigDecimal balance) {
		set("balance", balance);
	}

	public java.math.BigDecimal getBalance() {
		return get("balance");
	}

	public void setBirth(java.util.Date birth) {
		set("birth", birth);
	}

	public java.util.Date getBirth() {
		return get("birth");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setHasher(java.lang.String hasher) {
		set("hasher", hasher);
	}

	public java.lang.String getHasher() {
		return getStr("hasher");
	}

	public void setSalt(java.lang.String salt) {
		set("salt", salt);
	}

	public java.lang.String getSalt() {
		return getStr("salt");
	}

	public void setGender(java.lang.Integer gender) {
		set("gender", gender);
	}

	public java.lang.Integer getGender() {
		return getInt("gender");
	}

	public void setMobile(java.lang.String mobile) {
		set("mobile", mobile);
	}

	public java.lang.String getMobile() {
		return getStr("mobile");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return getStr("name");
	}

	public void setOpenId(java.lang.String openId) {
		set("open_id", openId);
	}

	public java.lang.String getOpenId() {
		return getStr("open_id");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setPoint(java.lang.Long point) {
		set("point", point);
	}

	public java.lang.Long getPoint() {
		return getLong("point");
	}

	public void setSafekeyExpire(java.util.Date safekeyExpire) {
		set("safeKey_expire", safekeyExpire);
	}

	public java.util.Date getSafekeyExpire() {
		return get("safeKey_expire");
	}

	public void setSafekeyValue(java.lang.String safekeyValue) {
		set("safeKey_value", safekeyValue);
	}

	public java.lang.String getSafekeyValue() {
		return getStr("safeKey_value");
	}

	public void setUsername(java.lang.String username) {
		set("username", username);
	}

	public java.lang.String getUsername() {
		return getStr("username");
	}

	public void setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
	}

	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

	public void setZipCode(java.lang.String zipCode) {
		set("zip_code", zipCode);
	}

	public java.lang.String getZipCode() {
		return getStr("zip_code");
	}

	public void setAreaId(java.lang.Long areaId) {
		set("area_id", areaId);
	}

	public java.lang.Long getAreaId() {
		return getLong("area_id");
	}

	public void setStoreId(java.lang.Long storeId) {
		set("store_id", storeId);
	}

	public java.lang.Long getStoreId() {
		return getLong("store_id");
	}

	public void setMemberRankId(java.lang.Long memberRankId) {
		set("member_rank_id", memberRankId);
	}

	public java.lang.Long getMemberRankId() {
		return getLong("member_rank_id");
	}

}