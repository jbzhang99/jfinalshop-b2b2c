package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseStoreProductTag<M extends BaseStoreProductTag<M>> extends Model<M> implements IBean {

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

	public void setOrders(java.lang.Integer orders) {
		set("orders", orders);
	}

	public java.lang.Integer getOrders() {
		return getInt("orders");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}

	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setIsEnabled(java.lang.Boolean isEnabled) {
		set("is_enabled", isEnabled);
	}

	public java.lang.Boolean getIsEnabled() {
		return get("is_enabled");
	}

	public void setMemo(java.lang.String memo) {
		set("memo", memo);
	}

	public java.lang.String getMemo() {
		return getStr("memo");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return getStr("name");
	}

	public void setStoreId(java.lang.Long storeId) {
		set("store_id", storeId);
	}

	public java.lang.Long getStoreId() {
		return getLong("store_id");
	}

}
