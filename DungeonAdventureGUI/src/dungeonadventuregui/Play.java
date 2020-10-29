/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonadventuregui;

/**
 *
 * @author Jamie
 */
public class Play extends javax.swing.JFrame {
    
    public static boolean disableMonsterSpwn = true;
    public static boolean gobMonsterIndicate = false;
    public static boolean skeMonsterIndicate = false;
    public static boolean vamMonsterIndicate = false;
    public static boolean draMonsterIndicate = false;
    public static int x = 0;
    public static int score = 0;
    private Tank tankPlayer;
    private Warrior warriorPlayer;
    private Mage magePlayer;
    private Goblin gobMonster;
    private Skeleton skeletonMonster;
    private Vampire vampireMonster;
    private Dragon dragonMonster;
    /**
     * Creates new form Play
     */
    public Play() 
    {

    }
    
    public Play(Player p)
    {   
        if(CharacterSelection.tankIndicate == true)
        {
            p = new Tank();
            Tank pt = (Tank)p;
            
            initComponents();
            this.specialBar.setMinimum(0);
            this.specialBar.setMaximum(20);
            this.playerHealth.setMinimum(0);
            this.playerHealth.setMaximum(80);
            this.healthPotionBar.setMinimum(0);
            this.healthPotionBar.setMaximum(3);
            ResizeImages resizeImg =  new ResizeImages();
            PathFileImage pathImage = new PathFileImage();
            Descriptions charDescription = new Descriptions();
            UseItems useItem = new UseItems();
            x = useItem.constantHealth(pt);
            playerImg.setIcon(resizeImg.resizeImage(pathImage.imageBasedOnFilePath(x), playerImg));
            this.battleLogTxtField.setText(charDescription.characterStats(pt));
            this.playerHealth.setValue(pt.getHealth());
            this.specialBar.setValue(pt.getShield());
            this.healthPotionBar.setValue(pt.NUMBEROFHEALTHPOTIONS);
            this.actualPlayerDMG.setText(Integer.toString(pt.getAttackDmg()));
            setTank(pt);
            
        }
        if(CharacterSelection.warriorIndicate == true)
        {
            p = new Warrior();
            Warrior pt = (Warrior)p;
            
            initComponents();
            this.specialBar.setMinimum(0);
            this.specialBar.setMaximum(3);
            this.playerHealth.setMinimum(0);
            this.playerHealth.setMaximum(55);
            this.healthPotionBar.setMinimum(0);
            this.healthPotionBar.setMaximum(3);
            ResizeImages resizeImg =  new ResizeImages();
            PathFileImage pathImage = new PathFileImage();
            Descriptions charDescription = new Descriptions();
            UseItems useItem = new UseItems();
            x = useItem.constantHealth(pt);
            playerImg.setIcon(resizeImg.resizeImage(pathImage.imageBasedOnFilePath(x), playerImg));
            this.battleLogTxtField.setText(charDescription.characterStats(pt));
            this.playerHealth.setValue(pt.getHealth());
            this.specialBar.setValue(pt.getRage());
            this.healthPotionBar.setValue(Warrior.NUMBEROFHEALTHPOTIONS);
            this.actualPlayerDMG.setText(Integer.toString(pt.getAttackDmg()));
            setWarrior(pt);
            

        }
        if(CharacterSelection.mageIndicate == true)
        {
            p = new Mage();
            Mage pt = (Mage)p;
            
            initComponents();
            this.specialBar.setMinimum(0);
            this.specialBar.setMaximum(3);
            this.playerHealth.setMinimum(0);
            this.playerHealth.setMaximum(45);
            this.healthPotionBar.setMinimum(0);
            this.healthPotionBar.setMaximum(3);
            ResizeImages resizeImg =  new ResizeImages();
            PathFileImage pathImage = new PathFileImage();
            Descriptions charDescription = new Descriptions();
            UseItems useItem = new UseItems();
            x = useItem.constantHealth(pt);
            playerImg.setIcon(resizeImg.resizeImage(pathImage.imageBasedOnFilePath(x), playerImg));
            this.battleLogTxtField.setText(charDescription.characterStats(pt));
            this.playerHealth.setValue(pt.getHealth());
            this.specialBar.setValue(pt.getIntelligence());
            this.healthPotionBar.setValue(Mage.NUMBEROFHEALTHPOTIONS);
            this.actualPlayerDMG.setText(Integer.toString(pt.getAttackDmg()));
            setMage(pt);
        }
         
    }
    public Tank getTank() // make sure to make setter and getter for th eother characters..
    {
        return this.tankPlayer;
    }
    
