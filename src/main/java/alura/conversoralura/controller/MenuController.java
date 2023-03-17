package alura.conversoralura.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import alura.conversoralura.model.Moneda;
import alura.conversoralura.model.Temperatura;
import alura.conversoralura.view.MenuView;
import alura.conversoralura.view.MonedasView;
import alura.conversoralura.view.TemperaturaView;

public class MenuController implements ActionListener{
	
	private MenuView view;
	
	
	public MenuController(MenuView view) {
		this.view = view;
		this.view.btnMonedas.addActionListener(this);
		this.view.btnTemperaturas.addActionListener(this);
		this.view.btnSalir.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.btnMonedas) {
			MonedasView mv = new MonedasView();
			Moneda moneda = new Moneda(0);
			MonedaController mc = new MonedaController(moneda, mv);
			mv.setVisible(true);
			mv.setLocationRelativeTo(null);
			this.view.dispose();
		}
		if(e.getSource() == view.btnTemperaturas) {
			TemperaturaView tv = new TemperaturaView();
			Temperatura temp = new Temperatura();
			TemperaturaController tc = new TemperaturaController(temp,tv);
			tv.setVisible(true);
			tv.setLocationRelativeTo(null);
			this.view.dispose();
		}
		if(e.getSource() == view.btnSalir) {
			System.exit(0);
		}
	}

}
