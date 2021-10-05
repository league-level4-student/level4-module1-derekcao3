package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.
	enum Zodiac {
		ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SEGITTARIUS, CAPRICORN, AQUARIUS, PISCES
	}

	Zodiac horoscope;

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	public  void showHoroscope(Zodiac horoscope) {
		switch (horoscope) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Aries");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Tarus");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Gemini");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Cancer");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Leo");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Virgo");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Libra");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Scorpio");
			break;
		case SEGITTARIUS:
			JOptionPane.showMessageDialog(null, "Segittarius");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Capricorn");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Aquarius");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Pisces");
			break;
		}

	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
new _00_Horoscope().showHoroscope(Zodiac.ARIES);
new _00_Horoscope().showHoroscope(Zodiac.LIBRA);
new _00_Horoscope().showHoroscope(Zodiac.PISCES);


	}
}