    public Warrior getWarrior()
    {
        return this.warriorPlayer;
    }
    
    public Mage getMage()
    {
        return this.magePlayer;
    }
    
    public Skeleton getSkeleton()
    {
        return this.skeletonMonster;
    }
    
    public Goblin getGoblin()
    {
        return this.gobMonster;
    }
    
    public Vampire getVampire()
    {
        return this.vampireMonster;
    }
    
    public Dragon getDragon()
    {
        return this.dragonMonster;
    }
    
    public void setTank(Tank x)
    {
        this.tankPlayer = x;
    }
    
    public void setWarrior(Warrior x)
    {
        this.warriorPlayer = x;
    }
    
    public void setMage(Mage x)
    {
        this.magePlayer = x;
    }
    
    public void setSkeleton(Skeleton x)
    {
        this.skeletonMonster = x;
    }
    
    public void setGoblin(Goblin x)
    {
        this.gobMonster = x;
    }
    
    public void setVampire(Vampire x)
    {
        this.vampireMonster = x;
    }
    
    public void setDragon(Dragon x)
    {
        this.dragonMonster = x;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        attackButton = new javax.swing.JButton();
        useHealthPotionButton = new javax.swing.JButton();
        useSpecialSkillButton = new javax.swing.JButton();
        runButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        battleLogTxtField = new javax.swing.JTextArea();
        playerImg = new javax.swing.JLabel();
        enemyImg = new javax.swing.JLabel();
        Quit = new javax.swing.JButton();
        health = new javax.swing.JLabel();
        noOfHealthPotions = new javax.swing.JLabel();
        specialCounter = new javax.swing.JLabel();
        enemyHealth = new javax.swing.JLabel();
        spwnMonster = new javax.swing.JButton();
        playerHealth = new javax.swing.JProgressBar();
        specialBar = new javax.swing.JProgressBar();
        healthPotionBar = new javax.swing.JProgressBar();
        enemyHealthBar = new javax.swing.JProgressBar();
        attackDmg = new javax.swing.JLabel();
        attackDMGMonster = new javax.swing.JLabel();
        actualMonsterDMG = new javax.swing.JLabel();
        actualPlayerDMG = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        actualScoreDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DungeonAdventure.exe");

        attackButton.setText("Attack");
        attackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attackButtonActionPerformed(evt);
            }
        });

        useHealthPotionButton.setText("Use Health Potion");
        useHealthPotionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useHealthPotionButtonActionPerformed(evt);
            }
        });

        useSpecialSkillButton.setText("Use Special Skill");
        useSpecialSkillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useSpecialSkillButtonActionPerformed(evt);
            }
        });

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        battleLogTxtField.setColumns(20);
        battleLogTxtField.setRows(5);
        jScrollPane1.setViewportView(battleLogTxtField);

        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        health.setText("Health");

        noOfHealthPotions.setText("No of Health Potions");

        specialCounter.setText("Special");

        enemyHealth.setText("Enemy health");

        spwnMonster.setText("Spawn Monster");
        spwnMonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spwnMonsterActionPerformed(evt);
            }
        });

        attackDmg.setText("Attack Damage:");

        attackDMGMonster.setText("Attack Damage:");

        scoreLabel.setText("Score:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(useHealthPotionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(useSpecialSkillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(runButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerImg, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(health)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enemyHealth, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spwnMonster, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(enemyImg, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(attackDmg))
                    .addComponent(specialCounter)
                    .addComponent(noOfHealthPotions, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthPotionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualPlayerDMG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(attackDMGMonster)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualMonsterDMG, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyHealthBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actualScoreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(specialBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(specialCounter)
                    .addComponent(scoreLabel)
                    .addComponent(actualScoreDisplay))
                .addGap(12, 12, 12)
                .addComponent(healthPotionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfHealthPotions)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualMonsterDMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerHealth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(attackDmg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualPlayerDMG)
                        .addComponent(attackDMGMonster))
                    .addComponent(enemyHealthBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(health)
                    .addComponent(enemyHealth))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enemyImg, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(playerImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(attackButton)
                                .addGap(28, 28, 28)
                                .addComponent(useHealthPotionButton)
                                .addGap(30, 30, 30)
                                .addComponent(useSpecialSkillButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(runButton)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(Quit)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spwnMonster)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
    
        dispose();
        getTank().NUMBEROFHEALTHPOTIONS = 3;
        DungeonAdventureGUI dungeonAdv = new DungeonAdventureGUI();
        dungeonAdv.setVisible(true);
        
        
    }//GEN-LAST:event_QuitActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        
        this.spwnMonster.setEnabled(false);
        this.attackButton.setEnabled(false);
        this.useHealthPotionButton.setEnabled(false);
        this.useSpecialSkillButton.setEnabled(false);
        
        this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n"  + "you have run away");
        
    }//GEN-LAST:event_runButtonActionPerformed

    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attackButtonActionPerformed
        
        
        NumberGenerator numGen = new NumberGenerator();
        DropItems dropItems = new DropItems();
        int chanceOfSpecial = numGen.chanceOfSpecial();
        int dropItemsChance = numGen.chanceOfSpecial();
        
        if(CharacterSelection.tankIndicate == true)
        {   
            Tank pTankCombat = new Tank();
            pTankCombat = getTank();
            
            if(gobMonsterIndicate == true)
            {
                Goblin gob = new Goblin();
                gob = getGoblin();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You hit the " + gob.getTypeName() + " for:" + pTankCombat.getAttackDmg());
                gob.setHealth(gob.getHealth() - pTankCombat.getAttackDmg());
                this.enemyHealthBar.setValue(gob.getHealth());
                
                if(chanceOfSpecial == 0)
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + " Oh no the goblin used his special skill you loose a health potion"
                                                                               + "\n" + "You also recieve: " + gob.getAttackDmg() + "damage ");
                    gob.specialSkill();
                    pTankCombat.setHealth(pTankCombat.getHealth() - gob.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                    this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                }
                
                else
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You also recieve: " + gob.getAttackDmg() + "damage " );
                    pTankCombat.setHealth(pTankCombat.getHealth() - gob.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                }
                
                if(gob.getHealth() <= 0)
                {
                    disableMonsterSpwn = true;
                    this.spwnMonster.setEnabled(true);
                    this.attackButton.setEnabled(false);
                    this.useHealthPotionButton.setEnabled(false);
                    this.useSpecialSkillButton.setEnabled(false);
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You have defeated the monster: " + "\n" + gob.getTypeName());
                    
                    if(dropItemsChance == 1)
                    {
                        this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "The monster has dropped a Health potion and you have received some shield, if youre not at the item limit");
                        dropItems.chanceHPPOTION(pTankCombat);
                        dropItems.spTank(pTankCombat);
                        this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                        this.specialBar.setValue(pTankCombat.getShield());                        
                    }
                    
                    score = score + 1; // value used to make the database need to update it on hte form , can add various values 
                    this.actualScoreDisplay.setText(Integer.toString(score));
                }
                
                setGoblin(gob);
                setTank(pTankCombat);
     
            }
            
            if(skeMonsterIndicate == true)
            {
                Skeleton ske = new Skeleton();
                ske = getSkeleton();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You hit the " + ske.getTypeName() + " for:" + pTankCombat.getAttackDmg());
                ske.setHealth(ske.getHealth() - pTankCombat.getAttackDmg());
                this.enemyHealthBar.setValue(ske.getHealth());
                
                if(chanceOfSpecial == 0)
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + " Oh no the Skeleton used his special skill and found one of his bones + 10 hp"
                                                                               + "\n" + "You also recieve: " + ske.getAttackDmg() + "damage ");
                    ske.specialSkill();
                    pTankCombat.setHealth(pTankCombat.getHealth() - ske.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                    this.enemyHealthBar.setValue(ske.getHealth());
                }
                
                else
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You also recieve: " + ske.getAttackDmg() + "damage " );
                    pTankCombat.setHealth(pTankCombat.getHealth() - ske.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                }
                
                if(ske.getHealth() <= 0)
                {
                    disableMonsterSpwn = true;
                    this.spwnMonster.setEnabled(true);
                    this.attackButton.setEnabled(false);
                    this.useHealthPotionButton.setEnabled(false);
                    this.useSpecialSkillButton.setEnabled(false);
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You have defeated the monster: " + "\n" + ske.getTypeName());
                    
                    if(dropItemsChance == 1)
                    {
                        this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "The monster has dropped a Health potion and you have received some shield, if youre not at the item limit");
                        dropItems.chanceHPPOTION(pTankCombat);
                        dropItems.spTank(pTankCombat);
                        this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                        this.specialBar.setValue(pTankCombat.getShield());                        
                    }
                    
                    score = score + 1; // value used to make the database need to update it on hte form , can add various values 
                    this.actualScoreDisplay.setText(Integer.toString(score));
                }
                
                setSkeleton(ske);
                setTank(pTankCombat);
            }
            
            if(vamMonsterIndicate == true)
            {
                Vampire vam = new Vampire();
                vam = getVampire();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You hit the " + vam.getTypeName() + " for:" + pTankCombat.getAttackDmg());
                vam.setHealth(vam.getHealth() - pTankCombat.getAttackDmg());
                this.enemyHealthBar.setValue(vam.getHealth());
                
                if(chanceOfSpecial == 0)
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + " Oh no the Vampire used his special skill you lose 5 hp"
                                                                               + "\n" + "You also recieve: " + vam.getAttackDmg() + "damage ");
                    vam.realSpecialSkillVamp(pTankCombat);
                    pTankCombat.setHealth(pTankCombat.getHealth() - vam.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                    this.enemyHealthBar.setValue(vam.getHealth());
                }
                
                else
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You also recieve: " + vam.getAttackDmg() + "damage " );
                    pTankCombat.setHealth(pTankCombat.getHealth() - vam.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                }
                
                if(vam.getHealth() <= 0)
                {
                    disableMonsterSpwn = true;
                    this.spwnMonster.setEnabled(true);
                    this.attackButton.setEnabled(false);
                    this.useHealthPotionButton.setEnabled(false);
                    this.useSpecialSkillButton.setEnabled(false);
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You have defeated the monster: " + "\n" + vam.getTypeName());
                    
                    if(dropItemsChance == 1)
                    {
                        this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "The monster has dropped a Health potion and you have received some shield, if youre not at the item limit");
                        dropItems.chanceHPPOTION(pTankCombat);
                        dropItems.spTank(pTankCombat);
                        this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                        this.specialBar.setValue(pTankCombat.getShield());                        
                    }
                    
                    score = score + 1; // value used to make the database need to update it on hte form , can add various values 
                    this.actualScoreDisplay.setText(Integer.toString(score));
                }
                
                setVampire(vam);
                setTank(pTankCombat);
                
            }
            
            if(draMonsterIndicate == true)
            {
                Dragon dra = new Dragon();
                dra = getDragon();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You hit the " + dra.getTypeName() + " for:" + pTankCombat.getAttackDmg());
                dra.setHealth(dra.getHealth() - pTankCombat.getAttackDmg());
                this.enemyHealthBar.setValue(dra.getHealth());
                
                if(chanceOfSpecial == 0)
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + " Oh no the Dragon used his special skill, you take burn damage"
                                                                               + "\n" + "You also recieve: " + dra.getAttackDmg() + "damage ");
                    dra.realSpecialSkill(pTankCombat);
                    pTankCombat.setHealth(pTankCombat.getHealth() - dra.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                    this.enemyHealthBar.setValue(dra.getHealth());
                }
                
                else
                {
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You also recieve: " + dra.getAttackDmg() + "damage " );
                    pTankCombat.setHealth(pTankCombat.getHealth() - dra.getAttackDmg());
                    this.playerHealth.setValue(pTankCombat.getHealth());
                }
                
                if(dra.getHealth() <= 0)
                {
                    disableMonsterSpwn = true;
                    this.spwnMonster.setEnabled(true);
                    this.attackButton.setEnabled(false);
                    this.useHealthPotionButton.setEnabled(false);
                    this.useSpecialSkillButton.setEnabled(false);
                    this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You have defeated the monster: " + "\n" + dra.getTypeName());
                    
                    if(dropItemsChance == 1)
                    {
                        this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "The monster has dropped a Health potion and you have received some shield, if youre not at the item limit");
                        dropItems.chanceHPPOTION(pTankCombat);
                        dropItems.spTank(pTankCombat);
                        this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                        this.specialBar.setValue(pTankCombat.getShield());                        
                    }
                    
                    score = score + 1; // value used to make the database need to update it on hte form , can add various values 
                    this.actualScoreDisplay.setText(Integer.toString(score));
                }
                
                setDragon(dra);
                setTank(pTankCombat);
                
            }
            
            if(pTankCombat.getHealth() <= 0)
            {
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "Your lifeless body falls to the ground, Better luck next time" );
                this.attackButton.setEnabled(false);
                this.useSpecialSkillButton.setEnabled(false);
                this.useHealthPotionButton.setEnabled(false);
            }
           
        }
        
        if(CharacterSelection.warriorIndicate == true )
        {
        
            
        }
        
    }//GEN-LAST:event_attackButtonActionPerformed

    private void useHealthPotionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useHealthPotionButtonActionPerformed
        UseItems useItem = new UseItems();
        if(CharacterSelection.tankIndicate == true)
        {
            Tank pTankCombat = new Tank();
            pTankCombat = getTank();
            
            if(gobMonsterIndicate == true && pTankCombat.NUMBEROFHEALTHPOTIONS > 0)
            {
                Goblin gob = new Goblin();
                gob = getGoblin();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You consumed a health potion recovering 30% of your HP");
                useItem.useHealthPotion(pTankCombat);
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + gob.getAttackDmg() + " damage");
                pTankCombat.setShield(pTankCombat.getHealth() - gob.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                setTank(pTankCombat);      
            }
            
            if(skeMonsterIndicate == true && pTankCombat.NUMBEROFHEALTHPOTIONS > 0)
            {
                Skeleton ske = new Skeleton();
                ske = getSkeleton();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You consumed a health potion recovering 30% of your HP");
                useItem.useHealthPotion(pTankCombat);
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + ske.getAttackDmg() + " damage");
                pTankCombat.setShield(pTankCombat.getHealth() - ske.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                setTank(pTankCombat);
                
            }
            
            
            if(vamMonsterIndicate == true && pTankCombat.NUMBEROFHEALTHPOTIONS > 0)
            {
                Vampire vam = new Vampire();
                vam = getVampire();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You consumed a health potion recovering 30% of your HP");
                useItem.useHealthPotion(pTankCombat);
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + vam.getAttackDmg() + " damage");
                pTankCombat.setShield(pTankCombat.getHealth() - vam.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                setTank(pTankCombat);
            }
            
            if(draMonsterIndicate == true && pTankCombat.NUMBEROFHEALTHPOTIONS > 0)
            {
                Dragon dra = new Dragon();
                dra = getDragon();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You consumed a health potion recovering 30% of your HP");
                useItem.useHealthPotion(pTankCombat);
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + dra.getAttackDmg() + " damage");
                pTankCombat.setShield(pTankCombat.getHealth() - dra.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.healthPotionBar.setValue(pTankCombat.NUMBEROFHEALTHPOTIONS);
                setTank(pTankCombat);
            }
            
            if(Tank.NUMBEROFHEALTHPOTIONS <= 0)
            {
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + " You are out of health potions");
            }
            
        }
    }//GEN-LAST:event_useHealthPotionButtonActionPerformed

    private void useSpecialSkillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useSpecialSkillButtonActionPerformed
        
        Tank pTankCombat = new Tank();
        pTankCombat = getTank();
        if(CharacterSelection.tankIndicate == true)
        {
           
            if(gobMonsterIndicate == true && pTankCombat.getShield() > 0)
            {
                Goblin gob = new Goblin();
                gob = getGoblin();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You utilise the extra shield and gain HP");
                pTankCombat.specialSkill();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + gob.getAttackDmg() + " damage");
                pTankCombat.setHealth(pTankCombat.getHealth() - gob.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.specialBar.setValue(pTankCombat.getShield());
                setTank(pTankCombat);
                    
            }
                
            if(skeMonsterIndicate == true && pTankCombat.getShield() > 0)
            {
                Skeleton ske = new Skeleton();
                ske = getSkeleton();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You utilise the extra shield and gain HP");
                pTankCombat.specialSkill();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + ske.getAttackDmg() + " damage");
                pTankCombat.setHealth(pTankCombat.getHealth() - ske.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.specialBar.setValue(pTankCombat.getShield());
                setTank(pTankCombat);
            }
                
            if(vamMonsterIndicate == true && pTankCombat.getShield() > 0)
            {
                Vampire vam = new Vampire();
                vam = getVampire();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You utilise the extra shield and gain HP");
                pTankCombat.specialSkill();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + vam.getAttackDmg() + " damage");
                pTankCombat.setHealth(pTankCombat.getHealth() - vam.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.specialBar.setValue(pTankCombat.getShield());
                setTank(pTankCombat);
            }
               
            if(draMonsterIndicate == true && pTankCombat.getShield() > 0)
            {
                Dragon dra = new Dragon();
                dra = getDragon();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You utilise the extra shield and gain HP");
                pTankCombat.specialSkill();
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You still get attacked" + "\n" + "You receive: " + dra.getAttackDmg() + " damage");
                pTankCombat.setHealth(pTankCombat.getHealth() - dra.getAttackDmg());
                this.playerHealth.setValue(pTankCombat.getHealth());
                this.specialBar.setValue(pTankCombat.getShield());
                setTank(pTankCombat);
            }
            
            
            else
            {
                this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + "You have no extra shield");
            }
       
        }
    }//GEN-LAST:event_useSpecialSkillButtonActionPerformed

    private void spwnMonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spwnMonsterActionPerformed
        this.attackButton.setEnabled(true);
        this.useHealthPotionButton.setEnabled(true);
        this.useSpecialSkillButton.setEnabled(true);
        ResizeImages resizeImg = new ResizeImages();
        PathFileImage pathImage = new PathFileImage();
        NumberGenerator numGen = new NumberGenerator();
        SpawnMonsters spwnMonster = new SpawnMonsters();
        UseItems useItems = new UseItems();
        Player monster = spwnMonster.randMonster();
        Descriptions describeMonster = new Descriptions();
        int checkTypeMonster = useItems.checkingMonsterType(monster);
        if( checkTypeMonster == 1)
        {
            Goblin goblinMonster = (Goblin)monster;
            setGoblin(goblinMonster);
            this.enemyImg.setIcon(resizeImg.resizeImage(pathImage.imageBasedOnFilePath(4),enemyImg));
            this.enemyHealthBar.setMaximum(20);
            this.enemyHealthBar.setMinimum(0);
            this.enemyHealthBar.setValue(goblinMonster.getHealth());
            this.actualMonsterDMG.setText(Integer.toString(goblinMonster.getAttackDmg()));
            this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + describeMonster.monsterDescription(goblinMonster));
            disableMonsterSpwn = false;
            gobMonsterIndicate = true;
            skeMonsterIndicate = false;
            vamMonsterIndicate = false;
            draMonsterIndicate = false;
            
        }
        
        if( checkTypeMonster == 2)
        {
            Skeleton skeletonMonster = (Skeleton)monster;
            setSkeleton(skeletonMonster);
            this.enemyImg.setIcon(resizeImg.resizeImage(pathImage.imageBasedOnFilePath(3), enemyImg));
            this.enemyHealthBar.setMaximum(25);
            this.enemyHealthBar.setMinimum(0);
            this.enemyHealthBar.setValue(skeletonMonster.getHealth());
            this.actualMonsterDMG.setText(Integer.toString(skeletonMonster.getAttackDmg()));
            this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + describeMonster.monsterDescription(skeletonMonster));
            disableMonsterSpwn = false;
            skeMonsterIndicate = true;
            gobMonsterIndicate = false;
            vamMonsterIndicate = false;
            draMonsterIndicate = false;
        }
        
        if( checkTypeMonster == 3)
        {
            Vampire vampireMonster = (Vampire)monster;
            setVampire(vampireMonster);
            this.enemyImg.setIcon(resizeImg.resizeImage(pathImage.imageBasedOnFilePath(5), enemyImg));
            this.enemyHealthBar.setMaximum(30);
            this.enemyHealthBar.setMinimum(0);
            this.enemyHealthBar.setValue(vampireMonster.getHealth());
            this.actualMonsterDMG.setText(Integer.toString(vampireMonster.getAttackDmg()));
            this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + describeMonster.monsterDescription(vampireMonster));
            disableMonsterSpwn = false;
            vamMonsterIndicate = true;
            gobMonsterIndicate = false;
            skeMonsterIndicate = false;
            draMonsterIndicate = false;
        }
        
        if( checkTypeMonster == 4)
        {
            Dragon dragonMonster = (Dragon)monster;
            setDragon(dragonMonster);
            this.enemyImg.setIcon(resizeImg.resizeImage(pathImage.imageBasedOnFilePath(6), enemyImg));
            this.enemyHealthBar.setMaximum(50);
            this.enemyHealthBar.setMinimum(0);
            this.enemyHealthBar.setValue(dragonMonster.getHealth());
            this.actualMonsterDMG.setText(Integer.toString(dragonMonster.getAttackDmg()));
            this.battleLogTxtField.setText(battleLogTxtField.getText() + "\n" + describeMonster.monsterDescription(dragonMonster));
            disableMonsterSpwn = false;
            draMonsterIndicate = true;
            gobMonsterIndicate = false;
            skeMonsterIndicate = false;
            vamMonsterIndicate = false;
        }
        
        if(disableMonsterSpwn == false)
        {
            this.spwnMonster.setEnabled(disableMonsterSpwn);
        }
    }//GEN-LAST:event_spwnMonsterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Quit;
    private javax.swing.JLabel actualMonsterDMG;
    private javax.swing.JLabel actualPlayerDMG;
    private javax.swing.JLabel actualScoreDisplay;
    private javax.swing.JButton attackButton;
    private javax.swing.JLabel attackDMGMonster;
    private javax.swing.JLabel attackDmg;
    private javax.swing.JTextArea battleLogTxtField;
    private javax.swing.JLabel enemyHealth;
    private javax.swing.JProgressBar enemyHealthBar;
    private javax.swing.JLabel enemyImg;
    private javax.swing.JLabel health;
    private javax.swing.JProgressBar healthPotionBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel noOfHealthPotions;
    private javax.swing.JProgressBar playerHealth;
    private javax.swing.JLabel playerImg;
    private javax.swing.JButton runButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JProgressBar specialBar;
    private javax.swing.JLabel specialCounter;
    private javax.swing.JButton spwnMonster;
    private javax.swing.JButton useHealthPotionButton;
    private javax.swing.JButton useSpecialSkillButton;
    // End of variables declaration//GEN-END:variables
}
