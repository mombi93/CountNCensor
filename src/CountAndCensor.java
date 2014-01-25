class CountAndCensor {
	
	public void count_and_censor_words(String raw_text, String censored_words[]){			
		String[] allWord = raw_text.split("\\s+");
		int wordCount = allWord.length;
		System.out.println("total_words: " + wordCount);
		
		int CensoredWordCount = 0;
		for (String censor : censored_words){
			CensoredWordCount++;
			String stars = "";
			for (int i = 0; i < censor.length(); i++){
				stars += '*';
			}
			raw_text = raw_text.replaceAll(censor, stars);
		}
		System.out.println("censored_text: " + raw_text);
		System.out.println("censored_word: " + CensoredWordCount);
	}
	
	public void start(){
		String raw_text = "HELLO my name is Blank Robot. I live in Roboville. I love Roboville so much. I want to live there forever and ever and ever";
		String censored_words[]={"Roboville","I"};
		count_and_censor_words(raw_text,censored_words);
	}
	
	public static void main(String[] args){
		CountAndCensor initialise = new CountAndCensor();
		initialise.start();
	}
	
}
