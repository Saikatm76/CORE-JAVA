class Bank{
	int get_rate_of_interest()
	{
		return 0;
	}
		}
	class SBI extends Bank{
		int get_rate_of_interest()
		{
            return 8;
		}
	}
	class ICICI extends Bank{
		int get_rate_of_interest()
		{
			return 7;
		}
	}
	class AXIS extends Bank{
		int get_rate_of_interest()
		{
			return 6;
		}
	}
class methodoverridingtest2{
	public static void main(String[] args) {
		SBI mb1=new SBI();
		ICICI mb2=new ICICI();
		AXIS mb3=new AXIS();
		System.out.println("SBI bank rate of interest: "+mb1.get_rate_of_interest());
		System.out.println("ICICI bank rate of interest: "+mb2.get_rate_of_interest());
		System.out.println("AXIS bank rate of interest: "+mb3.get_rate_of_interest());
	}
}
