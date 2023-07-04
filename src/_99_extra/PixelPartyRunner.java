package _99_extra;

public class PixelPartyRunner {
public static void main(String[] args) {
	PixelParty party = new PixelParty();
	party.setColor(21, 219, 184);
	party.setRainbow(true);
	party.drawTriangle(20, 50, 100, 250, 80, 129);
	party.drawRectangle(200, 150, 300, 129);
	party.drawCircle(400, 200, 300);
	party.saveImage();
	party.displayImage();
}
}
