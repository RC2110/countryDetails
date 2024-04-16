package org.tcs;

import org.hcl.IndianStates;

public class UnionTerritories extends IndianStates{
	
	private void andamanNicobar() {
		System.out.println("Andaman: Union territory Island");
	}
	
	private void ladakh() {
		System.out.println("Ladakh: union territory mountain ranges");

	}

	@Override
	public void pondicherry() {
		System.out.println("Pondicherry: union territory in South");
	}

	@Override
	public void goa() {
		System.out.println("Ladakh: union territory with good beaches");
	}

	@Override
	public void delhi() {
		System.out.println("Delhi: union territory capital");
	}
	
	public static void main(String[] args) {
		UnionTerritories u = new UnionTerritories();
		u.andamanNicobar();
		u.pondicherry();
		u.goa();
		u.delhi();
		u.ladakh();
		u.maharastra();
		u.andraPradesh();
		u.tamilNadu();
		
		
	}
	
	

}
