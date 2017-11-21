
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**sku** | **String** |  |  [optional]
**manual** | **String** |  |  [optional]
**urlVideo** | **String** |  |  [optional]
**visibility** | [**List&lt;VisibilityEnum&gt;**](#List&lt;VisibilityEnum&gt;) | channels that resource are showed |  [optional]
**inHomepage** | **Boolean** |  |  [optional]
**isPrefered** | **Boolean** |  |  [optional]
**isDigital** | **Boolean** |  |  [optional]
**urlDigital** | **String** |  |  [optional]
**isNew** | **Boolean** |  |  [optional]
**i18n** | [**I18nProduct**](I18nProduct.md) |  |  [optional]
**active** | **Boolean** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="List<VisibilityEnum>"></a>
## Enum: List&lt;VisibilityEnum&gt;
Name | Value
---- | -----
FACEBOOK | &quot;facebook&quot;
MOBILE | &quot;mobile&quot;
WEBSTORE | &quot;webstore&quot;
NONE | &quot;none&quot;
ALL | &quot;all&quot;



