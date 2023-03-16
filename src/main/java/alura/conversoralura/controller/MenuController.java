package alura.conversoralura.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import alura.conversoralura.model.Moneda;
import alura.conversoralura.view.MenuView;
import alura.conversoralura.view.MonedasView;

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
			//implementar
		}
		if(e.getSource() == view.btnSalir) {
			System.exit(0);
		}
	}

}
