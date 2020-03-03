package com.company;

// IMPORTES
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

// Classe responsável por carregar uma sprite de um arquivo .png para a memória
public class SpriteSheet { // Classe SprPlayer

    private BufferedImage sprite; // Cria um Buffered Image de vai receber o sprite

    // MÉTODO CONSTRUTOR
    public SpriteSheet(String path) { // Recebe o nome do Arquivo .png
        // Garante que a imagem vai ser carregada sem problemas
        try {
            sprite = ImageIO.read(this.getClass().getResource(path)); // Carrega a Imagem
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // MÉTODO GETSPRITE
    public BufferedImage getSprite(int x, int y, int w, int h) { // Retorna um recorte da imagem carregada
        return sprite.getSubimage(x, y, w, h);
    }
}
