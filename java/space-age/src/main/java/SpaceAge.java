class Orbital {

	public static final double EARTH   = 31557600.0;
	public static final double MERCURY = 0.2408467;
	public static final double VENUS   = 0.61519726;
	public static final double MARS    = 1.8808158;
	public static final double JUPITER = 11.862615;
	public static final double SATURN  = 29.447498;
	public static final double URANUS  = 84.016846;
	public static final double NEPTUNE = 164.79132;
}

class SpaceAge {

	private double seconds;
				
  SpaceAge(double seconds) {
  	this.seconds = seconds;
  }

  private double truncate(double number) {
    return Double.parseDouble(String.format("%.2f", number));
  }

  
  private double calc(double orbitalPeriod) {
    return orbitalPeriod / Orbital.EARTH;
  }

  double getSeconds() {
    return this.seconds;   
  }

  double onEarth() {
    return truncate(calc(this.seconds));
  }

  double onMercury() {
    return truncate(calc(this.seconds) / Orbital.MERCURY);
  }

  double onVenus() {
    return truncate(calc(this.seconds) / Orbital.VENUS); 
  }

  double onMars() {
    return truncate(calc(this.seconds) / Orbital.MARS);   
  }

  double onJupiter() {
    return truncate(calc(this.seconds) / Orbital.JUPITER);   
  }

  double onSaturn() {
    return truncate(calc(this.seconds) / Orbital.SATURN);   
  }

  double onUranus() {
    return truncate(calc(this.seconds) / Orbital.URANUS);
  }

  double onNeptune() {
    return truncate(calc(this.seconds) / Orbital.NEPTUNE);
  }

}
