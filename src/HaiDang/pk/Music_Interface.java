package HaiDang.pk;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Music_Interface extends javax.swing.JFrame {

    //Định nghĩa MP3Player Class từ file JACO.MP3Player.jar libraries
    MP3Player player;
    //Định nghĩa File cho song
    File songFile;

    String currentDirectory = "home.user";

    String currentPath;
    // String này cho tên ảnh
    String imagePath;
    //Phải đặt tên app là string
    boolean repeat = false;
    
    
    
    String appName = "First Swing GUI Java App (HHD) - (MP3 Player)";

    //check nút có xài được không
    boolean windowCollaped = false;

    //ĐỊnh nghĩa mouse x mouse y để biết vị trí của chuột trên màn hình
    int xMouse, yMouse;

    public Music_Interface() {
        initComponents();
        //Đặt tên APP ở đây
        appTitle.setText(appName);

        //bài hát mặc định
        songFile = new File("                          <chose mp3 file here> ");
        
        //Tạo tên cho file
        String fileName = songFile.getName();
        //Đặt lên label cái tên
        songNameDisplay.setText(fileName);

        //tạo hành động cho biến player
        player = mp3Player();
        //Thêm bài hát vào dưới dạng playlist

        player.addToPlayList(songFile);

        //Path thôi
        currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        imagePath = "\\images";

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        quitBtn = new javax.swing.JLabel();
        settingBtn = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        songNameMainPanel = new javax.swing.JPanel();
        songNameSubPanel = new javax.swing.JPanel();
        songNameDisplay = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        pauseBtn = new javax.swing.JLabel();
        playBtn = new javax.swing.JLabel();
        stopBtn = new javax.swing.JLabel();
        volumeDownBtn = new javax.swing.JLabel();
        openBtn = new javax.swing.JLabel();
        volumeFullBtn = new javax.swing.JLabel();
        muteBtn = new javax.swing.JLabel();
        repeatBtn = new javax.swing.JLabel();
        volumeUpBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 0, 51));
        mainPanel.setForeground(new java.awt.Color(0, 0, 0));

        headPanel.setBackground(new java.awt.Color(0, 0, 51));

        quitBtn.setBackground(new java.awt.Color(255, 102, 255));
        quitBtn.setForeground(new java.awt.Color(255, 102, 255));
        quitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-shutdown-50.png"))); // NOI18N
        quitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitBtnMouseClicked(evt);
            }
        });

        settingBtn.setBackground(new java.awt.Color(255, 51, 255));
        settingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-adjust-50.png"))); // NOI18N
        settingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingBtnMouseClicked(evt);
            }
        });

        appTitle.setBackground(new java.awt.Color(255, 51, 255));
        appTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        appTitle.setForeground(new java.awt.Color(102, 255, 255));
        appTitle.setText("APP TITLE");
        appTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                appTitleMouseDragged(evt);
            }
        });
        appTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTitleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appTitleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitBtn)
                .addContainerGap())
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPanelLayout.createSequentialGroup()
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(settingBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        songNameMainPanel.setBackground(new java.awt.Color(0, 0, 51));
        songNameMainPanel.setForeground(new java.awt.Color(0, 0, 0));

        songNameSubPanel.setBackground(new java.awt.Color(0, 0, 51));
        songNameSubPanel.setForeground(new java.awt.Color(0, 0, 0));

        songNameDisplay.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        songNameDisplay.setForeground(new java.awt.Color(0, 204, 255));
        songNameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songNameDisplay.setText("PLAYING");
        songNameDisplay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout songNameSubPanelLayout = new javax.swing.GroupLayout(songNameSubPanel);
        songNameSubPanel.setLayout(songNameSubPanelLayout);
        songNameSubPanelLayout.setHorizontalGroup(
            songNameSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songNameSubPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(songNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1055, 1055, 1055))
        );
        songNameSubPanelLayout.setVerticalGroup(
            songNameSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameSubPanelLayout.createSequentialGroup()
                .addComponent(songNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout songNameMainPanelLayout = new javax.swing.GroupLayout(songNameMainPanel);
        songNameMainPanel.setLayout(songNameMainPanelLayout);
        songNameMainPanelLayout.setHorizontalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(songNameSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2617, 2617, 2617))
        );
        songNameMainPanelLayout.setVerticalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameMainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(songNameSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanel.setBackground(new java.awt.Color(0, 0, 51));
        controlPanel.setForeground(new java.awt.Color(0, 0, 0));

        pauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-pause-64 (1).png"))); // NOI18N
        pauseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseBtnMouseClicked(evt);
            }
        });

        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-play-96 (1).png"))); // NOI18N
        playBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                playBtnMouseDragged(evt);
            }
        });
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });

        stopBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-stop-64 (1).png"))); // NOI18N
        stopBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopBtnMouseClicked(evt);
            }
        });

        volumeDownBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-low-volume-50.png"))); // NOI18N
        volumeDownBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeDownBtnMouseClicked(evt);
            }
        });

        openBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-up-squared-64 (1).png"))); // NOI18N
        openBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openBtnMouseClicked(evt);
            }
        });

        volumeFullBtn.setBackground(new java.awt.Color(255, 153, 255));
        volumeFullBtn.setForeground(new java.awt.Color(0, 0, 0));
        volumeFullBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-audio-50.png"))); // NOI18N
        volumeFullBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeFullBtnMouseClicked(evt);
            }
        });

        muteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-mute-50.png"))); // NOI18N
        muteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muteBtnMouseClicked(evt);
            }
        });

        repeatBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-repeat-64.png"))); // NOI18N
        repeatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatBtnMouseClicked(evt);
            }
        });

        volumeUpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-voice-50.png"))); // NOI18N
        volumeUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeUpBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(repeatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pauseBtn)
                .addGap(18, 18, 18)
                .addComponent(playBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volumeDownBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volumeFullBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(947, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumeDownBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumeUpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volumeFullBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stopBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(pauseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(playBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
            .addComponent(repeatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(songNameMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE)
                    .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songNameMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void repeatBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatBtnMouseClicked
        if(repeat == false){
            repeat = true;
            player.setRepeat(repeat);

            String image = currentPath + imagePath + "\\icons8-skyatlas-64.png";
            repeatBtn.setIcon(new ImageIcon(image));

        }else{
            repeat = false;
            player.setRepeat(repeat);
            String image2 = currentPath + imagePath + "\\icons8-repeat-64.png";
            repeatBtn.setIcon(new ImageIcon(image2));
        }
    }//GEN-LAST:event_repeatBtnMouseClicked

    private void stopBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopBtnMouseClicked
        player.stop();
    }//GEN-LAST:event_stopBtnMouseClicked

    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
        player.play();
    }//GEN-LAST:event_playBtnMouseClicked

    private void pauseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseBtnMouseClicked
        player.pause();
    }//GEN-LAST:event_pauseBtnMouseClicked

    private void appTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseClicked
        if(evt.getClickCount() == 2){
            if(windowCollaped == false){
                windowCollaped = true;
                this.setSize(new Dimension(this.getSize().width,51));
                
                appTitle.setFont(new Font("Nirmala UI", 0, 12));
                appTitle.setText("Playing Now....|" + songFile.getName());
                
            }else if(windowCollaped == true){
                windowCollaped = true;
                this.setSize(new Dimension(this.getSize().width,249));
                
                appTitle.setFont(new Font("Nirmala UI", 0, 18));
                appTitle.setText(appName);
                
            }
                
        }
    }//GEN-LAST:event_appTitleMouseClicked

    private void appTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_appTitleMousePressed

    private void playBtnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_playBtnMouseDragged

    private void appTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTitleMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_appTitleMouseDragged

    private void quitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitBtnMouseClicked

    private void settingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingBtnMouseClicked
        JOptionPane.showMessageDialog(this, "Your setting will be pop up here .");
    }//GEN-LAST:event_settingBtnMouseClicked

    private void openBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser openFileChooser = new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open MP3 File Only!"));
        int result = openFileChooser.showOpenDialog(null);
        if(result  == JFileChooser.APPROVE_OPTION){
            songFile = openFileChooser.getSelectedFile();
            player.addToPlayList(songFile);
            player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            songNameDisplay.setText("PLaying Now .....!" + songFile.getName());
        }
    }//GEN-LAST:event_openBtnMouseClicked

    private void volumeDownBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeDownBtnMouseClicked
        
        volumeDownControl(0.1);
    }//GEN-LAST:event_volumeDownBtnMouseClicked

    private void volumeUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeUpBtnMouseClicked
        volumeUpControl(0.1);
    }//GEN-LAST:event_volumeUpBtnMouseClicked

    private void volumeFullBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeFullBtnMouseClicked
        
        volumeControl(1.0);
    }//GEN-LAST:event_volumeFullBtnMouseClicked

    private void muteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteBtnMouseClicked
        
        volumeControl(0.0);
    }//GEN-LAST:event_muteBtnMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Music_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel muteBtn;
    private javax.swing.JLabel openBtn;
    private javax.swing.JLabel pauseBtn;
    private javax.swing.JLabel playBtn;
    private javax.swing.JLabel quitBtn;
    private javax.swing.JLabel repeatBtn;
    private javax.swing.JLabel settingBtn;
    private javax.swing.JLabel songNameDisplay;
    private javax.swing.JPanel songNameMainPanel;
    private javax.swing.JPanel songNameSubPanel;
    private javax.swing.JLabel stopBtn;
    private javax.swing.JLabel volumeDownBtn;
    private javax.swing.JLabel volumeFullBtn;
    private javax.swing.JLabel volumeUpBtn;
    // End of variables declaration//GEN-END:variables
    //Tạo hành động cho MP3
    private MP3Player mp3Player() {
        MP3Player mP3Player = new MP3Player();
        return mP3Player;

    }

    //Giờ làm cái giảm âm lượng
    private void volumeDownControl(Double valueToPlusMinus) {
        // Lấy thông tin của Mixer trong hệ thống âm thanh
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //giờ sử dụng vòng lặp để liệt kê các mixer
        for (Mixer.Info mixerInfo : mixers) {
            //Lấy mixer ra nè

            Mixer mixer = AudioSystem.getMixer(mixerInfo);

            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            //vòng lặp nữa để lấy line
            for (Line.Info lineInfo : lineInfos) {
                //Tạo line null
                Line line = null;
                // tạo boolean opened
                boolean opened = true;
                //sử dụng try catch để tránh tạo rác
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    //Kiểm tra nếu mà line mở
                    if (!opened) {
                        //Mở line
                        line.open();

                    }
                    // tạo một float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    //lấy âm lượng hiện tại
                    float currentVolume = volControl.getValue();
                    //Tạo biến temp double để lưu trữ valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    //tạo biến float và tính cộng hoặc trừ
                    float changedCalc = (float) ((float) currentVolume - (double) volumeToCut);
                    //giờ set cái giá trị vừa chuyển vào trong âm lượng
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {

                } catch (IllegalArgumentException illException) {

                } finally {
                    //Đóng line nếu nó opened
                    if (line != null && !opened) {
                        line.close();
                    }

                }

            }
        }

    }

    private void volumeUpControl(Double valueToPlusMinus) {
        // Lấy thông tin của Mixer trong hệ thống âm thanh
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //giờ sử dụng vòng lặp để liệt kê các mixer
        for (Mixer.Info mixerInfo : mixers) {
            //Lấy mixer ra nè

            Mixer mixer = AudioSystem.getMixer(mixerInfo);

            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            //vòng lặp nữa để lấy line
            for (Line.Info lineInfo : lineInfos) {
                //Tạo line null
                Line line = null;
                // tạo boolean opened
                boolean opened = true;
                //sử dụng try catch để tránh tạo rác
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    //Kiểm tra nếu mà line mở
                    if (!opened) {
                        //Mở line
                        line.open();

                    }
                    // tạo một float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    //lấy âm lượng hiện tại
                    float currentVolume = volControl.getValue();
                    //Tạo biến temp double để lưu trữ valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    //tạo biến float và tính cộng hoặc trừ
                    float changedCalc = (float) ((float) currentVolume + (double) volumeToCut);
                    //giờ set cái giá trị vừa chuyển vào trong âm lượng
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {

                } catch (IllegalArgumentException illException) {

                } finally {
                    //Đóng line nếu nó opened
                    if (line != null && !opened) {
                        line.close();
                    }

                }

            }
        }

    }
    private void volumeControl(Double valueToPlusMinus){
        // Lấy thông tin của Mixer trong hệ thống âm thanh
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        //giờ sử dụng vòng lặp để liệt kê các mixer
        for (Mixer.Info mixerInfo : mixers) {
            //Lấy mixer ra nè
            
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            //vòng lặp nữa để lấy line
            for (Line.Info lineInfo : lineInfos) {
                //Tạo line null
                Line line = null;
                // tạo boolean opened
                boolean opened = true;
                //sử dụng try catch để tránh tạo rác
                try{
                line = mixer.getLine(lineInfo);
                opened = line.isOpen() || line instanceof Clip;
                //Kiểm tra nếu mà line mở
                if(!opened){
                    //Mở line
                    line.open();
                    
                    
                }
                    // tạo một float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    //lấy âm lượng hiện tại
                    float currentVolume = volControl.getValue();
                    //Tạo biến temp double để lưu trữ valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    //tạo biến float và tính cộng hoặc trừ
                    float changedCalc = (float) ((double)volumeToCut);
                    //giờ set cái giá trị vừa chuyển vào trong âm lượng
                    volControl.setValue(changedCalc);
                    
                    
                    
                    
                }catch(LineUnavailableException lineException){    
                    
                }catch(IllegalArgumentException illException){
                    
                }finally{
                    //Đóng line nếu nó opened
                    if(line != null && !opened){
                        line.close();
                }
                
                
                
                
                
                
                
            }
            
        }
    }



}
    
}
