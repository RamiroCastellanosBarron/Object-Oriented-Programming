// JTextField: Componente para la introducción de un texto de una sola línea
// JButton: Botón que se pulsa

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ADN implements ActionListener {
	// Especificaciones de ventana
	final int ANCHO_TEXTO = 35;
	static String output;

	// Leyenda
	 final String LEYENDA = "SISTEMA DE RECONOCIMIENTO DE SOSPECHOSOS";

	// Ventana de la interfaz gráfica
	JFrame ventana = new JFrame("Policía Local");
	JTextArea leyenda = new JTextArea(LEYENDA, 2, ANCHO_TEXTO);
	JLabel nombreEtiqueta = new JLabel("Ingrese la secuencia:");
	JTextField secuencia = new JTextField(ANCHO_TEXTO);
	JButton desplegarCulpable = new JButton("Buscar culpable");
	JTextField culpable = new JTextField(ANCHO_TEXTO);

	// Constructor de la interfaz de usuario
	public ADN() {
		ventana.setSize(400, 250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);

		leyenda.setEditable(false);
		leyenda.setLineWrap(true);
		leyenda.setWrapStyleWord(true);
		leyenda.setBackground(ventana.getBackground());

		secuencia.setText(output);
		secuencia.setBackground(Color.WHITE);

		culpable.setEditable(false);
		secuencia.setBackground(Color.WHITE);

		// Escuchador de eventos
		desplegarCulpable.addActionListener(this);

		// Ordenar elementos en la interfaz
		ventana.setLayout(new FlowLayout());
		ventana.add(leyenda);
		ventana.add(nombreEtiqueta);
		ventana.add(secuencia);
		ventana.add(desplegarCulpable);
		ventana.add(culpable);

		// Mostrar la interfaz
		ventana.setVisible(true);
	}

	// Manejador de eventos de acción del botón
	public void actionPerformed(ActionEvent e) {
		// Información previa
		String[] nombres = { "Pedro", "Juan", "Diego" };
		String[] cadena = { "00000101010101010101", "00101010101101110111", "00100010010000001001" };
		String respuesta = secuencia.getText();

		int mayorCoincidencia = 0;
		String nombre = "";

		// Comparar
		for (int i = 0; i < nombres.length; i++) {
			int acumPersona = 0;
			for (int j = 0; j < 20; j++) {
				if (cadena[i].charAt(j) == respuesta.charAt(j))
					acumPersona++;
			}
			if (acumPersona > mayorCoincidencia) {
				mayorCoincidencia = acumPersona;
				nombre = nombres[i];
			}
		}

		// Mostrar resultados
		int porcentaje = (int) Math.round((mayorCoincidencia * 1.0) / 20 * 100);
		if (!(nombre.equals("")))
			output = "El culpable es " + nombre + " con un parentesco de " + porcentaje + "%";
		else
			output = "No hay coincidencias";
		culpable.setText(output);
	}

	public static void main(String[] args) {
		ADN gui = new ADN();
	}
}