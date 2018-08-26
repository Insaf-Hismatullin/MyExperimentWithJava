import javax.sound.midi.*;

public class MusicTest1{


	public void play(){

		try{	
	
			Sequencer player = MidiSystem.getSequencer(); //получить синтезатор
			System.out.println("”спешно получили синтезатор");
					
			player.open();//открыть его(синтезатор)

			Sequence seq = new Sequence(Sequence.PPQ, 4); //создать новую последовательность

			Track track = seq.createTrack(); //получить новый трек из последовательности

			ShortMessage a = new ShortMessage();		
			a.setMessage(144, 102, 44, 100);
			MidiEvent noteOn = new MidiEvent(a,1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			b.setMessage(128, 102, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff); //ѕомещаем в трек MIDI-событи€
			
			player.setSequence(seq);
			player.start();



		} catch(Exception ex){

			System.out.println("Ќеудача!");
			ex.printStackTrace();

		}

	}

	public static void main (String... args) {

		MusicTest1 mt = new MusicTest1();
		mt.play();

	}	

}