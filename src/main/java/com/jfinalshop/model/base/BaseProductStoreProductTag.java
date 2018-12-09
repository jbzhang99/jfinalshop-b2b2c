package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductStoreProductTag<M extends BaseProductStoreProductTag<M>> extends Model<M> implements IBean {

	public void setProductsId(java.lang.Long productsId) {
		set("products_id", productsId);
	}

	public java.lang.Long getProductsId() {
		return getLong("products_id");
	}

	public void setStoreProductTagsId(java.lang.Long storeProductTagsId) {
		set("store_product_tags_id", storeProductTagsId);
	}

	public java.lang.Long getStoreProductTagsId() {
		return getLong("store_product_tags_id");
	}

}