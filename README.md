## Data Preprocessing
Using Regular Expression to replace the following lists:
- [x] Price with \_PRICE\_
  - Price Regex
  ```
  ((由)?( )*(([\$|＄]( )*[0-9\.,]+(～|~)( )*[0-9\.,]+)|([\$|＄]( )*[0-9,\.]+( )*元)|((NT|¥|￥)( )*(:)?( )*[0-9,\.]+( )*元)|([\$＄￥¥]( )*(:)*( )*[0-9,\.]+( )?(￥|¥)?)|((NT|¥|￥)( )*[\$|＄]( )*(:)?( )*[0-9,\.]+( )*元)|((NT|¥|￥)( )*[\$|＄]( )*(:)?( )*[0-9,\.]+)|((NT|¥|￥)( )*(:)?( )*[0-9,\.]+)|([0-9\.,]+( )*元)|((NTD|¥|￥)( )*(:)\?( )*[0-9,\.]+)|((NTD|¥|￥)( )*[\$|＄]( )*(:)?( )*[0-9,\.]+)|(原( )*[\$|＄]( )*[0-9,\.]+)|([\$|＄]( )*[0-9,\.]+( )*(∼|～)( )*[0-9,\.]+))( )*[～|~|-|到]*)+
  ```
- [ ] Dates with \_DATES\_
  - Date Regex
  ```
  (([0-9]{1,2}(st|nd|th)?)?([^A-Za-z0-9]([Jj](an|AN)(\.|uary|UARY)?|[Ff](eb|EB)(\.|RUARY|ruary)?|[Mm](ar|AR)(\.|ch|CH)?|[Aa](PR|pr)(\.|il|IL)?|[Mm](AY|ay)|[Jj](UN|un)(\.|e|E)?|[Jj](ul|UL)(\.|y|Y)?|[Aa](UG|ug)(\.|ust|UST)?|[Ss](EP|ep)(t)?(\.|ember|EMBER)?|[Oo](ct|CT)(\.|ober|OBER)?|[Nn](ov|OV)(\.|ember|EMBER)?|[Dd](ec|EC)(\.|ember|EMBER)?)([^A-Za-z0-9])([0-9]{4})?([0-9]{1,2}( )?(,)?( )?)?([0-9]{4})?|[0-9]{4}( )?[年/-][0-9]{1,2}[-/月][0-9]{1,2}[日]?|[0-9]{1,2}[-\\\/][0-9]{1,2}[\\\/-][0-9]{4}))
  
  ``` 	
  - [ ] URL with \_URL\_
- [ ] volume of a product with \_VOLUME\_
- [ ] unit of an item with \_UNIT\_
