
# Brand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**position** | **Long** |  |  [optional]
**imageSmall** | **String** |  |  [optional]
**imageLarger** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**visibility** | [**List&lt;VisibilityEnum&gt;**](#List&lt;VisibilityEnum&gt;) | channels that resource are showed |  [optional]
**i18n** | [**List&lt;I18n&gt;**](I18n.md) | I18n fields to brands |  [optional]


<a name="List<VisibilityEnum>"></a>
## Enum: List&lt;VisibilityEnum&gt;
Name | Value
---- | -----
FACEBOOK | &quot;facebook&quot;
MOBILE | &quot;mobile&quot;
WEBSTORE | &quot;webstore&quot;
NONE | &quot;none&quot;
ALL | &quot;all&quot;



