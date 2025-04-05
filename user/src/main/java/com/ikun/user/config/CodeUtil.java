package com.ikun.user.config;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * 描述:
 *  验证码生成工具类
 * @author bigpeng
 * @create 2019-06-23 17:10
 */
public class CodeUtil {

        private static int imgWidth = 100;
        private static int imgHeight = 50;
        private static int codeCount = 4;
        private static int x = imgWidth / (codeCount + 1);
        private static int fontHeight=imgHeight - 2;
        private static int codeY=imgHeight - 12;
        private static String fontStyle;

        public static String processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("image/jpeg");
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0L);
//            HttpSession session = request.getSession();
            BufferedImage image = new BufferedImage(imgWidth, imgHeight, 1);
            Graphics2D g = image.createGraphics();
            Random random = new Random();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, imgWidth, imgHeight);
            g.setFont(new Font(fontStyle, 2, fontHeight));
            g.setColor(new Color(55, 55, 12));
            g.setColor(getRandColor(160, 200));

            int red;
            int green;
            int blue;
            int r;
            //绘制干扰线
            for(int i = 0; i < 60; ++i) {
                red = random.nextInt(imgWidth);
                green = random.nextInt(imgHeight);
                blue = random.nextInt(12);
                r = random.nextInt(12);
                g.drawLine(red, green, red + blue, green + r);
            }
            //生成随机验证码
            String sRand = "";
            for(int i = 0; i < codeCount; ++i) {
                red = random.nextInt(255);
                green = random.nextInt(255);
                blue = random.nextInt(255);
                int wordType = random.nextInt(3);
                char retWord = 0;
                switch(wordType) {
                    case 0:
                        retWord = getSingleNumberChar();
                        break;
                    case 1:
                        retWord = getLowerOrUpperChar(0);
                        break;
                    case 2:
                        retWord = getLowerOrUpperChar(1);
                }
                //随机生成的4位验证码
                sRand = sRand + String.valueOf(retWord);
                g.setColor(new Color(red, green, blue));
                g.drawString(String.valueOf(retWord), i * x, codeY);
            }
            //将验证码保存session
//            session.setAttribute("randomCode", sRand);
            g.dispose();
            ServletOutputStream responseOutputStream = response.getOutputStream();
            ImageIO.write(image, "JPEG", responseOutputStream);
            responseOutputStream.flush();
            responseOutputStream.close();
            return sRand;
        }

    /**
     * 随机获取颜色
     * @param fc
     * @param bc
     * @return
     */
     private  static   Color getRandColor(int fc, int bc) {
            Random random = new Random();
            if (fc > 255) {
                fc = 255;
            }

            if (bc > 255) {
                bc = 255;
            }

            int r = fc + random.nextInt(bc - fc);
            int g = fc + random.nextInt(bc - fc);
            int b = fc + random.nextInt(bc - fc);
            return new Color(r, g, b);
        }

    /**
     * 获取随机数
     * @return
     */
    private static char getSingleNumberChar() {
            Random random = new Random();
            int numberResult = random.nextInt(10);
            int ret = numberResult + 48;
            return (char)ret;
        }

    /**
     * 获取随机字母
     * @param upper
     * @return
     */
    private static char getLowerOrUpperChar(int upper) {
            Random random = new Random();
            int numberResult = random.nextInt(26);
            int ret = 0;
            if (upper == 0) {
                ret = numberResult + 97;
            } else if (upper == 1) {
                ret = numberResult + 65;
            }

            return (char)ret;
        }

}