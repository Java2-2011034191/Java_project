package sample_0407;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void pr(){
		System.out.println("ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�." + onOff);
				
	}

	int changeChannel (int ch){
		channel = ch;
		return channel;
	}
}
