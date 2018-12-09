package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCart<M extends BaseCart<M>> extends Model<M> implements IBean {

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

	public void setExpire(java.util.Date expire) {
		set("expire", expire);
	}

	public java.util.Date getExpire() {
		return get("expire");
	}

	public void setCartKey(java.lang.String cartKey) {
		set("cart_key", cartKey);
	}

	public java.lang.String getCartKey() {
		return getStr("cart_key");
	}

	public void setMemberId(java.lang.Long memberId) {
		set("member_id", memberId);
	}

	public java.lang.Long getMemberId() {
		return getLong("member_id");
	}

}