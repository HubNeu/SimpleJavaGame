package Main;

import java.util.Random;

public class Main extends javax.swing.JFrame {

    boolean running = false, foeBoardSet = false, youHitFoe = false, foeHitYou = false, isSet;
    Random rnjesus = new Random();
    int inputx = 0, inputy = 0, randoma, randomb, shipsLeft = 10;
    int nextShipLength = 1;
    int nextShipNumber = 0;
    //Deklaracje statkow tradycyjnych z wart. default
    private int oneCounter = 4;
    private int twoCounter = 3;
    private int threeCounter = 2;
    private int fourCounter = 1;
    /*nie używane
    private int yourBoardX = 10;
    private int yourBoardY = 10;
    private int foeBoardX = yourBoardX;
    private int foeBoardY = yourBoardY;
     */
    private int boardsLength = 10;

    //deklaracje jedn. specjalnych
    private int subCounter = 0, fSub = 0;
    private int fighterCounter = 0, fFighter = 0;
    private int bomberCounter = 0, fBomber = 0;
    //private int castleCounter = 0, fCastle = 0;
    private int krakenCounter = 0, fKraken = 0;

    private int[][] myBoard = new int[boardsLength][boardsLength];//legenda wartosci: 0-nic,1-statek,2-zniszczony,3-pudlo
    private int[][] foeBoard = new int[boardsLength][boardsLength];//08062018-zmiana planszy z 10 na 12 aby mozna bylo uproscic algorytm sprawdzania poprawnosci polozenia
//inicjalizacja statków odbywa sie podczas ich nakładania na plansze (niepotrzebne w ostatecznej wersji (tablice int łatwiejsze i szybsze, ta klasa jest niepotrzebna)
    private Battleship[] myBattleships = new Battleship[10];
    private Battleship[] foeBattleships = new Battleship[10];
    private Square boardPositioning = new Square(false, false);
    private Square boardMeBattle = new Square(false, true);
    private Square boardFoeBattle = new Square(true, true);

    public Main() {
        /*addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX() + "," + e.getY());
            }
        });*/
        initComponents();
        cardOptions.setVisible(false);
        cardPosition.setVisible(false);
        cardBattle.setVisible(false);
        labelError.setVisible(false);
        cardEnd.setVisible(false);
        //Zainicjalizowanie tablic
        for (int i = 0; i < boardsLength; i++) {
            for (int j = 0; j < boardsLength; j++) {
                myBoard[i][j] = 0;
                foeBoard[i][j] = 0;
            }
        }

        for (int i = 0; i < 10; i++) {
            myBattleships[i] = new Battleship(1, false);
            foeBattleships[i] = new Battleship(1, false);
        }
    }

    @SuppressWarnings("unchecked")//initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSizeOfBoard = new javax.swing.ButtonGroup();
        cardMenu = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jButtonNewGame = new javax.swing.JButton();
        jButtonWyjscie = new javax.swing.JButton();
        gamelogoIcon = new javax.swing.JLabel();
        labelBigWarShipBackGround = new javax.swing.JLabel();
        labelBackgroundMenu = new javax.swing.JLabel();
        cardOptions = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        buttonBackToMenu = new javax.swing.JButton();
        buttonPozycje = new javax.swing.JButton();
        labelHelpSpecial = new javax.swing.JLabel();
        textFieldCorvettes = new javax.swing.JTextField();
        textFieldFigates = new javax.swing.JTextField();
        textFieldDestroyers = new javax.swing.JTextField();
        textfieldCruisers = new javax.swing.JTextField();
        textFieldStatkiBazowe = new javax.swing.JTextField();
        textFieldJednostkiSpecjalne = new javax.swing.JTextField();
        textFieldSub = new javax.swing.JTextField();
        textFieldMysliwiec = new javax.swing.JTextField();
        textFieldBomber = new javax.swing.JTextField();
        textFieldKraken = new javax.swing.JTextField();
        labelFrigateCounter = new javax.swing.JLabel();
        labelCorvetteCounter = new javax.swing.JLabel();
        labelCruiserCounter = new javax.swing.JLabel();
        labelDestroyerCounter = new javax.swing.JLabel();
        spinSubCounter = new javax.swing.JSpinner();
        spinFighterCounter = new javax.swing.JSpinner();
        spinBomberCounter = new javax.swing.JSpinner();
        spinKrakenCounter = new javax.swing.JSpinner();
        labelHelpSpecial1 = new javax.swing.JLabel();
        backgroundShipRight = new javax.swing.JLabel();
        backgroundIconHalfOpaque1 = new javax.swing.JLabel();
        backgroundIconHalfOpaque2 = new javax.swing.JLabel();
        backgroundIconOptions = new javax.swing.JLabel();
        cardPosition = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        panelGameBoard = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonPlaceFrigate = new javax.swing.JButton();
        buttonPlaceCorvette = new javax.swing.JButton();
        buttonPlaceDestroyer = new javax.swing.JButton();
        buttonPlaceCruiser = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonPlaceCorvetteVertical = new javax.swing.JButton();
        buttonPlaceDestroyerVertical = new javax.swing.JButton();
        buttonPlaceCruiserVertical = new javax.swing.JButton();
        labelAlpha = new javax.swing.JLabel();
        labelBravo = new javax.swing.JLabel();
        labelCharlie = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        buttonRandom = new javax.swing.JButton();
        labelBackgroundGameBoard = new javax.swing.JLabel();
        labelFrigatesLeft = new javax.swing.JLabel();
        labelCorvettesLeft = new javax.swing.JLabel();
        labelDestroyersLeft = new javax.swing.JLabel();
        labelCruisersLeft = new javax.swing.JLabel();
        textFrigateLeft = new javax.swing.JTextField();
        textCorvetteLeft = new javax.swing.JTextField();
        textDestroyerLeft = new javax.swing.JTextField();
        textCruiserLeft = new javax.swing.JTextField();
        textLeftoverShips = new javax.swing.JTextField();
        labelError = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        buttonStart = new javax.swing.JButton();
        backgroundGrid = new javax.swing.JLabel();
        backgroundPosition = new javax.swing.JLabel();
        cardEnd = new javax.swing.JPanel();
        buttonBack1 = new javax.swing.JButton();
        panelEnd = new javax.swing.JPanel();
        labelInfo = new javax.swing.JLabel();
        labelWin = new javax.swing.JLabel();
        labelLose = new javax.swing.JLabel();
        labelBckgrnd = new javax.swing.JLabel();
        cardBattle = new javax.swing.JPanel();
        panelEnemy = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        labelBackgroundGameBoard2 = new javax.swing.JLabel();
        panelYou = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonShoot = new javax.swing.JButton();
        labelSubsLeft = new javax.swing.JLabel();
        labelFightersLeft = new javax.swing.JLabel();
        labelBombersLeft = new javax.swing.JLabel();
        labelKrakenLeft = new javax.swing.JLabel();
        buttonUseSub = new javax.swing.JButton();
        buttonUseFighter = new javax.swing.JButton();
        buttonUseBomber = new javax.swing.JButton();
        buttonUseKraken = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        labelBackgroundGameBoard1 = new javax.swing.JLabel();
        buttonBackToOptions = new javax.swing.JButton();
        backgroundBattle = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warship Battle-Ultimate Deluxe Final Game of the Year Edition");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new java.awt.CardLayout());

