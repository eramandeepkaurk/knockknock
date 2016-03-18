package redify.knockknock.webservices;

public class TestWebService {
		private static String STRING_NULL="100";
		private static String STRING_EMPTY_SPACE="101";
		private static String STRING_SUCCESS="102";
		
		public String concatStringsAndReturnCode(String string1, String string2){
			String resultCode="";
			String resultMessage="";
			String stringConcatenation = "";
			
			if(string1==null || string2==null){
				resultCode = STRING_NULL;
			}
			if(resultCode.trim().length()==0){
				if(string1.trim().length()==0 || string2.trim().length()==0){
					resultCode = STRING_EMPTY_SPACE;
				}
			}
			if(resultCode.trim().length()==0){
				stringConcatenation = string1.concat(string2);
				resultCode = STRING_SUCCESS;
			}
			
			if(resultCode.equals(STRING_NULL)){
				resultMessage+= "Null values entered for ";
				if(string1==null){
					resultMessage+= "String1";
				}
				if(string2==null){
					if(string1 == null){
						resultMessage+=" and ";
					}
					resultMessage+= "String2";					
				}				
			}else if(resultCode.equals(STRING_EMPTY_SPACE)){
				resultMessage = "Fields are empty for ";
				if(string1.trim().length()==0){
					resultMessage+= "String1";
				}
				if(string2.trim().length()==0){
					if(string1.trim().length()==0){
						resultMessage+=" and ";
					}
					resultMessage+= "String2";
				}				
			}else if(resultCode.equals(STRING_SUCCESS)){
				resultMessage = "The result is "+stringConcatenation;
			}
						
			return resultMessage;
		}
	
}
