int roman_to_int(string roman){
	map<char,int> rmap;
	rmap['I'] =   1;
	rmap['V'] =   5;
	rmap['X'] =  10;
	rmap['L'] =  50;
	rmap['C'] = 100;
	rmap['D'] = 500;
	rmap['M'] =1000;
	int number=0,i=0;
	
	//If input is only one character
	if(roman.length()<=1){
		return rmap[roman.at(0)];
	}
	else{
		while(i<roman.size()){
			if(rmap[roman[i]]<rmap[roman[i+1]]){
				number+=rmap[roman[i+1]]-rmap[roman[i]];
				i+=2;
			}
			else{
				number+=rmap[roman[i]];
				i++;
			}
		}
		return number;
	}
}