        cardMenu.setOpaque(false);
        cardMenu.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 3, 11)); // NOI18N
        jLabel3.setText("Wersja finalnaV2-12062018");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(820, 10, 170, 150);

        jButtonNewGame.setBackground(new java.awt.Color(185, 174, 154));
        jButtonNewGame.setFont(new java.awt.Font("Bradley Hand ITC", 3, 30)); // NOI18N
        jButtonNewGame.setText("NOWA GRA");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonNewGame);
        jButtonNewGame.setBounds(90, 310, 240, 110);

        jButtonWyjscie.setBackground(new java.awt.Color(185, 174, 154));
        jButtonWyjscie.setFont(new java.awt.Font("Bradley Hand ITC", 3, 30)); // NOI18N
        jButtonWyjscie.setText("WYJSCIE");
        jButtonWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWyjscieActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButtonWyjscie);
        jButtonWyjscie.setBounds(90, 510, 240, 110);

        gamelogoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/wblogo.png"))); // NOI18N
        jLayeredPane1.add(gamelogoIcon);
        gamelogoIcon.setBounds(40, 20, 490, 190);

        labelBigWarShipBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Warship960.png"))); // NOI18N
        jLayeredPane1.add(labelBigWarShipBackGround);
        labelBigWarShipBackGround.setBounds(370, 280, 910, 440);

        labelBackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/paperTexture1280x720.png"))); // NOI18N
        labelBackgroundMenu.setText("jLabel3");
        jLayeredPane1.add(labelBackgroundMenu);
        labelBackgroundMenu.setBounds(0, 0, 1280, 720);

        cardMenu.add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 1280, 720);

        getContentPane().add(cardMenu, "card3");

        cardOptions.setOpaque(false);
        cardOptions.setPreferredSize(new java.awt.Dimension(1280, 720));
        cardOptions.setLayout(null);

        buttonBackToMenu.setBackground(new java.awt.Color(185, 174, 154));
        buttonBackToMenu.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        buttonBackToMenu.setText("POWROT");
        buttonBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackToMenuActionPerformed(evt);
            }
        });
        jLayeredPane2.add(buttonBackToMenu);
        buttonBackToMenu.setBounds(20, 20, 210, 90);

        buttonPozycje.setBackground(new java.awt.Color(185, 174, 154));
        buttonPozycje.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        buttonPozycje.setText("DALEJ");
        buttonPozycje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPozycjeActionPerformed(evt);
            }
        });
        jLayeredPane2.add(buttonPozycje);
        buttonPozycje.setBounds(1030, 600, 210, 90);

        labelHelpSpecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/info40x40.png"))); // NOI18N
        labelHelpSpecial.setToolTipText("<html>Nie przejmuj się tymi ustawieniami jeśli chcesz rozegrać tradycyjną grę.<br>Łódź podwodna: podpłynie w określoną kratkę i będzie nasłuchiwać w którym<br> kierunku znajdują się jednostki nieprzyjaciela<br>Myśliwiec:Ostrzeliwuje pole długości 5 i wysokości 2.<br>Samolot rozpoznawczy: pokazuje nad którymi polami znajdują się jednostki nieprzyjaciela.<br>Roszada:daje ci możliwość przesunięcia statku podczas walki na inne miejsce.<br>???:???</html>");
        jLayeredPane2.add(labelHelpSpecial);
        labelHelpSpecial.setBounds(1060, 160, 40, 40);

        textFieldCorvettes.setEditable(false);
        textFieldCorvettes.setBackground(new java.awt.Color(185, 174, 154));
        textFieldCorvettes.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFieldCorvettes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldCorvettes.setText("Ilosc korwet:");
        textFieldCorvettes.setToolTipText("Ilość statków jednomasztowych");
        textFieldCorvettes.setBorder(null);
        textFieldCorvettes.setOpaque(false);
        jLayeredPane2.add(textFieldCorvettes);
        textFieldCorvettes.setBounds(320, 270, 110, 30);

        textFieldFigates.setEditable(false);
        textFieldFigates.setBackground(new java.awt.Color(185, 174, 154));
        textFieldFigates.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFieldFigates.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldFigates.setText("Ilosc fregat:");
        textFieldFigates.setToolTipText("Ilość statków dwumasztowych");
        textFieldFigates.setBorder(null);
        textFieldFigates.setOpaque(false);
        textFieldFigates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFigatesActionPerformed(evt);
            }
        });
        jLayeredPane2.add(textFieldFigates);
        textFieldFigates.setBounds(320, 220, 110, 30);

        textFieldDestroyers.setEditable(false);
        textFieldDestroyers.setBackground(new java.awt.Color(185, 174, 154));
        textFieldDestroyers.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFieldDestroyers.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textFieldDestroyers.setText("Ilosc niszczycieli:");
        textFieldDestroyers.setToolTipText("Ilość statków trójmasztowych");
        textFieldDestroyers.setBorder(null);
        textFieldDestroyers.setOpaque(false);
        jLayeredPane2.add(textFieldDestroyers);
        textFieldDestroyers.setBounds(300, 330, 150, 30);

        textfieldCruisers.setEditable(false);
        textfieldCruisers.setBackground(new java.awt.Color(185, 174, 154));
        textfieldCruisers.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textfieldCruisers.setText("Ilosc krazownikow:");
        textfieldCruisers.setToolTipText("Ilość statków czteromasztowych");
        textfieldCruisers.setBorder(null);
        textfieldCruisers.setOpaque(false);
        jLayeredPane2.add(textfieldCruisers);
        textfieldCruisers.setBounds(290, 390, 170, 30);

        textFieldStatkiBazowe.setEditable(false);
        textFieldStatkiBazowe.setBackground(new java.awt.Color(185, 174, 154));
        textFieldStatkiBazowe.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        textFieldStatkiBazowe.setText("Statki bazowe:");
        textFieldStatkiBazowe.setBorder(null);
        textFieldStatkiBazowe.setOpaque(false);
        textFieldStatkiBazowe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldStatkiBazoweActionPerformed(evt);
            }
        });
        jLayeredPane2.add(textFieldStatkiBazowe);
        textFieldStatkiBazowe.setBounds(250, 160, 180, 30);

        textFieldJednostkiSpecjalne.setEditable(false);
        textFieldJednostkiSpecjalne.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        textFieldJednostkiSpecjalne.setText("Jednostki specjalne:");
        textFieldJednostkiSpecjalne.setBorder(null);
        textFieldJednostkiSpecjalne.setOpaque(false);
        jLayeredPane2.add(textFieldJednostkiSpecjalne);
        textFieldJednostkiSpecjalne.setBounds(730, 160, 240, 30);

        textFieldSub.setEditable(false);
        textFieldSub.setBackground(new java.awt.Color(185, 174, 154));
        textFieldSub.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFieldSub.setText("Lodzie Podwodne:");
        textFieldSub.setBorder(null);
        textFieldSub.setOpaque(false);
        textFieldSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSubActionPerformed(evt);
            }
        });
        jLayeredPane2.add(textFieldSub);
        textFieldSub.setBounds(780, 220, 150, 30);

        textFieldMysliwiec.setEditable(false);
        textFieldMysliwiec.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFieldMysliwiec.setText("Mysliwiec:");
        textFieldMysliwiec.setBorder(null);
        textFieldMysliwiec.setOpaque(false);
        textFieldMysliwiec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMysliwiecActionPerformed(evt);
            }
        });
        jLayeredPane2.add(textFieldMysliwiec);
        textFieldMysliwiec.setBounds(810, 280, 90, 30);

        textFieldBomber.setEditable(false);
        textFieldBomber.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFieldBomber.setText("Bombowiec:");
        textFieldBomber.setBorder(null);
        textFieldBomber.setOpaque(false);
        jLayeredPane2.add(textFieldBomber);
        textFieldBomber.setBounds(810, 330, 100, 30);

        textFieldKraken.setEditable(false);
        textFieldKraken.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFieldKraken.setText("???");
        textFieldKraken.setBorder(null);
        textFieldKraken.setOpaque(false);
        jLayeredPane2.add(textFieldKraken);
        textFieldKraken.setBounds(840, 390, 30, 24);

        labelFrigateCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelFrigateCounter.setText("3");
        jLayeredPane2.add(labelFrigateCounter);
        labelFrigateCounter.setBounds(510, 260, 80, 40);

        labelCorvetteCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelCorvetteCounter.setText("4");
        jLayeredPane2.add(labelCorvetteCounter);
        labelCorvetteCounter.setBounds(510, 210, 80, 40);

        labelCruiserCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelCruiserCounter.setText("1");
        jLayeredPane2.add(labelCruiserCounter);
        labelCruiserCounter.setBounds(510, 380, 80, 40);

        labelDestroyerCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelDestroyerCounter.setText("2");
        jLayeredPane2.add(labelDestroyerCounter);
        labelDestroyerCounter.setBounds(510, 320, 80, 40);

        spinSubCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        spinSubCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        spinSubCounter.setBorder(null);
        spinSubCounter.setInheritsPopupMenu(true);
        spinSubCounter.setOpaque(false);
        spinSubCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSubChanged(evt);
            }
        });
        jLayeredPane2.add(spinSubCounter);
        spinSubCounter.setBounds(1020, 220, 40, 30);

        spinFighterCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        spinFighterCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        spinFighterCounter.setBorder(null);
        spinFighterCounter.setInheritsPopupMenu(true);
        spinFighterCounter.setOpaque(false);
        spinFighterCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerFighterChanged(evt);
            }
        });
        jLayeredPane2.add(spinFighterCounter);
        spinFighterCounter.setBounds(1020, 280, 40, 30);

        spinBomberCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        spinBomberCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));
        spinBomberCounter.setBorder(null);
        spinBomberCounter.setInheritsPopupMenu(true);
        spinBomberCounter.setOpaque(false);
        spinBomberCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerMPAChanged(evt);
            }
        });
        jLayeredPane2.add(spinBomberCounter);
        spinBomberCounter.setBounds(1020, 330, 40, 30);

        spinKrakenCounter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        spinKrakenCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));
        spinKrakenCounter.setBorder(null);
        spinKrakenCounter.setInheritsPopupMenu(true);
        spinKrakenCounter.setOpaque(false);
        spinKrakenCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerKrakenChanged(evt);
            }
        });
        jLayeredPane2.add(spinKrakenCounter);
        spinKrakenCounter.setBounds(1020, 390, 40, 30);

        labelHelpSpecial1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/info40x40.png"))); // NOI18N
        labelHelpSpecial1.setToolTipText("<html>To są twoje jednostki bazowe, zgodnie z zasadami gry w statki:<br>\nKorweta to najmniejsza jednostka w grze, tradycyjnie zwana jednomasztowcem.<br>\nFregata, to odpowiednik \"zwykłego\" dwumasztowca.<br>\nNiszczyciel jako jeden z większych statków odpowiada trójmasztowcowi.<br>\nKrążowniki ustępują wielkoścą tylko lotniskowcom, tu, jako statki czteromasztowe.<br>\n</html>");
        jLayeredPane2.add(labelHelpSpecial1);
        labelHelpSpecial1.setBounds(590, 160, 40, 40);

        backgroundShipRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/shipToRight440x342.png"))); // NOI18N
        jLayeredPane2.add(backgroundShipRight);
        backgroundShipRight.setBounds(0, 380, 520, 370);

        backgroundIconHalfOpaque1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/beige400x400.png"))); // NOI18N
        jLayeredPane2.add(backgroundIconHalfOpaque1);
        backgroundIconHalfOpaque1.setBounds(240, 160, 390, 280);

        backgroundIconHalfOpaque2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/beige400x400.png"))); // NOI18N
        jLayeredPane2.add(backgroundIconHalfOpaque2);
        backgroundIconHalfOpaque2.setBounds(720, 160, 380, 280);

        backgroundIconOptions.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        backgroundIconOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/paperTexture1280x720.png"))); // NOI18N
        backgroundIconOptions.setOpaque(true);
        jLayeredPane2.add(backgroundIconOptions);
        backgroundIconOptions.setBounds(0, 0, 1280, 720);

        cardOptions.add(jLayeredPane2);
        jLayeredPane2.setBounds(0, 0, 1280, 720);

        getContentPane().add(cardOptions, "card4");

        cardPosition.setPreferredSize(new java.awt.Dimension(1280, 720));
        cardPosition.setLayout(null);

        panelGameBoard.setBackground(new java.awt.Color(70, 157, 243));
        panelGameBoard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGameBoard.setOpaque(false);
        panelGameBoard.setPreferredSize(new java.awt.Dimension(500, 500));
        panelGameBoard.setLayout(new java.awt.GridLayout(1, 0));
        jLayeredPane3.add(panelGameBoard);
        panelGameBoard.setBounds(170, 170, 500, 500);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/info40x40.png"))); // NOI18N
        jLabel63.setToolTipText("<html>Kliknij na miejsce w które chcesz wstawić statek,<br>\na następnie w kierunek którym chcesz go ustawić</htm>");
        jLayeredPane3.add(jLabel63);
        jLabel63.setBounds(1120, 170, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/help40x61.png"))); // NOI18N
        jLabel1.setToolTipText("<html>Rozmieść statki poprzez kliknięcie na kratkę,<br> a następnie wybranie interesującego cię statku.<br>Wybrana kratka stanie się pierwszym \"masztem\".<br>Jeśli wybierzesz ułożenie go pionowo,<br>statek będzie się ciągnął od tej kratki w dół,<br> natomiast układając go poziomo będzie on szedł<br>od kratki w prawo.</html>");
        jLayeredPane3.add(jLabel1);
        jLabel1.setBounds(1200, 30, 40, 61);

        buttonPlaceFrigate.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonPlaceFrigate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/pionowopoziomo.png"))); // NOI18N
        buttonPlaceFrigate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlaceFrigate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaceFrigateActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonPlaceFrigate);
        buttonPlaceFrigate.setBounds(930, 220, 130, 60);

        buttonPlaceCorvette.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonPlaceCorvette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/poziomo.png"))); // NOI18N
        buttonPlaceCorvette.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlaceCorvette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaceCorvetteActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonPlaceCorvette);
        buttonPlaceCorvette.setBounds(930, 290, 60, 60);

        buttonPlaceDestroyer.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonPlaceDestroyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/poziomo.png"))); // NOI18N
        buttonPlaceDestroyer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlaceDestroyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaceDestroyerActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonPlaceDestroyer);
        buttonPlaceDestroyer.setBounds(930, 360, 60, 60);

        buttonPlaceCruiser.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonPlaceCruiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/poziomo.png"))); // NOI18N
        buttonPlaceCruiser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlaceCruiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaceCruiserActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonPlaceCruiser);
        buttonPlaceCruiser.setBounds(930, 440, 60, 60);

        buttonReset.setBackground(new java.awt.Color(185, 174, 154));
        buttonReset.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonReset.setText("RESET");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonReset);
        buttonReset.setBounds(870, 600, 140, 90);

        buttonPlaceCorvetteVertical.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonPlaceCorvetteVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/pionowo.png"))); // NOI18N
        buttonPlaceCorvetteVertical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlaceCorvetteVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaceCorvetteVerticalActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonPlaceCorvetteVertical);
        buttonPlaceCorvetteVertical.setBounds(1000, 290, 60, 60);

        buttonPlaceDestroyerVertical.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonPlaceDestroyerVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/pionowo.png"))); // NOI18N
        buttonPlaceDestroyerVertical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlaceDestroyerVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaceDestroyerVerticalActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonPlaceDestroyerVertical);
        buttonPlaceDestroyerVertical.setBounds(1000, 360, 60, 60);

        buttonPlaceCruiserVertical.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonPlaceCruiserVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/pionowo.png"))); // NOI18N
        buttonPlaceCruiserVertical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlaceCruiserVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlaceCruiserVerticalActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonPlaceCruiserVertical);
        buttonPlaceCruiserVertical.setBounds(1000, 440, 60, 60);

        labelAlpha.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        labelAlpha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlpha.setText("Alpha");
        labelAlpha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(labelAlpha);
        labelAlpha.setBounds(100, 170, 70, 50);

        labelBravo.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        labelBravo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBravo.setText("Bravo");
        labelBravo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(labelBravo);
        labelBravo.setBounds(100, 220, 70, 50);

        labelCharlie.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        labelCharlie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCharlie.setText("Charlie");
        labelCharlie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(labelCharlie);
        labelCharlie.setBounds(100, 270, 70, 50);

        jLabel6.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Delta");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel6);
        jLabel6.setBounds(100, 320, 70, 50);

        jLabel7.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Echo");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel7);
        jLabel7.setBounds(100, 370, 70, 50);

        jLabel8.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Foxtrot");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel8);
        jLabel8.setBounds(100, 420, 70, 50);

        jLabel9.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Golf");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel9);
        jLabel9.setBounds(100, 470, 70, 50);

        jLabel10.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Hotel");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel10);
        jLabel10.setBounds(100, 520, 70, 50);

        jLabel11.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("India");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel11);
        jLabel11.setBounds(100, 570, 70, 50);

        jLabel12.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Juliett");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel12);
        jLabel12.setBounds(100, 620, 70, 50);

        jLabel13.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel13);
        jLabel13.setBounds(170, 140, 50, 30);

        jLabel14.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("2");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel14);
        jLabel14.setBounds(220, 140, 50, 30);

        jLabel15.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("3");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel15);
        jLabel15.setBounds(270, 140, 50, 30);

        jLabel16.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("4");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel16);
        jLabel16.setBounds(320, 140, 50, 30);

        jLabel17.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("5");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel17);
        jLabel17.setBounds(370, 140, 50, 30);

        jLabel18.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("6");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel18);
        jLabel18.setBounds(420, 140, 50, 30);

        jLabel19.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("7");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel19);
        jLabel19.setBounds(470, 140, 50, 30);

        jLabel20.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("8");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel20);
        jLabel20.setBounds(520, 140, 50, 30);

        jLabel21.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("9");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel21);
        jLabel21.setBounds(570, 140, 50, 30);

        jLabel22.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("10");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.add(jLabel22);
        jLabel22.setBounds(620, 140, 50, 30);

        buttonRandom.setBackground(new java.awt.Color(185, 174, 154));
        buttonRandom.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonRandom.setText("AUTO");
        buttonRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRandomActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonRandom);
        buttonRandom.setBounds(700, 600, 140, 90);

        labelBackgroundGameBoard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/beige2000x3.png"))); // NOI18N
        jLayeredPane3.add(labelBackgroundGameBoard);
        labelBackgroundGameBoard.setBounds(80, 120, 610, 570);

        labelFrigatesLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelFrigatesLeft.setPreferredSize(new java.awt.Dimension(60, 60));
        jLayeredPane3.add(labelFrigatesLeft);
        labelFrigatesLeft.setBounds(1090, 220, 60, 60);

        labelCorvettesLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelCorvettesLeft.setPreferredSize(new java.awt.Dimension(60, 60));
        jLayeredPane3.add(labelCorvettesLeft);
        labelCorvettesLeft.setBounds(1090, 290, 60, 60);

        labelDestroyersLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelDestroyersLeft.setPreferredSize(new java.awt.Dimension(60, 60));
        jLayeredPane3.add(labelDestroyersLeft);
        labelDestroyersLeft.setBounds(1090, 360, 60, 60);

        labelCruisersLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelCruisersLeft.setPreferredSize(new java.awt.Dimension(60, 60));
        jLayeredPane3.add(labelCruisersLeft);
        labelCruisersLeft.setBounds(1090, 440, 60, 60);

        textFrigateLeft.setEditable(false);
        textFrigateLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textFrigateLeft.setText("Fregaty:");
        textFrigateLeft.setBorder(null);
        textFrigateLeft.setOpaque(false);
        textFrigateLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFrigateLeftActionPerformed(evt);
            }
        });
        jLayeredPane3.add(textFrigateLeft);
        textFrigateLeft.setBounds(810, 220, 80, 60);

        textCorvetteLeft.setEditable(false);
        textCorvetteLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textCorvetteLeft.setText("Korwety:");
        textCorvetteLeft.setBorder(null);
        textCorvetteLeft.setOpaque(false);
        jLayeredPane3.add(textCorvetteLeft);
        textCorvetteLeft.setBounds(810, 290, 80, 60);

        textDestroyerLeft.setEditable(false);
        textDestroyerLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textDestroyerLeft.setText("Niszczyciele:");
        textDestroyerLeft.setBorder(null);
        textDestroyerLeft.setOpaque(false);
        jLayeredPane3.add(textDestroyerLeft);
        textDestroyerLeft.setBounds(790, 360, 120, 60);

        textCruiserLeft.setEditable(false);
        textCruiserLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        textCruiserLeft.setText("Krazowniki:");
        textCruiserLeft.setBorder(null);
        textCruiserLeft.setOpaque(false);
        jLayeredPane3.add(textCruiserLeft);
        textCruiserLeft.setBounds(800, 440, 110, 60);

        textLeftoverShips.setEditable(false);
        textLeftoverShips.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        textLeftoverShips.setText("Pozostale statki");
        textLeftoverShips.setBorder(null);
        textLeftoverShips.setOpaque(false);
        textLeftoverShips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLeftoverShipsActionPerformed(evt);
            }
        });
        jLayeredPane3.add(textLeftoverShips);
        textLeftoverShips.setBounds(780, 160, 190, 50);

        labelError.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLayeredPane3.add(labelError);
        labelError.setBounds(770, 70, 400, 60);

        buttonBack.setBackground(new java.awt.Color(185, 174, 154));
        buttonBack.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        buttonBack.setText("POWROT");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonBack);
        buttonBack.setBounds(20, 20, 210, 90);

        buttonStart.setBackground(new java.awt.Color(185, 174, 154));
        buttonStart.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        buttonStart.setText("START");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });
        jLayeredPane3.add(buttonStart);
        buttonStart.setBounds(1030, 600, 210, 90);

        backgroundGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/beige400x400.png"))); // NOI18N
        jLayeredPane3.add(backgroundGrid);
        backgroundGrid.setBounds(770, 160, 400, 370);

        backgroundPosition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/paperTexture1280x720.png"))); // NOI18N
        jLayeredPane3.add(backgroundPosition);
        backgroundPosition.setBounds(0, 0, 1280, 720);

        cardPosition.add(jLayeredPane3);
        jLayeredPane3.setBounds(0, 0, 1280, 720);

        getContentPane().add(cardPosition, "card5");

        cardEnd.setPreferredSize(new java.awt.Dimension(1280, 720));
        cardEnd.setLayout(null);

        buttonBack1.setBackground(new java.awt.Color(185, 174, 154));
        buttonBack1.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        buttonBack1.setText("MENU");
        buttonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBack1ActionPerformed(evt);
            }
        });
        cardEnd.add(buttonBack1);
        buttonBack1.setBounds(40, 30, 210, 90);

        panelEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelEnd.setMaximumSize(new java.awt.Dimension(500, 500));
        panelEnd.setLayout(new java.awt.GridLayout(1, 0));
        cardEnd.add(panelEnd);
        panelEnd.setBounds(630, 200, 500, 500);

        labelInfo.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        labelInfo.setText("PRZEGRALES :C");
        cardEnd.add(labelInfo);
        labelInfo.setBounds(690, 40, 360, 130);

        labelWin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/win417x432.png"))); // NOI18N
        cardEnd.add(labelWin);
        labelWin.setBounds(10, 290, 520, 430);

        labelLose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/lose500x417.png"))); // NOI18N
        cardEnd.add(labelLose);
        labelLose.setBounds(10, 300, 500, 420);

        labelBckgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/paperTexture1280x720.png"))); // NOI18N
        labelBckgrnd.setToolTipText("");
        cardEnd.add(labelBckgrnd);
        labelBckgrnd.setBounds(0, 0, 1280, 720);

        getContentPane().add(cardEnd, "card6");

        cardBattle.setPreferredSize(new java.awt.Dimension(1280, 720));
        cardBattle.setLayout(null);

        panelEnemy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelEnemy.setMaximumSize(new java.awt.Dimension(500, 500));
        panelEnemy.setLayout(new java.awt.GridLayout(1, 0));
        cardBattle.add(panelEnemy);
        panelEnemy.setBounds(740, 170, 500, 500);

        jLabel50.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Hotel");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel50.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel50);
        jLabel50.setBounds(670, 520, 70, 50);

        jLabel43.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Alpha");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel43);
        jLabel43.setBounds(670, 170, 70, 50);

        jLabel57.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("5");
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel57);
        jLabel57.setBounds(940, 140, 50, 30);

        jLabel47.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Echo");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel47.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel47);
        jLabel47.setBounds(670, 370, 70, 50);

        jLabel54.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("2");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel54);
        jLabel54.setBounds(790, 140, 50, 30);

        jLabel44.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Bravo");
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel44.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel44);
        jLabel44.setBounds(670, 220, 70, 50);

        jLabel48.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Foxtrot");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel48.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel48);
        jLabel48.setBounds(670, 420, 70, 50);

        jLabel61.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("9");
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel61);
        jLabel61.setBounds(1140, 140, 50, 30);

        jLabel51.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("India");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel51.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel51);
        jLabel51.setBounds(670, 570, 70, 50);

        jLabel53.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("1");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel53);
        jLabel53.setBounds(740, 140, 50, 30);

        jLabel52.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Juliett");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel52.setPreferredSize(new java.awt.Dimension(70, 49));
        cardBattle.add(jLabel52);
        jLabel52.setBounds(670, 620, 70, 49);

        jLabel59.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("7");
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel59);
        jLabel59.setBounds(1040, 140, 50, 30);

        jLabel62.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("10");
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel62);
        jLabel62.setBounds(1190, 140, 50, 30);

        jLabel56.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("4");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel56);
        jLabel56.setBounds(890, 140, 50, 30);

        jLabel45.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Charlie");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel45.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel45);
        jLabel45.setBounds(670, 270, 70, 50);

        jLabel49.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Golf");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel49.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel49);
        jLabel49.setBounds(670, 470, 70, 50);

        jLabel55.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("3");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel55);
        jLabel55.setBounds(840, 140, 50, 30);

        jLabel58.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("6");
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel58);
        jLabel58.setBounds(990, 140, 50, 30);

        jLabel46.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Delta");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel46.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel46);
        jLabel46.setBounds(670, 320, 70, 50);

        jLabel60.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("8");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardBattle.add(jLabel60);
        jLabel60.setBounds(1090, 140, 50, 30);

        labelBackgroundGameBoard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/beige2000x3.png"))); // NOI18N
        cardBattle.add(labelBackgroundGameBoard2);
        labelBackgroundGameBoard2.setBounds(650, 120, 610, 570);

        panelYou.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelYou.setLayout(new java.awt.GridLayout(1, 0));
        cardBattle.add(panelYou);
        panelYou.setBounds(100, 170, 500, 500);

        jLabel23.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Alpha");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel23);
        jLabel23.setBounds(30, 170, 70, 50);

        jLabel24.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Bravo");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel24);
        jLabel24.setBounds(30, 220, 70, 50);

        jLabel25.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Charlie");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel25);
        jLabel25.setBounds(30, 270, 70, 50);

        jLabel26.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Delta");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel26);
        jLabel26.setBounds(30, 320, 70, 50);

        jLabel27.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Echo");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel27);
        jLabel27.setBounds(30, 370, 70, 50);

        jLabel28.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Foxtrot");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel28);
        jLabel28.setBounds(30, 420, 70, 50);

        jLabel29.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Golf");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel29);
        jLabel29.setBounds(30, 470, 70, 50);

        jLabel30.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Hotel");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel30);
        jLabel30.setBounds(30, 520, 70, 50);

        jLabel31.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("India");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel31.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel31);
        jLabel31.setBounds(30, 570, 70, 50);

        jLabel32.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Juliett");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel32.setPreferredSize(new java.awt.Dimension(70, 50));
        cardBattle.add(jLabel32);
        jLabel32.setBounds(30, 620, 70, 50);

        jLabel33.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("1");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel33);
        jLabel33.setBounds(100, 140, 50, 30);

        jLabel34.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("2");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel34.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel34);
        jLabel34.setBounds(150, 140, 50, 30);

        jLabel35.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("3");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel35);
        jLabel35.setBounds(200, 140, 50, 30);

        jLabel36.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("4");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel36);
        jLabel36.setBounds(250, 140, 50, 30);

        jLabel37.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("5");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel37.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel37);
        jLabel37.setBounds(300, 140, 50, 30);

        jLabel38.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("6");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel38.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel38);
        jLabel38.setBounds(350, 140, 50, 30);

        jLabel39.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("7");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel39.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel39);
        jLabel39.setBounds(400, 140, 50, 30);

        jLabel40.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("8");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel40.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel40);
        jLabel40.setBounds(450, 140, 50, 30);

        jLabel41.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("9");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel41.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel41);
        jLabel41.setBounds(500, 140, 50, 30);

        jLabel42.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("10");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel42.setPreferredSize(new java.awt.Dimension(50, 30));
        cardBattle.add(jLabel42);
        jLabel42.setBounds(550, 140, 50, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/info40x40.png"))); // NOI18N
        jLabel2.setToolTipText("<html>Aby zacząć grać, naciśnij na pole na planszy przeciwnika,<br>a następnie interesujący cie typ ataku.<br>Przeciwnik zaatakuje automatycznie</html>");
        cardBattle.add(jLabel2);
        jLabel2.setBounds(1230, 10, 40, 40);

        buttonShoot.setBackground(new java.awt.Color(185, 174, 154));
        buttonShoot.setFont(new java.awt.Font("Bradley Hand ITC", 3, 18)); // NOI18N
        buttonShoot.setText("STRZAL");
        buttonShoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShootActionPerformed(evt);
            }
        });
        cardBattle.add(buttonShoot);
        buttonShoot.setBounds(1050, 50, 140, 50);

        labelSubsLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        labelSubsLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelSubsLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cardBattle.add(labelSubsLeft);
        labelSubsLeft.setBounds(380, 50, 70, 50);

        labelFightersLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        labelFightersLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelFightersLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cardBattle.add(labelFightersLeft);
        labelFightersLeft.setBounds(580, 50, 70, 50);

        labelBombersLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        labelBombersLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelBombersLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cardBattle.add(labelBombersLeft);
        labelBombersLeft.setBounds(780, 50, 70, 50);

        labelKrakenLeft.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        labelKrakenLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelKrakenLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cardBattle.add(labelKrakenLeft);
        labelKrakenLeft.setBounds(980, 50, 70, 50);

        buttonUseSub.setBackground(new java.awt.Color(185, 174, 154));
        buttonUseSub.setFont(new java.awt.Font("Bradley Hand ITC", 3, 12)); // NOI18N
        buttonUseSub.setText("Łódz podwodna");
        buttonUseSub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonUseSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUseSubActionPerformed(evt);
            }
        });
        cardBattle.add(buttonUseSub);
        buttonUseSub.setBounds(250, 50, 130, 50);

        buttonUseFighter.setBackground(new java.awt.Color(185, 174, 154));
        buttonUseFighter.setFont(new java.awt.Font("Bradley Hand ITC", 3, 12)); // NOI18N
        buttonUseFighter.setText("Mysliwiec");
        buttonUseFighter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonUseFighter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUseFighterActionPerformed(evt);
            }
        });
        cardBattle.add(buttonUseFighter);
        buttonUseFighter.setBounds(450, 50, 130, 50);

        buttonUseBomber.setBackground(new java.awt.Color(185, 174, 154));
        buttonUseBomber.setFont(new java.awt.Font("Bradley Hand ITC", 3, 12)); // NOI18N
        buttonUseBomber.setText("Bombowiec");
        buttonUseBomber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonUseBomber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUseBomberActionPerformed(evt);
            }
        });
        cardBattle.add(buttonUseBomber);
        buttonUseBomber.setBounds(650, 50, 130, 50);

        buttonUseKraken.setBackground(new java.awt.Color(185, 174, 154));
        buttonUseKraken.setFont(new java.awt.Font("Bradley Hand ITC", 3, 12)); // NOI18N
        buttonUseKraken.setText("???");
        buttonUseKraken.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonUseKraken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUseKrakenActionPerformed(evt);
            }
        });
        cardBattle.add(buttonUseKraken);
        buttonUseKraken.setBounds(850, 50, 130, 50);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/beige2000x3.png"))); // NOI18N
        cardBattle.add(jLabel64);
        jLabel64.setBounds(240, 40, 980, 70);

        labelBackgroundGameBoard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/beige2000x3.png"))); // NOI18N
        cardBattle.add(labelBackgroundGameBoard1);
        labelBackgroundGameBoard1.setBounds(10, 120, 610, 570);

        buttonBackToOptions.setBackground(new java.awt.Color(185, 174, 154));
        buttonBackToOptions.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        buttonBackToOptions.setText("POWROT");
        buttonBackToOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackToOptionsActionPerformed(evt);
            }
        });
        cardBattle.add(buttonBackToOptions);
        buttonBackToOptions.setBounds(20, 20, 210, 90);

        backgroundBattle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/paperTexture1280x720.png"))); // NOI18N
        cardBattle.add(backgroundBattle);
        backgroundBattle.setBounds(0, 0, 1280, 720);

        jCheckBox1.setText("jCheckBox1");
        cardBattle.add(jCheckBox1);
        jCheckBox1.setBounds(670, 20, 81, 23);

        getContentPane().add(cardBattle, "card6");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        goCardOptions();
    }//GEN-LAST:event_jButtonNewGameActionPerformed
    private void jButtonWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWyjscieActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonWyjscieActionPerformed
    private void buttonBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackToMenuActionPerformed
        goCardMenu();
    }//GEN-LAST:event_buttonBackToMenuActionPerformed
    private void textFieldStatkiBazoweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldStatkiBazoweActionPerformed
    }//GEN-LAST:event_textFieldStatkiBazoweActionPerformed
    private void textFieldSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSubActionPerformed
    }//GEN-LAST:event_textFieldSubActionPerformed
    private void textFieldMysliwiecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMysliwiecActionPerformed
    }//GEN-LAST:event_textFieldMysliwiecActionPerformed
    private void buttonPozycjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPozycjeActionPerformed
        goCardPosition();
    }//GEN-LAST:event_buttonPozycjeActionPerformed
    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        goCardMenu();
    }//GEN-LAST:event_buttonBackActionPerformed
    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
        goCardBattle();
        startGame();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "=index");
            System.out.println(myBattleships[i].xInitial + "=xInitial");
            System.out.println(myBattleships[i].xFinal + "=xFinal");
            System.out.println(myBattleships[i].yInitial + "=yInitial");
            System.out.println(myBattleships[i].yFinal + "=yFinal");
            System.out.println(myBattleships[i].length + "=length");
            System.out.println("-------------------------------------------------------------");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "=index");
            System.out.println(foeBattleships[i].xInitial + "=xInitial");
            System.out.println(foeBattleships[i].xFinal + "=xFinal");
            System.out.println(foeBattleships[i].yInitial + "=yInitial");
            System.out.println(foeBattleships[i].yFinal + "=yFinal");
            System.out.println(foeBattleships[i].length + "=length");
            System.out.println("-----------------------foeBattleships------------------------------");
        }
    }//GEN-LAST:event_buttonStartActionPerformed
    private void spinnerSubChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSubChanged
        subCounter = (int) spinSubCounter.getValue();
        fSub = subCounter;
    }//GEN-LAST:event_spinnerSubChanged
    private void spinnerFighterChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerFighterChanged
        fighterCounter = (int) spinFighterCounter.getValue();
        fFighter = fighterCounter;
    }//GEN-LAST:event_spinnerFighterChanged
    private void spinnerKrakenChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerKrakenChanged
        krakenCounter = (int) spinKrakenCounter.getValue();
        fKraken = krakenCounter;
    }//GEN-LAST:event_spinnerKrakenChanged
    private void buttonBackToOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackToOptionsActionPerformed
        for (int i = 0; i < boardsLength; i++) {
            for (int j = 0; j < boardsLength; j++) {
                myBoard[i][j] = 0;
                foeBoard[i][j] = 0;
            }
        }
        copyBoards(boardFoeBattle, true);
        copyBoards(boardMeBattle, false);
        repaint();
        goCardMenu();//jednak backToMenu
    }//GEN-LAST:event_buttonBackToOptionsActionPerformed
    private void textLeftoverShipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLeftoverShipsActionPerformed
    }//GEN-LAST:event_textLeftoverShipsActionPerformed
    private void buttonPlaceFrigateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaceFrigateActionPerformed
        labelError.setVisible(false);
        if (oneCounter > 0) {
            if (!shipsClose(boardPositioning.getMouseX(), boardPositioning.getMouseY(), true, false, 1)) {
                nextShipLength = 1;
                setBattleships(false, false, nextShipLength, boardPositioning.getMouseX(), boardPositioning.getMouseY(), nextShipNumber);
                nextShipNumber++;
                myBoard[boardPositioning.getMouseX()][boardPositioning.getMouseY()] = 1;
                oneCounter--;
                shipsLeft--;
                labelFrigatesLeft.setText(String.valueOf(oneCounter));
                copyBoards(boardPositioning, false);
                cardPosition.repaint();
                boardPositioning.repaint();
                //printArr();
            } else {//shipsClose=true
                labelError.setText("Za blisko innych statkow!");
                labelError.setVisible(true);
            }
        }
        repaint();
    }//GEN-LAST:event_buttonPlaceFrigateActionPerformed
    private void textFrigateLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFrigateLeftActionPerformed
    }//GEN-LAST:event_textFrigateLeftActionPerformed
    private void textFieldFigatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFigatesActionPerformed
    }//GEN-LAST:event_textFieldFigatesActionPerformed
    private void buttonPlaceCorvetteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaceCorvetteActionPerformed
        labelError.setVisible(false);
        if (boardPositioning.getMouseX() + 2 <= 10) {
            if (!shipsClose(boardPositioning.getMouseX(), boardPositioning.getMouseY(), false, false, 2)) {
                if (twoCounter > 0) {
                    nextShipLength = 2;
                    shipsLeft--;
                    setBattleships(false, false, nextShipLength, boardPositioning.getMouseX(), boardPositioning.getMouseY(), nextShipNumber);
                    nextShipNumber++;
                    twoCounter--;
                    for (int i = 0; i < nextShipLength; i++) {
                        myBoard[boardPositioning.getMouseX() + i][boardPositioning.getMouseY()] = 1;
                    }
                    labelCorvettesLeft.setText(String.valueOf(twoCounter));
                    copyBoards(boardPositioning, false);
                    cardPosition.repaint();
                    boardPositioning.repaint();
                    //printArr();
                }
            } else {
                labelError.setText("Za blisko innych statkow!");
                labelError.setVisible(true);
            }
        } else {
            labelError.setText("Statek poza plansza!");
            labelError.setVisible(true);
        }
        repaint();
    }//GEN-LAST:event_buttonPlaceCorvetteActionPerformed
    private void buttonPlaceDestroyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaceDestroyerActionPerformed
        labelError.setVisible(false);
        if (boardPositioning.getMouseX() + 3 <= 10) {
            if (!shipsClose(boardPositioning.getMouseX(), boardPositioning.getMouseY(), false, false, 3)) {
                if (threeCounter > 0) {
                    nextShipLength = 3;
                    shipsLeft--;
                    setBattleships(false, false, nextShipLength, boardPositioning.getMouseX(), boardPositioning.getMouseY(), nextShipNumber);
                    nextShipNumber++;
                    threeCounter--;
                    for (int i = 0; i < nextShipLength; i++) {
                        myBoard[boardPositioning.getMouseX() + i][boardPositioning.getMouseY()] = 1;
                    }
                    labelDestroyersLeft.setText(String.valueOf(threeCounter));
                    copyBoards(boardPositioning, false);
                    cardPosition.repaint();
                    boardPositioning.repaint();
                    //printArr();
                }
            } else {
                labelError.setText("Za blisko innych statkow!");
                labelError.setVisible(true);
            }
        } else {
            labelError.setText("Statek poza plansza!");
            labelError.setVisible(true);
        }
        repaint();
    }//GEN-LAST:event_buttonPlaceDestroyerActionPerformed
    private void buttonPlaceCruiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaceCruiserActionPerformed
        labelError.setVisible(false);
        if (boardPositioning.getMouseX() + 4 <= 10) {
            if (!shipsClose(boardPositioning.getMouseX(), boardPositioning.getMouseY(), false, false, 4)) {
                if (fourCounter > 0) {
                    nextShipLength = 4;
                    shipsLeft--;
                    setBattleships(false, false, nextShipLength, boardPositioning.getMouseX(), boardPositioning.getMouseY(), nextShipNumber);
                    nextShipNumber++;
                    fourCounter--;
                    for (int i = 0; i < nextShipLength; i++) {
                        myBoard[boardPositioning.getMouseX() + i][boardPositioning.getMouseY()] = 1;
                    }
                    labelCruisersLeft.setText(String.valueOf(fourCounter));
                    copyBoards(boardPositioning, false);
                    cardPosition.repaint();
                    boardPositioning.repaint();
                    //printArr();
                }
            } else {
                labelError.setText("Za blisko innych statkow!");
                labelError.setVisible(true);
            }

        } else {
            labelError.setText("Statek poza plansza!");
            labelError.setVisible(true);
        }
        repaint();
    }//GEN-LAST:event_buttonPlaceCruiserActionPerformed
    private void buttonPlaceCorvetteVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaceCorvetteVerticalActionPerformed
        labelError.setVisible(false);
        if (boardPositioning.getMouseY() + 2 <= 10) {
            if (!shipsClose(boardPositioning.getMouseX(), boardPositioning.getMouseY(), true, false, 2)) {
                if (twoCounter > 0) {
                    nextShipLength = 2;
                    shipsLeft--;
                    setBattleships(false, true, nextShipLength, boardPositioning.getMouseX(), boardPositioning.getMouseY(), nextShipNumber);
                    nextShipNumber++;
                    twoCounter--;
                    labelCorvettesLeft.setText(String.valueOf(twoCounter));
                    for (int i = 0; i < nextShipLength; i++) {
                        myBoard[boardPositioning.getMouseX()][boardPositioning.getMouseY() + i] = 1;
                    }
                    copyBoards(boardPositioning, false);
                    cardPosition.repaint();
                    boardPositioning.repaint();
                    //printArr();
                }
            } else {//else shipsClose=true
                labelError.setText("Za blisko innych statkow!");
                labelError.setVisible(true);
            }

        } else {
            labelError.setText("Statek poza plansza!");
            labelError.setVisible(true);
        }
        repaint();
    }//GEN-LAST:event_buttonPlaceCorvetteVerticalActionPerformed
    private void buttonPlaceDestroyerVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaceDestroyerVerticalActionPerformed
        labelError.setVisible(false);
        if (boardPositioning.getMouseY() + 3 <= 10) {
            if (!shipsClose(boardPositioning.getMouseX(), boardPositioning.getMouseY(), true, false, 3)) {
                if (threeCounter > 0) {
                    nextShipLength = 3;
                    shipsLeft--;
                    setBattleships(false, true, nextShipLength, boardPositioning.getMouseX(), boardPositioning.getMouseY(), nextShipNumber);
                    nextShipNumber++;
                    threeCounter--;
                    for (int i = 0; i < nextShipLength; i++) {
                        myBoard[boardPositioning.getMouseX()][boardPositioning.getMouseY() + i] = 1;
                    }
                    labelDestroyersLeft.setText(String.valueOf(threeCounter));
                    copyBoards(boardPositioning, false);
                    cardPosition.repaint();
                    boardPositioning.repaint();
                    //printArr();
                }
            } else {
                labelError.setText("Za blisko innych statkow!");
                labelError.setVisible(true);
            }

        } else {
            labelError.setText("Statek poza plansza!");
            labelError.setVisible(true);
        }
        repaint();
    }//GEN-LAST:event_buttonPlaceDestroyerVerticalActionPerformed
    private void buttonPlaceCruiserVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlaceCruiserVerticalActionPerformed
        labelError.setVisible(false);
        if (boardPositioning.getMouseY() + 4 <= 10) {
            if (!shipsClose(boardPositioning.getMouseX(), boardPositioning.getMouseY(), true, false, 3)) {
                if (fourCounter > 0) {
                    nextShipLength = 4;
                    shipsLeft--;
                    setBattleships(false, true, nextShipLength, boardPositioning.getMouseX(), boardPositioning.getMouseY(), nextShipNumber);
                    nextShipNumber++;
                    fourCounter--;
                    for (int i = 0; i < nextShipLength; i++) {
                        myBoard[boardPositioning.getMouseX()][boardPositioning.getMouseY() + i] = 1;
                    }
                    labelCruisersLeft.setText(String.valueOf(fourCounter));
                    copyBoards(boardPositioning, false);
                    cardPosition.repaint();
                    boardPositioning.repaint();
                    //printArr();
                }
            } else {
                labelError.setText("Za blisko innych statkow!");
                labelError.setVisible(true);
            }

        } else {
            labelError.setText("Statek poza plansza!");
            labelError.setVisible(true);
        }
        repaint();
    }//GEN-LAST:event_buttonPlaceCruiserVerticalActionPerformed
    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        labelError.setVisible(false);
        foeBoardSet = false;
        shipsLeft = 10;
        oneCounter = 4;
        twoCounter = 3;
        threeCounter = 2;
        fourCounter = 1;
        nextShipLength = 1;
        nextShipNumber = 0;
        for (int i = 0; i < boardsLength; i++) {
            for (int j = 0; j < boardsLength; j++) {
                myBoard[i][j] = 0;
                foeBoard[i][j] = 0;
            }
        }
        copyBoards(boardPositioning, false);
        labelFrigatesLeft.setText(String.valueOf(oneCounter));
        labelCorvettesLeft.setText(String.valueOf(twoCounter));
        labelDestroyersLeft.setText(String.valueOf(threeCounter));
        labelCruisersLeft.setText(String.valueOf(fourCounter));
        cardPosition.repaint();
        panelGameBoard.repaint();
    }//GEN-LAST:event_buttonResetActionPerformed
    private void spinnerMPAChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerMPAChanged
        bomberCounter = (int) spinBomberCounter.getValue();//zmieniono z mpa na bombowiec
    }//GEN-LAST:event_spinnerMPAChanged
    private void buttonUseSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUseSubActionPerformed
        if (subCounter < 1) {
            return;
        }
        if (boardFoeBattle.triggerInput) {
            useSub(boardFoeBattle.getMouseX(), boardFoeBattle.getMouseY(), false);
            boardFoeBattle.triggerInput = false;
            do {
                foeHitYou = false;
                foeTurn();
            } while (foeHitYou);
        }
        foeHitYou = false;
        youHitFoe = false;
        repaint();
    }//GEN-LAST:event_buttonUseSubActionPerformed
    private void buttonUseFighterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUseFighterActionPerformed
        // System.out.println(boardFoeBattle.triggerInput);
        if (fighterCounter < 1) {
            return;
        }
        if (boardFoeBattle.triggerInput) {
            System.out.println("ty strzeliles");
            useFighter(boardFoeBattle.getMouseX(), boardFoeBattle.getMouseY(), false);
            boardFoeBattle.triggerInput = false;
            do {
                foeHitYou = false;
                foeTurn();
            } while (foeHitYou);
        }
        foeHitYou = false;
        youHitFoe = false;
        repaint();
        winner();
    }//GEN-LAST:event_buttonUseFighterActionPerformed
    private void buttonUseBomberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUseBomberActionPerformed
        //System.out.println(boardFoeBattle.triggerInput);
        if (bomberCounter < 1) {
            return;
        }
        if (boardFoeBattle.triggerInput) {
            //System.out.println("usedBomber");
            useBomber(boardFoeBattle.getMouseX(), boardFoeBattle.getMouseY(), false);
            boardFoeBattle.triggerInput = false;
            do {
                foeHitYou = false;
                foeTurn();
            } while (foeHitYou);
        }
        foeHitYou = false;
        youHitFoe = false;
        repaint();
        winner();
    }//GEN-LAST:event_buttonUseBomberActionPerformed
    private void buttonUseKrakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUseKrakenActionPerformed
        //System.out.println(boardFoeBattle.triggerInput);
        if (krakenCounter < 1) {
            return;
        }
        if (boardFoeBattle.triggerInput) {
            useKraken(false);
            boardFoeBattle.triggerInput = false;
            do {
                foeHitYou = false;
                foeTurn();
            } while (foeHitYou);
        }
        youHitFoe = false;
        foeHitYou = false;
        repaint();
        winner();
    }//GEN-LAST:event_buttonUseKrakenActionPerformed
    private void buttonShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonShootActionPerformed
        if (boardFoeBattle.triggerInput) {
            shoot(false, boardFoeBattle.getMouseX(), boardFoeBattle.getMouseY());
            boardFoeBattle.triggerInput = false;
            do {
                foeHitYou = false;
                foeTurn();
            } while (foeHitYou);
            foeHitYou = false;
            youHitFoe = false;
        }
        repaint();
        winner();
    }//GEN-LAST:event_buttonShootActionPerformed
    private void buttonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBack1ActionPerformed
        cardEnd.setVisible(false);
        goCardMenu();
    }//GEN-LAST:event_buttonBack1ActionPerformed
    private void buttonRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRandomActionPerformed
        if (isSet) {
            labelError.setVisible(false);
            foeBoardSet = false;
            shipsLeft = 10;
            oneCounter = 4;
            twoCounter = 3;
            threeCounter = 2;
            fourCounter = 1;
            nextShipLength = 1;
            nextShipNumber = 0;
            for (int i = 0; i < boardsLength; i++) {
                for (int j = 0; j < boardsLength; j++) {
                    myBoard[i][j] = 0;
                    foeBoard[i][j] = 0;
                }
            }
            copyBoards(boardPositioning, false);
            labelFrigatesLeft.setText(String.valueOf(oneCounter));
            labelCorvettesLeft.setText(String.valueOf(twoCounter));
            labelDestroyersLeft.setText(String.valueOf(threeCounter));
            labelCruisersLeft.setText(String.valueOf(fourCounter));
            cardPosition.repaint();
            panelGameBoard.repaint();
        }
        populateMyBoard();
        oneCounter = 0;
        twoCounter = 0;
        threeCounter = 0;
        fourCounter = 0;
        labelFrigatesLeft.setText(String.valueOf(oneCounter));
        labelCorvettesLeft.setText(String.valueOf(twoCounter));
        labelDestroyersLeft.setText(String.valueOf(threeCounter));
        labelCruisersLeft.setText(String.valueOf(fourCounter));
        repaint();
    }//GEN-LAST:event_buttonRandomActionPerformed
    private void setBattleships(boolean isEnemys, boolean isVertical, int length, int argx, int argy, int index) {
        if (isEnemys) {
            foeBattleships[index].isVertical = isVertical;
            foeBattleships[index].setHealthLength(length);
            foeBattleships[index].xInitial = argx;
            foeBattleships[index].yInitial = argy;
            foeBattleships[index].setFinals();
        } else {
            myBattleships[index].isVertical = isVertical;
            myBattleships[index].setHealthLength(length);
            myBattleships[index].xInitial = argx;
            myBattleships[index].yInitial = argy;
            myBattleships[index].setFinals();
        }

    }

    private void destroy(int index, boolean isEnemys) {
        if (isEnemys) {
            if (foeBattleships[index].health == 0) {
                int tmpLength = foeBattleships[index].length;
                int tmpXInitial = foeBattleships[index].xInitial;
                int tmpYInitial = foeBattleships[index].yInitial;
                boolean tmpVertical = foeBattleships[index].isVertical;
                for (int i = 0; i < 6 + 3 * tmpLength; i++) {
                    int a = foeBattleships[index].isDestroyed[i][0];
                    int b = foeBattleships[index].isDestroyed[i][1];
                    try {
                        foeBoard[a][b] = 3;
                    } catch (Exception e) {
                    }
                }
                if (tmpVertical) {
                    for (int i = 0; i < tmpLength; i++) {
                        foeBoard[tmpXInitial][tmpYInitial + i] = 2;
                    }
                } else {
                    for (int i = 0; i < tmpLength; i++) {
                        foeBoard[tmpXInitial + i][tmpYInitial] = 2;
                    }
                }
                //
                copyBoards(boardFoeBattle, true);
            }
        } else {//not foe
            if (myBattleships[index].health == 0) {
                int tmpLength = myBattleships[index].length;
                int tmpXInitial = myBattleships[index].xInitial;
                int tmpYInitial = myBattleships[index].yInitial;
                boolean tmpVertical = myBattleships[index].isVertical;
                for (int i = 0; i < 6 + 3 * tmpLength; i++) {
                    int a = myBattleships[index].isDestroyed[i][0];
                    int b = myBattleships[index].isDestroyed[i][1];
                    myBoard[a][b] = 3;
                    try {
                        myBoard[a][b] = 3;
                    } catch (Exception e) {
                    }
                }
                if (tmpVertical) {
                    for (int i = 0; i < tmpLength; i++) {
                        myBoard[tmpXInitial][tmpYInitial + i] = 2;
                    }
                } else {
                    for (int i = 0; i < tmpLength; i++) {
                        myBoard[tmpXInitial + i][tmpYInitial] = 2;
                    }
                }
                copyBoards(boardMeBattle, false);
            }
        }
    }

    private int checkShip(int argx, int argy, boolean enemys) {
        int index = 99;
        if (enemys) {
            for (int i = 0; i < 10; i++) {
                int x = 0;
                if (foeBattleships[i].xInitial <= argx && foeBattleships[i].xFinal >= argx && foeBattleships[i].yInitial <= argy && foeBattleships[i].yFinal >= argy) {
                    index = i;
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                if (myBattleships[i].xInitial <= argx && myBattleships[i].xFinal >= argx && myBattleships[i].yInitial <= argy && myBattleships[i].yFinal >= argy) {
                    index = i;
                }
            }
        }
        //System.out.println(argx + "=argx");
        //System.out.println(argx + "=argx");
        //System.out.println("nie znaleziono statku");
        return index;
    }

    private void goCardEnd(boolean winner) {
        cardBattle.setVisible(false);
        cardEnd.setVisible(true);
        labelWin.setVisible(false);
        labelLose.setVisible(false);
        if (winner) {
            labelInfo.setText("Wygrana :D");
            labelWin.setVisible(true);
            panelEnd.add(boardFoeBattle);

        } else {
            labelInfo.setText("Przegrana :C");
            labelLose.setVisible(true);
            panelEnd.add(boardMeBattle);
        }
    }

    private void useSub(int x, int y, boolean argEnemy) {
        if (argEnemy) {
            if (fSub < 1) {
                return;
            } else {
                if (subCounter < 1) {
                    return;
                }
            }
        }
        if (argEnemy) {
            for (int i = 0; i < 10 - x; i++) {
                try {
                    switch (myBoard[x + i][y]) {
                        case 0:
                            myBoard[x + i][y] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
                try {
                    switch (myBoard[x - i][y]) {
                        case 0:
                            myBoard[x - i][y] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
            }
            for (int i = 0; i < 10 - y; i++) {
                try {
                    switch (myBoard[x][y + i]) {
                        case 0:
                            myBoard[x][y + i] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
                try {
                    switch (myBoard[x][y - i]) {
                        case 0:
                            myBoard[x][y - i] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
            }

        } else {
            for (int i = 0; i < 10 - x; i++) {
                try {
                    switch (foeBoard[x + i][y]) {
                        case 0:
                            foeBoard[x + i][y] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
                try {
                    switch (foeBoard[x - i][y]) {
                        case 0:
                            foeBoard[x - i][y] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
            }
            for (int i = 0; i < 10 - y; i++) {
                try {
                    switch (foeBoard[x][y + i]) {
                        case 0:
                            foeBoard[x][y + i] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
                try {
                    switch (foeBoard[x][y - i]) {
                        case 0:
                            foeBoard[x][y - i] = 3;
                        default:
                            break;
                    }
                } catch (Exception e) {
                }
            }
        }
        subCounter--;
        copyBoards(boardFoeBattle, true);
        copyBoards(boardMeBattle, false);
        System.out.println(argEnemy + ":wykonano useSub");
        labelSubsLeft.setText(String.valueOf(subCounter));
        repaint();
        winner();
        //printArr(true);
    }

    private void useBomber(int x, int y, boolean argEnemy) {
        if (argEnemy) {
            if (fBomber < 1) {
                return;
            } else {
                if (bomberCounter < 1) {
                    return;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    shoot(argEnemy, x + i - 1, y + j - 1);
                } catch (Exception e) {
                }
            }
        }
        if (argEnemy) {
            fBomber--;
            System.out.println(argEnemy + ":bombed");
        } else {
            bomberCounter--;
            System.out.println(argEnemy + ":bombed");
        }
        copyBoards(boardFoeBattle, true);
        copyBoards(boardMeBattle, false);
        labelBombersLeft.setText(String.valueOf(bomberCounter));
        //System.out.println("wykonano useBomber");
        repaint();
        //printArr(true);
        //winner();
    }

    private void useFighter(int x, int y, boolean argEnemy) {
        if (argEnemy) {
            if (fFighter < 1) {
                return;
            } else {
                if (fighterCounter < 1) {
                    return;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                try {
                    shoot(argEnemy, x + i, y + j);
                } catch (Exception e) {
                }
            }
        }
        if (argEnemy) {
            fFighter--;
            System.out.println("przeciwnik strzelil");
        } else {
            fighterCounter--;
            System.out.println("ty strzelil");
        }
        copyBoards(boardFoeBattle, true);
        copyBoards(boardMeBattle, false);
        labelFightersLeft.setText(String.valueOf(fighterCounter));
        //System.out.println("wykonano useFighter");
        repaint();
        //printArr(true);
        //winner();
    }

    private void useKraken(boolean argEnemy) {
        if (argEnemy) {
            if (fKraken < 1) {
                return;
            } else {
                if (krakenCounter < 1) {
                    return;
                }
            }
        }
        buttonUseKraken.setForeground(java.awt.Color.RED);
        buttonUseKraken.setText("KRAKEN");
        int rand1 = rnjesus.nextInt(10);
        int rand2 = rnjesus.nextInt(10);
        for (int i = 0; i < 50; i++) {
            shoot(argEnemy, rand1, rand2);
            rand1 = rnjesus.nextInt(10);
            rand2 = rnjesus.nextInt(10);
        }
        if (argEnemy) {
            fKraken--;
            System.out.println(argEnemy + ":kraken");
        } else {
            krakenCounter--;
            System.out.println("ty strzelil");
        }
        copyBoards(boardFoeBattle, true);
        copyBoards(boardMeBattle, false);
        labelKrakenLeft.setText(String.valueOf(krakenCounter));
        //System.out.println("wykonano useKraken");
        repaint();
        //printArr(true);
        //winner();
    }

    private void useCastle(boolean argEnemy, int x, int y) {
        //funkcja porzucona ze wzgledu na knoflikt z wymogiem odstepu miedzy statkami
        /*
        boolean vert = false;
        int tempX = 0;
        int tempY = 0;
        boolean vertical = false;
        int index = 0, length = 0;
        tempX = rnjesus.nextInt(10 - length);
        tempY = rnjesus.nextInt(10 - length);
        vertical = rnjesus.nextBoolean();
        if (argEnemy) {
            //nic
        } else {
            //System.out.print("jestem w else");
            try {
                if (myBoard[x - 1][y] == 1 || myBoard[x + 1][y] == 1) {
                    vert = false;
                    System.out.println("vart=false");
                } else {
                    System.out.println("vart=true");
                    vert = true;
                }
            } catch (Exception e) {
            }
            for (int i = 0; i < boardsLength; i++) {
                if (vert) {
                    if (myBattleships[i].yInitial <= y && myBattleships[i].yFinal >= y) {
                        index = i;
                        length = myBattleships[i].length;
                        System.out.println("index:" + index + "length" + length);
                    }
                } else {
                    if (myBattleships[i].xInitial <= x && myBattleships[i].xFinal >= x) {
                        index = i;
                        length = myBattleships[i].length;
                    }
                }
            }
            if (vert) {
                for (int k = 0; k < length; k++) {
                    myBoard[myBattleships[index].xInitial][myBattleships[index].yInitial + k] = 0;
                    //myBoard[newx][newy + k] = 1;
                }
            } else {
                for (int k = 0; k < length; k++) {
                    myBoard[myBattleships[index].xInitial + k][myBattleships[index].yInitial] = 0;
                    //myBoard[newx + k][newy] = 1;
                }
            }
            tempX = rnjesus.nextInt(10 - length);
            tempY = rnjesus.nextInt(10 - length);
            vertical = rnjesus.nextBoolean();
            while (shipsClose(tempX, tempY, vertical, false, length)) {
                tempX = rnjesus.nextInt(10 - length);
                tempY = rnjesus.nextInt(10 - length);
                vertical = rnjesus.nextBoolean();
                System.out.println("petla");
            }
            if (vertical) {
                for (int i = 0; i < length; i++) {
                    foeBoard[tempX][tempY + i] = 1;
                    System.out.println("polozono statek 4vert");
                }
            } else {
                for (int i = 0; i < length; i++) {
                    foeBoard[tempX + i][tempY] = 1;
                    System.out.println("polozono statek 4hor");
                }
            }
        }
        copyBoards(boardFoeBattle, true);
        copyBoards(boardMeBattle, false);
    
         */
    }

    private void foeTurn() {
        if (youHitFoe) {
            return;
        }

        int rnda = rnjesus.nextInt(10);
        switch (rnda) {
            case 7:
                if (fBomber > 0) {
                    getValidShot();
                    useBomber(randoma, randomb, true);
                    copyBoards(boardFoeBattle, true);
                    copyBoards(boardMeBattle, false);
                    //System.out.println("useBomber");
                } else {
                    getValidShot();
                    shoot(true, randoma, randomb);
                    copyBoards(boardFoeBattle, true);
                    copyBoards(boardMeBattle, false);
                    //System.out.println("useShot");
                }
                break;
            case 8:
                if (fFighter > 0) {
                    getValidShot();
                    useFighter(randoma, randomb, true);
                    copyBoards(boardFoeBattle, true);
                    copyBoards(boardMeBattle, false);
                    //System.out.println("useFighter");
                } else {
                    getValidShot();
                    shoot(true, randoma, randomb);
                    copyBoards(boardFoeBattle, true);
                    copyBoards(boardMeBattle, false);
                    //System.out.println("useShot");
                }
                break;
            case 9:
                if (fKraken > 0) {
                    getValidShot();
                    useKraken(true);
                    copyBoards(boardFoeBattle, true);
                    copyBoards(boardMeBattle, false);
                    //System.out.println("useKraken");
                } else {
                    getValidShot();
                    shoot(true, randoma, randomb);
                    copyBoards(boardFoeBattle, true);
                    copyBoards(boardMeBattle, false);
                    //System.out.println("useShot");//kom
                }
                break;
            default:
                getValidShot();
                shoot(true, randoma, randomb);
                copyBoards(boardFoeBattle, true);
                copyBoards(boardMeBattle, false);
                //System.out.println("useShot");
                break;
        }

    }

    private void copyBoards(Square arg, boolean isEnemy) {
        if (isEnemy) {
            for (int i = 0; i < boardsLength; i++) {
                for (int j = 0; j < boardsLength; j++) {
                    arg.thisBoard[i][j] = foeBoard[i][j];
                    //System.out.println("skopiowana foe");
                    //System.out.println(arg.thisBoard[i][j]+"jest równe:"+foeBoard[i][j]);
                }
            }
        } else {
            for (int i = 0; i < boardsLength; i++) {
                for (int j = 0; j < boardsLength; j++) {
                    arg.thisBoard[i][j] = myBoard[i][j];
                    //System.out.println("skopiowana moja");
                    //System.out.println(arg.thisBoard[i][j]+"jest równe:"+myBoard[i][j]);
                }
            }
        }
    }

    private void shoot(boolean enemyShot, int argx, int argy) {
        if (enemyShot) {
            switch (myBoard[argx][argy]) {
                case 0:
                    myBoard[argx][argy] = 3;
                    //foeHitYou = false;
                    break;
                case 1:
                    myBoard[argx][argy] = 2;
                    foeHitYou = true;
                    int tmpIndex = checkShip(argx, argy, false);
                    myBattleships[tmpIndex].hit();
                    if (myBattleships[tmpIndex].isDestroyed()) {
                        destroy(tmpIndex, false);
                        System.out.println("petla destroy");
                    }
                    break;
                default:
                    //foeHitYou = false;
                    break;
            }
            copyBoards(boardMeBattle, false);
            //destroy(checkShip(argx,argy,enemyShot),false);
        } else {
            switch (foeBoard[argx][argy]) {
                case 0:
                    foeBoard[argx][argy] = 3;
                    //youHitFoe=false;
                    break;
                case 1:
                    foeBoard[argx][argy] = 2;
                    youHitFoe = true;
                    //z jakiegos powodu wywoluje funkcje shoot 3 razy co powodue nadpisanie wartosci dobrej złą
                    int tmpIndex = checkShip(argx, argy, true);
                    foeBattleships[tmpIndex].hit();
                    int temp = foeBattleships[tmpIndex].health;
                    if (foeBattleships[tmpIndex].health == 0) {
                        System.out.println("przed petla destroy");
                        printArr(true);
                        destroy(tmpIndex, true);
                    }
                    break;
                default:
                    //youHitFoe = false;
                    break;
            }
            copyBoards(boardFoeBattle, true);
            copyBoards(boardMeBattle, false);
            System.out.println("po petla destroy");
            printArr(true);
            /*
            if (myBattleships[checkShip(argx,argy,enemyShot)].isDestroyed()){
                destroy(checkShip(argx,argy,enemyShot),true);
            }*/
        }
        winner();
        repaint();
    }

    private void goCardOptions() {
        cardMenu.setVisible(false);
        cardPosition.setVisible(false);
        cardBattle.setVisible(false);
        cardOptions.setVisible(true);
    }

    private void goCardMenu() {
        cardPosition.setVisible(false);
        cardBattle.setVisible(false);
        cardOptions.setVisible(false);
        cardMenu.setVisible(true);
    }

    private void goCardPosition() {
        cardBattle.setVisible(false);
        cardOptions.setVisible(false);
        cardMenu.setVisible(false);
        cardPosition.setVisible(true);
        panelGameBoard.add(boardPositioning);
        panelGameBoard.setVisible(true);
        labelFrigatesLeft.setText(String.valueOf(oneCounter));
        labelCorvettesLeft.setText(String.valueOf(twoCounter));
        labelDestroyersLeft.setText(String.valueOf(threeCounter));
        labelCruisersLeft.setText(String.valueOf(fourCounter));
        revalidate();
        repaint();

    }

    private void goCardBattle() {
        cardOptions.setVisible(false);
        cardMenu.setVisible(false);
        cardPosition.setVisible(false);
        cardBattle.setVisible(true);
        panelYou.add(boardMeBattle);
        panelEnemy.add(boardFoeBattle);
        labelSubsLeft.setText(String.valueOf(subCounter));
        labelFightersLeft.setText(String.valueOf(fighterCounter));
        labelBombersLeft.setText(String.valueOf(bomberCounter));
        labelKrakenLeft.setText(String.valueOf(krakenCounter));
        revalidate();
        repaint();
    }

    private boolean isValidPosition(int argx, int argy, boolean argEnemy) {
        if (argEnemy) {
            if (foeBoard[argx][argy] == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (myBoard[argx][argy] == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean isValidShot(int argx, int argy, boolean argEnemy) {
        if (argEnemy) {
            if (myBoard[argx][argy] == 0 || myBoard[argx][argy] == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            if (foeBoard[argx][argy] == 0 || foeBoard[argx][argy] == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    private void populateFoeBoard() {
        //System.out.println("wywolano populateFoeboard");
        if (!foeBoardSet) {
            int tempX = 0;
            int tempY = 0;
            int index = 0;
            boolean vertical = false;
            int one = 4, two = 3, three = 2, four = 1;
            while (four > 0) {
                tempX = rnjesus.nextInt(7);
                tempY = rnjesus.nextInt(7);
                vertical = rnjesus.nextBoolean();
                if (!shipsClose(tempX, tempY, vertical, true, 4)) {
                    if (vertical) {
                        for (int i = 0; i < 4; i++) {
                            foeBoard[tempX][tempY + i] = 1;
                            //System.out.println("polozono statek 4");
                        }
                    } else {
                        for (int i = 0; i < 4; i++) {
                            foeBoard[tempX + i][tempY] = 1;
                            //System.out.println("polozono statek 4");
                        }
                    }
                    setBattleships(true, vertical, 4, tempX, tempY, index);
                    index++;
                    four--;
                }
            }
            while (three > 0) {
                tempX = rnjesus.nextInt(8);
                tempY = rnjesus.nextInt(8);
                vertical = rnjesus.nextBoolean();
                if (!shipsClose(tempX, tempY, vertical, true, 3)) {
                    if (vertical) {
                        for (int i = 0; i < 3; i++) {
                            foeBoard[tempX][tempY + i] = 1;
                        }
                    } else {
                        for (int i = 0; i < 3; i++) {
                            foeBoard[tempX + i][tempY] = 1;
                        }
                    }
                    setBattleships(true, vertical, 3, tempX, tempY, index);
                    index++;
                    three--;
                }

            }
            while (two > 0) {
                tempX = rnjesus.nextInt(9);
                tempY = rnjesus.nextInt(9);
                vertical = rnjesus.nextBoolean();
                if (!shipsClose(tempX, tempY, vertical, true, 2)) {
                    if (vertical) {
                        for (int i = 0; i < 2; i++) {
                            foeBoard[tempX][tempY + i] = 1;
                        }
                    } else {
                        for (int i = 0; i < 2; i++) {
                            foeBoard[tempX + i][tempY] = 1;
                        }
                    }
                    setBattleships(true, vertical, 2, tempX, tempY, index);
                    index++;
                    two--;
                }
            }
            while (one > 0) {
                tempX = rnjesus.nextInt(10);
                tempY = rnjesus.nextInt(10);
                if (!shipsClose(tempX, tempY, vertical, true, 1)) {
                    foeBoard[tempX][tempY] = 1;
                    setBattleships(true, vertical, 1, tempX, tempY, index);
                    index++;
                    one--;
                }
            }
            //printArr(true);
            foeBoardSet = true;
        }
    }

    private void populateMyBoard() {
        //System.out.println("wywolano populateFoeboard");
        int tempX = 0;
        int tempY = 0;
        int index = 0;
        boolean vertical = false;
        int one = 4, two = 3, three = 2, four = 1;
        while (four > 0) {
            tempX = rnjesus.nextInt(7);
            tempY = rnjesus.nextInt(7);
            vertical = rnjesus.nextBoolean();
            if (!shipsClose(tempX, tempY, vertical, false, 4)) {
                if (vertical) {
                    for (int i = 0; i < 4; i++) {
                        myBoard[tempX][tempY + i] = 1;
                        //System.out.println("polozono statek 4");
                    }
                } else {
                    for (int i = 0; i < 4; i++) {
                        myBoard[tempX + i][tempY] = 1;
                        //System.out.println("polozono statek 4");
                    }
                }
                setBattleships(false, vertical, 4, tempX, tempY, index);
                four--;
                index++;
            }
        }
        while (three > 0) {
            tempX = rnjesus.nextInt(8);
            tempY = rnjesus.nextInt(8);
            vertical = rnjesus.nextBoolean();
            if (!shipsClose(tempX, tempY, vertical, false, 3)) {
                if (vertical) {
                    for (int i = 0; i < 3; i++) {
                        myBoard[tempX][tempY + i] = 1;
                    }
                } else {
                    for (int i = 0; i < 3; i++) {
                        myBoard[tempX + i][tempY] = 1;
                    }
                }
                setBattleships(false, vertical, 3, tempX, tempY, index);
                three--;
                index++;
            }

        }
        while (two > 0) {
            tempX = rnjesus.nextInt(9);
            tempY = rnjesus.nextInt(9);
            vertical = rnjesus.nextBoolean();
            if (!shipsClose(tempX, tempY, vertical, false, 2)) {
                if (vertical) {
                    for (int i = 0; i < 2; i++) {
                        myBoard[tempX][tempY + i] = 1;
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        myBoard[tempX + i][tempY] = 1;
                    }
                }
                setBattleships(false, vertical, 2, tempX, tempY, index);
                two--;
                index++;
            }
        }
        while (one > 0) {
            tempX = rnjesus.nextInt(10);
            tempY = rnjesus.nextInt(10);
            if (!shipsClose(tempX, tempY, vertical, false, 1)) {
                myBoard[tempX][tempY] = 1;
                one--;
                setBattleships(false, vertical, 1, tempX, tempY, index);
                index++;
            }
        }
        //printArr(true);
        copyBoards(boardPositioning, false);
        panelGameBoard.revalidate();
        panelGameBoard.repaint();
        isSet = true;
    }

    private boolean shipsClose(int x, int y, boolean isVert, boolean argEnem, int argLength) {
        int shipWidth = 3;
        if (argEnem) {
            if (isVert) {
                for (int i = 0; i < shipWidth; i++) {
                    for (int j = 0; j < argLength + 2; j++) {
                        try {
                            if (foeBoard[x + i - 1][y + j - 1] == 1) {
                                return true;//cos przeszkadza to nie ma sensu dalej sprawdzac
                            }
                        } catch (Exception e) {
                            //System.out.println(e.getLocalizedMessage() + "przy:i=" + i + "y:" + y);
                        }
                    }
                }
            } else {//isVert=false
                for (int i = 0; i < argLength + 2; i++) {
                    for (int j = 0; j < shipWidth; j++) {
                        try {
                            if (foeBoard[x + i - 1][y + j - 1] == 1) {
                                return true;//cos przeszkadza to nie ma sensu dalej sprawdzac
                            }
                        } catch (Exception e) {
                            //System.out.println(e.getLocalizedMessage() + "przy:i=" + i + "y:" + y);
                        }
                    }
                }
            }
        } else {//argEnem=false
            if (isVert) {
                for (int i = 0; i < shipWidth; i++) {
                    for (int j = 0; j < argLength + 2; j++) {
                        try {
                            if (myBoard[x + i - 1][y + j - 1] == 1) {
                                return true;//cos przeszkadza to nie ma sensu dalej sprawdzac
                            }
                        } catch (Exception e) {
                            //System.out.println(e.getLocalizedMessage() + "przy:i=" + i + "y:" + y);
                        }
                    }
                }
            } else {//isVert=false
                for (int i = 0; i < argLength + 2; i++) {
                    for (int j = 0; j < shipWidth; j++) {
                        try {
                            if (myBoard[x + i - 1][y + j - 1] == 1) {
                                return true;//cos przeszkadza to nie ma sensu dalej sprawdzac
                            }
                        } catch (Exception e) {
                            //System.out.println(e.getLocalizedMessage() + "przy:i=" + i + "y:" + y);
                        }
                    }
                }
            }
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="stary kod ktory sie wali">
    /*
        boolean flag = false;
        if (argEnem) {
            if (isVert) {
                switch (argLength) {
                    case 1: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 2: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 4; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 3: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 5; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 4: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 6; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                }

            } else {//else not vertical
                switch (argLength) {
                    case 1: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 2: {
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 3: {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 4: {
                        for (int i = 0; i < 6; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (foeBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                }
            }
        } else {//=notEnemy
            if (isVert) {
                switch (argLength) {
                    case 1: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.println("x;" + x + ",y:" + y + ",i:" + i + ",j:" + j + "Myboard[x][y]:" + myBoard[x][y]);
                                try {
                                    if (myBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 2: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 4; j++) {
                                System.out.println(x + "," + y);
                                if (myBoard[x + i][j + j] == 1) {
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                    case 3: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 5; j++) {
                                System.out.println("tego nie powinno byc");
                                if (myBoard[x - 1 + i][j - 1 + j] == 1) {
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                    case 4: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 6; j++) {
                                if (myBoard[x - 1 + i][j - 1 + j] == 1) {
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }

            } else {//is not vert
                switch (argLength) {
                    case 1: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (myBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 2: {
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (myBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 3: {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (myBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    case 4: {
                        for (int i = 0; i < 6; i++) {
                            for (int j = 0; j < 3; j++) {
                                try {
                                    if (myBoard[x - 1 + i][j - 1 + j] == 1) {
                                        flag = true;
                                        System.out.println("wszedlem do petli");
                                    } else {
                                        System.out.println("nie wszedlem do petli");
                                    }
                                } catch (Exception e) {
                                    System.out.println("zlapano wyjatek:" + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }
     */
    //</editor-fold>
    public void getValidShot() {
        randoma = rnjesus.nextInt(10);
        randomb = rnjesus.nextInt(10);
        boolean vs = (isValidShot(randoma, randomb, true));
        while (!vs) {
            randoma = rnjesus.nextInt(10);
            randomb = rnjesus.nextInt(10);
            vs = isValidShot(randoma, randomb, true);
        }
    }

    private void winner() {
        int totalCounterMe = 0, totalCounterFoe = 0;
        for (int i = 0; i < boardsLength; i++) {
            for (int j = 0; j < boardsLength; j++) {
                if (myBoard[i][j] == 1) {
                    totalCounterMe++;
                }
                if (foeBoard[i][j] == 1) {
                    totalCounterFoe++;
                }
            }
        }
        System.out.println("totalCounterFoe:" + totalCounterFoe);
        printArr(true);
        System.out.println("totalCounterMe:" + totalCounterMe);
        printArr(false);
        if (totalCounterMe == 0) {
            running = false;
            System.out.println("PRZEGRANA");
            goCardEnd(false);
        }
        if (totalCounterFoe == 0) {
            running = false;
            System.out.println("WYGRANA");
            goCardEnd(true);
        }

    }

    private void printArr(boolean isFoe) {
        if (isFoe) {
            for (int i = 0; i < boardsLength; i++) {
                for (int j = 0; j < boardsLength; j++) {
                    System.out.print(foeBoard[j][i]);
                }
                System.out.println("Z main");
            }
        } else {
            for (int i = 0; i < boardsLength; i++) {
                for (int j = 0; j < boardsLength; j++) {
                    System.out.print(myBoard[j][i]);
                }
                System.out.println("Z main");
            }
        }
    }

    private void startGame() {
        populateFoeBoard();
        copyBoards(boardMeBattle, false);
        copyBoards(boardFoeBattle, true);
        running = true;
        repaint();
    }

    private void waitForInput() {
        //beznadzieja
        boolean tg = boardFoeBattle.triggerInput;
        repaint();
        if (tg) {
            repaint();
            return;
        } else {
            while (!tg) {
                repaint();
                tg = boardFoeBattle.triggerInput;
            }
        }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Main().setVisible(true);

            }
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundBattle;
    private javax.swing.JLabel backgroundGrid;
    private javax.swing.JLabel backgroundIconHalfOpaque1;
    private javax.swing.JLabel backgroundIconHalfOpaque2;
    private javax.swing.JLabel backgroundIconOptions;
    private javax.swing.JLabel backgroundPosition;
    private javax.swing.JLabel backgroundShipRight;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonBack1;
    private javax.swing.JButton buttonBackToMenu;
    private javax.swing.JButton buttonBackToOptions;
    private javax.swing.ButtonGroup buttonGroupSizeOfBoard;
    private javax.swing.JButton buttonPlaceCorvette;
    private javax.swing.JButton buttonPlaceCorvetteVertical;
    private javax.swing.JButton buttonPlaceCruiser;
    private javax.swing.JButton buttonPlaceCruiserVertical;
    private javax.swing.JButton buttonPlaceDestroyer;
    private javax.swing.JButton buttonPlaceDestroyerVertical;
    private javax.swing.JButton buttonPlaceFrigate;
    private javax.swing.JButton buttonPozycje;
    private javax.swing.JButton buttonRandom;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonShoot;
    private javax.swing.JButton buttonStart;
    private javax.swing.JButton buttonUseBomber;
    private javax.swing.JButton buttonUseFighter;
    private javax.swing.JButton buttonUseKraken;
    private javax.swing.JButton buttonUseSub;
    private javax.swing.JPanel cardBattle;
    private javax.swing.JPanel cardEnd;
    private javax.swing.JPanel cardMenu;
    private javax.swing.JPanel cardOptions;
    private javax.swing.JPanel cardPosition;
    private javax.swing.JLabel gamelogoIcon;
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JButton jButtonWyjscie;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLabel labelAlpha;
    private javax.swing.JLabel labelBackgroundGameBoard;
    private javax.swing.JLabel labelBackgroundGameBoard1;
    private javax.swing.JLabel labelBackgroundGameBoard2;
    private javax.swing.JLabel labelBackgroundMenu;
    private javax.swing.JLabel labelBckgrnd;
    private javax.swing.JLabel labelBigWarShipBackGround;
    private javax.swing.JLabel labelBombersLeft;
    private javax.swing.JLabel labelBravo;
    private javax.swing.JLabel labelCharlie;
    private javax.swing.JLabel labelCorvetteCounter;
    private javax.swing.JLabel labelCorvettesLeft;
    private javax.swing.JLabel labelCruiserCounter;
    private javax.swing.JLabel labelCruisersLeft;
    private javax.swing.JLabel labelDestroyerCounter;
    private javax.swing.JLabel labelDestroyersLeft;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelFightersLeft;
    private javax.swing.JLabel labelFrigateCounter;
    private javax.swing.JLabel labelFrigatesLeft;
    private javax.swing.JLabel labelHelpSpecial;
    private javax.swing.JLabel labelHelpSpecial1;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JLabel labelKrakenLeft;
    private javax.swing.JLabel labelLose;
    private javax.swing.JLabel labelSubsLeft;
    private javax.swing.JLabel labelWin;
    private javax.swing.JPanel panelEnd;
    private javax.swing.JPanel panelEnemy;
    private javax.swing.JPanel panelGameBoard;
    private javax.swing.JPanel panelYou;
    private javax.swing.JSpinner spinBomberCounter;
    private javax.swing.JSpinner spinFighterCounter;
    private javax.swing.JSpinner spinKrakenCounter;
    private javax.swing.JSpinner spinSubCounter;
    private javax.swing.JTextField textCorvetteLeft;
    private javax.swing.JTextField textCruiserLeft;
    private javax.swing.JTextField textDestroyerLeft;
    private javax.swing.JTextField textFieldBomber;
    private javax.swing.JTextField textFieldCorvettes;
    private javax.swing.JTextField textFieldDestroyers;
    private javax.swing.JTextField textFieldFigates;
    private javax.swing.JTextField textFieldJednostkiSpecjalne;
    private javax.swing.JTextField textFieldKraken;
    private javax.swing.JTextField textFieldMysliwiec;
    private javax.swing.JTextField textFieldStatkiBazowe;
    private javax.swing.JTextField textFieldSub;
    private javax.swing.JTextField textFrigateLeft;
    private javax.swing.JTextField textLeftoverShips;
    private javax.swing.JTextField textfieldCruisers;
    // End of variables declaration//GEN-END:variables
}
