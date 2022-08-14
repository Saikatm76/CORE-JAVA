class arraycopymethod{
	public static void main(String[] args) {
		char arrcopyfrom[]={'a','b','c','d','e','d','b','s','w','g','h'};
		char arrcopyto[]=new char[6];
		System.arraycopy(arrcopyfrom,3,arrcopyto,0,6);
		System.out.println(new String(arrcopyto));
	}
}