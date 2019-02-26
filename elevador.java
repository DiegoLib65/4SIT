import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class elevador extends JPanel {
	int c = 0;
	int p = 0;
	JLabel inv1, inv2, inv3, inv4, inv5, inv6, inv7, inv8, inv9, lb;
	ImageIcon img1, img2;
	JButton bt1, bt2, bt3, bt4, bt5;

	public elevador() {
		organizacao();
		progDados();
	}

	public void organizacao() {
		setLayout(null);

		bt1 = new JButton("^");
		bt1.setBounds(30, 20, 80, 50);
		add(bt1);

		bt2 = new JButton("v");
		bt2.setBounds(30, 90, 80, 50);
		add(bt2);

		img1 = new ImageIcon("C:\\Users\\root\\Desktop\\saida.png");
		bt3 = new JButton(img1);
		bt3.setBounds(30, 160, 80, 50);
		add(bt3);

		img2 = new ImageIcon("C:\\Users\\root\\Desktop\\entrada.png");
		bt4 = new JButton(img2);
		bt4.setBounds(30, 230, 80, 50);
		add(bt4);

		bt5 = new JButton("T");
		bt5.setBounds(30, 300, 80, 50);
		add(bt5);

		inv9 = new JLabel("           Hotel");
		inv9.setBounds(280, 40, 150, 30);

		inv1 = new JLabel("                         7º");
		inv1.setBounds(280, 40, 150, 30);
		inv1.setOpaque(true);
		inv1.setBackground(Color.white);

		inv2 = new JLabel("                         6º");
		inv2.setBounds(280, 80, 150, 30);
		inv2.setOpaque(true);
		inv2.setBackground(Color.white);

		inv3 = new JLabel("                         5º");
		inv3.setBounds(280, 120, 150, 30);
		inv3.setOpaque(true);
		inv3.setBackground(Color.white);

		inv4 = new JLabel("                         4º");
		inv4.setBounds(280, 160, 150, 30);
		inv4.setOpaque(true);
		inv4.setBackground(Color.white);

		inv5 = new JLabel("                         3º");
		inv5.setBounds(280, 200, 150, 30);
		inv5.setOpaque(true);
		inv5.setBackground(Color.white);

		inv6 = new JLabel("                         2º");
		inv6.setBounds(280, 240, 150, 30);
		inv6.setOpaque(true);
		inv6.setBackground(Color.white);

		inv7 = new JLabel("                         1º");
		inv7.setBounds(280, 280, 150, 30);
		inv7.setOpaque(true);
		inv7.setBackground(Color.white);

		inv8 = new JLabel("                      Terreo");
		inv8.setBounds(280, 320, 150, 30);
		inv8.setOpaque(true);
		inv8.setBackground(Color.green);

		add(inv1);
		add(inv2);
		add(inv3);
		add(inv4);
		add(inv5);
		add(inv6);
		add(inv7);
		add(inv8);
		add(inv9);
	}

	public void progDados() {
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p = p + 1;
				if (c == 0) {
					inv8.setBackground(Color.red);
				}
				if (c == 1) {
					inv7.setBackground(Color.red);
				}
				if (c == 2) {
					inv6.setBackground(Color.red);
				}
				if (c == 3) {
					inv5.setBackground(Color.red);
				}
				if (c == 4) {
					inv4.setBackground(Color.red);
				}
				if (c == 5) {
					inv3.setBackground(Color.red);
				}
				if (c == 6) {
					inv2.setBackground(Color.red);
				}
				if (c == 7) {
					inv1.setBackground(Color.red);
				}
			}
		});
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p = p - 1;
				if (c == 0) {
					inv8.setBackground(Color.green);
				}
				if (c == 1) {
					inv7.setBackground(Color.green);
				}
				if (c == 2) {
					inv6.setBackground(Color.green);
				}
				if (c == 3) {
					inv5.setBackground(Color.green);
				}
				if (c == 4) {
					inv4.setBackground(Color.green);
				}
				if (c == 5) {
					inv3.setBackground(Color.green);
				}
				if (c == 6) {
					inv2.setBackground(Color.green);
				}
				if (c == 7) {
					inv1.setBackground(Color.green);
				}
			}
		});

		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c = c + 1;
				if (p == 0) {
					if (c == 1) {
						inv8.setBackground(Color.white);
						inv7.setBackground(Color.green);

					}
					if (c == 2) {
						inv7.setBackground(Color.white);
						inv6.setBackground(Color.green);

					}
					if (c == 3) {
						inv6.setBackground(Color.white);
						inv5.setBackground(Color.green);

					}
					if (c == 4) {
						inv5.setBackground(Color.white);
						inv4.setBackground(Color.green);

					}
					if (c == 5) {
						inv4.setBackground(Color.white);
						inv3.setBackground(Color.green);

					}
					if (c == 6) {
						inv3.setBackground(Color.white);
						inv2.setBackground(Color.green);

					}
					if (c == 7) {
						inv2.setBackground(Color.white);
						inv1.setBackground(Color.green);

					}
					if (c >= 8) {
						JOptionPane.showMessageDialog(null, "Quem manda pro céu é Deus.");
						return;

					}
				}
				if(p ==1) {
				if (c == 1) {
					inv8.setBackground(Color.white);
					inv7.setBackground(Color.red);

				}
				if (c == 2) {
					inv7.setBackground(Color.white);
					inv6.setBackground(Color.red);

				}
				if (c == 3) {
					inv6.setBackground(Color.white);
					inv5.setBackground(Color.red);

				}
				if (c == 4) {
					inv5.setBackground(Color.white);
					inv4.setBackground(Color.red);

				}
				if (c == 5) {
					inv4.setBackground(Color.white);
					inv3.setBackground(Color.red);

				}
				if (c == 6) {
					inv3.setBackground(Color.white);
					inv2.setBackground(Color.red);

				}
				if (c == 7) {
					inv2.setBackground(Color.white);
					inv1.setBackground(Color.red);

				}
				if (c >= 8) {
					JOptionPane.showMessageDialog(null, "Quem manda pro céu é Deus.");
					c=7;
					return;

				}
				}
			}
		});

		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c = c - 1;
				if (p == 0) {
					if (c == 6) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.green);
						inv3.setBackground(Color.white);
						inv4.setBackground(Color.white);
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);
						inv8.setBackground(Color.white);
						System.out.print(c);
					}
					if (c == 5) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.white);
						inv3.setBackground(Color.green);
						inv4.setBackground(Color.white);
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);
						inv8.setBackground(Color.white);
						System.out.print(c);

					}
					if (c == 4) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.white);
						inv3.setBackground(Color.white);
						inv4.setBackground(Color.green);
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);
						System.out.print(c);

					}
					if (c == 3) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.white);
						inv3.setBackground(Color.white);
						inv4.setBackground(Color.white);
						inv5.setBackground(Color.green);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);

					}
					if (c == 2) {
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.green);
						inv7.setBackground(Color.white);
					}
					if (c == 1) {
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.green);

					}
					if (c == 0) {
						inv7.setBackground(Color.white);
						inv8.setBackground(Color.green);

					}
					if (c < 0) {
						JOptionPane.showMessageDialog(null, "Quer ir pro inferno?! desgraçado!");
						c=0;
						return;
					}

				}
				if (p >= 1) {
					if (c == 6) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.red);
						inv3.setBackground(Color.white);
						inv4.setBackground(Color.white);
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);
						inv8.setBackground(Color.white);
						System.out.print(c);
					}
					if (c == 5) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.white);
						inv3.setBackground(Color.red);
						inv4.setBackground(Color.white);
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);
						inv8.setBackground(Color.white);
						System.out.print(c);

					}
					if (c == 4) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.white);
						inv3.setBackground(Color.white);
						inv4.setBackground(Color.red);
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);
						System.out.print(c);

					}
					if (c == 3) {
						inv1.setBackground(Color.white);
						inv2.setBackground(Color.white);
						inv3.setBackground(Color.white);
						inv4.setBackground(Color.white);
						inv5.setBackground(Color.red);
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.white);

					}
					if (c == 2) {
						inv5.setBackground(Color.white);
						inv6.setBackground(Color.red);
						inv7.setBackground(Color.white);
					}
					if (c == 1) {
						inv6.setBackground(Color.white);
						inv7.setBackground(Color.red);

					}
					if (c == 0) {
						inv7.setBackground(Color.white);
						inv8.setBackground(Color.red);

					}
					if (c < 0) {
						JOptionPane.showMessageDialog(null, "Quer ir pro inferno?! desgraçado!");
						return;
					}
				}

			}
		});
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(p==0) {
				inv8.setBackground(Color.green);
				inv7.setBackground(Color.white);
				inv6.setBackground(Color.white);
				inv5.setBackground(Color.white);
				inv4.setBackground(Color.white);
				inv3.setBackground(Color.white);
				inv2.setBackground(Color.white);
				inv1.setBackground(Color.white);
				c = 0;
				}
				if(p==1) {
					inv8.setBackground(Color.red);
					inv7.setBackground(Color.white);
					inv6.setBackground(Color.white);
					inv5.setBackground(Color.white);
					inv4.setBackground(Color.white);
					inv3.setBackground(Color.white);
					inv2.setBackground(Color.white);
					inv1.setBackground(Color.white);
					c = 0;
					}
			}

		});

	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Primeira Janela"); // declara a classe para criar uma janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// método para fechar a janela
		frame.getContentPane().add(new elevador()); // adiciona o construtor na janela
		frame.setBounds(300, 300, 450, 450);// define tamanho e posição da janela
		frame.setVisible(true);// define se a janela irá ser visivel ou não
	}
}
