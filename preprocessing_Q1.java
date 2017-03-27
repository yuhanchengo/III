import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class preprocessing_Q1 {

	public static void main(String[] args) {
		final String Price = "((由)?( )*(([\\$|＄]( )*[0-9\\.,]+(～|~)( )*[0-9\\.,]+)|([\\$|＄]( )*[0-9,\\.]+( )*元)|((NT|¥|￥)( )*(:)?( )*[0-9,\\.]+( )*元)|([\\$＄￥¥]( )*(:)*( )*[0-9,\\.]+( )?(￥|¥)?)|((NT|¥|￥)( )*[\\$|＄]( )*(:)?( )*[0-9,\\.]+( )*元)|((NT|¥|￥)( )*[\\$|＄]( )*(:)?( )*[0-9,\\.]+)|((NT|¥|￥)( )*(:)?( )*[0-9,\\.]+)|([0-9\\.,]+( )*元)|((NTD|¥|￥)( )*(:)\\?( )*[0-9,\\.]+)|((NTD|¥|￥)( )*[\\$|＄]( )*(:)?( )*[0-9,\\.]+)|(原( )*[\\$|＄]( )*[0-9,\\.]+)|([\\$|＄]( )*[0-9,\\.]+( )*(∼|～)( )*[0-9,\\.]+))( )*[～|~|-|到]*)+";
		final String Quant_3 = "([一二三四五六七八九十](公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|卡|箱|罐))?(\\s)?\\(?[0-9]+(\\.[0-9]*)?(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|卡|箱|罐)+(\\s)?(\\(|\\*|x|X|\\+)?\\s?[0-9]+(\\.[0-9]*)?(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|箱|罐)((\\*|x|X)?[0-9]?(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|卡|箱|罐))?(\\/(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|箱|罐)|\\*|x|X)*[0-9]*(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|罐|箱)*\\)?\\s?((\\/\\s?(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|箱|罐)\\)?)|(\\*|x|X|\\/\\s?(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|罐|箱))[0-9]+(\\.[0-9]*)?\\s?(公克|袋|盒|g|克|入|包|塊|本|cm|mm|mmHg|ml|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|卡|箱|罐)\\)?)";
		final String Date = "(([0-9]{1,2}(st|nd|th)?)?([^A-Za-z0-9]([Jj](an|AN)(\\.|uary|UARY)?|[Ff](eb|EB)(\\.|RUARY|ruary)?|[Mm](ar|AR)(\\.|ch|CH)?|[Aa](PR|pr)(\\.|il|IL)?|[Mm](AY|ay)|[Jj](UN|un)(\\.|e|E)?|[Jj](ul|UL)(\\.|y|Y)?|[Aa](UG|ug)(\\.|ust|UST)?|[Ss](EP|ep)(t)?(\\.|ember|EMBER)?|[Oo](ct|CT)(\\.|ober|OBER)?|[Nn](ov|OV)(\\.|ember|EMBER)?|[Dd](ec|EC)(\\.|ember|EMBER)?)([^A-Za-z0-9])([0-9]{4})?([0-9]{1,2}( )?(,)?( )?)?([0-9]{4})?|[0-9]{4}( )?[年/-][0-9]{1,2}[-/月][0-9]{1,2}[日]?|[0-9]{1,2}[-'\\'\\/][0-9]{1,2}['\\'\\/-][0-9]{4}))";
		final String Quant_1 = "([0-9]+(\\.[0-9]+)?|[一二三四五六七八九十])(公克|袋|盒|g|克|入|包|塊|本|cm|CM|mm|mmHg|ml|ML|mL|m|mg|g|kg|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|卡|箱|罐)((x|X|×)([0-9]+(\\.[0-9]+)?|[一二三四五六七八九十]))?";
		final String Quant_2 = "([0-9]+(\\.[0-9]+)?|[一二三四五六七八九十])(\\s)?(公克|袋|盒|g|G|克|入|包|塊|本|cm|CM|mm|mmHg|ml|ML|mL|m|mg|g|kg|KG|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|卡|箱|罐)+(\\s)?(\\/|／|x|X|×|\\*)?(\\s)?([0-9]+(\\.[0-9]+)?|[一二三四五六七八九十])?(\\s)?(公克|袋|盒|g|克|入|包|塊|本|cm|CM|mm|mL|mmHg|ml|ML|m|mg|g|G|kg|KG|公分|公斤|毫米|毫克|尺|公尺|份|台|件|片|粒|枚|支|個|抽|組|裝|卡|瓶|條|卡|箱|罐)+";
		final String URL = "((https?|http|ftp|file):\\/\\/|www.)[-a-zA-Z0-9+&@#/%?=~_|!:,\\.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		final String More = "\\.\\.\\.";
		try{
		      BufferedReader br = new BufferedReader(new FileReader("/Users/joy/GitHub/III/Poya Goods Yahoo Snippet.txt"));
		      BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/joy/GitHub/III/clean Yahoo Snippet.txt"));
		      while(br.ready()){
		        String line = br.readLine();
		        line = line.replaceAll(URL, "___URL___").replaceAll(Price, " ___PRICE___ ").replaceAll(Date, " ___DATE___ ").replaceAll(Quant_3, " ___QUANTITY___ ").replaceAll(Quant_2, " ___QUANTITY___ ").replaceAll(Quant_1," ___QUANTITY___ " ).replaceAll(More, " ___MORE___ ");
		        System.out.println(line);
		        bw.write(line);
		        bw.newLine();
		      }
		      br.close();
		      bw.close();
		    }catch(IOException e){
		      e.printStackTrace();
		    }
	}

}
