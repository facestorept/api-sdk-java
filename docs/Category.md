
# Category

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**position** | **Integer** |  |  [optional]
**imageSmall** | **String** | The file to be attached. Must be multipart/form-data. The maximum file size is 2 MB.  |  [optional]
**imageLarger** | **String** | The file to be attached. Must be multipart/form-data. The maximum file size is 2 MB.  |  [optional]
**active** | **Boolean** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**visibility** | [**List&lt;VisibilityEnum&gt;**](#List&lt;VisibilityEnum&gt;) | channels that resource are showed |  [optional]
**i18n** | [**List&lt;I18n&gt;**](I18n.md) | I18n fields to categories |  [optional]


<a name="List<VisibilityEnum>"></a>
## Enum: List&lt;VisibilityEnum&gt;
Name | Value
---- | -----
FACEBOOK | &quot;facebook&quot;
MOBILE | &quot;mobile&quot;
WEBSTORE | &quot;webstore&quot;
NONE | &quot;none&quot;
ALL | &quot;all&quot;



