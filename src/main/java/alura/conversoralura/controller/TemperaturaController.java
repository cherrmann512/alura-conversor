package alura.conversoralura.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import alura.conversoralura.model.Escala;
import alura.conversoralura.model.Temperatura;
import alura.conversoralura.view.MenuView;
import alura.conversoralura.view.TemperaturaView;

public class TemperaturaController implements ActionListener{
	
	private Temperatura temperatura;
	private TemperaturaView view;
	
	
	public TemperaturaController(Temperatura temperatura, TemperaturaView view) {
		super();
		this.temperatura = temperatura;
		this.view = view;
		this.view.btnAtras.addActionListener(this);
		this.view.btnConvertir.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.btnConvertir) {
			try {
				double grados = (Double.parseDouble(view.txtGrados.getText()));
				switch (view.cmbConversiones.getSelectedIndex()) {
				case 0:
					//celsius a Fahrenheit
					System.out.println(view.cmbConversiones.getSelectedItem().toString());
					temperatura = new Temperatura(grados, Escala.CELSIUS);
					conversion(temperatura, Escala.FAHRENHEIT, view.cmbConversiones.getSelectedItem().toString());
					break;
				case 1:
					//celsius a Kelvin
					System.out.println(view.cmbConversiones.getSelectedItem().toString());
					temperatura = new Temperatura(grados, Escala.CELSIUS);
					conversion(temperatura, Escala.KELVIN, view.cmbConversiones.getSelectedItem().toString());
					break;
				case 2:
					//fahrenheit a celsius
					System.out.println(view.cmbConversiones.getSelectedItem().toString());
					temperatura = new Temperatura(grados, Escala.FAHRENHEIT);
					conversion(temperatura, Escala.CELSIUS, view.cmbConversiones.getSelectedItem().toString());
					break;
				case 3:
					//fahrenheit a kelvin
					System.out.println(view.cmbConversiones.getSelectedItem().toString());
					temperatura = new Temperatura(grados, Escala.FAHRENHEIT);
					conversion(temperatura, Escala.KELVIN, view.cmbConversiones.getSelectedItem().toString());
					break;
				case 4:
					//Kelvin a Celsius
					System.out.println(view.cmbConversiones.getSelectedItem().toString());
					temperatura = new Temperatura(grados, Escala.KELVIN);
					conversion(temperatura, Escala.CELSIUS, view.cmbConversiones.getSelectedItem().toString());
					break;
				case 5:
					//Kelvin a Fahrenheit
					System.out.println(view.cmbConversiones.getSelectedItem().toString());
					temperatura = new Temperatura(grados, Escala.KELVIN);
					conversion(temperatura, Escala.FAHRENHEIT, view.cmbConversiones.getSelectedItem().toString());
					break;
					}
				
				
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Solo puede ingresar números");
			}
		}
		if(e.getSource() == view.btnAtras) {
			MenuView mv = new MenuView();
			mv.setVisible(true);
			mv.setLocationRelativeTo(null);
			this.view.dispose();
			MenuController mc = new MenuController(mv);
		}
		
	}
	
	public void conversion(Temperatura t, Escala nuevaEscala, String conversion) {
		double nuevoValor = Math.round(t.conversion(conversion)*100.0)/100.0;
		t.setGrados(nuevoValor);
		t.setEscala(nuevaEscala);
		System.out.println(t.toString());
		JOptionPane.showMessageDialog(null, t.toString());
	}
	
	
	
}
