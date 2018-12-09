package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDeliveryTemplate<M extends BaseDeliveryTemplate<M>> extends Model<M> implements IBean {

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

	public void setBackground(java.lang.String background) {
		set("background", background);
	}

	public java.lang.String getBackground() {
		return getStr("background");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setHeight(java.lang.Integer height) {
		set("height", height);
	}

	public java.lang.Integer getHeight() {
		return getInt("height");
	}

	public void setIsDefault(java.lang.Boolean isDefault) {
		set("is_default", isDefault);
	}

	public java.lang.Boolean getIsDefault() {
		return get("is_default");
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

	public void setOffsetX(java.lang.Integer offsetX) {
		set("offset_x", offsetX);
	}

	public java.lang.Integer getOffsetX() {
		return getInt("offset_x");
	}

	public void setOffsetY(java.lang.Integer offsetY) {
		set("offset_y", offsetY);
	}

	public java.lang.Integer getOffsetY() {
		return getInt("offset_y");
	}

	public void setWidth(java.lang.Integer width) {
		set("width", width);
	}

	public java.lang.Integer getWidth() {
		return getInt("width");
	}

	public void setStoreId(java.lang.Long storeId) {
		set("store_id", storeId);
	}

	public java.lang.Long getStoreId() {
		return getLong("store_id");
	}

}